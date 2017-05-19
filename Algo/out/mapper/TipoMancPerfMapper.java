package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoMancPerfDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoMancPerf;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoMancPerfMapper implements Mapper<TipoMancPerf, TipoMancPerfDto> {

	@Override
	public TipoMancPerf from(TipoMancPerfDto dest) {
		// TipoMancPerf src = new TipoMancPerf();
		// TipoMancPerfDto dto = new TipoMancPerfDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoMancPerfDto to(TipoMancPerf source) {
		TipoMancPerfDto dest = new TipoMancPerfDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoMancPerf(), source.getCodTipoMancPerf(),
				source.getDesTipoMancPerf(), dest);
		return dest;
	}

	@Override
	public List<TipoMancPerfDto> toMany(List<TipoMancPerf> sourceList) {
		List<TipoMancPerfDto> destList = new ArrayList<TipoMancPerfDto>();
		for (TipoMancPerf src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}