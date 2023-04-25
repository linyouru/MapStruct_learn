package com.lyr.mapstruct_learn.mapstruct;

import com.lyr.mapstruct_learn.pojo.bo.PersonBo;
import com.lyr.mapstruct_learn.pojo.bo.UserBo;
import com.lyr.mapstruct_learn.pojo.po.UserPo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class AbstractPersonMapping {

    //抽象方法可以声明额外的字段
    private String hope;

    @Mapping(target = "name",source = "nickname")
    public abstract UserBo userPoToUserBo(UserPo userPo);

    public PersonBo userPoToPersonBo(UserPo userPo){
        PersonBo personBo = new PersonBo();
        personBo.setAge(userPo.getAge());
        personBo.setId(userPo.getId());
        personBo.setStatus(userPo.getStatus());
        personBo.setFullName(userPo.getUsername()+"_"+userPo.getNickname());
        return personBo;
    }

}
