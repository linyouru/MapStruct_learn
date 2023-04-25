package com.lyr.mapstruct_learn.mapstruct;

import com.lyr.mapstruct_learn.pojo.bo.ManBo;
import com.lyr.mapstruct_learn.pojo.po.AnimalPo;
import com.lyr.mapstruct_learn.pojo.po.UserPo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MergeMapping {

    //多个bean合并，源bean中相同名称字段需要用Mapping指明
    @Mapping(target = "nickname" ,source = "userPo.nickname")
    ManBo animalAndUserToManBo(AnimalPo animalPo, UserPo userPo);

}
