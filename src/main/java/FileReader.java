import org.apache.commons.io.FileUtils;

import java.io.File;

class FileReader {

    static File readFile(String path) {
        return new File(path);
    }

    static String convertFromFileToString(File file) throws Exception {
        return FileUtils.readFileToString(file, "utf-8");
    }
}
