package HW6_Proxy;

public class BigDataFileLazyProxy implements File{
	String FilePath = null;
	BigDataFile bigDataFile = null;
	
	public BigDataFileLazyProxy(String FilePath) {
		this.FilePath = FilePath;
	}
	
	@Override
	public void PrintHeader() {
		// TODO Auto-generated method stub
		if(this.bigDataFile == null) {
			this.bigDataFile = new BigDataFile(this.FilePath);
		}
		this.bigDataFile.PrintHeader();
	}

}
