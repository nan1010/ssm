package com.home.dao;

import java.util.List;

import com.home.domain.Item;

public interface ItemMapper {
    int deleteByPrimaryKey(Long itemid);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Long itemid);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);

	List<Item> findAll();

	Item selectItemByName(String inputname);
}