package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoCoperturaDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoCopertura;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoCoperturaMapper implements Mapper<TipoCopertura, TipoCoperturaDto> {

	@Override
	public TipoCopertura from(TipoCoperturaDto dest) {
		// TipoCopertura src = new TipoCopertura();
		// TipoCoperturaDto dto = new TipoCoperturaDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoCoperturaDto to(TipoCopertura source) {
		TipoCoperturaDto dest = new TipoCoperturaDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoCopertura(), source.getCodTipoCopertura(),
				source.getDesTipoCopertura(), dest);
		return dest;
	}

	@Override
	public List<TipoCoperturaDto> toMany(List<TipoCopertura> sourceList) {
		List<TipoCoperturaDto> destList = new ArrayList<TipoCoperturaDto>();
		for (TipoCopertura src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}