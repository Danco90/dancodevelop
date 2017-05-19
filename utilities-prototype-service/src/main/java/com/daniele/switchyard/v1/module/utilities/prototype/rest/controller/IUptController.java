package com.daniele.switchyard.v1.module.utilities.prototype.rest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptRequestModel;

/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 7/17/2017
 * @time 03:47
 * @version 0.1
 * 
 */
@Path("v1")
public interface IUptController {
	
	public static final String CHANNEL = "channel";
	
	@PUT
	@Path("genKey")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response genKey(@HeaderParam(CHANNEL) String channel,
					   @Context HttpServletRequest httpRequest,
					   UptRequestModel request);
	
}
