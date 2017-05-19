package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoTassaDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoTassa;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoTassaMapper implements Mapper<TipoTassa, TipoTassaDto> {

	@Override
	public TipoTassa from(TipoTassaDto dest) {
		// TipoTassa src = new TipoTassa();
		// TipoTassaDto dto = new TipoTassaDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoTassaDto to(TipoTassa source) {
		TipoTassaDto dest = new TipoTassaDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoTassa(), source.getCodTipoTassa(),
				source.getDesTipoTassa(), dest);
		return dest;
	}

	@Override
	public List<TipoTassaDto> toMany(List<TipoTassa> sourceList) {
		List<TipoTassaDto> destList = new ArrayList<TipoTassaDto>();
		for (TipoTassa src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}