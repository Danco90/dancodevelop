package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoUnitMercDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoUnitMerc;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoUnitMercMapper implements Mapper<TipoUnitMerc, TipoUnitMercDto> {

	@Override
	public TipoUnitMerc from(TipoUnitMercDto dest) {
		// TipoUnitMerc src = new TipoUnitMerc();
		// TipoUnitMercDto dto = new TipoUnitMercDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoUnitMercDto to(TipoUnitMerc source) {
		TipoUnitMercDto dest = new TipoUnitMercDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoUnitMerc(), source.getCodTipoUnitMerc(),
				source.getDesTipoUnitMerc(), dest);
		return dest;
	}

	@Override
	public List<TipoUnitMercDto> toMany(List<TipoUnitMerc> sourceList) {
		List<TipoUnitMercDto> destList = new ArrayList<TipoUnitMercDto>();
		for (TipoUnitMerc src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}