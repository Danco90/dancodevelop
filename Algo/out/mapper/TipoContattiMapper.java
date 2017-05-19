package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoContattiDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoContatti;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoContattiMapper implements Mapper<TipoContatti, TipoContattiDto> {

	@Override
	public TipoContatti from(TipoContattiDto dest) {
		// TipoContatti src = new TipoContatti();
		// TipoContattiDto dto = new TipoContattiDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoContattiDto to(TipoContatti source) {
		TipoContattiDto dest = new TipoContattiDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoContatti(), source.getCodTipoContatti(),
				source.getDesTipoContatti(), dest);
		return dest;
	}

	@Override
	public List<TipoContattiDto> toMany(List<TipoContatti> sourceList) {
		List<TipoContattiDto> destList = new ArrayList<TipoContattiDto>();
		for (TipoContatti src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}