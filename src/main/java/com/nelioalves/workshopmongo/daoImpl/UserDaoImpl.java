package com.nelioalves.workshopmongo.daoImpl;

import com.nelioalves.workshopmongo.dao.UserDao;
import com.nelioalves.workshopmongo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

/**
 * @description
 * @author: yyp
 * @create: 2021-10-09
 **/
public class UserDaoImpl implements UserDao {

    /**
     * 由springboot自动注入，默认配置会产生mongoTemplate这个bean
     */
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @return {@link List < User > }
     * @Description 找到所有
     * @auther: yyp
     * @date: 2021/10/09
     */
    @Override
    public List<User> findAll() {
        return mongoTemplate.findAll(User.class);
    }

    /**
     * @param id id
     * @return {@link User }
     * @Description 获取用户
     * @auther: yyp
     * @date: 2021/10/09
     */
    @Override
    public User getUser(Integer id) {
        return mongoTemplate.findOne(new Query(Criteria.where("id").is(id)), User.class);
    }

    /**
     * @param user 用户
     * @Description 更新
     * @auther: yyp
     * @date: 2021/10/09
     */
    @Override
    public void update(User user) {
        Criteria criteria = Criteria.where("id").is(user.getId());
        Query query = new Query(criteria);
        Update update = Update.update("name", user.getName()).set("age", user.getAge());
        mongoTemplate.updateMulti(query, update, User.class);

    }

    /**
     * @param user 用户
     * @Description 插入
     * @auther: yyp
     * @date: 2021/10/09
     */
    @Override
    public void insert(User user) {
        mongoTemplate.insert(user);
    }

    /**
     * @param users 用户
     * @Description 插入所有
     * @auther: yyp
     * @date: 2021/10/09
     */
    @Override
    public void insertAll(List<User> users) {
        mongoTemplate.insertAll(users);
    }

    /**
     * @param id id
     * @Description 删除
     * @auther: yyp
     * @date: 2021/10/09
     */
    @Override
    public void remove(String id) {
        Criteria criteria = Criteria.where("id").is(id);
        Query query = new Query(criteria);
        mongoTemplate.remove(query,User.class);
    }

    /**
     * @param user     用户
     * @param pageable 可分页
     * @return {@link List<User> }
     * @Description 找到的页面
     * @auther: yyp
     * @date: 2021/10/09
     */
    @Override
    public List<User> findByPage(User user, Pageable pageable) {
        Query query = new Query();
        if (user != null && user.getName() != null) {
            //模糊查询
            query = new Query(Criteria.where("name").regex("^" + user.getName()));
        }
        List<User> list = mongoTemplate.find(query.with(pageable), User.class);
        return list;
    }
}
