package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.FamigliaNodoDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.FamigliaNodo;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class FamigliaNodoMapper implements Mapper<FamigliaNodo, FamigliaNodoDto> {

	@Override
	public FamigliaNodo from(FamigliaNodoDto dest) {
		// FamigliaNodo src = new FamigliaNodo();
		// FamigliaNodoDto dto = new FamigliaNodoDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public FamigliaNodoDto to(FamigliaNodo source) {
		FamigliaNodoDto dest = new FamigliaNodoDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKFamigliaNodo(), source.getCodFamigliaNodo(),
				source.getDesFamigliaNodo(), dest);
		return dest;
	}

	@Override
	public List<FamigliaNodoDto> toMany(List<FamigliaNodo> sourceList) {
		List<FamigliaNodoDto> destList = new ArrayList<FamigliaNodoDto>();
		for (FamigliaNodo src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}