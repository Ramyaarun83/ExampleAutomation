package com.sg.Autotesting;

public class ExecuteAutoITDemo {

	public static void main(String[] args) {
		executeScript();

	}
	
	static void executeScript()
	{
		try
		{
			String path="H:\\SeleniumAutomation\\Examples\\AutoIt\\CompleteScenario.exe";
		//	Runtime.getRuntime().exec(path);
			
			Runtime obj=Runtime.getRuntime();
			obj.exec(path);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
