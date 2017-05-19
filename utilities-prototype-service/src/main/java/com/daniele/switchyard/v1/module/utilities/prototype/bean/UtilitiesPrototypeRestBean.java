package com.daniele.switchyard.v1.module.utilities.prototype.bean;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

import com.daniele.switchyard.v1.module.utilities.prototype.dao.service.IUtilitiesPrototypeDaoService;
import com.daniele.switchyard.v1.module.utilities.prototype.dto.BaseDto;
import com.daniele.switchyard.v1.module.utilities.prototype.dto.BaseDto.CallStatus;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptRequestModel;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptResponseModel;
import com.daniele.switchyard.v1.module.utilities.prototype.rest.service.IUtilitiesPrototypeRestService;

/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 7/18/2017
 * @time 14:00
 * @version 0.2
 * 
 */
@Service(name = "IUtilitiesPrototypeRestService", value = IUtilitiesPrototypeRestService.class)
public class UtilitiesPrototypeRestBean implements IUtilitiesPrototypeRestService {
	
	protected static final Logger LOGGER = Logger.getLogger(UtilitiesPrototypeRestBean.class.getName());
	
	@Inject
	@Reference
	IUtilitiesPrototypeDaoService dao;
//	
	@Override
	public BaseDto<UptResponseModel> genKey(BaseDto<UptRequestModel> request) {
		LOGGER.log(Level.INFO, "UtilitiesPrototypeRestBean - genKey - start ");
		long start = System.currentTimeMillis();
		BaseDto<UptResponseModel> toReturn = new BaseDto<UptResponseModel>();
		toReturn.setCallStatus(CallStatus.OK);
		
		try{
			toReturn = this.dao.genKey(request);
			if (toReturn != null && 
				    toReturn.getMessage() != null && 
				    toReturn.getMessage() != null 
					) {
					LOGGER.log(Level.INFO,"UtilitiesPrototypeRestBean - genKey -dao service method invoked");
	
					
			}
		}catch(Exception e){
			LOGGER.log(Level.SEVERE,"exception caught ",e);
			toReturn.setCallStatus(CallStatus.KO);
		}finally{
			LOGGER.log(Level.INFO, "UtilitiesPrototypeRestBean - genKey - ends in "+(System.currentTimeMillis()-start)+" ms.");
		}
		
		return toReturn;
		
	}

	

	

	

}
