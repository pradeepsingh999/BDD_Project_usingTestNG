package org.iPulse.hooks;

import java.io.FileInputStream;
import java.util.Properties;

import org.iPulse.general.TestBase;

import cucumber.api.java.Before;

//import io.cucumber.java.Before;
//import cucumber.api.java.Before;
//import cucumber.api.java.Before;



public class Hooks extends TestBase {
	
	
	@Before
	public void fnpInitialize() throws Throwable{
		
		if(!initialize){
			//initialize properties file
			OR=new Properties();
			FileInputStream orFile=new FileInputStream(System.getProperty("user.dir")+"//src\\test\\java\\org\\iPulse\\config\\OR.property");
			OR.load(orFile);
			
			initialize=true;
		}
	}
	
	
	
	

}
