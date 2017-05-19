package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoContrattoDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoContratto;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoContrattoMapper implements Mapper<TipoContratto, TipoContrattoDto> {

	@Override
	public TipoContratto from(TipoContrattoDto dest) {
		// TipoContratto src = new TipoContratto();
		// TipoContrattoDto dto = new TipoContrattoDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoContrattoDto to(TipoContratto source) {
		TipoContrattoDto dest = new TipoContrattoDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoContratto(), source.getCodTipoContratto(),
				source.getDesTipoContratto(), dest);
		return dest;
	}

	@Override
	public List<TipoContrattoDto> toMany(List<TipoContratto> sourceList) {
		List<TipoContrattoDto> destList = new ArrayList<TipoContrattoDto>();
		for (TipoContratto src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}