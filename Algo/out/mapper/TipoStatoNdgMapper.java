package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoStatoNdgDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoStatoNdg;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoStatoNdgMapper implements Mapper<TipoStatoNdg, TipoStatoNdgDto> {

	@Override
	public TipoStatoNdg from(TipoStatoNdgDto dest) {
		// TipoStatoNdg src = new TipoStatoNdg();
		// TipoStatoNdgDto dto = new TipoStatoNdgDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoStatoNdgDto to(TipoStatoNdg source) {
		TipoStatoNdgDto dest = new TipoStatoNdgDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoStatoNdg(), source.getCodTipoStatoNdg(),
				source.getDesTipoStatoNdg(), dest);
		return dest;
	}

	@Override
	public List<TipoStatoNdgDto> toMany(List<TipoStatoNdg> sourceList) {
		List<TipoStatoNdgDto> destList = new ArrayList<TipoStatoNdgDto>();
		for (TipoStatoNdg src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}