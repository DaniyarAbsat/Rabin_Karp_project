import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReaderUtil {

    public static String readFile(String path) {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (Exception e) {
            System.out.println("Error reading file: " + path);
            return "";
        }
    }
}
