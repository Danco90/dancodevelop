package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoEsitoPremDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoEsitoPrem;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoEsitoPremMapper implements Mapper<TipoEsitoPrem, TipoEsitoPremDto> {

	@Override
	public TipoEsitoPrem from(TipoEsitoPremDto dest) {
		// TipoEsitoPrem src = new TipoEsitoPrem();
		// TipoEsitoPremDto dto = new TipoEsitoPremDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoEsitoPremDto to(TipoEsitoPrem source) {
		TipoEsitoPremDto dest = new TipoEsitoPremDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoEsitoPrem(), source.getCodTipoEsitoPrem(),
				source.getDesTipoEsitoPrem(), dest);
		return dest;
	}

	@Override
	public List<TipoEsitoPremDto> toMany(List<TipoEsitoPrem> sourceList) {
		List<TipoEsitoPremDto> destList = new ArrayList<TipoEsitoPremDto>();
		for (TipoEsitoPrem src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}