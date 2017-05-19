package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.RaeDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.Rae;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class RaeMapper implements Mapper<Rae, RaeDto> {

	@Override
	public Rae from(RaeDto dest) {
		// Rae src = new Rae();
		// RaeDto dto = new RaeDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public RaeDto to(Rae source) {
		RaeDto dest = new RaeDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKRae(), source.getCodRae(),
				source.getDesRae(), dest);
		return dest;
	}

	@Override
	public List<RaeDto> toMany(List<Rae> sourceList) {
		List<RaeDto> destList = new ArrayList<RaeDto>();
		for (Rae src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}