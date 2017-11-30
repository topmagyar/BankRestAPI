package com.bank.services;

import com.bank.DAO.DAOImpl.UserDAOImpl;
import com.bank.entities.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

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
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserList() throws Exception{
        Response response = null;
        List<User> users = userDAOImpl.getUserList();
        response = Response.status(200).entity(users).build();
        return response;
    }

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createUser(User user) throws Exception{
        Response response = null;
        userDAOImpl.createUser(user);
        response = Response.status(200).entity(user).build();
        return response;
    }

    @DELETE
    @Path("/id/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteUserByID(@PathParam("id") String id) throws Exception {
        Response response = null;
        userDAOImpl.deleteUserByID(Long.valueOf(id));
        response = Response.status(200).build();
        return response;
    }

    @DELETE
    @Path("/username/{username}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteUserByUsername(@PathParam("username") String username) throws Exception {
        Response response = null;
        userDAOImpl.deleteUserByUsername(username);
        response = Response.status(200).build();
        return response;
    }

    @GET
    @Path("/check")
    public Response check() {
        String msg = ":(";
        if (userDAOImpl != null) {
            msg = ":)";
        }
        return Response.status(200).entity(msg).build();
    }

}
