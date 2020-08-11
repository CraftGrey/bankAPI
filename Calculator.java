/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank;
import com.google.gson.Gson;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

@Path("/mortgagecalc")
public class Calculator {
    
    private CustomerService customerService = new CustomerService();
    
    
    @GET
    @Path("/payment")
    //@Produces(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_XML)
    public Response getPayment(@Context UriInfo info) {
        System.out.println("in mortgage class");
        
//        customerService.createAllCustomers();

//        String email = info.getQueryParameters().getFirst("email");
//        String password = info.getQueryParameters().getFirst("password");
//        String term = info.getQueryParameters().getFirst("term");
//
//        MortgageInfo mortgageInfo = new MortgageInfo(Double.parseDouble(principal), Double.parseDouble(interest), Integer.parseInt(term));
        

        // test return all customers
        
        return Response.status(200).entity(customerService.getAllCustomers().get(0)).build();
//        return Response.status(200).build();
    }

//    @GET
//    @Path("/paymentj")
//    @Produces(MediaType.APPLICATION_JSON)
//        public Response getPaymentj(@Context UriInfo info) {
//            System.out.println("in mortgage class");
//
//            Gson gson = new Gson();
//
//    //        String principal = info.getQueryParameters().getFirst("principal");
//    //        String interest = info.getQueryParameters().getFirst("interest");
//    //        String term = info.getQueryParameters().getFirst("term");
//    //
//    //        MortgageInfo mortgageInfo = new MortgageInfo(Double.parseDouble(principal), Double.parseDouble(interest), Integer.parseInt(term));
//
//            return Response.status(200).entity(gson.toJson()).build();
//        }

    @GET
    @Path("/echo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response post(String entity){
        System.out.println("...echo");

        return Response.status(200).entity(entity).build();
    }

}


