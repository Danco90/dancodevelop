package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoPromozDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoPromoz;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoPromozMapper implements Mapper<TipoPromoz, TipoPromozDto> {

	@Override
	public TipoPromoz from(TipoPromozDto dest) {
		// TipoPromoz src = new TipoPromoz();
		// TipoPromozDto dto = new TipoPromozDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoPromozDto to(TipoPromoz source) {
		TipoPromozDto dest = new TipoPromozDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoPromoz(), source.getCodTipoPromoz(),
				source.getDesTipoPromoz(), dest);
		return dest;
	}

	@Override
	public List<TipoPromozDto> toMany(List<TipoPromoz> sourceList) {
		List<TipoPromozDto> destList = new ArrayList<TipoPromozDto>();
		for (TipoPromoz src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}