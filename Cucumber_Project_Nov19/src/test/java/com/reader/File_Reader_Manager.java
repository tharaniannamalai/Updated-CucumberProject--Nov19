package com.reader;

import java.io.IOException;

public class File_Reader_Manager {
	
	private File_Reader_Manager()
	{
		
	}
	
	public static File_Reader_Manager getInstanceFRM()
	{
		File_Reader_Manager reader = new File_Reader_Manager();
		return reader;
	}
	
	public TestData_Reader getInstanceTD() throws IOException
	{
		TestData_Reader tdreader = new TestData_Reader();
		
		return tdreader;
	}

}
