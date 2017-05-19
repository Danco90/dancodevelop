package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoProtDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoProt;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoProtMapper implements Mapper<TipoProt, TipoProtDto> {

	@Override
	public TipoProt from(TipoProtDto dest) {
		// TipoProt src = new TipoProt();
		// TipoProtDto dto = new TipoProtDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoProtDto to(TipoProt source) {
		TipoProtDto dest = new TipoProtDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoProt(), source.getCodTipoProt(),
				source.getDesTipoProt(), dest);
		return dest;
	}

	@Override
	public List<TipoProtDto> toMany(List<TipoProt> sourceList) {
		List<TipoProtDto> destList = new ArrayList<TipoProtDto>();
		for (TipoProt src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}