package it.euris.insurance.platform.portfolio.lisa.dto.sddecoding;

import com.google.gson.annotations.Expose;

import it.euris.insurance.platform.portfolio.dto.annotation.DataType;
import it.euris.insurance.platform.portfolio.dto.annotation.Dto;
import it.euris.insurance.platform.portfolio.dto.annotation.Key;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
@Dto
public class TipoModRivEsoDto implements java.io.Serializable, BaseDto {
	
	private static final long serialVersionUID = 1L;
	
	@Key
	@DataType(name = "k_tipo_mod_riv_eso", nullable = false)
	@Expose
	private int id;
	
	
	@DataType(name = "cod_tipo_mod_riv_eso", nullable = false)
	@Expose
	private String cod;
	
	@DataType(name = "des_tipo_mod_riv_eso", nullable = false)
	@Expose
	private String des;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCod() {
		return cod;
	}

	public String getDes() {
		return des;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	@Override
	public void setDes(String des) {
		this.des=des;
		
	}
	
	

}