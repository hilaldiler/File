import java.util.List;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperations {

	public static void createDirectory(String dir) throws IOException {
		try {

			Files.createDirectories(Paths.get(dir));
			System.out.println(dir + " oluşturuldu.");
		} catch (FileAlreadyExistsException e) {
			System.out.println("Dizin zaten var.");
		}

	}

	public static void createFile(String pathAndFile) throws IOException {

		try {
			Files.createFile(Paths.get(pathAndFile));
			System.out.println(pathAndFile + " oluşturuldu.");
		} catch (FileAlreadyExistsException e) {
			System.out.println("Dosya zaten var.");
		}

	}

	public static void writeToFile(String hede, String pathAndFile) throws IOException {

		Files.write(Paths.get(pathAndFile), hede.getBytes());
		System.out.println(hede + ", " + pathAndFile + " dizinine yazdırıldı.");

	}

	public static void readFile(String pathAndFile) throws IOException {

		List<String> lines = Files.readAllLines(Paths.get(pathAndFile));

		for (String line : lines) {

			System.out.println("Okunan satır: " + line);

		}
	}
}
