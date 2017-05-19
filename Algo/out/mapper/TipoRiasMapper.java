package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoRiasDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoRias;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoRiasMapper implements Mapper<TipoRias, TipoRiasDto> {

	@Override
	public TipoRias from(TipoRiasDto dest) {
		// TipoRias src = new TipoRias();
		// TipoRiasDto dto = new TipoRiasDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoRiasDto to(TipoRias source) {
		TipoRiasDto dest = new TipoRiasDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoRias(), source.getCodTipoRias(),
				source.getDesTipoRias(), dest);
		return dest;
	}

	@Override
	public List<TipoRiasDto> toMany(List<TipoRias> sourceList) {
		List<TipoRiasDto> destList = new ArrayList<TipoRiasDto>();
		for (TipoRias src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}