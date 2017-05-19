package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoLineaVenditaDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoLineaVendita;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoLineaVenditaMapper implements Mapper<TipoLineaVendita, TipoLineaVenditaDto> {

	@Override
	public TipoLineaVendita from(TipoLineaVenditaDto dest) {
		// TipoLineaVendita src = new TipoLineaVendita();
		// TipoLineaVenditaDto dto = new TipoLineaVenditaDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoLineaVenditaDto to(TipoLineaVendita source) {
		TipoLineaVenditaDto dest = new TipoLineaVenditaDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoLineaVendita(), source.getCodTipoLineaVendita(),
				source.getDesTipoLineaVendita(), dest);
		return dest;
	}

	@Override
	public List<TipoLineaVenditaDto> toMany(List<TipoLineaVendita> sourceList) {
		List<TipoLineaVenditaDto> destList = new ArrayList<TipoLineaVenditaDto>();
		for (TipoLineaVendita src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}