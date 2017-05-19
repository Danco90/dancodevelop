package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.StatoPropDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.StatoProp;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class StatoPropMapper implements Mapper<StatoProp, StatoPropDto> {

	@Override
	public StatoProp from(StatoPropDto dest) {
		// StatoProp src = new StatoProp();
		// StatoPropDto dto = new StatoPropDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public StatoPropDto to(StatoProp source) {
		StatoPropDto dest = new StatoPropDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKStatoProp(), source.getCodStatoProp(),
				source.getDesStatoProp(), dest);
		return dest;
	}

	@Override
	public List<StatoPropDto> toMany(List<StatoProp> sourceList) {
		List<StatoPropDto> destList = new ArrayList<StatoPropDto>();
		for (StatoProp src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}