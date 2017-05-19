@Override
public List<{Entity}Dto> read{Entity}() throws PFBaseServiceException{
	return getAll({entity}Dao, mapperFactory.create{Entity}Mapper());
}
@Override
public {Entity}Dto read{Entity}ById({Entity}Dto {entity}Dto)
		throws PFBaseServiceException {
	return getById({entity}Dao, mapperFactory.create{Entity}Mapper(), {entity}Dto.getId());

}
@Override
public {Entity}Dto read{Entity}ByCode({Entity}Dto {entity}Dto)
		throws PFBaseServiceException {
	return getByField({entity}Dao, mapperFactory.create{Entity}Mapper(), {entity}Dto.getCod(), "cod{Entity}");

}