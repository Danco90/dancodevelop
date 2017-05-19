package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoCanaleVenditaDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoCanaleVendita;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoCanaleVenditaMapper implements Mapper<TipoCanaleVendita, TipoCanaleVenditaDto> {

	@Override
	public TipoCanaleVendita from(TipoCanaleVenditaDto dest) {
		// TipoCanaleVendita src = new TipoCanaleVendita();
		// TipoCanaleVenditaDto dto = new TipoCanaleVenditaDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoCanaleVenditaDto to(TipoCanaleVendita source) {
		TipoCanaleVenditaDto dest = new TipoCanaleVenditaDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoCanaleVendita(), source.getCodTipoCanaleVendita(),
				source.getDesTipoCanaleVendita(), dest);
		return dest;
	}

	@Override
	public List<TipoCanaleVenditaDto> toMany(List<TipoCanaleVendita> sourceList) {
		List<TipoCanaleVenditaDto> destList = new ArrayList<TipoCanaleVenditaDto>();
		for (TipoCanaleVendita src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}