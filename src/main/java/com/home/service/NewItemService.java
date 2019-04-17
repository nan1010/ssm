package com.home.service;

import java.util.List;

import com.home.domain.NewItem;
import com.home.domain.NewItemWithBLOBs;

public interface NewItemService {
	public abstract List<NewItemWithBLOBs> findAll();

	public abstract NewItemWithBLOBs findNewItemByName(String name);
}
