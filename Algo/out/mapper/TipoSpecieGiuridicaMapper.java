package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoSpecieGiuridicaDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoSpecieGiuridica;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoSpecieGiuridicaMapper implements Mapper<TipoSpecieGiuridica, TipoSpecieGiuridicaDto> {

	@Override
	public TipoSpecieGiuridica from(TipoSpecieGiuridicaDto dest) {
		// TipoSpecieGiuridica src = new TipoSpecieGiuridica();
		// TipoSpecieGiuridicaDto dto = new TipoSpecieGiuridicaDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoSpecieGiuridicaDto to(TipoSpecieGiuridica source) {
		TipoSpecieGiuridicaDto dest = new TipoSpecieGiuridicaDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoSpecieGiuridica(), source.getCodTipoSpecieGiuridica(),
				source.getDesTipoSpecieGiuridica(), dest);
		return dest;
	}

	@Override
	public List<TipoSpecieGiuridicaDto> toMany(List<TipoSpecieGiuridica> sourceList) {
		List<TipoSpecieGiuridicaDto> destList = new ArrayList<TipoSpecieGiuridicaDto>();
		for (TipoSpecieGiuridica src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}