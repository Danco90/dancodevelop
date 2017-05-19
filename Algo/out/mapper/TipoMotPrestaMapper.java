package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoMotPrestaDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoMotPresta;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoMotPrestaMapper implements Mapper<TipoMotPresta, TipoMotPrestaDto> {

	@Override
	public TipoMotPresta from(TipoMotPrestaDto dest) {
		// TipoMotPresta src = new TipoMotPresta();
		// TipoMotPrestaDto dto = new TipoMotPrestaDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoMotPrestaDto to(TipoMotPresta source) {
		TipoMotPrestaDto dest = new TipoMotPrestaDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoMotPresta(), source.getCodTipoMotPresta(),
				source.getDesTipoMotPresta(), dest);
		return dest;
	}

	@Override
	public List<TipoMotPrestaDto> toMany(List<TipoMotPresta> sourceList) {
		List<TipoMotPrestaDto> destList = new ArrayList<TipoMotPrestaDto>();
		for (TipoMotPresta src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}