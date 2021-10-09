package com.nelioalves.workshopmongo.dao;

import com.nelioalves.workshopmongo.domain.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 用户刀
 *
 * @author 019MSI
 * @description
 * @author: yyp
 * @create: 2021-10-09
 * @date 2021/10/09
 */
public interface UserDao {

    /**
     * @return {@link List<User> }
     * @Description 找到所有
     * @auther: yyp
     * @date: 2021/10/09
     */
    List<User> findAll();

    /**
     * @param id id
     * @return {@link User }
     * @Description 获取用户
     * @auther: yyp
     * @date: 2021/10/09
     */
    User getUser(Integer id);

    /**
     * @param user 用户
     * @Description 更新
     * @auther: yyp
     * @date: 2021/10/09
     */
    void update(User user);

    /**
     * @param user 用户
     * @Description 插入
     * @auther: yyp
     * @date: 2021/10/09
     */
    void insert(User user);

    /**
     * @param users 用户
     * @Description 插入所有
     * @auther: yyp
     * @date: 2021/10/09
     */
    void insertAll(List<User> users);

    /**
     * @param id id
     * @Description 删除
     * @auther: yyp
     * @date: 2021/10/09
     */
    void remove(String id);

    /**
     * @param user     用户
     * @param pageable 可分页
     * @return {@link List<User> }
     * @Description 找到的页面
     * @auther: yyp
     * @date: 2021/10/09
     */
    List<User> findByPage(User user, Pageable pageable);

}
