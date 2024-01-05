package test_scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_lib.BaseScripts;

/***
 * @author Dayasindhu.N
 */
public class TC_Id_001_Test extends BaseScripts {
	@Test
	public void login(){
		Reporter.log("Login is successfull",true);
	}
}