package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoTitoloPremioDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoTitoloPremio;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoTitoloPremioMapper implements Mapper<TipoTitoloPremio, TipoTitoloPremioDto> {

	@Override
	public TipoTitoloPremio from(TipoTitoloPremioDto dest) {
		// TipoTitoloPremio src = new TipoTitoloPremio();
		// TipoTitoloPremioDto dto = new TipoTitoloPremioDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoTitoloPremioDto to(TipoTitoloPremio source) {
		TipoTitoloPremioDto dest = new TipoTitoloPremioDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoTitoloPremio(), source.getCodTipoTitoloPremio(),
				source.getDesTipoTitoloPremio(), dest);
		return dest;
	}

	@Override
	public List<TipoTitoloPremioDto> toMany(List<TipoTitoloPremio> sourceList) {
		List<TipoTitoloPremioDto> destList = new ArrayList<TipoTitoloPremioDto>();
		for (TipoTitoloPremio src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}