import ExpCoefficients.ExpPayOut;

public class CheckPayOutRunner extends JsHandler {
    public static void main(String[] args) throws Exception {

        Client.sendPOST(Url.CONSOLE_URL, Url.PARAMS1);
        AssertEquals.isEqualWins(ExpPayOut.symbol_3x5, getTotalWin(convertJsStringToJsObject(Client.sendGET(Url.SPIN))));
        Client.sendPOST(Url.CONSOLE_URL, Url.PARAMS2);
        AssertEquals.isEqualWins(ExpCoefficients.ExpPayOut.symbol_3x4, getTotalWin(convertJsStringToJsObject(Client.sendGET(Url.SPIN))));
        Client.sendPOST(Url.CONSOLE_URL, Url.PARAMS3);
        AssertEquals.isEqualWins(ExpCoefficients.ExpPayOut.symbol_3x3, getTotalWin(convertJsStringToJsObject(Client.sendGET(Url.SPIN))));
    }
}
