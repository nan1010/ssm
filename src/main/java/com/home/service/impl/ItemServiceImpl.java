package com.home.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.home.dao.ItemMapper;
import com.home.domain.Item;
import com.home.service.ItemService;
@Service("itemServiceImpl")
public class ItemServiceImpl implements ItemService{
	@Autowired
    @Qualifier("itemMapper")
	private ItemMapper itemMapper;
	
	@Override
	public List<Item> findAll() {
		List<Item> items =  itemMapper.findAll();
		return items ;
	}

	public Item findItemById(long itemid) {
		// TODO Auto-generated method stub
		Item item = itemMapper.selectItemById(itemid);
		return item;
	}

	
	public Item updateItemById(Item item) {
		// TODO Auto-generated method stub
		 itemMapper.updateById(item);
		Item item1 = itemMapper.selectItemById(item.getItemid());
		return item1;
	}

	
	public void deleteItemById(long itemid) {
		// TODO Auto-generated method stub
		itemMapper.deleteItemById(itemid);
	}

	
	public Item findItemByName(String inputname) {
		// TODO Auto-generated method stub
		Item item = itemMapper.selectItemByName(inputname);
		return item;
	}

	@Override
	public void insertItem(Item item) {
		// TODO Auto-generated method stub
		itemMapper.insert(item);
	}

//	@Override
//	public void insertItem(Item item) {
//		// TODO Auto-generated method stub
//		itemMapper.insert(item);
//	}
}
