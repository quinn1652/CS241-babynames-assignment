import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile {
	private String path;
	private boolean append = false;
	
	public WriteFile(String path){
		this.path = path;
		
	}
	
	public WriteFile(String path, boolean append){
		this.path=path;
		this.append=append;
	}
	
	public void WriteToFile(String text) throws IOException{
		FileWriter write = new FileWriter(path, append);
		PrintWriter print_line = new PrintWriter(write);
		
		print_line.printf("%s" + "%n", text);
		print_line.close();
	}
}
