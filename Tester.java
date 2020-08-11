/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank;

/**
 *
 * @author User
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam; 
import javax.ws.rs.core.Response;

@Path("/Wellhello") 

public class Tester {
//curl -vi -X GET -G "http://localhost:49000/api/Wellhello/Eddy"
@GET
@Path("/{param}")
    public Response sayHelloWorld(@PathParam("param") String message) { 
        String output = "Welcome to our app!";
        return Response.status(200).entity(output).build();
    }
}
