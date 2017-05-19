package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.CausaleEstinzioneDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.CausaleEstinzione;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class CausaleEstinzioneMapper implements Mapper<CausaleEstinzione, CausaleEstinzioneDto> {

	@Override
	public CausaleEstinzione from(CausaleEstinzioneDto dest) {
		// CausaleEstinzione src = new CausaleEstinzione();
		// CausaleEstinzioneDto dto = new CausaleEstinzioneDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public CausaleEstinzioneDto to(CausaleEstinzione source) {
		CausaleEstinzioneDto dest = new CausaleEstinzioneDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKCausaleEstinzione(), source.getCodCausaleEstinzione(),
				source.getDesCausaleEstinzione(), dest);
		return dest;
	}

	@Override
	public List<CausaleEstinzioneDto> toMany(List<CausaleEstinzione> sourceList) {
		List<CausaleEstinzioneDto> destList = new ArrayList<CausaleEstinzioneDto>();
		for (CausaleEstinzione src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}