package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoRivalutazioneDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoRivalutazione;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoRivalutazioneMapper implements Mapper<TipoRivalutazione, TipoRivalutazioneDto> {

	@Override
	public TipoRivalutazione from(TipoRivalutazioneDto dest) {
		// TipoRivalutazione src = new TipoRivalutazione();
		// TipoRivalutazioneDto dto = new TipoRivalutazioneDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoRivalutazioneDto to(TipoRivalutazione source) {
		TipoRivalutazioneDto dest = new TipoRivalutazioneDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoRivalutazione(), source.getCodTipoRivalutazione(),
				source.getDesTipoRivalutazione(), dest);
		return dest;
	}

	@Override
	public List<TipoRivalutazioneDto> toMany(List<TipoRivalutazione> sourceList) {
		List<TipoRivalutazioneDto> destList = new ArrayList<TipoRivalutazioneDto>();
		for (TipoRivalutazione src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}