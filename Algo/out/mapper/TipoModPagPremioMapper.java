package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoModPagPremioDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoModPagPremio;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoModPagPremioMapper implements Mapper<TipoModPagPremio, TipoModPagPremioDto> {

	@Override
	public TipoModPagPremio from(TipoModPagPremioDto dest) {
		// TipoModPagPremio src = new TipoModPagPremio();
		// TipoModPagPremioDto dto = new TipoModPagPremioDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoModPagPremioDto to(TipoModPagPremio source) {
		TipoModPagPremioDto dest = new TipoModPagPremioDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoModPagPremio(), source.getCodTipoModPagPremio(),
				source.getDesTipoModPagPremio(), dest);
		return dest;
	}

	@Override
	public List<TipoModPagPremioDto> toMany(List<TipoModPagPremio> sourceList) {
		List<TipoModPagPremioDto> destList = new ArrayList<TipoModPagPremioDto>();
		for (TipoModPagPremio src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}