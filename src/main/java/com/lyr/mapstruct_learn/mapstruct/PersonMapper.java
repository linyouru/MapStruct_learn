package com.lyr.mapstruct_learn.mapstruct;

import com.lyr.mapstruct_learn.pojo.bo.PersonBo;
import com.lyr.mapstruct_learn.pojo.bo.UserBo;
import com.lyr.mapstruct_learn.pojo.po.UserPo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PersonMapper {

    @Mapping(target = "name",source = "nickname")
    UserBo userPoToUserBo(UserPo userPo);

    //自定义映射方法
    default PersonBo userPoToPersonBo(UserPo userPo){
        PersonBo personBo = new PersonBo();
        personBo.setAge(userPo.getAge());
        personBo.setId(userPo.getId());
        personBo.setStatus(userPo.getStatus());
        personBo.setFullName(userPo.getUsername()+"_"+userPo.getNickname());
        return personBo;
    }


}
