public class Runner extends JsHandler {

    public static void main(String[] args) throws Exception {
        String path = "src\\main\\resources\\the_hattress.json";
        String[] expLines = Lines.fillWithLinesIndependent5x4x50V2();
        System.out.println(CompareObjects.isEqualsLines(expLines, convertLinesFromJsArrayToJavaArray(50, getJsArrayLines
                        (convertJsStringToJsObject(FileReader.convertFromFileToString(FileReader.readFile(path)))))));

    }
}
