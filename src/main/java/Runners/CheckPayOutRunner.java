package Runners;

import ExpCoefficients.ExpPayOut;
import Logic.AssertEquals;
import Logic.Client;
import Logic.JsHandler;
import Logic.Url;

public class CheckPayOutRunner extends JsHandler {
    public static void main(String[] args) throws Exception {
        Client.sendPOST(Url.CONSOLE_URL, Url.PARAMS1);
        AssertEquals.isEqualWins(ExpPayOut.symbol_3x5, getTotalWin(convertJsStrToJsObject(Client.sendGET(Url.SPIN))));
        Client.sendPOST(Url.CONSOLE_URL, Url.PARAMS2);
        AssertEquals.isEqualWins(ExpCoefficients.ExpPayOut.symbol_3x4, getTotalWin(convertJsStrToJsObject(Client.sendGET(Url.SPIN))));
        Client.sendPOST(Url.CONSOLE_URL, Url.PARAMS3);
        AssertEquals.isEqualWins(ExpCoefficients.ExpPayOut.symbol_3x3, getTotalWin(convertJsStrToJsObject(Client.sendGET(Url.SPIN))));
    }
}
