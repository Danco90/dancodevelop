package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.ModUtilizzoMailDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.ModUtilizzoMail;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class ModUtilizzoMailMapper implements Mapper<ModUtilizzoMail, ModUtilizzoMailDto> {

	@Override
	public ModUtilizzoMail from(ModUtilizzoMailDto dest) {
		// ModUtilizzoMail src = new ModUtilizzoMail();
		// ModUtilizzoMailDto dto = new ModUtilizzoMailDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public ModUtilizzoMailDto to(ModUtilizzoMail source) {
		ModUtilizzoMailDto dest = new ModUtilizzoMailDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKModUtilizzoMail(), source.getCodModUtilizzoMail(),
				source.getDesModUtilizzoMail(), dest);
		return dest;
	}

	@Override
	public List<ModUtilizzoMailDto> toMany(List<ModUtilizzoMail> sourceList) {
		List<ModUtilizzoMailDto> destList = new ArrayList<ModUtilizzoMailDto>();
		for (ModUtilizzoMail src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}