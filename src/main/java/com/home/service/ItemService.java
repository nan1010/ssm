package com.home.service;

import java.util.List;

import com.home.domain.Item;

public interface ItemService {
	public abstract List<Item> findAll();

	public abstract Item findItemById(long itemid);

	public abstract Item updateItemById(Item item);

	public abstract void deleteItemById(long itemid);

	public abstract Item findItemByName(String name);

	public abstract void insertItem(Item item);

}
