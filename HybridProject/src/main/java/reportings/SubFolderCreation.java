package reportings;

import java.io.File;

public class SubFolderCreation
{

	public static void main(String[] args) 
	{
		File f = new File("C:\\Users\\ravi\\Desktop\\abc\\xyz\\pqr");
		f.mkdirs();

	}

}
