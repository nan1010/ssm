package com.home.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
