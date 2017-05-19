package com.daniele.switchyard.v1.module.utilities.prototype.dao;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 7/17/2017
 * @time 06:04
 * @version 0.1
 * 
 */
public class Constants {
	
	public static final String IN_DIR_BASE_PATH = "C:/Users/daniele/workspace/Algo/in";
	public static final String OUT_DIR_BASE_PATH = "C:/Users/daniele/workspace/Algo/out";
	public static final String DAO_TEMPLATE_OUT_DIR_NAME = "dao";
	public static final String MAPPER_TEMPLATE_OUT_DIR_NAME = "mapper";
	
	public static final String PLACE_HOLDER_ENTITY = "\\{Entity\\}";
	public static final String PLACE_HOLDER_ENTITY_LOWER_CASE = "\\{entity\\}";
	public static final String PLACE_HOLDER_TABLE = "\\{table\\}";
	public static final String PLACE_HOLDER_KEY_GEN = "\\{key\\}";
	
	public static final String IN_FILE_INVOKE_POSTMAN_SERVICE_TEMPLATE_CODE_NAME = "Code";
	public static final String IN_FILE_MAPPER_TEMPLATE_NAME = "MapperTemplate";
	public static final String IN_FILE_DAO_TEMPLATE_NAME = "DaoTemplate";
	public static final String IN_FILE_DECLARE_DAO_TEMPLATE_NAME = "declareDaoTemplate";
	public static final String IN_FILE_DECLARE_READ_METHODS_TEMPLATE_NAME = "declareReadMethodsTemplate";
	public static final String IN_FILE_INSTANTIATE_DAO_TEMPLATE_NAME = "instantiateDaoTemplate";
	public static final String IN_FILE_OVERRIDE_READ_METHODS_TEMPLATE_NAME = "OverrideReadMethodsTemplate";
	public static final String IN_FILE_TRANSFORMER_TEMPLATE_NAME = "transformerTemplate";
	public static final String IN_FILE_MAPPER_FACTORY_TEMPLATE_NAME = "MapperFactoryTemplate";
	public static final String IN_FILE_MAPPER_FACTORY_IMPL_TEMPLATE_NAME ="MapperFactoryImplTemplate";
	public static final String IN_FILE_INVOKE_POSTMAN_SERVICE_TEMPLATE_NAME = "invokePostmanTemplate";
	
	public static final String TEST_INVOKE_POSTMAN_SERVICE_TEMPLATE_NAME = "test";
	
	public static final Charset CHARSET = StandardCharsets.UTF_8;
	

}
