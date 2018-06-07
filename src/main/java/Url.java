public class Url {

/////////////////////////////// Spin Params: gameId, session, lines, bet//////////////

    private static String gameId = "151";

    private static String session = "\"1e65b192d09ad1dd\"";

    private static String lines = "30";

    private static String bet = "25.0";

/////////////////////////////// Spin URL ////////////////////////////////////////////

    protected static String SPIN = "http://hoflbtest.pacific-interactive.net/onlinecasino/games/handler.ashx?params={\"gameId\":" + gameId + ",\"session\":"+ session +",\"lines\":" + lines + ",\"bet\":" + bet + "}&cmd=spin&id=";
    protected static String INIT = "http://hoflbtest.pacific-interactive.net/onlinecasino/games/handler.ashx?params={\"gameId\":" + gameId + ",\"session\":"+ session +",\"lines\":" + lines + ",\"bet\":" + bet + "}&cmd=init&id=";

/////////////////////////////// Console URL /////////////////////////////////////////

    protected static final String CONSOLE_URL = "http://testcase-kiev.dublin.local/gamedata/server/3/game/210/user/2118136584/set";

//////////////////////////////// Console set reels //////////////////////////////////////

    private static String allLines_independent_reels_5x4 = "[5],[5],[5],[5],[5],[5],[5],[5],[5],[5],[5],[5],[5],[5],[5],[5],[5],[5],[5],[5]";
    private static String allLines_standart_reels_5x4 = "[5,5,5,5],[5,5,5,5],[5,5,5,5],[5,5,5,5],[5,5,5,5]";
    private static String fiveSymbolsInARowSymbol_3_reels_5x4 = "[3,6,6,6],[3,7,7,7],[3,8,8,8],[3,9,9,9],[3,10,10,10]";
    private static String fourSymbolsInARowSymbol_3_reels_5x4 = "[3,6,6,6],[3,7,7,7],[3,8,8,8],[3,9,9,9],[4,10,10,10]";
    private static String threeSymbolsInARowSymbol_3_reels_5x4 = "[3,6,6,6],[3,7,7,7],[3,8,8,8],[4,9,9,9],[4,10,10,10]";

///////////////////////////////// Console Params /////////////////////////////////////////

    protected static String PARAMS = "{\"serverId\":3,\"gameId\":" + gameId +  ",\"userId\":2118136584,\"gameData\":\"{\\\"baseFeatures\\\":[{\\\"id\\\":0,\\\"name\\\":\\\"Primary game\\\",\\\"type\\\":\\\"BaseSpin\\\",\\\"data\\\":null,\\\"features\\\":null,\\\"reelsMask\\\":null,\\\"wheelsState\\\":[" + allLines_independent_reels_5x4 + "]}]}\"}";
    protected static String PARAMS1 = "{\"serverId\":3,\"gameId\":" + gameId +  ",\"userId\":2118136584,\"gameData\":\"{\\\"baseFeatures\\\":[{\\\"id\\\":0,\\\"name\\\":\\\"Primary game\\\",\\\"type\\\":\\\"BaseSpin\\\",\\\"data\\\":null,\\\"features\\\":null,\\\"reelsMask\\\":null,\\\"wheelsState\\\":[" + fiveSymbolsInARowSymbol_3_reels_5x4 + "]}]}\"}";
    protected static String PARAMS2 = "{\"serverId\":3,\"gameId\":" + gameId +  ",\"userId\":2118136584,\"gameData\":\"{\\\"baseFeatures\\\":[{\\\"id\\\":0,\\\"name\\\":\\\"Primary game\\\",\\\"type\\\":\\\"BaseSpin\\\",\\\"data\\\":null,\\\"features\\\":null,\\\"reelsMask\\\":null,\\\"wheelsState\\\":[" + fourSymbolsInARowSymbol_3_reels_5x4 + "]}]}\"}";
    protected static String PARAMS3 = "{\"serverId\":3,\"gameId\":" + gameId +  ",\"userId\":2118136584,\"gameData\":\"{\\\"baseFeatures\\\":[{\\\"id\\\":0,\\\"name\\\":\\\"Primary game\\\",\\\"type\\\":\\\"BaseSpin\\\",\\\"data\\\":null,\\\"features\\\":null,\\\"reelsMask\\\":null,\\\"wheelsState\\\":[" + threeSymbolsInARowSymbol_3_reels_5x4 + "]}]}\"}";

}
