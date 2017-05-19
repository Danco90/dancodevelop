package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoPremioDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoPremio;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoPremioMapper implements Mapper<TipoPremio, TipoPremioDto> {

	@Override
	public TipoPremio from(TipoPremioDto dest) {
		// TipoPremio src = new TipoPremio();
		// TipoPremioDto dto = new TipoPremioDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoPremioDto to(TipoPremio source) {
		TipoPremioDto dest = new TipoPremioDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoPremio(), source.getCodTipoPremio(),
				source.getDesTipoPremio(), dest);
		return dest;
	}

	@Override
	public List<TipoPremioDto> toMany(List<TipoPremio> sourceList) {
		List<TipoPremioDto> destList = new ArrayList<TipoPremioDto>();
		for (TipoPremio src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}