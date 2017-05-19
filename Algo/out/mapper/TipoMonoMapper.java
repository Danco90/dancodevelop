package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoMonoDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoMono;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoMonoMapper implements Mapper<TipoMono, TipoMonoDto> {

	@Override
	public TipoMono from(TipoMonoDto dest) {
		// TipoMono src = new TipoMono();
		// TipoMonoDto dto = new TipoMonoDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoMonoDto to(TipoMono source) {
		TipoMonoDto dest = new TipoMonoDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoMono(), source.getCodTipoMono(),
				source.getDesTipoMono(), dest);
		return dest;
	}

	@Override
	public List<TipoMonoDto> toMany(List<TipoMono> sourceList) {
		List<TipoMonoDto> destList = new ArrayList<TipoMonoDto>();
		for (TipoMono src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}