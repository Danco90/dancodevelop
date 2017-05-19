package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoTitoloStudioDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoTitoloStudio;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoTitoloStudioMapper implements Mapper<TipoTitoloStudio, TipoTitoloStudioDto> {

	@Override
	public TipoTitoloStudio from(TipoTitoloStudioDto dest) {
		// TipoTitoloStudio src = new TipoTitoloStudio();
		// TipoTitoloStudioDto dto = new TipoTitoloStudioDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoTitoloStudioDto to(TipoTitoloStudio source) {
		TipoTitoloStudioDto dest = new TipoTitoloStudioDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoTitoloStudio(), source.getCodTipoTitoloStudio(),
				source.getDesTipoTitoloStudio(), dest);
		return dest;
	}

	@Override
	public List<TipoTitoloStudioDto> toMany(List<TipoTitoloStudio> sourceList) {
		List<TipoTitoloStudioDto> destList = new ArrayList<TipoTitoloStudioDto>();
		for (TipoTitoloStudio src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}