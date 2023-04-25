package com.lyr.mapstruct_learn.mapstruct;

import com.lyr.mapstruct_learn.pojo.bo.UserBo;
import com.lyr.mapstruct_learn.pojo.po.UserPo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {

    //基础映射
    @Mapping(target = "name",source = "nickname")
    UserBo userPoToUserBo(UserPo userPo);

}
