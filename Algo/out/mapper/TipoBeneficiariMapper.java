package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoBeneficiariDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoBeneficiari;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoBeneficiariMapper implements Mapper<TipoBeneficiari, TipoBeneficiariDto> {

	@Override
	public TipoBeneficiari from(TipoBeneficiariDto dest) {
		// TipoBeneficiari src = new TipoBeneficiari();
		// TipoBeneficiariDto dto = new TipoBeneficiariDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoBeneficiariDto to(TipoBeneficiari source) {
		TipoBeneficiariDto dest = new TipoBeneficiariDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoBeneficiari(), source.getCodTipoBeneficiari(),
				source.getDesTipoBeneficiari(), dest);
		return dest;
	}

	@Override
	public List<TipoBeneficiariDto> toMany(List<TipoBeneficiari> sourceList) {
		List<TipoBeneficiariDto> destList = new ArrayList<TipoBeneficiariDto>();
		for (TipoBeneficiari src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}