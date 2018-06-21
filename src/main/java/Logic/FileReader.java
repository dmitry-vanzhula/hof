package Logic;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class FileReader {

    public static File readFile(String path) {
        return new File(path);
    }

    public static String convertFromFileToString(File file) throws Exception {
        return FileUtils.readFileToString(file, "utf-8");
    }
}
