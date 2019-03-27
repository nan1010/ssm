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
}
