package com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts;

import java.io.Serializable;

/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 1/03/2018
 * @time 22:20
 * @version 0.2
 * 
 */
public class UptRequestModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String channel;
	
//	private String entitiesFilePath;
//	private String outDirPath;
//	private String templatesInDirPath;
	
//	public String getEntitiesFilePath() {
//		return entitiesFilePath;
//	}
//
//	public void setEntitiesFilePath(String entitiesFilePath) {
//		this.entitiesFilePath = entitiesFilePath;
//	}
//
//	public String getOutDirPath() {
//		return outDirPath;
//	}
//
//	public void setOutDirPath(String outDirPath) {
//		this.outDirPath = outDirPath;
//	}
//
//	public String getTemplatesInDirPath() {
//		return templatesInDirPath;
//	}
//
//	public void setTemplatesInDirPath(String templatesInDirPath) {
//		this.templatesInDirPath = templatesInDirPath;
//	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	

}
