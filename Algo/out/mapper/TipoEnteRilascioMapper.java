package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoEnteRilascioDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoEnteRilascio;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoEnteRilascioMapper implements Mapper<TipoEnteRilascio, TipoEnteRilascioDto> {

	@Override
	public TipoEnteRilascio from(TipoEnteRilascioDto dest) {
		// TipoEnteRilascio src = new TipoEnteRilascio();
		// TipoEnteRilascioDto dto = new TipoEnteRilascioDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoEnteRilascioDto to(TipoEnteRilascio source) {
		TipoEnteRilascioDto dest = new TipoEnteRilascioDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoEnteRilascio(), source.getCodTipoEnteRilascio(),
				source.getDesTipoEnteRilascio(), dest);
		return dest;
	}

	@Override
	public List<TipoEnteRilascioDto> toMany(List<TipoEnteRilascio> sourceList) {
		List<TipoEnteRilascioDto> destList = new ArrayList<TipoEnteRilascioDto>();
		for (TipoEnteRilascio src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}