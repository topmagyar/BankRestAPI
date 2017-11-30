package com.bank.DAO;

import com.bank.entities.User;

/**
 * Created by bobyk on 11/29/17.
 */
public interface UserDAO {
    void createUser(User user) throws Exception;
}
