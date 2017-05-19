package com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts;

import java.util.ArrayList;
import java.util.List;

public class UptResponseModel implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	List<Object> codes = new ArrayList<>();

	public List<Object> getCodes() {
		return codes;
	}

	public void setCodes(List<Object> codes) {
		this.codes = codes;
	}
	
	
	
	

}
