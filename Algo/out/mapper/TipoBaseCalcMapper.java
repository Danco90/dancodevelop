package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoBaseCalcDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoBaseCalc;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoBaseCalcMapper implements Mapper<TipoBaseCalc, TipoBaseCalcDto> {

	@Override
	public TipoBaseCalc from(TipoBaseCalcDto dest) {
		// TipoBaseCalc src = new TipoBaseCalc();
		// TipoBaseCalcDto dto = new TipoBaseCalcDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoBaseCalcDto to(TipoBaseCalc source) {
		TipoBaseCalcDto dest = new TipoBaseCalcDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoBaseCalc(), source.getCodTipoBaseCalc(),
				source.getDesTipoBaseCalc(), dest);
		return dest;
	}

	@Override
	public List<TipoBaseCalcDto> toMany(List<TipoBaseCalc> sourceList) {
		List<TipoBaseCalcDto> destList = new ArrayList<TipoBaseCalcDto>();
		for (TipoBaseCalc src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}