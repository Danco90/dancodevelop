package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoProfessioniDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoProfessioni;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoProfessioniMapper implements Mapper<TipoProfessioni, TipoProfessioniDto> {

	@Override
	public TipoProfessioni from(TipoProfessioniDto dest) {
		// TipoProfessioni src = new TipoProfessioni();
		// TipoProfessioniDto dto = new TipoProfessioniDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoProfessioniDto to(TipoProfessioni source) {
		TipoProfessioniDto dest = new TipoProfessioniDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoProfessioni(), source.getCodTipoProfessioni(),
				source.getDesTipoProfessioni(), dest);
		return dest;
	}

	@Override
	public List<TipoProfessioniDto> toMany(List<TipoProfessioni> sourceList) {
		List<TipoProfessioniDto> destList = new ArrayList<TipoProfessioniDto>();
		for (TipoProfessioni src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}