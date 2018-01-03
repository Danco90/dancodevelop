package com.daniele.switchyard.v1.module.utilities.prototype.rest.service;

import com.daniele.switchyard.v1.module.utilities.prototype.dto.BaseDto;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptRequestModel;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptResponseModel;

/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 1/03/2018
 * @time 22:16
 * @version 0.5.3
 * 
 */
public interface IUtilitiesPrototypeRestService {
	
	//public BaseDto<UptResponseModel> genKey(BaseDto<UptRequestModel> request);
	public BaseDto<UptResponseModel> acctList();

}
