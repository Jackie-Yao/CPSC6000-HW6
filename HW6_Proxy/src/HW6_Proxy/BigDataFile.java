package HW6_Proxy;

public class BigDataFile implements File {
	String FilePath;
	
	public BigDataFile(String FilePath) {
		this.FilePath = FilePath;
		this.LoadFile();
	}
	
	public void LoadFile() {
		System.out.println("Load Big Data File");
	}
	
	@Override
	public void PrintHeader() {
		System.out.println("Print first 50 rows");
		
	}
}
