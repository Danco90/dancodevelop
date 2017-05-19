package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoPauDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoPau;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoPauMapper implements Mapper<TipoPau, TipoPauDto> {

	@Override
	public TipoPau from(TipoPauDto dest) {
		// TipoPau src = new TipoPau();
		// TipoPauDto dto = new TipoPauDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoPauDto to(TipoPau source) {
		TipoPauDto dest = new TipoPauDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoPau(), source.getCodTipoPau(),
				source.getDesTipoPau(), dest);
		return dest;
	}

	@Override
	public List<TipoPauDto> toMany(List<TipoPau> sourceList) {
		List<TipoPauDto> destList = new ArrayList<TipoPauDto>();
		for (TipoPau src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}