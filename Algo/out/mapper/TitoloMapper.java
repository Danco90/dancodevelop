package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TitoloDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.Titolo;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TitoloMapper implements Mapper<Titolo, TitoloDto> {

	@Override
	public Titolo from(TitoloDto dest) {
		// Titolo src = new Titolo();
		// TitoloDto dto = new TitoloDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TitoloDto to(Titolo source) {
		TitoloDto dest = new TitoloDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTitolo(), source.getCodTitolo(),
				source.getDesTitolo(), dest);
		return dest;
	}

	@Override
	public List<TitoloDto> toMany(List<Titolo> sourceList) {
		List<TitoloDto> destList = new ArrayList<TitoloDto>();
		for (Titolo src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}