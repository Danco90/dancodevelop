package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.StatoPremioDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.StatoPremio;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class StatoPremioMapper implements Mapper<StatoPremio, StatoPremioDto> {

	@Override
	public StatoPremio from(StatoPremioDto dest) {
		// StatoPremio src = new StatoPremio();
		// StatoPremioDto dto = new StatoPremioDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public StatoPremioDto to(StatoPremio source) {
		StatoPremioDto dest = new StatoPremioDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKStatoPremio(), source.getCodStatoPremio(),
				source.getDesStatoPremio(), dest);
		return dest;
	}

	@Override
	public List<StatoPremioDto> toMany(List<StatoPremio> sourceList) {
		List<StatoPremioDto> destList = new ArrayList<StatoPremioDto>();
		for (StatoPremio src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}