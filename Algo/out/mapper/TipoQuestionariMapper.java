package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoQuestionariDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoQuestionari;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoQuestionariMapper implements Mapper<TipoQuestionari, TipoQuestionariDto> {

	@Override
	public TipoQuestionari from(TipoQuestionariDto dest) {
		// TipoQuestionari src = new TipoQuestionari();
		// TipoQuestionariDto dto = new TipoQuestionariDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoQuestionariDto to(TipoQuestionari source) {
		TipoQuestionariDto dest = new TipoQuestionariDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoQuestionari(), source.getCodTipoQuestionari(),
				source.getDesTipoQuestionari(), dest);
		return dest;
	}

	@Override
	public List<TipoQuestionariDto> toMany(List<TipoQuestionari> sourceList) {
		List<TipoQuestionariDto> destList = new ArrayList<TipoQuestionariDto>();
		for (TipoQuestionari src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}