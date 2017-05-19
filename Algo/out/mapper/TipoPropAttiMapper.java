package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoPropAttiDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoPropAtti;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoPropAttiMapper implements Mapper<TipoPropAtti, TipoPropAttiDto> {

	@Override
	public TipoPropAtti from(TipoPropAttiDto dest) {
		// TipoPropAtti src = new TipoPropAtti();
		// TipoPropAttiDto dto = new TipoPropAttiDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoPropAttiDto to(TipoPropAtti source) {
		TipoPropAttiDto dest = new TipoPropAttiDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoPropAtti(), source.getCodTipoPropAtti(),
				source.getDesTipoPropAtti(), dest);
		return dest;
	}

	@Override
	public List<TipoPropAttiDto> toMany(List<TipoPropAtti> sourceList) {
		List<TipoPropAttiDto> destList = new ArrayList<TipoPropAttiDto>();
		for (TipoPropAtti src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}