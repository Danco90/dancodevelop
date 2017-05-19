package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoModalitaDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoModalita;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoModalitaMapper implements Mapper<TipoModalita, TipoModalitaDto> {

	@Override
	public TipoModalita from(TipoModalitaDto dest) {
		// TipoModalita src = new TipoModalita();
		// TipoModalitaDto dto = new TipoModalitaDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoModalitaDto to(TipoModalita source) {
		TipoModalitaDto dest = new TipoModalitaDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoModalita(), source.getCodTipoModalita(),
				source.getDesTipoModalita(), dest);
		return dest;
	}

	@Override
	public List<TipoModalitaDto> toMany(List<TipoModalita> sourceList) {
		List<TipoModalitaDto> destList = new ArrayList<TipoModalitaDto>();
		for (TipoModalita src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}