package com.home.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.home.dao.ItemMapper;
import com.home.dao.NewItemMapper;
import com.home.domain.Item;
import com.home.domain.NewItem;
import com.home.domain.NewItemWithBLOBs;
import com.home.service.NewItemService;
@Service("newItemServiceImpl")
public class NewItemServiceImpl implements NewItemService{
	@Autowired
    @Qualifier("newItemMapper")
	private NewItemMapper newItemMapper;
	@Override
	public List<NewItemWithBLOBs> findAll() {
		List<NewItemWithBLOBs> newItems =  newItemMapper.findAll();
		return newItems ;
	}
	@Override
	public NewItemWithBLOBs findNewItemByName(String name) {
		// TODO Auto-generated method stub
		NewItemWithBLOBs newItemWithBLOBs = newItemMapper.findNewItemByName(name);
		return newItemWithBLOBs;
	}
	
}
