package Runners;

import ExpLines.Lines;
import Logic.*;

public class CheckLinesRunner extends JsHandler {

    public static void main(String[] args) throws Exception {
      /*  String[] expLines = Lines.fillWithLinesIndependent5x4x50V2();
        Client.sendPOST(Url.CONSOLE_URL, Url.PARAMS);
        System.out.println(AssertEquals.isEqual(expLines, convertLinesFromJsArrayToJavaArray(50, getJsArrayLines
                (convertJsStringToJsObject((Client.sendGET(Url.SPIN)))))));
                */
        String[] expLines = Lines.fillWithLinesIndependent5x4x50V2();
        String[] actualLines = JsHandler.convertLinesFromJsArrToJavaArr(50, JsHandler.getJsArrLines(JsHandler.convertJsStrToJsObject((FileReader.convertFromFileToString(FileReader.readFile("E:\\dimatest\\src\\main\\resources\\the_hattress.json"))))));
        AssertEquals.isEqualLines(expLines, actualLines);
    }
}
