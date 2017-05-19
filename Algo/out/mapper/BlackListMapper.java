package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.BlackListDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.BlackList;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class BlackListMapper implements Mapper<BlackList, BlackListDto> {

	@Override
	public BlackList from(BlackListDto dest) {
		// BlackList src = new BlackList();
		// BlackListDto dto = new BlackListDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public BlackListDto to(BlackList source) {
		BlackListDto dest = new BlackListDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKBlackList(), source.getCodBlackList(),
				source.getDesBlackList(), dest);
		return dest;
	}

	@Override
	public List<BlackListDto> toMany(List<BlackList> sourceList) {
		List<BlackListDto> destList = new ArrayList<BlackListDto>();
		for (BlackList src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}