package com.home.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public ModelAndView findItemById(ModelAndView mav, long itemid) {
		Item item = itemService.findItemById(itemid);
		mav.addObject(item);
		mav.setViewName("item/edititem");
		return mav;	
	}
	@RequestMapping("/showitem")
	public ModelAndView updateItemById(ModelAndView mav, Item item) {		
		mav.addObject(itemService.updateItemById(item));
		mav.setViewName("item/showitem");
		return mav;
	}
}
