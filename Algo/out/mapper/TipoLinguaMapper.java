package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoLinguaDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoLingua;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoLinguaMapper implements Mapper<TipoLingua, TipoLinguaDto> {

	@Override
	public TipoLingua from(TipoLinguaDto dest) {
		// TipoLingua src = new TipoLingua();
		// TipoLinguaDto dto = new TipoLinguaDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoLinguaDto to(TipoLingua source) {
		TipoLinguaDto dest = new TipoLinguaDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoLingua(), source.getCodTipoLingua(),
				source.getDesTipoLingua(), dest);
		return dest;
	}

	@Override
	public List<TipoLinguaDto> toMany(List<TipoLingua> sourceList) {
		List<TipoLinguaDto> destList = new ArrayList<TipoLinguaDto>();
		for (TipoLingua src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}