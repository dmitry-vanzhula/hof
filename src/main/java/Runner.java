public class Runner extends JsHandler {

    public static void main(String[] args) throws Exception {
       // String path = "E:\\myapp\\src\\main\\resources\\res.json";
        String path = "E:\\myapp\\src\\main\\resources\\gummy.json";
        String[] expLines = Lines.fillWithLinesIndependent4x5x40();
        System.out.println(CompareObjects.isEqualsLines(expLines, convertLinesFromJsArrayToJavaArray(40, getJsArrayLines
                        (convertJsStringToJsObject(FileReader.convertFromFileToString(FileReader.readFile(path)))))));

    }
}
