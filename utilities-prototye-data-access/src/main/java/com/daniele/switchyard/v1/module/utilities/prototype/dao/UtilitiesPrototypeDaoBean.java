package com.daniele.switchyard.v1.module.utilities.prototype.dao;


import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.switchyard.component.bean.Service;

//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.transaction.annotation.Transactional;
import com.daniele.switchyard.v1.module.utilities.prototype.dao.service.IUtilitiesPrototypeDaoService;
import com.daniele.switchyard.v1.module.utilities.prototype.dto.BaseDto;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptResponseModel;
import com.daniele.switchyard.v1.module.utilities.prototype.model.entities.Account;

/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 1/03/2017
 * @time 22:53
 * @version 0.8
 * 
 */

@Service(name = "IUtilitiesPrototypeDaoService", value = IUtilitiesPrototypeDaoService.class)
public class UtilitiesPrototypeDaoBean implements IUtilitiesPrototypeDaoService {

	@Inject
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public BaseDto<UptResponseModel> listAccount(){
		
		BaseDto<UptResponseModel> toReturn = new BaseDto<UptResponseModel>();
		
		Session session = this.sessionFactory.getCurrentSession();
		List<Account> list = session.createQuery("from Account").list();
		
		UptResponseModel UptResponseModel = new UptResponseModel();
		UptResponseModel.setAccounts(list);
		toReturn.setMessage(UptResponseModel);
		return toReturn;
	}
	
//	@Override
//	public BaseDto<UptResponseModel> genKey(BaseDto<UptRequestModel> request) {
//		
//		BaseDto<UptResponseModel> toReturn = new BaseDto<UptResponseModel>();
//		
//		String entitiesTablesInFilePath = request.getMessage().getEntitiesFilePath();
//		String outDirPath = request.getMessage().getOutDirPath();
//		String templatesInDirPath = request.getMessage().getEntitiesFilePath();
//		
//		UptResponseModel UptResponseModel = new UptResponseModel();
//		
//		UptResponseModel.getCodes().add(templatesInDirPath);
//		UptResponseModel.getCodes().add(outDirPath);
//		UptResponseModel.getCodes().add(entitiesTablesInFilePath);
//		
//		toReturn.setMessage(UptResponseModel);
//		
//		
//		return toReturn;
//	}
	
}
