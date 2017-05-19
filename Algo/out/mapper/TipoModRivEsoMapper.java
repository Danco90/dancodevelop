package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoModRivEsoDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoModRivEso;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoModRivEsoMapper implements Mapper<TipoModRivEso, TipoModRivEsoDto> {

	@Override
	public TipoModRivEso from(TipoModRivEsoDto dest) {
		// TipoModRivEso src = new TipoModRivEso();
		// TipoModRivEsoDto dto = new TipoModRivEsoDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoModRivEsoDto to(TipoModRivEso source) {
		TipoModRivEsoDto dest = new TipoModRivEsoDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoModRivEso(), source.getCodTipoModRivEso(),
				source.getDesTipoModRivEso(), dest);
		return dest;
	}

	@Override
	public List<TipoModRivEsoDto> toMany(List<TipoModRivEso> sourceList) {
		List<TipoModRivEsoDto> destList = new ArrayList<TipoModRivEsoDto>();
		for (TipoModRivEso src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}