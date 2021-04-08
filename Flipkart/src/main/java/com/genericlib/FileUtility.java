package com.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{

   public String readDataFromProperty(String key) throws IOException
   {
	   Properties prop=new Properties();
	   FileInputStream fis=new FileInputStream(AutoConstant.PropertyFile_path);
	   prop.load(fis);
	   String value = prop.getProperty(key);
	   
	   return value;
	   
   }
}
