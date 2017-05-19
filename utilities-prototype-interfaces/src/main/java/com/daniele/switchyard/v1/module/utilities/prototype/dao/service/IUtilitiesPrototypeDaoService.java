package com.daniele.switchyard.v1.module.utilities.prototype.dao.service;

import com.daniele.switchyard.v1.module.utilities.prototype.dto.BaseDto;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptRequestModel;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptResponseModel;


/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 7/18/2017
 * @time 05:42
 * @version 0.3
 * 
 */
public interface IUtilitiesPrototypeDaoService {
	
	BaseDto<UptResponseModel> genKey(BaseDto<UptRequestModel> request);
}
