package com.daniele.switchyard.v1.module.utilities.prototype.dao;


import java.util.List;

import org.switchyard.component.bean.Service;
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.transaction.annotation.Transactional;
import com.daniele.switchyard.v1.module.utilities.prototype.dao.service.IUtilitiesPrototypeDaoService;
import com.daniele.switchyard.v1.module.utilities.prototype.dto.BaseDto;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptAccountRequestModel;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptRequestModel;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptResponseModel;

/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 1/01/2017
 * @time 19:34
 * @version 0.6
 * 
 */
@SuppressWarnings("rawtypes")
@Service(name = "IUtilitiesPrototypeDaoService", value = IUtilitiesPrototypeDaoService.class)
public class UtilitiesPrototypeDaoBean implements IUtilitiesPrototypeDaoService {

	//private SessionFactory sessionFactory;
	
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
	
	
	public List<UptAccountRequestModel> listAccount() throws Exception{
//		Session session = this.sessionFactory.getCurrentSession();
//		List<UptAccountRequestModel> list = session.createQuery("from Account").list();
//	    return list;
		return null;
	}

}
