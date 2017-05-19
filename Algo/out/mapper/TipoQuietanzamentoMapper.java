package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoQuietanzamentoDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoQuietanzamento;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoQuietanzamentoMapper implements Mapper<TipoQuietanzamento, TipoQuietanzamentoDto> {

	@Override
	public TipoQuietanzamento from(TipoQuietanzamentoDto dest) {
		// TipoQuietanzamento src = new TipoQuietanzamento();
		// TipoQuietanzamentoDto dto = new TipoQuietanzamentoDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoQuietanzamentoDto to(TipoQuietanzamento source) {
		TipoQuietanzamentoDto dest = new TipoQuietanzamentoDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoQuietanzamento(), source.getCodTipoQuietanzamento(),
				source.getDesTipoQuietanzamento(), dest);
		return dest;
	}

	@Override
	public List<TipoQuietanzamentoDto> toMany(List<TipoQuietanzamento> sourceList) {
		List<TipoQuietanzamentoDto> destList = new ArrayList<TipoQuietanzamentoDto>();
		for (TipoQuietanzamento src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}