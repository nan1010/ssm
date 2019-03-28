package com.home.dao;

import com.home.domain.Item;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemMapper {
   

//    int deleteByPrimaryKey(Long itemid);
//
//    int insert(Item record);
//
//    int insertSelective(Item record);
//
//    Item selectByPrimaryKey(Long itemid);
//
//
//    int updateByPrimaryKeySelective(Item record);
//
//    int updateByPrimaryKey(Item record);

    //xml文件中还没有sql语句
	public List<Item> findAll();
	
	public Item selectItemById(long itemid);

	public void updateById(Item item);

	public void deleteItemById(long itemid);

	public Item selectItemByName(String itemname);

	public void insert(Item item);
}