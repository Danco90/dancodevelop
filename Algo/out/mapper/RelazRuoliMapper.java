package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.RelazRuoliDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.RelazRuoli;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class RelazRuoliMapper implements Mapper<RelazRuoli, RelazRuoliDto> {

	@Override
	public RelazRuoli from(RelazRuoliDto dest) {
		// RelazRuoli src = new RelazRuoli();
		// RelazRuoliDto dto = new RelazRuoliDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public RelazRuoliDto to(RelazRuoli source) {
		RelazRuoliDto dest = new RelazRuoliDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKRelazRuoli(), source.getCodRelazRuoli(),
				source.getDesRelazRuoli(), dest);
		return dest;
	}

	@Override
	public List<RelazRuoliDto> toMany(List<RelazRuoli> sourceList) {
		List<RelazRuoliDto> destList = new ArrayList<RelazRuoliDto>();
		for (RelazRuoli src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}