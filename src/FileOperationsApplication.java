import java.io.IOException;

public class FileOperationsApplication {

	public static void main(String[] args) throws IOException {
		FileOperations fileOperations = new FileOperations();

		//fileOperations.createDirectory("/home/cylon/hello");

		//fileOperations.createFile("/home/cylon/hello/hey.txt");
		
		//fileOperations.writeToFile("JOE STRUMMER WAS BORN IN ANKARA", "/home/cylon/hello/hey.txt");

		fileOperations.readFile("/home/cylon/hello/hey.txt");
	}

}
