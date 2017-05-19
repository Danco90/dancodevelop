package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoRamoContrattoDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoRamoContratto;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoRamoContrattoMapper implements Mapper<TipoRamoContratto, TipoRamoContrattoDto> {

	@Override
	public TipoRamoContratto from(TipoRamoContrattoDto dest) {
		// TipoRamoContratto src = new TipoRamoContratto();
		// TipoRamoContrattoDto dto = new TipoRamoContrattoDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoRamoContrattoDto to(TipoRamoContratto source) {
		TipoRamoContrattoDto dest = new TipoRamoContrattoDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoRamoContratto(), source.getCodTipoRamoContratto(),
				source.getDesTipoRamoContratto(), dest);
		return dest;
	}

	@Override
	public List<TipoRamoContrattoDto> toMany(List<TipoRamoContratto> sourceList) {
		List<TipoRamoContrattoDto> destList = new ArrayList<TipoRamoContrattoDto>();
		for (TipoRamoContratto src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}