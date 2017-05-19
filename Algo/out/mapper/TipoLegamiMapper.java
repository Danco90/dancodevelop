package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoLegamiDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoLegami;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoLegamiMapper implements Mapper<TipoLegami, TipoLegamiDto> {

	@Override
	public TipoLegami from(TipoLegamiDto dest) {
		// TipoLegami src = new TipoLegami();
		// TipoLegamiDto dto = new TipoLegamiDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoLegamiDto to(TipoLegami source) {
		TipoLegamiDto dest = new TipoLegamiDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoLegami(), source.getCodTipoLegami(),
				source.getDesTipoLegami(), dest);
		return dest;
	}

	@Override
	public List<TipoLegamiDto> toMany(List<TipoLegami> sourceList) {
		List<TipoLegamiDto> destList = new ArrayList<TipoLegamiDto>();
		for (TipoLegami src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}