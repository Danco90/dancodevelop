package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.CompagniaDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.Compagnia;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class CompagniaMapper implements Mapper<Compagnia, CompagniaDto> {

	@Override
	public Compagnia from(CompagniaDto dest) {
		// Compagnia src = new Compagnia();
		// CompagniaDto dto = new CompagniaDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public CompagniaDto to(Compagnia source) {
		CompagniaDto dest = new CompagniaDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKCompagnia(), source.getCodCompagnia(),
				source.getDesCompagnia(), dest);
		return dest;
	}

	@Override
	public List<CompagniaDto> toMany(List<Compagnia> sourceList) {
		List<CompagniaDto> destList = new ArrayList<CompagniaDto>();
		for (Compagnia src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}