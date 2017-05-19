package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoConverDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoConver;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoConverMapper implements Mapper<TipoConver, TipoConverDto> {

	@Override
	public TipoConver from(TipoConverDto dest) {
		// TipoConver src = new TipoConver();
		// TipoConverDto dto = new TipoConverDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoConverDto to(TipoConver source) {
		TipoConverDto dest = new TipoConverDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoConver(), source.getCodTipoConver(),
				source.getDesTipoConver(), dest);
		return dest;
	}

	@Override
	public List<TipoConverDto> toMany(List<TipoConver> sourceList) {
		List<TipoConverDto> destList = new ArrayList<TipoConverDto>();
		for (TipoConver src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}