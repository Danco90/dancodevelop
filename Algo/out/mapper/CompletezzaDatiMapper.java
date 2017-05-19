package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.CompletezzaDatiDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.CompletezzaDati;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class CompletezzaDatiMapper implements Mapper<CompletezzaDati, CompletezzaDatiDto> {

	@Override
	public CompletezzaDati from(CompletezzaDatiDto dest) {
		// CompletezzaDati src = new CompletezzaDati();
		// CompletezzaDatiDto dto = new CompletezzaDatiDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public CompletezzaDatiDto to(CompletezzaDati source) {
		CompletezzaDatiDto dest = new CompletezzaDatiDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKCompletezzaDati(), source.getCodCompletezzaDati(),
				source.getDesCompletezzaDati(), dest);
		return dest;
	}

	@Override
	public List<CompletezzaDatiDto> toMany(List<CompletezzaDati> sourceList) {
		List<CompletezzaDatiDto> destList = new ArrayList<CompletezzaDatiDto>();
		for (CompletezzaDati src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}