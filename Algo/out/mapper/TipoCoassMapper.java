package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoCoassDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoCoass;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoCoassMapper implements Mapper<TipoCoass, TipoCoassDto> {

	@Override
	public TipoCoass from(TipoCoassDto dest) {
		// TipoCoass src = new TipoCoass();
		// TipoCoassDto dto = new TipoCoassDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoCoassDto to(TipoCoass source) {
		TipoCoassDto dest = new TipoCoassDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoCoass(), source.getCodTipoCoass(),
				source.getDesTipoCoass(), dest);
		return dest;
	}

	@Override
	public List<TipoCoassDto> toMany(List<TipoCoass> sourceList) {
		List<TipoCoassDto> destList = new ArrayList<TipoCoassDto>();
		for (TipoCoass src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}