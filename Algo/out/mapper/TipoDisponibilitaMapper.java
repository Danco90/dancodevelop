package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoDisponibilitaDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoDisponibilita;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoDisponibilitaMapper implements Mapper<TipoDisponibilita, TipoDisponibilitaDto> {

	@Override
	public TipoDisponibilita from(TipoDisponibilitaDto dest) {
		// TipoDisponibilita src = new TipoDisponibilita();
		// TipoDisponibilitaDto dto = new TipoDisponibilitaDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoDisponibilitaDto to(TipoDisponibilita source) {
		TipoDisponibilitaDto dest = new TipoDisponibilitaDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoDisponibilita(), source.getCodTipoDisponibilita(),
				source.getDesTipoDisponibilita(), dest);
		return dest;
	}

	@Override
	public List<TipoDisponibilitaDto> toMany(List<TipoDisponibilita> sourceList) {
		List<TipoDisponibilitaDto> destList = new ArrayList<TipoDisponibilitaDto>();
		for (TipoDisponibilita src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}