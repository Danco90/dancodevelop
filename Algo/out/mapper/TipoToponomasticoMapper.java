package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoToponomasticoDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoToponomastico;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoToponomasticoMapper implements Mapper<TipoToponomastico, TipoToponomasticoDto> {

	@Override
	public TipoToponomastico from(TipoToponomasticoDto dest) {
		// TipoToponomastico src = new TipoToponomastico();
		// TipoToponomasticoDto dto = new TipoToponomasticoDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoToponomasticoDto to(TipoToponomastico source) {
		TipoToponomasticoDto dest = new TipoToponomasticoDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoToponomastico(), source.getCodTipoToponomastico(),
				source.getDesTipoToponomastico(), dest);
		return dest;
	}

	@Override
	public List<TipoToponomasticoDto> toMany(List<TipoToponomastico> sourceList) {
		List<TipoToponomasticoDto> destList = new ArrayList<TipoToponomasticoDto>();
		for (TipoToponomastico src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}