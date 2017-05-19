package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoSelezioneDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoSelezione;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoSelezioneMapper implements Mapper<TipoSelezione, TipoSelezioneDto> {

	@Override
	public TipoSelezione from(TipoSelezioneDto dest) {
		// TipoSelezione src = new TipoSelezione();
		// TipoSelezioneDto dto = new TipoSelezioneDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoSelezioneDto to(TipoSelezione source) {
		TipoSelezioneDto dest = new TipoSelezioneDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoSelezione(), source.getCodTipoSelezione(),
				source.getDesTipoSelezione(), dest);
		return dest;
	}

	@Override
	public List<TipoSelezioneDto> toMany(List<TipoSelezione> sourceList) {
		List<TipoSelezioneDto> destList = new ArrayList<TipoSelezioneDto>();
		for (TipoSelezione src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}