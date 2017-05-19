package com.daniele.switchyard.v1.module.utilities.prototype.messagecomposer;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;

import com.daniele.switchyard.v1.module.utilities.prototype.dto.BaseDto;
import com.daniele.switchyard.v1.module.utilities.prototype.interceptors.ApplicationController;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptRequestModel;
import com.daniele.switchyard.v1.module.utilities.prototype.rest.controller.IUptController;
import com.daniele.switchyard.v1.module.utilities.prototype.utils.UrlBuilder;

/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 7/17/2017
 * @time 04:29
 * @version 0.4
 * 
 */
@ApplicationController
public class UptMessageComposer extends UptMessageComposerParameters {
	protected static final Logger LOGGER = Logger.getLogger(UptMessageComposer.class.getName());

	@Override
	public Message compose(RESTEasyBindingData src, Exchange exchange) throws Exception {
		LOGGER.log(Level.INFO,"UptMessageComposer - Entering message composer...");
		final Message message = super.compose(src, exchange);
		if(src.getOperationName().equalsIgnoreCase(UptMessageComposerParameters.UPT_GEN_KEY)){
			String channel = src.getHeaders().getFirst(IUptController.CHANNEL);
			UptRequestModel model = (UptRequestModel) src.getParameters()[2];
			model.setChannel(channel);
			HttpServletRequest httpServletRequest = (HttpServletRequest) src.getParameters()[1];
			LOGGER.log(Level.INFO, "UptMessageComposer - compose - Context Path:"+UrlBuilder.getURL(httpServletRequest));
			BaseDto<UptRequestModel> payload = new BaseDto<UptRequestModel>();
			payload.setMessage(model);
			message.setContent(payload);
		}
		return message;
	}
	
	@Override
    public RESTEasyBindingData decompose(Exchange exchange, RESTEasyBindingData target) throws Exception {
		return null;
	}
	
}
