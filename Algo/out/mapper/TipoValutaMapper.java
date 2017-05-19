package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoValutaDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoValuta;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoValutaMapper implements Mapper<TipoValuta, TipoValutaDto> {

	@Override
	public TipoValuta from(TipoValutaDto dest) {
		// TipoValuta src = new TipoValuta();
		// TipoValutaDto dto = new TipoValutaDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoValutaDto to(TipoValuta source) {
		TipoValutaDto dest = new TipoValutaDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoValuta(), source.getCodTipoValuta(),
				source.getDesTipoValuta(), dest);
		return dest;
	}

	@Override
	public List<TipoValutaDto> toMany(List<TipoValuta> sourceList) {
		List<TipoValutaDto> destList = new ArrayList<TipoValutaDto>();
		for (TipoValuta src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}