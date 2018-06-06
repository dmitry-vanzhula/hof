import ExpLines.Lines;

public class CheckLinesRunner extends JsHandler {

    public static void main(String[] args) throws Exception {
        String[] expLines = Lines.fillWithLinesIndependent5x4x50V2();
        Client.sendPOST(Url.CONSOLE_URL, Url.PARAMS_SET_ALL_LINES);
        System.out.println(AssertEquals.isEqualsLines(expLines, convertLinesFromJsArrayToJavaArray(50, getJsArrayLines
                (convertJsStringToJsObject((Client.sendGET(Url.SPIN)))))));
    }
}
