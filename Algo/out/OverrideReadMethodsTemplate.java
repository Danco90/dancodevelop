@Override
public List<BlackListDto> readBlackList() throws PFBaseServiceException{
	return getAll(blackListDao, mapperFactory.createBlackListMapper());
}
@Override
public BlackListDto readBlackListById(BlackListDto blackListDto)
		throws PFBaseServiceException {
	return getById(blackListDao, mapperFactory.createBlackListMapper(), blackListDto.getId());

}
@Override
public BlackListDto readBlackListByCode(BlackListDto blackListDto)
		throws PFBaseServiceException {
	return getByField(blackListDao, mapperFactory.createBlackListMapper(), blackListDto.getCod(), "codBlackList");

}
@Override
public List<CausaleEstinzioneDto> readCausaleEstinzione() throws PFBaseServiceException{
	return getAll(causaleEstinzioneDao, mapperFactory.createCausaleEstinzioneMapper());
}
@Override
public CausaleEstinzioneDto readCausaleEstinzioneById(CausaleEstinzioneDto causaleEstinzioneDto)
		throws PFBaseServiceException {
	return getById(causaleEstinzioneDao, mapperFactory.createCausaleEstinzioneMapper(), causaleEstinzioneDto.getId());

}
@Override
public CausaleEstinzioneDto readCausaleEstinzioneByCode(CausaleEstinzioneDto causaleEstinzioneDto)
		throws PFBaseServiceException {
	return getByField(causaleEstinzioneDao, mapperFactory.createCausaleEstinzioneMapper(), causaleEstinzioneDto.getCod(), "codCausaleEstinzione");

}
@Override
public List<CompagniaDto> readCompagnia() throws PFBaseServiceException{
	return getAll(compagniaDao, mapperFactory.createCompagniaMapper());
}
@Override
public CompagniaDto readCompagniaById(CompagniaDto compagniaDto)
		throws PFBaseServiceException {
	return getById(compagniaDao, mapperFactory.createCompagniaMapper(), compagniaDto.getId());

}
@Override
public CompagniaDto readCompagniaByCode(CompagniaDto compagniaDto)
		throws PFBaseServiceException {
	return getByField(compagniaDao, mapperFactory.createCompagniaMapper(), compagniaDto.getCod(), "codCompagnia");

}
@Override
public List<CompletezzaDatiDto> readCompletezzaDati() throws PFBaseServiceException{
	return getAll(completezzaDatiDao, mapperFactory.createCompletezzaDatiMapper());
}
@Override
public CompletezzaDatiDto readCompletezzaDatiById(CompletezzaDatiDto completezzaDatiDto)
		throws PFBaseServiceException {
	return getById(completezzaDatiDao, mapperFactory.createCompletezzaDatiMapper(), completezzaDatiDto.getId());

}
@Override
public CompletezzaDatiDto readCompletezzaDatiByCode(CompletezzaDatiDto completezzaDatiDto)
		throws PFBaseServiceException {
	return getByField(completezzaDatiDao, mapperFactory.createCompletezzaDatiMapper(), completezzaDatiDto.getCod(), "codCompletezzaDati");

}
@Override
public List<FamigliaNodoDto> readFamigliaNodo() throws PFBaseServiceException{
	return getAll(famigliaNodoDao, mapperFactory.createFamigliaNodoMapper());
}
@Override
public FamigliaNodoDto readFamigliaNodoById(FamigliaNodoDto famigliaNodoDto)
		throws PFBaseServiceException {
	return getById(famigliaNodoDao, mapperFactory.createFamigliaNodoMapper(), famigliaNodoDto.getId());

}
@Override
public FamigliaNodoDto readFamigliaNodoByCode(FamigliaNodoDto famigliaNodoDto)
		throws PFBaseServiceException {
	return getByField(famigliaNodoDao, mapperFactory.createFamigliaNodoMapper(), famigliaNodoDto.getCod(), "codFamigliaNodo");

}
@Override
public List<ModUtilizzoMailDto> readModUtilizzoMail() throws PFBaseServiceException{
	return getAll(modUtilizzoMailDao, mapperFactory.createModUtilizzoMailMapper());
}
@Override
public ModUtilizzoMailDto readModUtilizzoMailById(ModUtilizzoMailDto modUtilizzoMailDto)
		throws PFBaseServiceException {
	return getById(modUtilizzoMailDao, mapperFactory.createModUtilizzoMailMapper(), modUtilizzoMailDto.getId());

}
@Override
public ModUtilizzoMailDto readModUtilizzoMailByCode(ModUtilizzoMailDto modUtilizzoMailDto)
		throws PFBaseServiceException {
	return getByField(modUtilizzoMailDao, mapperFactory.createModUtilizzoMailMapper(), modUtilizzoMailDto.getCod(), "codModUtilizzoMail");

}
@Override
public List<PaesiBlackListDto> readPaesiBlackList() throws PFBaseServiceException{
	return getAll(paesiBlackListDao, mapperFactory.createPaesiBlackListMapper());
}
@Override
public PaesiBlackListDto readPaesiBlackListById(PaesiBlackListDto paesiBlackListDto)
		throws PFBaseServiceException {
	return getById(paesiBlackListDao, mapperFactory.createPaesiBlackListMapper(), paesiBlackListDto.getId());

}
@Override
public PaesiBlackListDto readPaesiBlackListByCode(PaesiBlackListDto paesiBlackListDto)
		throws PFBaseServiceException {
	return getByField(paesiBlackListDao, mapperFactory.createPaesiBlackListMapper(), paesiBlackListDto.getCod(), "codPaesiBlackList");

}
@Override
public List<PortafogliDto> readPortafogli() throws PFBaseServiceException{
	return getAll(portafogliDao, mapperFactory.createPortafogliMapper());
}
@Override
public PortafogliDto readPortafogliById(PortafogliDto portafogliDto)
		throws PFBaseServiceException {
	return getById(portafogliDao, mapperFactory.createPortafogliMapper(), portafogliDto.getId());

}
@Override
public PortafogliDto readPortafogliByCode(PortafogliDto portafogliDto)
		throws PFBaseServiceException {
	return getByField(portafogliDao, mapperFactory.createPortafogliMapper(), portafogliDto.getCod(), "codPortafogli");

}
@Override
public List<PrivacyDto> readPrivacy() throws PFBaseServiceException{
	return getAll(privacyDao, mapperFactory.createPrivacyMapper());
}
@Override
public PrivacyDto readPrivacyById(PrivacyDto privacyDto)
		throws PFBaseServiceException {
	return getById(privacyDao, mapperFactory.createPrivacyMapper(), privacyDto.getId());

}
@Override
public PrivacyDto readPrivacyByCode(PrivacyDto privacyDto)
		throws PFBaseServiceException {
	return getByField(privacyDao, mapperFactory.createPrivacyMapper(), privacyDto.getCod(), "codPrivacy");

}
@Override
public List<RaeDto> readRae() throws PFBaseServiceException{
	return getAll(raeDao, mapperFactory.createRaeMapper());
}
@Override
public RaeDto readRaeById(RaeDto raeDto)
		throws PFBaseServiceException {
	return getById(raeDao, mapperFactory.createRaeMapper(), raeDto.getId());

}
@Override
public RaeDto readRaeByCode(RaeDto raeDto)
		throws PFBaseServiceException {
	return getByField(raeDao, mapperFactory.createRaeMapper(), raeDto.getCod(), "codRae");

}
@Override
public List<RelazRuoliDto> readRelazRuoli() throws PFBaseServiceException{
	return getAll(relazRuoliDao, mapperFactory.createRelazRuoliMapper());
}
@Override
public RelazRuoliDto readRelazRuoliById(RelazRuoliDto relazRuoliDto)
		throws PFBaseServiceException {
	return getById(relazRuoliDao, mapperFactory.createRelazRuoliMapper(), relazRuoliDto.getId());

}
@Override
public RelazRuoliDto readRelazRuoliByCode(RelazRuoliDto relazRuoliDto)
		throws PFBaseServiceException {
	return getByField(relazRuoliDao, mapperFactory.createRelazRuoliMapper(), relazRuoliDto.getCod(), "codRelazRuoli");

}
@Override
public List<SaeDto> readSae() throws PFBaseServiceException{
	return getAll(saeDao, mapperFactory.createSaeMapper());
}
@Override
public SaeDto readSaeById(SaeDto saeDto)
		throws PFBaseServiceException {
	return getById(saeDao, mapperFactory.createSaeMapper(), saeDto.getId());

}
@Override
public SaeDto readSaeByCode(SaeDto saeDto)
		throws PFBaseServiceException {
	return getByField(saeDao, mapperFactory.createSaeMapper(), saeDto.getCod(), "codSae");

}
@Override
public List<SessoDto> readSesso() throws PFBaseServiceException{
	return getAll(sessoDao, mapperFactory.createSessoMapper());
}
@Override
public SessoDto readSessoById(SessoDto sessoDto)
		throws PFBaseServiceException {
	return getById(sessoDao, mapperFactory.createSessoMapper(), sessoDto.getId());

}
@Override
public SessoDto readSessoByCode(SessoDto sessoDto)
		throws PFBaseServiceException {
	return getByField(sessoDao, mapperFactory.createSessoMapper(), sessoDto.getCod(), "codSesso");

}
@Override
public List<StatoCivileDto> readStatoCivile() throws PFBaseServiceException{
	return getAll(statoCivileDao, mapperFactory.createStatoCivileMapper());
}
@Override
public StatoCivileDto readStatoCivileById(StatoCivileDto statoCivileDto)
		throws PFBaseServiceException {
	return getById(statoCivileDao, mapperFactory.createStatoCivileMapper(), statoCivileDto.getId());

}
@Override
public StatoCivileDto readStatoCivileByCode(StatoCivileDto statoCivileDto)
		throws PFBaseServiceException {
	return getByField(statoCivileDao, mapperFactory.createStatoCivileMapper(), statoCivileDto.getCod(), "codStatoCivile");

}
@Override
public List<StatoOperativoCopDto> readStatoOperativoCop() throws PFBaseServiceException{
	return getAll(statoOperativoCopDao, mapperFactory.createStatoOperativoCopMapper());
}
@Override
public StatoOperativoCopDto readStatoOperativoCopById(StatoOperativoCopDto statoOperativoCopDto)
		throws PFBaseServiceException {
	return getById(statoOperativoCopDao, mapperFactory.createStatoOperativoCopMapper(), statoOperativoCopDto.getId());

}
@Override
public StatoOperativoCopDto readStatoOperativoCopByCode(StatoOperativoCopDto statoOperativoCopDto)
		throws PFBaseServiceException {
	return getByField(statoOperativoCopDao, mapperFactory.createStatoOperativoCopMapper(), statoOperativoCopDto.getCod(), "codStatoOperativoCop");

}
@Override
public List<StatoPremioDto> readStatoPremio() throws PFBaseServiceException{
	return getAll(statoPremioDao, mapperFactory.createStatoPremioMapper());
}
@Override
public StatoPremioDto readStatoPremioById(StatoPremioDto statoPremioDto)
		throws PFBaseServiceException {
	return getById(statoPremioDao, mapperFactory.createStatoPremioMapper(), statoPremioDto.getId());

}
@Override
public StatoPremioDto readStatoPremioByCode(StatoPremioDto statoPremioDto)
		throws PFBaseServiceException {
	return getByField(statoPremioDao, mapperFactory.createStatoPremioMapper(), statoPremioDto.getCod(), "codStatoPremio");

}
@Override
public List<StatoPremioCoperturaDto> readStatoPremioCopertura() throws PFBaseServiceException{
	return getAll(statoPremioCoperturaDao, mapperFactory.createStatoPremioCoperturaMapper());
}
@Override
public StatoPremioCoperturaDto readStatoPremioCoperturaById(StatoPremioCoperturaDto statoPremioCoperturaDto)
		throws PFBaseServiceException {
	return getById(statoPremioCoperturaDao, mapperFactory.createStatoPremioCoperturaMapper(), statoPremioCoperturaDto.getId());

}
@Override
public StatoPremioCoperturaDto readStatoPremioCoperturaByCode(StatoPremioCoperturaDto statoPremioCoperturaDto)
		throws PFBaseServiceException {
	return getByField(statoPremioCoperturaDao, mapperFactory.createStatoPremioCoperturaMapper(), statoPremioCoperturaDto.getCod(), "codStatoPremioCopertura");

}
@Override
public List<StatoProgDto> readStatoProg() throws PFBaseServiceException{
	return getAll(statoProgDao, mapperFactory.createStatoProgMapper());
}
@Override
public StatoProgDto readStatoProgById(StatoProgDto statoProgDto)
		throws PFBaseServiceException {
	return getById(statoProgDao, mapperFactory.createStatoProgMapper(), statoProgDto.getId());

}
@Override
public StatoProgDto readStatoProgByCode(StatoProgDto statoProgDto)
		throws PFBaseServiceException {
	return getByField(statoProgDao, mapperFactory.createStatoProgMapper(), statoProgDto.getCod(), "codStatoProg");

}
@Override
public List<StatoPropDto> readStatoProp() throws PFBaseServiceException{
	return getAll(statoPropDao, mapperFactory.createStatoPropMapper());
}
@Override
public StatoPropDto readStatoPropById(StatoPropDto statoPropDto)
		throws PFBaseServiceException {
	return getById(statoPropDao, mapperFactory.createStatoPropMapper(), statoPropDto.getId());

}
@Override
public StatoPropDto readStatoPropByCode(StatoPropDto statoPropDto)
		throws PFBaseServiceException {
	return getByField(statoPropDao, mapperFactory.createStatoPropMapper(), statoPropDto.getCod(), "codStatoProp");

}
@Override
public List<TipoBaseCalcDto> readTipoBaseCalc() throws PFBaseServiceException{
	return getAll(tipoBaseCalcDao, mapperFactory.createTipoBaseCalcMapper());
}
@Override
public TipoBaseCalcDto readTipoBaseCalcById(TipoBaseCalcDto tipoBaseCalcDto)
		throws PFBaseServiceException {
	return getById(tipoBaseCalcDao, mapperFactory.createTipoBaseCalcMapper(), tipoBaseCalcDto.getId());

}
@Override
public TipoBaseCalcDto readTipoBaseCalcByCode(TipoBaseCalcDto tipoBaseCalcDto)
		throws PFBaseServiceException {
	return getByField(tipoBaseCalcDao, mapperFactory.createTipoBaseCalcMapper(), tipoBaseCalcDto.getCod(), "codTipoBaseCalc");

}
@Override
public List<TipoBeneficiariDto> readTipoBeneficiari() throws PFBaseServiceException{
	return getAll(tipoBeneficiariDao, mapperFactory.createTipoBeneficiariMapper());
}
@Override
public TipoBeneficiariDto readTipoBeneficiariById(TipoBeneficiariDto tipoBeneficiariDto)
		throws PFBaseServiceException {
	return getById(tipoBeneficiariDao, mapperFactory.createTipoBeneficiariMapper(), tipoBeneficiariDto.getId());

}
@Override
public TipoBeneficiariDto readTipoBeneficiariByCode(TipoBeneficiariDto tipoBeneficiariDto)
		throws PFBaseServiceException {
	return getByField(tipoBeneficiariDao, mapperFactory.createTipoBeneficiariMapper(), tipoBeneficiariDto.getCod(), "codTipoBeneficiari");

}
@Override
public List<TipoCanaleVenditaDto> readTipoCanaleVendita() throws PFBaseServiceException{
	return getAll(tipoCanaleVenditaDao, mapperFactory.createTipoCanaleVenditaMapper());
}
@Override
public TipoCanaleVenditaDto readTipoCanaleVenditaById(TipoCanaleVenditaDto tipoCanaleVenditaDto)
		throws PFBaseServiceException {
	return getById(tipoCanaleVenditaDao, mapperFactory.createTipoCanaleVenditaMapper(), tipoCanaleVenditaDto.getId());

}
@Override
public TipoCanaleVenditaDto readTipoCanaleVenditaByCode(TipoCanaleVenditaDto tipoCanaleVenditaDto)
		throws PFBaseServiceException {
	return getByField(tipoCanaleVenditaDao, mapperFactory.createTipoCanaleVenditaMapper(), tipoCanaleVenditaDto.getCod(), "codTipoCanaleVendita");

}
@Override
public List<TipoCessLegDto> readTipoCessLeg() throws PFBaseServiceException{
	return getAll(tipoCessLegDao, mapperFactory.createTipoCessLegMapper());
}
@Override
public TipoCessLegDto readTipoCessLegById(TipoCessLegDto tipoCessLegDto)
		throws PFBaseServiceException {
	return getById(tipoCessLegDao, mapperFactory.createTipoCessLegMapper(), tipoCessLegDto.getId());

}
@Override
public TipoCessLegDto readTipoCessLegByCode(TipoCessLegDto tipoCessLegDto)
		throws PFBaseServiceException {
	return getByField(tipoCessLegDao, mapperFactory.createTipoCessLegMapper(), tipoCessLegDto.getCod(), "codTipoCessLeg");

}
@Override
public List<TipoCoassDto> readTipoCoass() throws PFBaseServiceException{
	return getAll(tipoCoassDao, mapperFactory.createTipoCoassMapper());
}
@Override
public TipoCoassDto readTipoCoassById(TipoCoassDto tipoCoassDto)
		throws PFBaseServiceException {
	return getById(tipoCoassDao, mapperFactory.createTipoCoassMapper(), tipoCoassDto.getId());

}
@Override
public TipoCoassDto readTipoCoassByCode(TipoCoassDto tipoCoassDto)
		throws PFBaseServiceException {
	return getByField(tipoCoassDao, mapperFactory.createTipoCoassMapper(), tipoCoassDto.getCod(), "codTipoCoass");

}
@Override
public List<TipoContattiDto> readTipoContatti() throws PFBaseServiceException{
	return getAll(tipoContattiDao, mapperFactory.createTipoContattiMapper());
}
@Override
public TipoContattiDto readTipoContattiById(TipoContattiDto tipoContattiDto)
		throws PFBaseServiceException {
	return getById(tipoContattiDao, mapperFactory.createTipoContattiMapper(), tipoContattiDto.getId());

}
@Override
public TipoContattiDto readTipoContattiByCode(TipoContattiDto tipoContattiDto)
		throws PFBaseServiceException {
	return getByField(tipoContattiDao, mapperFactory.createTipoContattiMapper(), tipoContattiDto.getCod(), "codTipoContatti");

}
@Override
public List<TipoContrattoDto> readTipoContratto() throws PFBaseServiceException{
	return getAll(tipoContrattoDao, mapperFactory.createTipoContrattoMapper());
}
@Override
public TipoContrattoDto readTipoContrattoById(TipoContrattoDto tipoContrattoDto)
		throws PFBaseServiceException {
	return getById(tipoContrattoDao, mapperFactory.createTipoContrattoMapper(), tipoContrattoDto.getId());

}
@Override
public TipoContrattoDto readTipoContrattoByCode(TipoContrattoDto tipoContrattoDto)
		throws PFBaseServiceException {
	return getByField(tipoContrattoDao, mapperFactory.createTipoContrattoMapper(), tipoContrattoDto.getCod(), "codTipoContratto");

}
@Override
public List<TipoConverDto> readTipoConver() throws PFBaseServiceException{
	return getAll(tipoConverDao, mapperFactory.createTipoConverMapper());
}
@Override
public TipoConverDto readTipoConverById(TipoConverDto tipoConverDto)
		throws PFBaseServiceException {
	return getById(tipoConverDao, mapperFactory.createTipoConverMapper(), tipoConverDto.getId());

}
@Override
public TipoConverDto readTipoConverByCode(TipoConverDto tipoConverDto)
		throws PFBaseServiceException {
	return getByField(tipoConverDao, mapperFactory.createTipoConverMapper(), tipoConverDto.getCod(), "codTipoConver");

}
@Override
public List<TipoCoperturaDto> readTipoCopertura() throws PFBaseServiceException{
	return getAll(tipoCoperturaDao, mapperFactory.createTipoCoperturaMapper());
}
@Override
public TipoCoperturaDto readTipoCoperturaById(TipoCoperturaDto tipoCoperturaDto)
		throws PFBaseServiceException {
	return getById(tipoCoperturaDao, mapperFactory.createTipoCoperturaMapper(), tipoCoperturaDto.getId());

}
@Override
public TipoCoperturaDto readTipoCoperturaByCode(TipoCoperturaDto tipoCoperturaDto)
		throws PFBaseServiceException {
	return getByField(tipoCoperturaDao, mapperFactory.createTipoCoperturaMapper(), tipoCoperturaDto.getCod(), "codTipoCopertura");

}
@Override
public List<TipoDisponibilitaDto> readTipoDisponibilita() throws PFBaseServiceException{
	return getAll(tipoDisponibilitaDao, mapperFactory.createTipoDisponibilitaMapper());
}
@Override
public TipoDisponibilitaDto readTipoDisponibilitaById(TipoDisponibilitaDto tipoDisponibilitaDto)
		throws PFBaseServiceException {
	return getById(tipoDisponibilitaDao, mapperFactory.createTipoDisponibilitaMapper(), tipoDisponibilitaDto.getId());

}
@Override
public TipoDisponibilitaDto readTipoDisponibilitaByCode(TipoDisponibilitaDto tipoDisponibilitaDto)
		throws PFBaseServiceException {
	return getByField(tipoDisponibilitaDao, mapperFactory.createTipoDisponibilitaMapper(), tipoDisponibilitaDto.getCod(), "codTipoDisponibilita");

}
@Override
public List<TipoDocRiconoscimentoDto> readTipoDocRiconoscimento() throws PFBaseServiceException{
	return getAll(tipoDocRiconoscimentoDao, mapperFactory.createTipoDocRiconoscimentoMapper());
}
@Override
public TipoDocRiconoscimentoDto readTipoDocRiconoscimentoById(TipoDocRiconoscimentoDto tipoDocRiconoscimentoDto)
		throws PFBaseServiceException {
	return getById(tipoDocRiconoscimentoDao, mapperFactory.createTipoDocRiconoscimentoMapper(), tipoDocRiconoscimentoDto.getId());

}
@Override
public TipoDocRiconoscimentoDto readTipoDocRiconoscimentoByCode(TipoDocRiconoscimentoDto tipoDocRiconoscimentoDto)
		throws PFBaseServiceException {
	return getByField(tipoDocRiconoscimentoDao, mapperFactory.createTipoDocRiconoscimentoMapper(), tipoDocRiconoscimentoDto.getCod(), "codTipoDocRiconoscimento");

}
@Override
public List<TipoEnteRilascioDto> readTipoEnteRilascio() throws PFBaseServiceException{
	return getAll(tipoEnteRilascioDao, mapperFactory.createTipoEnteRilascioMapper());
}
@Override
public TipoEnteRilascioDto readTipoEnteRilascioById(TipoEnteRilascioDto tipoEnteRilascioDto)
		throws PFBaseServiceException {
	return getById(tipoEnteRilascioDao, mapperFactory.createTipoEnteRilascioMapper(), tipoEnteRilascioDto.getId());

}
@Override
public TipoEnteRilascioDto readTipoEnteRilascioByCode(TipoEnteRilascioDto tipoEnteRilascioDto)
		throws PFBaseServiceException {
	return getByField(tipoEnteRilascioDao, mapperFactory.createTipoEnteRilascioMapper(), tipoEnteRilascioDto.getCod(), "codTipoEnteRilascio");

}
@Override
public List<TipoEsitoPremDto> readTipoEsitoPrem() throws PFBaseServiceException{
	return getAll(tipoEsitoPremDao, mapperFactory.createTipoEsitoPremMapper());
}
@Override
public TipoEsitoPremDto readTipoEsitoPremById(TipoEsitoPremDto tipoEsitoPremDto)
		throws PFBaseServiceException {
	return getById(tipoEsitoPremDao, mapperFactory.createTipoEsitoPremMapper(), tipoEsitoPremDto.getId());

}
@Override
public TipoEsitoPremDto readTipoEsitoPremByCode(TipoEsitoPremDto tipoEsitoPremDto)
		throws PFBaseServiceException {
	return getByField(tipoEsitoPremDao, mapperFactory.createTipoEsitoPremMapper(), tipoEsitoPremDto.getCod(), "codTipoEsitoPrem");

}
@Override
public List<TipoFrazionamentoDto> readTipoFrazionamento() throws PFBaseServiceException{
	return getAll(tipoFrazionamentoDao, mapperFactory.createTipoFrazionamentoMapper());
}
@Override
public TipoFrazionamentoDto readTipoFrazionamentoById(TipoFrazionamentoDto tipoFrazionamentoDto)
		throws PFBaseServiceException {
	return getById(tipoFrazionamentoDao, mapperFactory.createTipoFrazionamentoMapper(), tipoFrazionamentoDto.getId());

}
@Override
public TipoFrazionamentoDto readTipoFrazionamentoByCode(TipoFrazionamentoDto tipoFrazionamentoDto)
		throws PFBaseServiceException {
	return getByField(tipoFrazionamentoDao, mapperFactory.createTipoFrazionamentoMapper(), tipoFrazionamentoDto.getCod(), "codTipoFrazionamento");

}
@Override
public List<TipoFreqRinnDto> readTipoFreqRinn() throws PFBaseServiceException{
	return getAll(tipoFreqRinnDao, mapperFactory.createTipoFreqRinnMapper());
}
@Override
public TipoFreqRinnDto readTipoFreqRinnById(TipoFreqRinnDto tipoFreqRinnDto)
		throws PFBaseServiceException {
	return getById(tipoFreqRinnDao, mapperFactory.createTipoFreqRinnMapper(), tipoFreqRinnDto.getId());

}
@Override
public TipoFreqRinnDto readTipoFreqRinnByCode(TipoFreqRinnDto tipoFreqRinnDto)
		throws PFBaseServiceException {
	return getByField(tipoFreqRinnDao, mapperFactory.createTipoFreqRinnMapper(), tipoFreqRinnDto.getCod(), "codTipoFreqRinn");

}
@Override
public List<TipoIndirizzoDto> readTipoIndirizzo() throws PFBaseServiceException{
	return getAll(tipoIndirizzoDao, mapperFactory.createTipoIndirizzoMapper());
}
@Override
public TipoIndirizzoDto readTipoIndirizzoById(TipoIndirizzoDto tipoIndirizzoDto)
		throws PFBaseServiceException {
	return getById(tipoIndirizzoDao, mapperFactory.createTipoIndirizzoMapper(), tipoIndirizzoDto.getId());

}
@Override
public TipoIndirizzoDto readTipoIndirizzoByCode(TipoIndirizzoDto tipoIndirizzoDto)
		throws PFBaseServiceException {
	return getByField(tipoIndirizzoDao, mapperFactory.createTipoIndirizzoMapper(), tipoIndirizzoDto.getCod(), "codTipoIndirizzo");

}
@Override
public List<TipoLegamiDto> readTipoLegami() throws PFBaseServiceException{
	return getAll(tipoLegamiDao, mapperFactory.createTipoLegamiMapper());
}
@Override
public TipoLegamiDto readTipoLegamiById(TipoLegamiDto tipoLegamiDto)
		throws PFBaseServiceException {
	return getById(tipoLegamiDao, mapperFactory.createTipoLegamiMapper(), tipoLegamiDto.getId());

}
@Override
public TipoLegamiDto readTipoLegamiByCode(TipoLegamiDto tipoLegamiDto)
		throws PFBaseServiceException {
	return getByField(tipoLegamiDao, mapperFactory.createTipoLegamiMapper(), tipoLegamiDto.getCod(), "codTipoLegami");

}
@Override
public List<TipoLineaVenditaDto> readTipoLineaVendita() throws PFBaseServiceException{
	return getAll(tipoLineaVenditaDao, mapperFactory.createTipoLineaVenditaMapper());
}
@Override
public TipoLineaVenditaDto readTipoLineaVenditaById(TipoLineaVenditaDto tipoLineaVenditaDto)
		throws PFBaseServiceException {
	return getById(tipoLineaVenditaDao, mapperFactory.createTipoLineaVenditaMapper(), tipoLineaVenditaDto.getId());

}
@Override
public TipoLineaVenditaDto readTipoLineaVenditaByCode(TipoLineaVenditaDto tipoLineaVenditaDto)
		throws PFBaseServiceException {
	return getByField(tipoLineaVenditaDao, mapperFactory.createTipoLineaVenditaMapper(), tipoLineaVenditaDto.getCod(), "codTipoLineaVendita");

}
@Override
public List<TipoLinguaDto> readTipoLingua() throws PFBaseServiceException{
	return getAll(tipoLinguaDao, mapperFactory.createTipoLinguaMapper());
}
@Override
public TipoLinguaDto readTipoLinguaById(TipoLinguaDto tipoLinguaDto)
		throws PFBaseServiceException {
	return getById(tipoLinguaDao, mapperFactory.createTipoLinguaMapper(), tipoLinguaDto.getId());

}
@Override
public TipoLinguaDto readTipoLinguaByCode(TipoLinguaDto tipoLinguaDto)
		throws PFBaseServiceException {
	return getByField(tipoLinguaDao, mapperFactory.createTipoLinguaMapper(), tipoLinguaDto.getCod(), "codTipoLingua");

}
@Override
public List<TipoMancPerfDto> readTipoMancPerf() throws PFBaseServiceException{
	return getAll(tipoMancPerfDao, mapperFactory.createTipoMancPerfMapper());
}
@Override
public TipoMancPerfDto readTipoMancPerfById(TipoMancPerfDto tipoMancPerfDto)
		throws PFBaseServiceException {
	return getById(tipoMancPerfDao, mapperFactory.createTipoMancPerfMapper(), tipoMancPerfDto.getId());

}
@Override
public TipoMancPerfDto readTipoMancPerfByCode(TipoMancPerfDto tipoMancPerfDto)
		throws PFBaseServiceException {
	return getByField(tipoMancPerfDao, mapperFactory.createTipoMancPerfMapper(), tipoMancPerfDto.getCod(), "codTipoMancPerf");

}
@Override
public List<TipoModPagPremioDto> readTipoModPagPremio() throws PFBaseServiceException{
	return getAll(tipoModPagPremioDao, mapperFactory.createTipoModPagPremioMapper());
}
@Override
public TipoModPagPremioDto readTipoModPagPremioById(TipoModPagPremioDto tipoModPagPremioDto)
		throws PFBaseServiceException {
	return getById(tipoModPagPremioDao, mapperFactory.createTipoModPagPremioMapper(), tipoModPagPremioDto.getId());

}
@Override
public TipoModPagPremioDto readTipoModPagPremioByCode(TipoModPagPremioDto tipoModPagPremioDto)
		throws PFBaseServiceException {
	return getByField(tipoModPagPremioDao, mapperFactory.createTipoModPagPremioMapper(), tipoModPagPremioDto.getCod(), "codTipoModPagPremio");

}
@Override
public List<TipoModRivEsoDto> readTipoModRivEso() throws PFBaseServiceException{
	return getAll(tipoModRivEsoDao, mapperFactory.createTipoModRivEsoMapper());
}
@Override
public TipoModRivEsoDto readTipoModRivEsoById(TipoModRivEsoDto tipoModRivEsoDto)
		throws PFBaseServiceException {
	return getById(tipoModRivEsoDao, mapperFactory.createTipoModRivEsoMapper(), tipoModRivEsoDto.getId());

}
@Override
public TipoModRivEsoDto readTipoModRivEsoByCode(TipoModRivEsoDto tipoModRivEsoDto)
		throws PFBaseServiceException {
	return getByField(tipoModRivEsoDao, mapperFactory.createTipoModRivEsoMapper(), tipoModRivEsoDto.getCod(), "codTipoModRivEso");

}
@Override
public List<TipoModalitaDto> readTipoModalita() throws PFBaseServiceException{
	return getAll(tipoModalitaDao, mapperFactory.createTipoModalitaMapper());
}
@Override
public TipoModalitaDto readTipoModalitaById(TipoModalitaDto tipoModalitaDto)
		throws PFBaseServiceException {
	return getById(tipoModalitaDao, mapperFactory.createTipoModalitaMapper(), tipoModalitaDto.getId());

}
@Override
public TipoModalitaDto readTipoModalitaByCode(TipoModalitaDto tipoModalitaDto)
		throws PFBaseServiceException {
	return getByField(tipoModalitaDao, mapperFactory.createTipoModalitaMapper(), tipoModalitaDto.getCod(), "codTipoModalita");

}
@Override
public List<TipoMonoDto> readTipoMono() throws PFBaseServiceException{
	return getAll(tipoMonoDao, mapperFactory.createTipoMonoMapper());
}
@Override
public TipoMonoDto readTipoMonoById(TipoMonoDto tipoMonoDto)
		throws PFBaseServiceException {
	return getById(tipoMonoDao, mapperFactory.createTipoMonoMapper(), tipoMonoDto.getId());

}
@Override
public TipoMonoDto readTipoMonoByCode(TipoMonoDto tipoMonoDto)
		throws PFBaseServiceException {
	return getByField(tipoMonoDao, mapperFactory.createTipoMonoMapper(), tipoMonoDto.getCod(), "codTipoMono");

}
@Override
public List<TipoMotEmesDto> readTipoMotEmes() throws PFBaseServiceException{
	return getAll(tipoMotEmesDao, mapperFactory.createTipoMotEmesMapper());
}
@Override
public TipoMotEmesDto readTipoMotEmesById(TipoMotEmesDto tipoMotEmesDto)
		throws PFBaseServiceException {
	return getById(tipoMotEmesDao, mapperFactory.createTipoMotEmesMapper(), tipoMotEmesDto.getId());

}
@Override
public TipoMotEmesDto readTipoMotEmesByCode(TipoMotEmesDto tipoMotEmesDto)
		throws PFBaseServiceException {
	return getByField(tipoMotEmesDao, mapperFactory.createTipoMotEmesMapper(), tipoMotEmesDto.getCod(), "codTipoMotEmes");

}
@Override
public List<TipoMotOprDto> readTipoMotOpr() throws PFBaseServiceException{
	return getAll(tipoMotOprDao, mapperFactory.createTipoMotOprMapper());
}
@Override
public TipoMotOprDto readTipoMotOprById(TipoMotOprDto tipoMotOprDto)
		throws PFBaseServiceException {
	return getById(tipoMotOprDao, mapperFactory.createTipoMotOprMapper(), tipoMotOprDto.getId());

}
@Override
public TipoMotOprDto readTipoMotOprByCode(TipoMotOprDto tipoMotOprDto)
		throws PFBaseServiceException {
	return getByField(tipoMotOprDao, mapperFactory.createTipoMotOprMapper(), tipoMotOprDto.getCod(), "codTipoMotOpr");

}
@Override
public List<TipoMotPrestaDto> readTipoMotPresta() throws PFBaseServiceException{
	return getAll(tipoMotPrestaDao, mapperFactory.createTipoMotPrestaMapper());
}
@Override
public TipoMotPrestaDto readTipoMotPrestaById(TipoMotPrestaDto tipoMotPrestaDto)
		throws PFBaseServiceException {
	return getById(tipoMotPrestaDao, mapperFactory.createTipoMotPrestaMapper(), tipoMotPrestaDto.getId());

}
@Override
public TipoMotPrestaDto readTipoMotPrestaByCode(TipoMotPrestaDto tipoMotPrestaDto)
		throws PFBaseServiceException {
	return getByField(tipoMotPrestaDao, mapperFactory.createTipoMotPrestaMapper(), tipoMotPrestaDto.getCod(), "codTipoMotPresta");

}
@Override
public List<TipoNdgDto> readTipoNdg() throws PFBaseServiceException{
	return getAll(tipoNdgDao, mapperFactory.createTipoNdgMapper());
}
@Override
public TipoNdgDto readTipoNdgById(TipoNdgDto tipoNdgDto)
		throws PFBaseServiceException {
	return getById(tipoNdgDao, mapperFactory.createTipoNdgMapper(), tipoNdgDto.getId());

}
@Override
public TipoNdgDto readTipoNdgByCode(TipoNdgDto tipoNdgDto)
		throws PFBaseServiceException {
	return getByField(tipoNdgDao, mapperFactory.createTipoNdgMapper(), tipoNdgDto.getCod(), "codTipoNdg");

}
@Override
public List<TipoPauDto> readTipoPau() throws PFBaseServiceException{
	return getAll(tipoPauDao, mapperFactory.createTipoPauMapper());
}
@Override
public TipoPauDto readTipoPauById(TipoPauDto tipoPauDto)
		throws PFBaseServiceException {
	return getById(tipoPauDao, mapperFactory.createTipoPauMapper(), tipoPauDto.getId());

}
@Override
public TipoPauDto readTipoPauByCode(TipoPauDto tipoPauDto)
		throws PFBaseServiceException {
	return getByField(tipoPauDao, mapperFactory.createTipoPauMapper(), tipoPauDto.getCod(), "codTipoPau");

}
@Override
public List<TipoPremioDto> readTipoPremio() throws PFBaseServiceException{
	return getAll(tipoPremioDao, mapperFactory.createTipoPremioMapper());
}
@Override
public TipoPremioDto readTipoPremioById(TipoPremioDto tipoPremioDto)
		throws PFBaseServiceException {
	return getById(tipoPremioDao, mapperFactory.createTipoPremioMapper(), tipoPremioDto.getId());

}
@Override
public TipoPremioDto readTipoPremioByCode(TipoPremioDto tipoPremioDto)
		throws PFBaseServiceException {
	return getByField(tipoPremioDao, mapperFactory.createTipoPremioMapper(), tipoPremioDto.getCod(), "codTipoPremio");

}
@Override
public List<TipoPremioCoperturaDto> readTipoPremioCopertura() throws PFBaseServiceException{
	return getAll(tipoPremioCoperturaDao, mapperFactory.createTipoPremioCoperturaMapper());
}
@Override
public TipoPremioCoperturaDto readTipoPremioCoperturaById(TipoPremioCoperturaDto tipoPremioCoperturaDto)
		throws PFBaseServiceException {
	return getById(tipoPremioCoperturaDao, mapperFactory.createTipoPremioCoperturaMapper(), tipoPremioCoperturaDto.getId());

}
@Override
public TipoPremioCoperturaDto readTipoPremioCoperturaByCode(TipoPremioCoperturaDto tipoPremioCoperturaDto)
		throws PFBaseServiceException {
	return getByField(tipoPremioCoperturaDao, mapperFactory.createTipoPremioCoperturaMapper(), tipoPremioCoperturaDto.getCod(), "codTipoPremioCopertura");

}
@Override
public List<TipoProfessioniDto> readTipoProfessioni() throws PFBaseServiceException{
	return getAll(tipoProfessioniDao, mapperFactory.createTipoProfessioniMapper());
}
@Override
public TipoProfessioniDto readTipoProfessioniById(TipoProfessioniDto tipoProfessioniDto)
		throws PFBaseServiceException {
	return getById(tipoProfessioniDao, mapperFactory.createTipoProfessioniMapper(), tipoProfessioniDto.getId());

}
@Override
public TipoProfessioniDto readTipoProfessioniByCode(TipoProfessioniDto tipoProfessioniDto)
		throws PFBaseServiceException {
	return getByField(tipoProfessioniDao, mapperFactory.createTipoProfessioniMapper(), tipoProfessioniDto.getCod(), "codTipoProfessioni");

}
@Override
public List<TipoPromozDto> readTipoPromoz() throws PFBaseServiceException{
	return getAll(tipoPromozDao, mapperFactory.createTipoPromozMapper());
}
@Override
public TipoPromozDto readTipoPromozById(TipoPromozDto tipoPromozDto)
		throws PFBaseServiceException {
	return getById(tipoPromozDao, mapperFactory.createTipoPromozMapper(), tipoPromozDto.getId());

}
@Override
public TipoPromozDto readTipoPromozByCode(TipoPromozDto tipoPromozDto)
		throws PFBaseServiceException {
	return getByField(tipoPromozDao, mapperFactory.createTipoPromozMapper(), tipoPromozDto.getCod(), "codTipoPromoz");

}
@Override
public List<TipoPropAttiDto> readTipoPropAtti() throws PFBaseServiceException{
	return getAll(tipoPropAttiDao, mapperFactory.createTipoPropAttiMapper());
}
@Override
public TipoPropAttiDto readTipoPropAttiById(TipoPropAttiDto tipoPropAttiDto)
		throws PFBaseServiceException {
	return getById(tipoPropAttiDao, mapperFactory.createTipoPropAttiMapper(), tipoPropAttiDto.getId());

}
@Override
public TipoPropAttiDto readTipoPropAttiByCode(TipoPropAttiDto tipoPropAttiDto)
		throws PFBaseServiceException {
	return getByField(tipoPropAttiDao, mapperFactory.createTipoPropAttiMapper(), tipoPropAttiDto.getCod(), "codTipoPropAtti");

}
@Override
public List<TipoProtDto> readTipoProt() throws PFBaseServiceException{
	return getAll(tipoProtDao, mapperFactory.createTipoProtMapper());
}
@Override
public TipoProtDto readTipoProtById(TipoProtDto tipoProtDto)
		throws PFBaseServiceException {
	return getById(tipoProtDao, mapperFactory.createTipoProtMapper(), tipoProtDto.getId());

}
@Override
public TipoProtDto readTipoProtByCode(TipoProtDto tipoProtDto)
		throws PFBaseServiceException {
	return getByField(tipoProtDao, mapperFactory.createTipoProtMapper(), tipoProtDto.getCod(), "codTipoProt");

}
@Override
public List<TipoQuestionariDto> readTipoQuestionari() throws PFBaseServiceException{
	return getAll(tipoQuestionariDao, mapperFactory.createTipoQuestionariMapper());
}
@Override
public TipoQuestionariDto readTipoQuestionariById(TipoQuestionariDto tipoQuestionariDto)
		throws PFBaseServiceException {
	return getById(tipoQuestionariDao, mapperFactory.createTipoQuestionariMapper(), tipoQuestionariDto.getId());

}
@Override
public TipoQuestionariDto readTipoQuestionariByCode(TipoQuestionariDto tipoQuestionariDto)
		throws PFBaseServiceException {
	return getByField(tipoQuestionariDao, mapperFactory.createTipoQuestionariMapper(), tipoQuestionariDto.getCod(), "codTipoQuestionari");

}
@Override
public List<TipoQuietanzamentoDto> readTipoQuietanzamento() throws PFBaseServiceException{
	return getAll(tipoQuietanzamentoDao, mapperFactory.createTipoQuietanzamentoMapper());
}
@Override
public TipoQuietanzamentoDto readTipoQuietanzamentoById(TipoQuietanzamentoDto tipoQuietanzamentoDto)
		throws PFBaseServiceException {
	return getById(tipoQuietanzamentoDao, mapperFactory.createTipoQuietanzamentoMapper(), tipoQuietanzamentoDto.getId());

}
@Override
public TipoQuietanzamentoDto readTipoQuietanzamentoByCode(TipoQuietanzamentoDto tipoQuietanzamentoDto)
		throws PFBaseServiceException {
	return getByField(tipoQuietanzamentoDao, mapperFactory.createTipoQuietanzamentoMapper(), tipoQuietanzamentoDto.getCod(), "codTipoQuietanzamento");

}
@Override
public List<TipoRamoContrattoDto> readTipoRamoContratto() throws PFBaseServiceException{
	return getAll(tipoRamoContrattoDao, mapperFactory.createTipoRamoContrattoMapper());
}
@Override
public TipoRamoContrattoDto readTipoRamoContrattoById(TipoRamoContrattoDto tipoRamoContrattoDto)
		throws PFBaseServiceException {
	return getById(tipoRamoContrattoDao, mapperFactory.createTipoRamoContrattoMapper(), tipoRamoContrattoDto.getId());

}
@Override
public TipoRamoContrattoDto readTipoRamoContrattoByCode(TipoRamoContrattoDto tipoRamoContrattoDto)
		throws PFBaseServiceException {
	return getByField(tipoRamoContrattoDao, mapperFactory.createTipoRamoContrattoMapper(), tipoRamoContrattoDto.getCod(), "codTipoRamoContratto");

}
@Override
public List<TipoRiasDto> readTipoRias() throws PFBaseServiceException{
	return getAll(tipoRiasDao, mapperFactory.createTipoRiasMapper());
}
@Override
public TipoRiasDto readTipoRiasById(TipoRiasDto tipoRiasDto)
		throws PFBaseServiceException {
	return getById(tipoRiasDao, mapperFactory.createTipoRiasMapper(), tipoRiasDto.getId());

}
@Override
public TipoRiasDto readTipoRiasByCode(TipoRiasDto tipoRiasDto)
		throws PFBaseServiceException {
	return getByField(tipoRiasDao, mapperFactory.createTipoRiasMapper(), tipoRiasDto.getCod(), "codTipoRias");

}
@Override
public List<TipoRivalutazioneDto> readTipoRivalutazione() throws PFBaseServiceException{
	return getAll(tipoRivalutazioneDao, mapperFactory.createTipoRivalutazioneMapper());
}
@Override
public TipoRivalutazioneDto readTipoRivalutazioneById(TipoRivalutazioneDto tipoRivalutazioneDto)
		throws PFBaseServiceException {
	return getById(tipoRivalutazioneDao, mapperFactory.createTipoRivalutazioneMapper(), tipoRivalutazioneDto.getId());

}
@Override
public TipoRivalutazioneDto readTipoRivalutazioneByCode(TipoRivalutazioneDto tipoRivalutazioneDto)
		throws PFBaseServiceException {
	return getByField(tipoRivalutazioneDao, mapperFactory.createTipoRivalutazioneMapper(), tipoRivalutazioneDto.getCod(), "codTipoRivalutazione");

}
@Override
public List<TipoRuoloDto> readTipoRuolo() throws PFBaseServiceException{
	return getAll(tipoRuoloDao, mapperFactory.createTipoRuoloMapper());
}
@Override
public TipoRuoloDto readTipoRuoloById(TipoRuoloDto tipoRuoloDto)
		throws PFBaseServiceException {
	return getById(tipoRuoloDao, mapperFactory.createTipoRuoloMapper(), tipoRuoloDto.getId());

}
@Override
public TipoRuoloDto readTipoRuoloByCode(TipoRuoloDto tipoRuoloDto)
		throws PFBaseServiceException {
	return getByField(tipoRuoloDao, mapperFactory.createTipoRuoloMapper(), tipoRuoloDto.getCod(), "codTipoRuolo");

}
@Override
public List<TipoSelezioneDto> readTipoSelezione() throws PFBaseServiceException{
	return getAll(tipoSelezioneDao, mapperFactory.createTipoSelezioneMapper());
}
@Override
public TipoSelezioneDto readTipoSelezioneById(TipoSelezioneDto tipoSelezioneDto)
		throws PFBaseServiceException {
	return getById(tipoSelezioneDao, mapperFactory.createTipoSelezioneMapper(), tipoSelezioneDto.getId());

}
@Override
public TipoSelezioneDto readTipoSelezioneByCode(TipoSelezioneDto tipoSelezioneDto)
		throws PFBaseServiceException {
	return getByField(tipoSelezioneDao, mapperFactory.createTipoSelezioneMapper(), tipoSelezioneDto.getCod(), "codTipoSelezione");

}
@Override
public List<TipoSpecieGiuridicaDto> readTipoSpecieGiuridica() throws PFBaseServiceException{
	return getAll(tipoSpecieGiuridicaDao, mapperFactory.createTipoSpecieGiuridicaMapper());
}
@Override
public TipoSpecieGiuridicaDto readTipoSpecieGiuridicaById(TipoSpecieGiuridicaDto tipoSpecieGiuridicaDto)
		throws PFBaseServiceException {
	return getById(tipoSpecieGiuridicaDao, mapperFactory.createTipoSpecieGiuridicaMapper(), tipoSpecieGiuridicaDto.getId());

}
@Override
public TipoSpecieGiuridicaDto readTipoSpecieGiuridicaByCode(TipoSpecieGiuridicaDto tipoSpecieGiuridicaDto)
		throws PFBaseServiceException {
	return getByField(tipoSpecieGiuridicaDao, mapperFactory.createTipoSpecieGiuridicaMapper(), tipoSpecieGiuridicaDto.getCod(), "codTipoSpecieGiuridica");

}
@Override
public List<TipoSportDto> readTipoSport() throws PFBaseServiceException{
	return getAll(tipoSportDao, mapperFactory.createTipoSportMapper());
}
@Override
public TipoSportDto readTipoSportById(TipoSportDto tipoSportDto)
		throws PFBaseServiceException {
	return getById(tipoSportDao, mapperFactory.createTipoSportMapper(), tipoSportDto.getId());

}
@Override
public TipoSportDto readTipoSportByCode(TipoSportDto tipoSportDto)
		throws PFBaseServiceException {
	return getByField(tipoSportDao, mapperFactory.createTipoSportMapper(), tipoSportDto.getCod(), "codTipoSport");

}
@Override
public List<TipoStampaQuietDto> readTipoStampaQuiet() throws PFBaseServiceException{
	return getAll(tipoStampaQuietDao, mapperFactory.createTipoStampaQuietMapper());
}
@Override
public TipoStampaQuietDto readTipoStampaQuietById(TipoStampaQuietDto tipoStampaQuietDto)
		throws PFBaseServiceException {
	return getById(tipoStampaQuietDao, mapperFactory.createTipoStampaQuietMapper(), tipoStampaQuietDto.getId());

}
@Override
public TipoStampaQuietDto readTipoStampaQuietByCode(TipoStampaQuietDto tipoStampaQuietDto)
		throws PFBaseServiceException {
	return getByField(tipoStampaQuietDao, mapperFactory.createTipoStampaQuietMapper(), tipoStampaQuietDto.getCod(), "codTipoStampaQuiet");

}
@Override
public List<TipoStatoNdgDto> readTipoStatoNdg() throws PFBaseServiceException{
	return getAll(tipoStatoNdgDao, mapperFactory.createTipoStatoNdgMapper());
}
@Override
public TipoStatoNdgDto readTipoStatoNdgById(TipoStatoNdgDto tipoStatoNdgDto)
		throws PFBaseServiceException {
	return getById(tipoStatoNdgDao, mapperFactory.createTipoStatoNdgMapper(), tipoStatoNdgDto.getId());

}
@Override
public TipoStatoNdgDto readTipoStatoNdgByCode(TipoStatoNdgDto tipoStatoNdgDto)
		throws PFBaseServiceException {
	return getByField(tipoStatoNdgDao, mapperFactory.createTipoStatoNdgMapper(), tipoStatoNdgDto.getCod(), "codTipoStatoNdg");

}
@Override
public List<TipoTassaDto> readTipoTassa() throws PFBaseServiceException{
	return getAll(tipoTassaDao, mapperFactory.createTipoTassaMapper());
}
@Override
public TipoTassaDto readTipoTassaById(TipoTassaDto tipoTassaDto)
		throws PFBaseServiceException {
	return getById(tipoTassaDao, mapperFactory.createTipoTassaMapper(), tipoTassaDto.getId());

}
@Override
public TipoTassaDto readTipoTassaByCode(TipoTassaDto tipoTassaDto)
		throws PFBaseServiceException {
	return getByField(tipoTassaDao, mapperFactory.createTipoTassaMapper(), tipoTassaDto.getCod(), "codTipoTassa");

}
@Override
public List<TipoTitoloPremioDto> readTipoTitoloPremio() throws PFBaseServiceException{
	return getAll(tipoTitoloPremioDao, mapperFactory.createTipoTitoloPremioMapper());
}
@Override
public TipoTitoloPremioDto readTipoTitoloPremioById(TipoTitoloPremioDto tipoTitoloPremioDto)
		throws PFBaseServiceException {
	return getById(tipoTitoloPremioDao, mapperFactory.createTipoTitoloPremioMapper(), tipoTitoloPremioDto.getId());

}
@Override
public TipoTitoloPremioDto readTipoTitoloPremioByCode(TipoTitoloPremioDto tipoTitoloPremioDto)
		throws PFBaseServiceException {
	return getByField(tipoTitoloPremioDao, mapperFactory.createTipoTitoloPremioMapper(), tipoTitoloPremioDto.getCod(), "codTipoTitoloPremio");

}
@Override
public List<TipoTitoloStudioDto> readTipoTitoloStudio() throws PFBaseServiceException{
	return getAll(tipoTitoloStudioDao, mapperFactory.createTipoTitoloStudioMapper());
}
@Override
public TipoTitoloStudioDto readTipoTitoloStudioById(TipoTitoloStudioDto tipoTitoloStudioDto)
		throws PFBaseServiceException {
	return getById(tipoTitoloStudioDao, mapperFactory.createTipoTitoloStudioMapper(), tipoTitoloStudioDto.getId());

}
@Override
public TipoTitoloStudioDto readTipoTitoloStudioByCode(TipoTitoloStudioDto tipoTitoloStudioDto)
		throws PFBaseServiceException {
	return getByField(tipoTitoloStudioDao, mapperFactory.createTipoTitoloStudioMapper(), tipoTitoloStudioDto.getCod(), "codTipoTitoloStudio");

}
@Override
public List<TipoToponomasticoDto> readTipoToponomastico() throws PFBaseServiceException{
	return getAll(tipoToponomasticoDao, mapperFactory.createTipoToponomasticoMapper());
}
@Override
public TipoToponomasticoDto readTipoToponomasticoById(TipoToponomasticoDto tipoToponomasticoDto)
		throws PFBaseServiceException {
	return getById(tipoToponomasticoDao, mapperFactory.createTipoToponomasticoMapper(), tipoToponomasticoDto.getId());

}
@Override
public TipoToponomasticoDto readTipoToponomasticoByCode(TipoToponomasticoDto tipoToponomasticoDto)
		throws PFBaseServiceException {
	return getByField(tipoToponomasticoDao, mapperFactory.createTipoToponomasticoMapper(), tipoToponomasticoDto.getCod(), "codTipoToponomastico");

}
@Override
public List<TipoUnitMercDto> readTipoUnitMerc() throws PFBaseServiceException{
	return getAll(tipoUnitMercDao, mapperFactory.createTipoUnitMercMapper());
}
@Override
public TipoUnitMercDto readTipoUnitMercById(TipoUnitMercDto tipoUnitMercDto)
		throws PFBaseServiceException {
	return getById(tipoUnitMercDao, mapperFactory.createTipoUnitMercMapper(), tipoUnitMercDto.getId());

}
@Override
public TipoUnitMercDto readTipoUnitMercByCode(TipoUnitMercDto tipoUnitMercDto)
		throws PFBaseServiceException {
	return getByField(tipoUnitMercDao, mapperFactory.createTipoUnitMercMapper(), tipoUnitMercDto.getCod(), "codTipoUnitMerc");

}
@Override
public List<TipoUnitPromozDto> readTipoUnitPromoz() throws PFBaseServiceException{
	return getAll(tipoUnitPromozDao, mapperFactory.createTipoUnitPromozMapper());
}
@Override
public TipoUnitPromozDto readTipoUnitPromozById(TipoUnitPromozDto tipoUnitPromozDto)
		throws PFBaseServiceException {
	return getById(tipoUnitPromozDao, mapperFactory.createTipoUnitPromozMapper(), tipoUnitPromozDto.getId());

}
@Override
public TipoUnitPromozDto readTipoUnitPromozByCode(TipoUnitPromozDto tipoUnitPromozDto)
		throws PFBaseServiceException {
	return getByField(tipoUnitPromozDao, mapperFactory.createTipoUnitPromozMapper(), tipoUnitPromozDto.getCod(), "codTipoUnitPromoz");

}
@Override
public List<TipoValutaDto> readTipoValuta() throws PFBaseServiceException{
	return getAll(tipoValutaDao, mapperFactory.createTipoValutaMapper());
}
@Override
public TipoValutaDto readTipoValutaById(TipoValutaDto tipoValutaDto)
		throws PFBaseServiceException {
	return getById(tipoValutaDao, mapperFactory.createTipoValutaMapper(), tipoValutaDto.getId());

}
@Override
public TipoValutaDto readTipoValutaByCode(TipoValutaDto tipoValutaDto)
		throws PFBaseServiceException {
	return getByField(tipoValutaDao, mapperFactory.createTipoValutaMapper(), tipoValutaDto.getCod(), "codTipoValuta");

}
@Override
public List<TitoloDto> readTitolo() throws PFBaseServiceException{
	return getAll(titoloDao, mapperFactory.createTitoloMapper());
}
@Override
public TitoloDto readTitoloById(TitoloDto titoloDto)
		throws PFBaseServiceException {
	return getById(titoloDao, mapperFactory.createTitoloMapper(), titoloDto.getId());

}
@Override
public TitoloDto readTitoloByCode(TitoloDto titoloDto)
		throws PFBaseServiceException {
	return getByField(titoloDao, mapperFactory.createTitoloMapper(), titoloDto.getCod(), "codTitolo");

}
