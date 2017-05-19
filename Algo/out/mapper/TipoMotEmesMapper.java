package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoMotEmesDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoMotEmes;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoMotEmesMapper implements Mapper<TipoMotEmes, TipoMotEmesDto> {

	@Override
	public TipoMotEmes from(TipoMotEmesDto dest) {
		// TipoMotEmes src = new TipoMotEmes();
		// TipoMotEmesDto dto = new TipoMotEmesDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoMotEmesDto to(TipoMotEmes source) {
		TipoMotEmesDto dest = new TipoMotEmesDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoMotEmes(), source.getCodTipoMotEmes(),
				source.getDesTipoMotEmes(), dest);
		return dest;
	}

	@Override
	public List<TipoMotEmesDto> toMany(List<TipoMotEmes> sourceList) {
		List<TipoMotEmesDto> destList = new ArrayList<TipoMotEmesDto>();
		for (TipoMotEmes src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}