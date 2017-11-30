package com.bank.DAO.DAOImpl;

import com.bank.entities.User;
import org.springframework.stereotype.Component;

/**
 * Created by bobyk on 11/29/17.
 */

@Component(value = "userDAOImpl")
public class UserDAOImpl/* extends HibernateDaoSupport implements UserDAO */{

    public void createUser(User user) throws Exception {
//        Session session = getSession().getSessionFactory().openSession();
//        session.beginTransaction();
//        session.save(user);
//        session.getTransaction().commit();
//        if (session != null && session.isOpen()) {
//            session.close();
//        }
    }
}
