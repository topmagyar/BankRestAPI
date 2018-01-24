package com.bank.services;

import com.bank.entities.Order;
import org.springframework.stereotype.Service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by bobyk on 1/24/18.
 */

@Service
@Path("/order")
public class OrderService {


    @POST
    @Path("/create")
    public Response createOrder(Order order) throws Exception {
        Response response = null;
        return response;
    }
}
