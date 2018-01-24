package com.bank.DAO.DAOImpl;

import com.bank.DAO.UserDAO;
import com.bank.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bobyk on 11/29/17.
 */

@Component(value = "userDAOImpl")
public class UserDAOImpl implements UserDAO {

    private SessionFactory sessionFactory;

    public void createUser(User user) throws Exception {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.flush();
        if (session != null && session.isOpen()) {
            session.close();
        }
    }

    public List<User> getUserList() throws Exception {
        List<User> users = new ArrayList<User>();
        Session session = getSessionFactory().openSession();
        session.beginTransaction();;
        users = session.createCriteria(User.class).list();
        if (session != null && session.isOpen()) {
            session.close();
        }
        return users;
    }

    public void deleteUserByID(long id) throws Exception {
        Session session = getSessionFactory().openSession();
        User user = (User) session.load(User.class, id);
        session.delete(user);

        session.flush();

        if (session != null && session.isOpen()) {
            session.close();
        }
    }

    public void deleteUserByUsername(String username) throws Exception {
        Session session = getSessionFactory().openSession();
        User user = (User) session.createCriteria(User.class).add(Restrictions.eq("username",username))
                .uniqueResult();
        session.delete(user);

        session.flush();

        if (session != null && session.isOpen()) {
            session.close();
        }
    }

    public User getUser(String userIdentificationData) throws Exception {
        Session session = getSessionFactory().openSession();
        User userByUsername = (User) session.createCriteria(User.class).add(Restrictions.eq("username",userIdentificationData))
                .uniqueResult();
        User userByID = (User) session.load(User.class, Long.valueOf(userIdentificationData));
        User user = null;
        if (userByUsername != null) {
            user = userByUsername;
        }
        if (userByID != null) {
            user = userByID;
        }
        return user;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}


// sonarGraph
// Robert Martin clean architecture
// Screaming architecture Rob
// Hexagonal architecture
//
