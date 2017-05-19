package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoRuoloDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoRuolo;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoRuoloMapper implements Mapper<TipoRuolo, TipoRuoloDto> {

	@Override
	public TipoRuolo from(TipoRuoloDto dest) {
		// TipoRuolo src = new TipoRuolo();
		// TipoRuoloDto dto = new TipoRuoloDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoRuoloDto to(TipoRuolo source) {
		TipoRuoloDto dest = new TipoRuoloDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoRuolo(), source.getCodTipoRuolo(),
				source.getDesTipoRuolo(), dest);
		return dest;
	}

	@Override
	public List<TipoRuoloDto> toMany(List<TipoRuolo> sourceList) {
		List<TipoRuoloDto> destList = new ArrayList<TipoRuoloDto>();
		for (TipoRuolo src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}