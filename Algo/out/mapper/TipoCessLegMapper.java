package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoCessLegDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoCessLeg;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoCessLegMapper implements Mapper<TipoCessLeg, TipoCessLegDto> {

	@Override
	public TipoCessLeg from(TipoCessLegDto dest) {
		// TipoCessLeg src = new TipoCessLeg();
		// TipoCessLegDto dto = new TipoCessLegDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoCessLegDto to(TipoCessLeg source) {
		TipoCessLegDto dest = new TipoCessLegDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoCessLeg(), source.getCodTipoCessLeg(),
				source.getDesTipoCessLeg(), dest);
		return dest;
	}

	@Override
	public List<TipoCessLegDto> toMany(List<TipoCessLeg> sourceList) {
		List<TipoCessLegDto> destList = new ArrayList<TipoCessLegDto>();
		for (TipoCessLeg src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}