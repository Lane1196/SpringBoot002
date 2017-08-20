package com.dao;

import com.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Wzj on 2017/8/20 0020.
 */
@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(User user) {
        this.entityManager.persist(user);
    }

    public User update(User user) {
        return this.entityManager.merge(user);
    }

    public void removeById(Long id) {
        User user = this.getById(id); // 关联到记录，方可删除
        if (null != user) {
            this.entityManager.remove(user);
        }
    }

    public User getById(Long id) {
        return this.entityManager.find(User.class, id);
    }

    public List<User> findAll() {
        Query query = this.entityManager.createQuery("from User ", List.class);
        return query.getResultList();
    }
}
