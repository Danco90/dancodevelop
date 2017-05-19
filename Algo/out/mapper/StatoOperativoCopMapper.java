package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.StatoOperativoCopDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.StatoOperativoCop;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class StatoOperativoCopMapper implements Mapper<StatoOperativoCop, StatoOperativoCopDto> {

	@Override
	public StatoOperativoCop from(StatoOperativoCopDto dest) {
		// StatoOperativoCop src = new StatoOperativoCop();
		// StatoOperativoCopDto dto = new StatoOperativoCopDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public StatoOperativoCopDto to(StatoOperativoCop source) {
		StatoOperativoCopDto dest = new StatoOperativoCopDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKStatoOperativoCop(), source.getCodStatoOperativoCop(),
				source.getDesStatoOperativoCop(), dest);
		return dest;
	}

	@Override
	public List<StatoOperativoCopDto> toMany(List<StatoOperativoCop> sourceList) {
		List<StatoOperativoCopDto> destList = new ArrayList<StatoOperativoCopDto>();
		for (StatoOperativoCop src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}