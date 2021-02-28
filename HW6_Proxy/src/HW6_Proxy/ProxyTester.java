package HW6_Proxy;

public class ProxyTester {

	public static void main(String[] args) {
		String filePath = "BigDataFilePath.csv";
		BigDataFileLazyProxy proxy = new BigDataFileLazyProxy(filePath);
		// First time of calling, load data file
		System.out.println("First Calling");
		proxy.PrintHeader();
		
		// Second time of calling, no load data
		System.out.println("Second Calling");
		proxy.PrintHeader();
		
	}

}
