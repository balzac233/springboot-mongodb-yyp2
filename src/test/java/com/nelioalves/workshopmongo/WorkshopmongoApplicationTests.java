package com.nelioalves.workshopmongo;

//import com.nelioalves.workshopmongo.domain.User;
//import com.nelioalves.workshopmongo.services.UserService;
import com.nelioalves.workshopmongo.dao.MongoTestDao;
import com.nelioalves.workshopmongo.model.MongoTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class WorkshopmongoApplicationTests {

    @Autowired
    private MongoTestDao mtdao;

//    private UserService userService;

//    @Test
//    public void contextLoads() {
//        User user = new User();
//        user.setName("ydsds");
//        user.setEmail("ydsds@gmail.com");
//        userService.insert(user);
//    }

    @Test
    public void test01(){
        MongoTest sss = mtdao.findTestByName("sss");
        if (null == sss){
            log.info("o查不出东西啊");
        }else {
            log.info("ohhhhhhhhhhhhhhhhh!!!!!  "+sss.toString());
        }
//        System.out.println(sss.toString());
    }

}
