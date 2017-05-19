package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.StatoCivileDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.StatoCivile;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class StatoCivileMapper implements Mapper<StatoCivile, StatoCivileDto> {

	@Override
	public StatoCivile from(StatoCivileDto dest) {
		// StatoCivile src = new StatoCivile();
		// StatoCivileDto dto = new StatoCivileDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public StatoCivileDto to(StatoCivile source) {
		StatoCivileDto dest = new StatoCivileDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKStatoCivile(), source.getCodStatoCivile(),
				source.getDesStatoCivile(), dest);
		return dest;
	}

	@Override
	public List<StatoCivileDto> toMany(List<StatoCivile> sourceList) {
		List<StatoCivileDto> destList = new ArrayList<StatoCivileDto>();
		for (StatoCivile src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}