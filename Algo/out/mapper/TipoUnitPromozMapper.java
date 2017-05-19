package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoUnitPromozDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoUnitPromoz;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoUnitPromozMapper implements Mapper<TipoUnitPromoz, TipoUnitPromozDto> {

	@Override
	public TipoUnitPromoz from(TipoUnitPromozDto dest) {
		// TipoUnitPromoz src = new TipoUnitPromoz();
		// TipoUnitPromozDto dto = new TipoUnitPromozDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoUnitPromozDto to(TipoUnitPromoz source) {
		TipoUnitPromozDto dest = new TipoUnitPromozDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoUnitPromoz(), source.getCodTipoUnitPromoz(),
				source.getDesTipoUnitPromoz(), dest);
		return dest;
	}

	@Override
	public List<TipoUnitPromozDto> toMany(List<TipoUnitPromoz> sourceList) {
		List<TipoUnitPromozDto> destList = new ArrayList<TipoUnitPromozDto>();
		for (TipoUnitPromoz src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}