package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.PaesiBlackListDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.PaesiBlackList;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class PaesiBlackListMapper implements Mapper<PaesiBlackList, PaesiBlackListDto> {

	@Override
	public PaesiBlackList from(PaesiBlackListDto dest) {
		// PaesiBlackList src = new PaesiBlackList();
		// PaesiBlackListDto dto = new PaesiBlackListDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public PaesiBlackListDto to(PaesiBlackList source) {
		PaesiBlackListDto dest = new PaesiBlackListDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKPaesiBlackList(), source.getCodPaesiBlackList(),
				source.getDesPaesiBlackList(), dest);
		return dest;
	}

	@Override
	public List<PaesiBlackListDto> toMany(List<PaesiBlackList> sourceList) {
		List<PaesiBlackListDto> destList = new ArrayList<PaesiBlackListDto>();
		for (PaesiBlackList src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}