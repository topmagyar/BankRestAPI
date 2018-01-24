package com.bank.DAO;

import com.bank.entities.User;

import java.util.List;

/**
 * Created by bobyk on 11/29/17.
 */
public interface UserDAO {
    void createUser(User user) throws Exception;
    List<User> getUserList() throws Exception;
    void deleteUserByID(long id) throws Exception;
    void deleteUserByUsername(String username) throws Exception;
    User getUser(String userIdentificationData) throws Exception;
}
