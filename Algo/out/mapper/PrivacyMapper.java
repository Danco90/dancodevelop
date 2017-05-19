package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.PrivacyDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.Privacy;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class PrivacyMapper implements Mapper<Privacy, PrivacyDto> {

	@Override
	public Privacy from(PrivacyDto dest) {
		// Privacy src = new Privacy();
		// PrivacyDto dto = new PrivacyDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public PrivacyDto to(Privacy source) {
		PrivacyDto dest = new PrivacyDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKPrivacy(), source.getCodPrivacy(),
				source.getDesPrivacy(), dest);
		return dest;
	}

	@Override
	public List<PrivacyDto> toMany(List<Privacy> sourceList) {
		List<PrivacyDto> destList = new ArrayList<PrivacyDto>();
		for (Privacy src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}