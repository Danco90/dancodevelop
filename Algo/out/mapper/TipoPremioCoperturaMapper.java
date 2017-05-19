package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoPremioCoperturaDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoPremioCopertura;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoPremioCoperturaMapper implements Mapper<TipoPremioCopertura, TipoPremioCoperturaDto> {

	@Override
	public TipoPremioCopertura from(TipoPremioCoperturaDto dest) {
		// TipoPremioCopertura src = new TipoPremioCopertura();
		// TipoPremioCoperturaDto dto = new TipoPremioCoperturaDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoPremioCoperturaDto to(TipoPremioCopertura source) {
		TipoPremioCoperturaDto dest = new TipoPremioCoperturaDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoPremioCopertura(), source.getCodTipoPremioCopertura(),
				source.getDesTipoPremioCopertura(), dest);
		return dest;
	}

	@Override
	public List<TipoPremioCoperturaDto> toMany(List<TipoPremioCopertura> sourceList) {
		List<TipoPremioCoperturaDto> destList = new ArrayList<TipoPremioCoperturaDto>();
		for (TipoPremioCopertura src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}