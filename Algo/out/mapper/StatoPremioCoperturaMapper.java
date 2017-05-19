package it.euris.insurance.platform.portfolio.sd_decoding.mapping.refactoring.generics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import it.euris.insurance.platform.portfolio.common.mapper.Mapper;
import it.euris.insurance.platform.portfolio.lisa.dto.sddecoding.StatoPremioCoperturaDto;
import it.euris.insurance.platform.portfolio.utils.MapperUtil;
import it.euris.lisa.insurance.platform.portfolio.sd_decoding.entities.StatoPremioCopertura;

/**
 * 
 * @author daniele
 * @update 3/28/2017
 * @version 0.1
 */
public class StatoPremioCoperturaMapper implements Mapper<StatoPremioCopertura, StatoPremioCoperturaDto> {

	@Override
	public StatoPremioCopertura from(StatoPremioCoperturaDto dest) {
		// StatoPremioCopertura src = new StatoPremioCopertura();
		// StatoPremioCoperturaDto dto = new StatoPremioCoperturaDto();
		//// BeanUtils.copyProperties(dest, src);
		// MapperUtil.copyDtoPropertiesToEntity(src.getId(),
		// src.getCod(),src.getDes(),src);
		// return src;
		return null;
	}

	@Override
	public StatoPremioCoperturaDto to(StatoPremioCopertura source) {
		StatoPremioCoperturaDto dest = new StatoPremioCoperturaDto();
		MapperUtil.copyEntityPropertiesToDto(source.getKStatoPremioCopertura(), source.getCodStatoPremioCopertura(),
				source.getDesStatoPremioCopertura(), dest);
		return dest;
	}

	@Override
	public List<StatoPremioCoperturaDto> toMany(List<StatoPremioCopertura> sourceList) {
		List<StatoPremioCoperturaDto> destList = new ArrayList<StatoPremioCoperturaDto>();
		for (StatoPremioCopertura src : sourceList) {
			destList.add(to(src));
		}
		return destList;
	}

}