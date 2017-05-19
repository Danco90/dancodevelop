package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoSportDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoSport;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoSportMapper implements Mapper<TipoSport, TipoSportDto> {

	@Override
	public TipoSport from(TipoSportDto dest) {
		// TipoSport src = new TipoSport();
		// TipoSportDto dto = new TipoSportDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoSportDto to(TipoSport source) {
		TipoSportDto dest = new TipoSportDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoSport(), source.getCodTipoSport(),
				source.getDesTipoSport(), dest);
		return dest;
	}

	@Override
	public List<TipoSportDto> toMany(List<TipoSport> sourceList) {
		List<TipoSportDto> destList = new ArrayList<TipoSportDto>();
		for (TipoSport src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}