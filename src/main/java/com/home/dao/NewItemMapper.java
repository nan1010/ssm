package com.home.dao;

import java.util.List;

import com.home.domain.NewItem;
import com.home.domain.NewItemWithBLOBs;

public interface NewItemMapper {
    int deleteByPrimaryKey(Integer newitemid);

    int updateByPrimaryKey(NewItem record);

	List<NewItemWithBLOBs> findAll();

	NewItemWithBLOBs findNewItemByName(String newitemname);
}