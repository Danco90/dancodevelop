package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.SessoDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.Sesso;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class SessoMapper implements Mapper<Sesso, SessoDto> {

	@Override
	public Sesso from(SessoDto dest) {
		// Sesso src = new Sesso();
		// SessoDto dto = new SessoDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public SessoDto to(Sesso source) {
		SessoDto dest = new SessoDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKSesso(), source.getCodSesso(),
				source.getDesSesso(), dest);
		return dest;
	}

	@Override
	public List<SessoDto> toMany(List<Sesso> sourceList) {
		List<SessoDto> destList = new ArrayList<SessoDto>();
		for (Sesso src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}