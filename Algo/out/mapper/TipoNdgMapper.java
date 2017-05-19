package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoNdgDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoNdg;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoNdgMapper implements Mapper<TipoNdg, TipoNdgDto> {

	@Override
	public TipoNdg from(TipoNdgDto dest) {
		// TipoNdg src = new TipoNdg();
		// TipoNdgDto dto = new TipoNdgDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoNdgDto to(TipoNdg source) {
		TipoNdgDto dest = new TipoNdgDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoNdg(), source.getCodTipoNdg(),
				source.getDesTipoNdg(), dest);
		return dest;
	}

	@Override
	public List<TipoNdgDto> toMany(List<TipoNdg> sourceList) {
		List<TipoNdgDto> destList = new ArrayList<TipoNdgDto>();
		for (TipoNdg src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}