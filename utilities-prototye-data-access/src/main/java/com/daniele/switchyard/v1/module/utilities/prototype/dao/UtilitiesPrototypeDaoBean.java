package com.daniele.switchyard.v1.module.utilities.prototype.dao;


import org.switchyard.component.bean.Service;

import com.daniele.switchyard.v1.module.utilities.prototype.dao.service.IUtilitiesPrototypeDaoService;
import com.daniele.switchyard.v1.module.utilities.prototype.dto.BaseDto;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptRequestModel;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptResponseModel;

/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 5/18/2017
 * @time 01:34
 * @version 0.5
 * 
 */
@SuppressWarnings("rawtypes")
@Service(name = "IUtilitiesPrototypeDaoService", value = IUtilitiesPrototypeDaoService.class)
public class UtilitiesPrototypeDaoBean implements IUtilitiesPrototypeDaoService {

	@Override
	public BaseDto<UptResponseModel> genKey(BaseDto<UptRequestModel> request) {
		
		BaseDto<UptResponseModel> toReturn = new BaseDto<UptResponseModel>();
		
		String entitiesTablesInFilePath = request.getMessage().getEntitiesFilePath();
		String outDirPath = request.getMessage().getOutDirPath();
		String templatesInDirPath = request.getMessage().getEntitiesFilePath();
		
		UptResponseModel UptResponseModel = new UptResponseModel();
		
		UptResponseModel.getCodes().add(templatesInDirPath);
		UptResponseModel.getCodes().add(outDirPath);
		UptResponseModel.getCodes().add(entitiesTablesInFilePath);
		
		toReturn.setMessage(UptResponseModel);
		
		
		return toReturn;
	}

}
