package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.PortafogliDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.Portafogli;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class PortafogliMapper implements Mapper<Portafogli, PortafogliDto> {

	@Override
	public Portafogli from(PortafogliDto dest) {
		// Portafogli src = new Portafogli();
		// PortafogliDto dto = new PortafogliDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public PortafogliDto to(Portafogli source) {
		PortafogliDto dest = new PortafogliDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKPortafogli(), source.getCodPortafogli(),
				source.getDesPortafogli(), dest);
		return dest;
	}

	@Override
	public List<PortafogliDto> toMany(List<Portafogli> sourceList) {
		List<PortafogliDto> destList = new ArrayList<PortafogliDto>();
		for (Portafogli src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}