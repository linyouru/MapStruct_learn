package com.lyr.mapstruct_learn;

import com.lyr.mapstruct_learn.mapstruct.MergeMappingImpl;
import com.lyr.mapstruct_learn.mapstruct.PersonMapper;
import com.lyr.mapstruct_learn.mapstruct.PersonMapperImpl;
import com.lyr.mapstruct_learn.mapstruct.UserMapperImpl;
import com.lyr.mapstruct_learn.pojo.bo.ManBo;
import com.lyr.mapstruct_learn.pojo.bo.PersonBo;
import com.lyr.mapstruct_learn.pojo.bo.UserBo;
import com.lyr.mapstruct_learn.pojo.po.AnimalPo;
import com.lyr.mapstruct_learn.pojo.po.UserPo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MapStructLearnApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void basicMapping() {
        UserMapperImpl userMapper = new UserMapperImpl();

        UserPo userPo = new UserPo();
        userPo.setId(1);
        userPo.setAge(20);
        userPo.setUsername("linyouru");
        userPo.setNickname("link");
        userPo.setStatus(1);

        UserBo userBo = userMapper.userPoToUserBo(userPo);
        System.out.println(userBo.toString());
    }

    @Test
    void customMapping(){
        PersonMapperImpl personMapper = new PersonMapperImpl();

        UserPo userPo = new UserPo();
        userPo.setId(1);
        userPo.setAge(20);
        userPo.setUsername("linyouru");
        userPo.setNickname("link");
        userPo.setStatus(1);

        PersonBo personBo = personMapper.userPoToPersonBo(userPo);
        UserBo userBo = personMapper.userPoToUserBo(userPo);
        System.out.println(personBo);
        System.out.println(userBo);
    }

    @Test
    void severalSource(){
        MergeMappingImpl mergeMapping = new MergeMappingImpl();

        UserPo userPo = new UserPo();
        userPo.setId(1);
        userPo.setAge(20);
        userPo.setUsername("linyouru");
        userPo.setNickname("link");
        userPo.setStatus(1);

        AnimalPo animalPo = new AnimalPo();
        animalPo.setSound("like a dog");
        animalPo.setWeight(182);
        animalPo.setNickname("kiki");

        ManBo manBo = mergeMapping.animalAndUserToManBo(animalPo, userPo);
        System.out.println(manBo);
    }

}
