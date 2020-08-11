/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank;

import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author mac
 */
@Path("/transaction")
public class TransactionResource {
    private TransactionService transactionService = new TransactionService(); 
    
    @PUT
    @Path("/lodge")
    //@Produces(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_XML)
    public Response  lodgeTransaction(@Context UriInfo info) {
        
        String accountId = info.getQueryParameters().getFirst("accountId");
        String lodgeAmount = info.getQueryParameters().getFirst("lodgeAmount");
        
           // return
    }
    
    @PUT
    @Path("/withdraw")
    //@Produces(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_XML)
    public Response  withdrawTransaction(@Context UriInfo info) {
        
           String accountId = info.getQueryParameters().getFirst("accountId");
        String withdrawAmount = info.getQueryParameters().getFirst("withdrawAmount");
        
          // return
    }
    
    @PUT
    @Path("/transfer")
    //@Produces(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_XML)
    public Response  transferTransaction(@Context UriInfo info) {
        
        String transferAmount = info.getQueryParameters().getFirst("transferAmount");
        String accountId1 = info.getQueryParameters().getFirst("accountId1");
        String accountId2 = info.getQueryParameters().getFirst("accountId2");
        
        
          // return
    }
    
}
