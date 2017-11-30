package com.bank.services;

import com.bank.DAO.DAOImpl.UserDAOImpl;
import com.bank.entities.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by bobyk on 11/28/17.
 */

@Service
@Scope("prototype")
@Path("/user")
public class UserService {

    @Resource
    private UserDAOImpl userDAOImpl;

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {
        if (getUserDAOImpl() != null) {
            msg = ":)";
        } else {
            msg = ":(";
        }
        String output = "Jersey say : " + msg;
        return Response.status(200).entity(output).build();
    }

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createUser(User user) throws Exception{
        Response response = null;
        return response;
    }

//    public void setUserDAOImpl(UserDAOImpl userDAOImpl) {
//        this.userDAOImpl = userDAOImpl;
//    }

    public UserDAOImpl getUserDAOImpl() {
        return userDAOImpl;
    }
}
