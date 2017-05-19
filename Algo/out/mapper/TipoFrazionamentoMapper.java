package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoFrazionamentoDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoFrazionamento;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoFrazionamentoMapper implements Mapper<TipoFrazionamento, TipoFrazionamentoDto> {

	@Override
	public TipoFrazionamento from(TipoFrazionamentoDto dest) {
		// TipoFrazionamento src = new TipoFrazionamento();
		// TipoFrazionamentoDto dto = new TipoFrazionamentoDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoFrazionamentoDto to(TipoFrazionamento source) {
		TipoFrazionamentoDto dest = new TipoFrazionamentoDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoFrazionamento(), source.getCodTipoFrazionamento(),
				source.getDesTipoFrazionamento(), dest);
		return dest;
	}

	@Override
	public List<TipoFrazionamentoDto> toMany(List<TipoFrazionamento> sourceList) {
		List<TipoFrazionamentoDto> destList = new ArrayList<TipoFrazionamentoDto>();
		for (TipoFrazionamento src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}