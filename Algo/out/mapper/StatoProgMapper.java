package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.StatoProgDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.StatoProg;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class StatoProgMapper implements Mapper<StatoProg, StatoProgDto> {

	@Override
	public StatoProg from(StatoProgDto dest) {
		// StatoProg src = new StatoProg();
		// StatoProgDto dto = new StatoProgDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public StatoProgDto to(StatoProg source) {
		StatoProgDto dest = new StatoProgDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKStatoProg(), source.getCodStatoProg(),
				source.getDesStatoProg(), dest);
		return dest;
	}

	@Override
	public List<StatoProgDto> toMany(List<StatoProg> sourceList) {
		List<StatoProgDto> destList = new ArrayList<StatoProgDto>();
		for (StatoProg src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}