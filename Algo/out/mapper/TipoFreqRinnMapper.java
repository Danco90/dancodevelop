package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoFreqRinnDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoFreqRinn;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoFreqRinnMapper implements Mapper<TipoFreqRinn, TipoFreqRinnDto> {

	@Override
	public TipoFreqRinn from(TipoFreqRinnDto dest) {
		// TipoFreqRinn src = new TipoFreqRinn();
		// TipoFreqRinnDto dto = new TipoFreqRinnDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoFreqRinnDto to(TipoFreqRinn source) {
		TipoFreqRinnDto dest = new TipoFreqRinnDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoFreqRinn(), source.getCodTipoFreqRinn(),
				source.getDesTipoFreqRinn(), dest);
		return dest;
	}

	@Override
	public List<TipoFreqRinnDto> toMany(List<TipoFreqRinn> sourceList) {
		List<TipoFreqRinnDto> destList = new ArrayList<TipoFreqRinnDto>();
		for (TipoFreqRinn src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}