package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.TipoStampaQuietDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.TipoStampaQuiet;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class TipoStampaQuietMapper implements Mapper<TipoStampaQuiet, TipoStampaQuietDto> {

	@Override
	public TipoStampaQuiet from(TipoStampaQuietDto dest) {
		// TipoStampaQuiet src = new TipoStampaQuiet();
		// TipoStampaQuietDto dto = new TipoStampaQuietDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public TipoStampaQuietDto to(TipoStampaQuiet source) {
		TipoStampaQuietDto dest = new TipoStampaQuietDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKTipoStampaQuiet(), source.getCodTipoStampaQuiet(),
				source.getDesTipoStampaQuiet(), dest);
		return dest;
	}

	@Override
	public List<TipoStampaQuietDto> toMany(List<TipoStampaQuiet> sourceList) {
		List<TipoStampaQuietDto> destList = new ArrayList<TipoStampaQuietDto>();
		for (TipoStampaQuiet src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}