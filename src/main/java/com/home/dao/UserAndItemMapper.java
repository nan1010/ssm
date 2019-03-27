package com.home.dao;

import com.home.domain.UserAndItem;
import com.home.domain.UserAndItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository(value="userAndItemMapper")
public interface UserAndItemMapper {
    int countByExample(UserAndItemExample example);

    int deleteByExample(UserAndItemExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(UserAndItem record);

    int insertSelective(UserAndItem record);

    List<UserAndItem> selectByExample(UserAndItemExample example);

    UserAndItem selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") UserAndItem record, @Param("example") UserAndItemExample example);

    int updateByExample(@Param("record") UserAndItem record, @Param("example") UserAndItemExample example);

    int updateByPrimaryKeySelective(UserAndItem record);

    int updateByPrimaryKey(UserAndItem record);
}