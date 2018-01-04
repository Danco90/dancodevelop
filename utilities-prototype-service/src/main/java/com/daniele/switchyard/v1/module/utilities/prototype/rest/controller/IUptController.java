package com.daniele.switchyard.v1.module.utilities.prototype.rest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
//import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
//import org.springframework.http.ResponseEntity;

import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptRequestModel;

/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 1/04/2017
 * @time 12:32
 * @version 0.3.2
 * 
 */
@Path("v1")
public interface IUptController {
	
	public static final String CHANNEL = "channel";
	
	@GET
	@Path("accounts")
	@Produces(MediaType.APPLICATION_JSON)
	public Response acctList(@HeaderParam(CHANNEL) String channel,
			   				 @Context HttpServletRequest httpRequest);
	
//	@PUT
//	@Path("genKey")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response genKey(@HeaderParam(CHANNEL) String channel,
//					   @Context HttpServletRequest httpRequest,
//					   UptRequestModel request);
	
//	@GET
//	@Path("accounts")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response acctList(@HeaderParam(CHANNEL) String channel,
//			   				 @Context HttpServletRequest httpRequest,
//			   				 UptRequestModel request);
	
}
