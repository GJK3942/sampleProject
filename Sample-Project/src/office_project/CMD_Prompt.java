package office_project;

import java.io.File;
import java.util.Properties;

public class CMD_Prompt {
	
	public boolean downloadFlow() {
		
		try {
			for(String dirname:System.getenv("PATH").split(File.pathSeparator)) {
				
				File file = new File(dirname,"git.exe");
				
				if(file.isFile() && file.canExecute()) {
					
					String path = "git clone "+ Properties.getValue("").replace("username",System.getProperty("user.name")).replace("password",System.getProperty("user.name"));
				}
			}
		}
		
	}

	public static void main(String[] args) {
	
		

	}

}
