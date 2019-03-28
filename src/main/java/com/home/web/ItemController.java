package com.home.web;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.home.domain.Item;
import com.home.service.ItemService;

@RequestMapping("/item")
public class ItemController {
	@Autowired
	@Qualifier("itemServiceImpl")
	private ItemService itemService;	
	
	@RequestMapping("/tolist")
	public  String tolist(Model model){
		List<Item> list = itemService.findAll();
		model.addAttribute("itemsList", list);
		return "item/itemsList";
	}
	
	@RequestMapping("/finditembyid")
	public ModelAndView findItemById(ModelAndView mav, Long itemid) {
		Item item = itemService.findItemById(itemid);
		mav.addObject(item);
		mav.setViewName("item/edititem");
		return mav;	
	}
	@RequestMapping("/showitem")
	public ModelAndView updateItemById(ModelAndView mav, Item item) {
		if(itemService.findItemById(item.getItemid())!=null) {
			mav.addObject(itemService.updateItemById(item));
			mav.setViewName("item/showitem");
			return mav;
		}else {
			itemService.insertItem(item);
			mav.addObject(item);
			mav.setViewName("item/showitem");
			return mav;
		}
	}
	@RequestMapping("/deleteByID")
		public ModelAndView deleteItemById(ModelAndView mav, Long itemid) {	
			itemService.deleteItemById(itemid);	
			mav.setViewName("item/itemsList");
			List<Item> list = itemService.findAll();
			mav.addObject("itemsList", list);
			return mav;
	}
	@RequestMapping(value="/finditembyname", method = RequestMethod.POST)
	public ModelAndView findItemByName(ModelAndView mav, HttpServletRequest request, @RequestParam String inputname) throws UnsupportedEncodingException {
		String name = (String)request.getParameter("inputname");
		Item item = itemService.findItemByName(name);
		if(item.getItemid()!=null) {
			mav.addObject(item);
			mav.setViewName("item/showitem");
			return mav;
		}else {
			mav.setViewName("item/itemsList");
			return mav;
		}
		
	}
	
	
}
