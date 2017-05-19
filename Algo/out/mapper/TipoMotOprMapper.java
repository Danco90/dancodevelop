package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoMotOprDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoMotOpr;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoMotOprMapper implements Mapper<TipoMotOpr, TipoMotOprDto> {

	@Override
	public TipoMotOpr from(TipoMotOprDto dest) {
		// TipoMotOpr src = new TipoMotOpr();
		// TipoMotOprDto dto = new TipoMotOprDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoMotOprDto to(TipoMotOpr source) {
		TipoMotOprDto dest = new TipoMotOprDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoMotOpr(), source.getCodTipoMotOpr(),
				source.getDesTipoMotOpr(), dest);
		return dest;
	}

	@Override
	public List<TipoMotOprDto> toMany(List<TipoMotOpr> sourceList) {
		List<TipoMotOprDto> destList = new ArrayList<TipoMotOprDto>();
		for (TipoMotOpr src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}