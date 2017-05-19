package com.daniele.project.parsers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.stream.Collectors;

public class TemplateGeneratorDemo {
	
	
	private String entitiesTablesInFilePath;
	private String templatesInDirPath;
	private String outDirPath;
	private String daoOutDirPath;
	private String testServicesOutDirPath;
	
	
	public TemplateGeneratorDemo() {
		super();
		this.entitiesTablesInFilePath = Constants.IN_DIR_BASE_PATH+"/EntityTables.txt";
		this.templatesInDirPath = Constants.IN_DIR_BASE_PATH+"/templates";
		this.outDirPath = Constants.OUT_DIR_BASE_PATH;
		this.daoOutDirPath = Constants.OUT_DIR_BASE_PATH+"/dao";
		this.testServicesOutDirPath =Constants.OUT_DIR_BASE_PATH+"/test/";
		
	}

	
	public void genKey() throws IOException{
		System.out.println("genKey - start");
		
		try 
		 {
			File entitiesTabFold = new File(entitiesTablesInFilePath);
			BufferedReader br = new BufferedReader(new FileReader(entitiesTabFold));
			File fileOut = new File(outDirPath);//Where to generate dao
			final String basePath = templatesInDirPath;
			
			File templatesFolder = new File(templatesInDirPath+"\\"+Constants.TEST_INVOKE_POSTMAN_SERVICE_TEMPLATE_NAME+"\\key");
			File [] templates = templatesFolder.listFiles();
			StringBuilder buffer ;
			StringBuilder buffer2 ;
			String line;
			int numLine = 0;
			int is = 0;


			for(int i=0; i<templates.length;i++){
				File template = templates[i];
				
				Path path = Paths.get(template.getPath());
				Path outPath = null;
				Charset charset = StandardCharsets.UTF_8;
				String content="";
				String bufferStr="";
				String templatefileName = path.getFileName().toString();
				
				switch(templatefileName){
				
				case Constants.IN_FILE_INVOKE_POSTMAN_SERVICE_TEMPLATE_CODE_NAME+".txt" :
					br = new BufferedReader(new FileReader(entitiesTabFold));
				    buffer2 = new StringBuilder();
					while ( (line = br.readLine()) != null ) 
					{ 
						buffer = new StringBuilder();
						buffer.append(line);
						String ss = buffer.toString();
						String [] colums = ss.split(";");
					    String entity = colums[0].trim();

					    String subStrKey = entity.substring(entity.length()-3, entity.length());//retrieves the 3 first char as a key that will replace the placeholder {key} 
					   
						outPath = Paths.get(fileOut.getPath()+"\\"+Constants.TEST_INVOKE_POSTMAN_SERVICE_TEMPLATE_NAME+"\\CodesList.txt");
						try {
							
							content = Files.lines(path, charset).collect(Collectors.joining("\n"));
						} catch (IOException e) {
							
							e.printStackTrace();
						}
						content = content.replaceAll(Constants.PLACE_HOLDER_KEY_GEN, subStrKey);
						buffer2.append(content+"\n");
					}//end-while
					br.close();
					bufferStr = buffer2.toString();
					try {
						Files.write(outPath, bufferStr.getBytes(charset));
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
					
				default :
					break;
				}
				
			}//end-for
			
		 } catch (IOException e) {
				System.err.println("readEntitiesList - ERROR IOException :"+e);
				e.printStackTrace();
		 
		 }
	
	}
	
	public void produceTestServiceMock() throws IOException{
		System.out.println("readEntitiesList - start");
		
		 try 
		 {
			File entitiesTabFold = new File(entitiesTablesInFilePath);
			BufferedReader br = new BufferedReader(new FileReader(entitiesTabFold));
			File fileOut = new File(outDirPath);
			File templatesFolder = new File(templatesInDirPath+"\\"+Constants.TEST_INVOKE_POSTMAN_SERVICE_TEMPLATE_NAME);
			File [] templates = templatesFolder.listFiles();
			StringBuilder buffer ;
			StringBuilder buffer2 ;
			String line;
			int numLine = 0;
			int is = 0;

			for(int i=0; i<templates.length;i++){
				File template = templates[i];
				Path path = Paths.get(template.getPath());
				Path outPath = null;
				Charset charset = StandardCharsets.UTF_8;
				String content="";
				String bufferStr="";
				String templatefileName = path.getFileName().toString();
				
				switch(templatefileName){
				
				case Constants.IN_FILE_INVOKE_POSTMAN_SERVICE_TEMPLATE_NAME+".txt" :
					br = new BufferedReader(new FileReader(entitiesTabFold));
				    buffer2 = new StringBuilder();
					while ( (line = br.readLine()) != null ) 
					{ 
						buffer = new StringBuilder();
						buffer.append(line);
						String ss = buffer.toString();
						String [] colums = ss.split(";");
					    String entity = colums[0].trim();
					    String genKey = colums[2].trim();
						outPath = Paths.get(fileOut.getPath()+"\\"+Constants.TEST_INVOKE_POSTMAN_SERVICE_TEMPLATE_NAME+"\\invokedServiceRequestSectionJson.java");
						try {
							content = Files.lines(path, charset).collect(Collectors.joining("\n"));
						} catch (IOException e) {
							e.printStackTrace();
						}
						content = content.replaceAll(Constants.PLACE_HOLDER_ENTITY, entity).replaceAll(Constants.PLACE_HOLDER_KEY_GEN, genKey);
						buffer2.append(content+"\n");
					}//end-while
					br.close();
					bufferStr = buffer2.toString();
					try {
						Files.write(outPath, bufferStr.getBytes(charset));
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
					
				default :
					break;
				}
					
			}
			
		 } catch (IOException e) {
				System.err.println("readEntitiesList - ERROR IOException :"+e);
				e.printStackTrace();
		 
		 }
	}
	
	
	public void readEntitiesList() throws IOException{
		System.out.println("readEntitiesList - start");
		
	 try 
	 {
		File entitiesTabFold = new File(entitiesTablesInFilePath);
		BufferedReader br = new BufferedReader(new FileReader(entitiesTabFold));
		File fileOut = new File(outDirPath);//Where to generate dao
		File templatesFolder = new File(templatesInDirPath);
		File [] templates = templatesFolder.listFiles();
		StringBuilder buffer ;
		StringBuilder buffer2 ;
		String line;
		
		for(int i=0; i<templates.length;i++){
			File template = templates[i];
			Path path = Paths.get(template.getPath());
			Path outPath = null;
			Charset charset = StandardCharsets.UTF_8;
			String content="";
			String bufferStr="";
			String templatefileName = path.getFileName().toString();
			
			switch(templatefileName){
			
			case Constants.IN_FILE_DAO_TEMPLATE_NAME+".txt" :
				br = new BufferedReader(new FileReader(entitiesTabFold));
				while ( (line = br.readLine()) != null ) 
				{ 
					buffer = new StringBuilder();
					buffer.append(line);
					String ss = buffer.toString();
					String [] colums = ss.split(";");
				    String entity = colums[0].trim();
				    String table = colums[1].trim();
				    
				    outPath = Paths.get(fileOut.getPath()+"\\"+Constants.DAO_TEMPLATE_OUT_DIR_NAME+"\\"+entity+"Dto.java");
					try {
						 content = Files.lines(path, charset).collect(Collectors.joining("\n"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					content = content.replaceAll(Constants.PLACE_HOLDER_ENTITY, entity).replaceAll(Constants.PLACE_HOLDER_TABLE, parseFirstCharToLowerCase(table));
					
					try {
						Files.write(outPath, content.getBytes(charset));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				br.close();
				break;
			case Constants.IN_FILE_MAPPER_TEMPLATE_NAME+".txt" :
				
				br = new BufferedReader(new FileReader(entitiesTabFold));
				while ( (line = br.readLine()) != null ) 
				{ 
					buffer = new StringBuilder();
					buffer.append(line);
					String ss = buffer.toString();
					String [] colums = ss.split(";");
				    String entity = colums[0].trim();
				   
				    outPath = Paths.get(fileOut.getPath()+"\\"+Constants.MAPPER_TEMPLATE_OUT_DIR_NAME+"\\"+entity+"Mapper.java");
					try {
						content = Files.lines(path, charset).collect(Collectors.joining("\n"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					content = content.replaceAll(Constants.PLACE_HOLDER_ENTITY, entity);
					try {
						Files.write(outPath, content.getBytes(charset));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				br.close();
				break;
				
			case Constants.IN_FILE_DECLARE_DAO_TEMPLATE_NAME+".txt" :	
				br = new BufferedReader(new FileReader(entitiesTabFold));
			    buffer2 = new StringBuilder();
				while ( (line = br.readLine()) != null ) 
				{ 
					buffer = new StringBuilder();
					buffer.append(line);
					String ss = buffer.toString();
					String [] colums = ss.split(";");
				    String entity = colums[0].trim();
					outPath = Paths.get(fileOut.getPath()+"\\"+Constants.IN_FILE_DECLARE_DAO_TEMPLATE_NAME+".java");
					try {
							content = Files.lines(path, charset).collect(Collectors.joining("\n"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					content = content.replaceAll(Constants.PLACE_HOLDER_ENTITY, entity).replaceAll(Constants.PLACE_HOLDER_ENTITY_LOWER_CASE, parseFirstCharToLowerCase(entity));
					buffer2.append(content+"\n");
				}//end-while
				
				br.close();
				bufferStr = buffer2.toString();
				try {
					 Files.write(outPath, bufferStr.getBytes(charset));
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;	
				
			case Constants.IN_FILE_DECLARE_READ_METHODS_TEMPLATE_NAME+".txt" :
				br = new BufferedReader(new FileReader(entitiesTabFold));
			    buffer2 = new StringBuilder();
				while ( (line = br.readLine()) != null ) 
				{ 
					buffer = new StringBuilder();
					buffer.append(line);
					String ss = buffer.toString();
					String [] colums = ss.split(";");//TODO
				    String entity = colums[0].trim();
				    String table = colums[1].trim();
				    
					outPath = Paths.get(fileOut.getPath()+"\\"+Constants.IN_FILE_DECLARE_READ_METHODS_TEMPLATE_NAME+".java");
					try {
						   content = Files.lines(path, charset).collect(Collectors.joining("\n"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					content = content.replaceAll(Constants.PLACE_HOLDER_ENTITY, entity).replaceAll(Constants.PLACE_HOLDER_ENTITY_LOWER_CASE, parseFirstCharToLowerCase(entity));
					buffer2.append(content+"\n");
					
				}//end-while
				br.close();
				bufferStr = buffer2.toString();
				try {
					Files.write(outPath, bufferStr.getBytes(charset));
				} catch (IOException e) {
					e.printStackTrace();
				}	
				break;
			case Constants.IN_FILE_INSTANTIATE_DAO_TEMPLATE_NAME+".txt" :
				br = new BufferedReader(new FileReader(entitiesTabFold));
			    buffer2 = new StringBuilder();
				while ( (line = br.readLine()) != null ) 
				{ 
					buffer = new StringBuilder();
					buffer.append(line);
					String ss = buffer.toString();
					String [] colums = ss.split(";");
				    String entity = colums[0].trim();
				    String table = colums[1].trim();
				    
					outPath = Paths.get(fileOut.getPath()+"\\"+Constants.IN_FILE_INSTANTIATE_DAO_TEMPLATE_NAME+".java");
					try {
						 content = Files.lines(path, charset).collect(Collectors.joining("\n"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					content = content.replaceAll(Constants.PLACE_HOLDER_ENTITY, entity).replaceAll(Constants.PLACE_HOLDER_ENTITY_LOWER_CASE, parseFirstCharToLowerCase(entity));
					buffer2.append(content+"\n");
					
				}//end-while
				br.close();
				bufferStr = buffer2.toString();
				try {
					  Files.write(outPath, bufferStr.getBytes(charset));
				} catch (IOException e) {
					
					e.printStackTrace();
				}	
				break;
				
			case Constants.IN_FILE_OVERRIDE_READ_METHODS_TEMPLATE_NAME+".txt" :
				br = new BufferedReader(new FileReader(entitiesTabFold));
			    buffer2 = new StringBuilder();
				while ( (line = br.readLine()) != null ) 
				{ 
					buffer = new StringBuilder();
					buffer.append(line);
					String ss = buffer.toString();
					String [] colums = ss.split(";");
				    String entity = colums[0].trim();
				    String table = colums[1].trim();
				    
					outPath = Paths.get(fileOut.getPath()+"\\"+Constants.IN_FILE_OVERRIDE_READ_METHODS_TEMPLATE_NAME+".java");
					try {
						   content = Files.lines(path, charset).collect(Collectors.joining("\n"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					content = content.replaceAll(Constants.PLACE_HOLDER_ENTITY, entity).replaceAll(Constants.PLACE_HOLDER_ENTITY_LOWER_CASE, parseFirstCharToLowerCase(entity));
					buffer2.append(content+"\n");
					
				}//end-while
				br.close();
				bufferStr = buffer2.toString();
				try {
					Files.write(outPath, bufferStr.getBytes(charset));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				break;
			case Constants.IN_FILE_TRANSFORMER_TEMPLATE_NAME+".txt" :
				br = new BufferedReader(new FileReader(entitiesTabFold));
			    buffer2 = new StringBuilder();
				while ( (line = br.readLine()) != null ) 
				{ 
					buffer = new StringBuilder();
					buffer.append(line);
					String ss = buffer.toString();
					String [] colums = ss.split(";");//TODO
				    String entity = colums[0].trim();
				    String table = colums[1].trim();
				    
					outPath = Paths.get(fileOut.getPath()+"\\"+Constants.IN_FILE_TRANSFORMER_TEMPLATE_NAME+".java");
					try {
							content = Files.lines(path, charset).collect(Collectors.joining("\n"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					content = content.replaceAll(Constants.PLACE_HOLDER_ENTITY, entity).replaceAll(Constants.PLACE_HOLDER_ENTITY_LOWER_CASE, parseFirstCharToLowerCase(entity));
					buffer2.append(content+"\n");
					
				}//end-while
				br.close();
				bufferStr = buffer2.toString();
				try {
					Files.write(outPath, bufferStr.getBytes(charset));
				} catch (IOException e) {
					e.printStackTrace();
				}	
				break;
			case Constants.IN_FILE_MAPPER_FACTORY_TEMPLATE_NAME+".txt" :
				br = new BufferedReader(new FileReader(entitiesTabFold));
			    buffer2 = new StringBuilder();
				while ( (line = br.readLine()) != null ) 
				{ 
					buffer = new StringBuilder();
					buffer.append(line);
					String ss = buffer.toString();
					String [] colums = ss.split(";");//TODO
				    String entity = colums[0].trim();
				    String table = colums[1].trim();
				    
					outPath = Paths.get(fileOut.getPath()+"\\"+Constants.IN_FILE_MAPPER_FACTORY_TEMPLATE_NAME+".java");
					try {
						   content = Files.lines(path, charset).collect(Collectors.joining("\n"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					content = content.replaceAll(Constants.PLACE_HOLDER_ENTITY, entity).replaceAll(Constants.PLACE_HOLDER_ENTITY_LOWER_CASE, parseFirstCharToLowerCase(entity));
					buffer2.append(content+"\n");
					
				}//end-while
				br.close();
				bufferStr = buffer2.toString();
				try {
					Files.write(outPath, bufferStr.getBytes(charset));
				} catch (IOException e) {
					
					e.printStackTrace();
				}	
				break;
				
			case Constants.IN_FILE_MAPPER_FACTORY_IMPL_TEMPLATE_NAME+".txt" :	
				br = new BufferedReader(new FileReader(entitiesTabFold));
			    buffer2 = new StringBuilder();
				while ( (line = br.readLine()) != null ) 
				{ 
					buffer = new StringBuilder();
					buffer.append(line);
					String ss = buffer.toString();
					String [] colums = ss.split(";");//TODO
				    String entity = colums[0].trim();
				    String table = colums[1].trim();
				    
					outPath = Paths.get(fileOut.getPath()+"\\"+Constants.IN_FILE_MAPPER_FACTORY_IMPL_TEMPLATE_NAME+".java");
					try {
					
						content = Files.lines(path, charset).collect(Collectors.joining("\n"));
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					content = content.replaceAll(Constants.PLACE_HOLDER_ENTITY, entity).replaceAll(Constants.PLACE_HOLDER_ENTITY_LOWER_CASE, parseFirstCharToLowerCase(entity));
					buffer2.append(content+"\n");
					
				}//end-while
				br.close();
				bufferStr = buffer2.toString();
				try {
					Files.write(outPath, bufferStr.getBytes(charset));
				} catch (IOException e) {
					e.printStackTrace();
				}	
				break;
			default :
				break;
			}//end-switch
		}
		 br.close();
	 } catch (IOException e) {
			System.err.println("readEntitiesList - ERROR IOException :"+e);
			e.printStackTrace();
	 
	 }
	 
	 
	}
	
	
	public void readEntitiesList0() throws IOException{
		
		System.out.println("readEntitiesList - start");
		File entitiesTabFold = new File(entitiesTablesInFilePath);
		BufferedReader br = new BufferedReader(new FileReader(entitiesTabFold));
		File fileOut = new File(outDirPath+"/"+Constants.DAO_TEMPLATE_OUT_DIR_NAME);//Where to generate dao
		File templatesFolder = new File(templatesInDirPath);
		File [] templates = templatesFolder.listFiles();
		StringBuilder buffer ;
		String line;
		
		while ( (line = br.readLine()) != null ) 
		{ 
			buffer = new StringBuilder();
			buffer.append(line);
			String ss = buffer.toString();
			String [] colums = ss.split(";");
		    String entity = colums[0].trim();
			for(int i=0; i<templates.length;i++){
				File template = templates[i];
				if(Constants.IN_FILE_DECLARE_DAO_TEMPLATE_NAME.equals(template.getPath())){
					Path path = Paths.get(template.getPath());
					Path outPath = null;
					Charset charset = StandardCharsets.UTF_8;
					String content=null;
					
					switch(template.getName()){
					
					case Constants.IN_FILE_DAO_TEMPLATE_NAME :
						
						outPath = Paths.get(fileOut.getPath()+"\\"+entity+"Dao");
						try {
							  content = new String(Files.readAllBytes(path), charset);
						} catch (IOException e) {
							
							e.printStackTrace();
						}
						content = content.replaceAll(Constants.PLACE_HOLDER_ENTITY, entity).replaceAll(Constants.PLACE_HOLDER_ENTITY_LOWER_CASE, parseFirstCharToLowerCase(entity));
						try {
							Files.write(outPath, content.getBytes(charset));
						} catch (IOException e) {
							e.printStackTrace();
						}
						break;
						
					case Constants.IN_FILE_DECLARE_DAO_TEMPLATE_NAME :	
						outPath = Paths.get(fileOut.getPath()+"\\"+entity+"Dao");
						try {
							content = new String(Files.readAllBytes(path), charset);
						} catch (IOException e) {
							e.printStackTrace();
						}
						content = content.replaceAll(Constants.PLACE_HOLDER_ENTITY, entity).replaceAll(Constants.PLACE_HOLDER_ENTITY_LOWER_CASE, parseFirstCharToLowerCase(entity));
						buffer = new StringBuilder();
						buffer.append(line);
						try {
							Files.write(outPath, content.getBytes(charset));
						} catch (IOException e) {
						
							e.printStackTrace();
						}
						break;
					}
					
				}
			}
		}
		
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 * @description Given string ('Abcd') Return the corrispondent with first char lower case ('abcd')
	 */
	public String parseFirstCharToLowerCase(String value){
		System.out.println("parseFirstCharToLowerCase - start");
		StringBuilder sb = new StringBuilder(value);
		char c = sb.charAt(0);
	    if (Character.isUpperCase(c)) {
	        sb.setCharAt(0, Character.toLowerCase(c));
	    }
		return sb.toString();
	}
	
	
	

	public static void main(String[] args) {
		
		TemplateGeneratorDemo demo = new TemplateGeneratorDemo();
		try {
			  demo.genKey();
			  demo.produceTestServiceMock();
			//demo.readEntitiesList();
			//demo.produceTestServiceMock();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		
	}

	public static class Constants {
		
		private static final String IN_DIR_BASE_PATH = "C:/Users/daniele/workspace/Algo/in";
		private static final String OUT_DIR_BASE_PATH = "C:/Users/daniele/workspace/Algo/out";
		private static final String DAO_TEMPLATE_OUT_DIR_NAME = "dao";
		private static final String MAPPER_TEMPLATE_OUT_DIR_NAME = "mapper";
		
		private static final String PLACE_HOLDER_ENTITY = "\\{Entity\\}";
		private static final String PLACE_HOLDER_ENTITY_LOWER_CASE = "\\{entity\\}";
		private static final String PLACE_HOLDER_TABLE = "\\{table\\}";
		private static final String PLACE_HOLDER_KEY_GEN = "\\{key\\}";
		
		private static final String IN_FILE_INVOKE_POSTMAN_SERVICE_TEMPLATE_CODE_NAME = "Code";
		private static final String IN_FILE_MAPPER_TEMPLATE_NAME = "MapperTemplate";
		private static final String IN_FILE_DAO_TEMPLATE_NAME = "DaoTemplate";
		private static final String IN_FILE_DECLARE_DAO_TEMPLATE_NAME = "declareDaoTemplate";
		private static final String IN_FILE_DECLARE_READ_METHODS_TEMPLATE_NAME = "declareReadMethodsTemplate";
		private static final String IN_FILE_INSTANTIATE_DAO_TEMPLATE_NAME = "instantiateDaoTemplate";
		private static final String IN_FILE_OVERRIDE_READ_METHODS_TEMPLATE_NAME = "OverrideReadMethodsTemplate";
		private static final String IN_FILE_TRANSFORMER_TEMPLATE_NAME = "transformerTemplate";
		private static final String IN_FILE_MAPPER_FACTORY_TEMPLATE_NAME = "MapperFactoryTemplate";
		private static final String IN_FILE_MAPPER_FACTORY_IMPL_TEMPLATE_NAME ="MapperFactoryImplTemplate";
		private static final String IN_FILE_INVOKE_POSTMAN_SERVICE_TEMPLATE_NAME = "invokePostmanTemplate";
		
		private static final String TEST_INVOKE_POSTMAN_SERVICE_TEMPLATE_NAME = "test";
		
		
	}
	
	
}
