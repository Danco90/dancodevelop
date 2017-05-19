package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.SaeDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.Sae;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class SaeMapper implements Mapper<Sae, SaeDto> {

	@Override
	public Sae from(SaeDto dest) {
		// Sae src = new Sae();
		// SaeDto dto = new SaeDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public SaeDto to(Sae source) {
		SaeDto dest = new SaeDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKSae(), source.getCodSae(),
				source.getDesSae(), dest);
		return dest;
	}

	@Override
	public List<SaeDto> toMany(List<Sae> sourceList) {
		List<SaeDto> destList = new ArrayList<SaeDto>();
		for (Sae src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}