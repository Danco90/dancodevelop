package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoDocRiconoscimentoDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoDocRiconoscimento;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoDocRiconoscimentoMapper implements Mapper<TipoDocRiconoscimento, TipoDocRiconoscimentoDto> {

	@Override
	public TipoDocRiconoscimento from(TipoDocRiconoscimentoDto dest) {
		// TipoDocRiconoscimento src = new TipoDocRiconoscimento();
		// TipoDocRiconoscimentoDto dto = new TipoDocRiconoscimentoDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoDocRiconoscimentoDto to(TipoDocRiconoscimento source) {
		TipoDocRiconoscimentoDto dest = new TipoDocRiconoscimentoDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoDocRiconoscimento(), source.getCodTipoDocRiconoscimento(),
				source.getDesTipoDocRiconoscimento(), dest);
		return dest;
	}

	@Override
	public List<TipoDocRiconoscimentoDto> toMany(List<TipoDocRiconoscimento> sourceList) {
		List<TipoDocRiconoscimentoDto> destList = new ArrayList<TipoDocRiconoscimentoDto>();
		for (TipoDocRiconoscimento src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}