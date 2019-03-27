package com.home.service;

import java.util.List;

import com.home.domain.Item;
import com.home.domain.User;

public interface ItemService {
	public abstract List<Item> findAll();

	public abstract Item findItemById(long itemid);

	public abstract Item updateItemById(Item item);

}
