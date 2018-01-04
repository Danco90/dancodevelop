package com.daniele.switchyard.v1.module.utilities.prototype.messagecomposer;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.switchyard.Exchange;
import org.switchyard.ExchangeState;
import org.switchyard.HandlerException;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;
//import com.daniele.switchyard.v1.module.utilities.prototype.interceptors.ApplicationController;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptResponseModel;
import com.daniele.switchyard.v1.module.utilities.prototype.utils.UrlBuilder;

/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 1/04/2017
 * @time 12:43
 * @version 0.5.1
 * 
 */
//@ApplicationController
public class UptMessageComposer extends /*UptMessageComposerParameters*/ RESTEasyMessageComposer {
	
	protected static final Logger LOGGER = Logger.getLogger(UptMessageComposer.class.getName());

	public static final  String UPT_ACCOUNTS = "accounts";
	
	@Override
	public Message compose(RESTEasyBindingData src, Exchange exchange) throws Exception {
		LOGGER.log(Level.INFO,"UptMessageComposer - Entering message composer...");
		final Message message = super.compose(src, exchange);
		if(src.getOperationName().equalsIgnoreCase(/*UptMessageComposerParameters.*/UPT_ACCOUNTS)){
//			Object content = null;
//	        if (src.getParameters().length > 0) {
//	            content = src.getParameters()[0];
//	        }
	       

			
//			String channel = src.getHeaders().getFirst(IUptController.CHANNEL);
//			UptRequestModel model = (UptRequestModel) src.getParameters()[2];
//			model.setChannel(channel);
			HttpServletRequest httpServletRequest = (HttpServletRequest) src.getParameters()[1];
			LOGGER.log(Level.INFO, "UptMessageComposer - compose - Context Path:"+UrlBuilder.getURL(httpServletRequest));
//			BaseDto<UptRequestModel> payload = new BaseDto<UptRequestModel>();
//			payload.setMessage(model);
//			message.setContent(payload);
		}
		return message;
	}
	
	@Override
    public RESTEasyBindingData decompose(Exchange exchange, RESTEasyBindingData target) throws Exception {
		Object content = exchange.getMessage().getContent();
		if (exchange.getState().equals(ExchangeState.FAULT)){
			if (content instanceof HandlerException){
				HandlerException he = (HandlerException) content;
				//if (he.getCause() instanceof ItemNotFoundException){
					throw (Exception) he.getCause();
				//}
			}
		}
		target = super.decompose(exchange, target);
		
		if(target.getOperationName().equals(/*UptMessageComposerParameters.*/UPT_ACCOUNTS) && (content != null) && (content instanceof UptResponseModel )){
			//Unwrap the parameters
			target.setParameters(new Object[] { ((UptResponseModel) content) });
		}
		return target;
	}
	
}
