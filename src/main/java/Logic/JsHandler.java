package Logic;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsHandler {

    public static JSONObject convertJsStrToJsObject(String content) {
        return new JSONObject(content);
    }

    public static JSONArray getJsArrLines(JSONObject jsObject) {
        JSONArray winsArray = jsObject.getJSONObject("result").getJSONObject("gameInfo").getJSONArray("wins");
        JSONObject winsObject = (JSONObject) winsArray.get(0);
        return winsObject.getJSONArray("lines");
    }

    public static JSONArray getJsArraySequencesBG(JSONObject jsObject) {
        return jsObject.getJSONObject("result").getJSONObject("gameInfo").getJSONArray("symbolsSequences").getJSONArray(0);
    }

    public static JSONArray getJsArraySequencesFG(JSONObject jsObject) {
        return jsObject.getJSONObject("result").getJSONObject("gameInfo").getJSONArray("symbolsSequences").getJSONArray(1);
    }

    public static JSONArray getJsArraySequencesRespins(JSONObject jsObject) {
        return jsObject.getJSONObject("result").getJSONObject("gameInfo").getJSONArray("symbolsSequences").getJSONArray(2);
    }

    public static String[] convertLinesFromJsArrToJavaArr(int lines, JSONArray jsLinesBG) {
        try {
            String[] actualLinesBG = new String[lines];
            for (int i = 0; i < jsLinesBG.length(); i++) {
                actualLinesBG[i] = ((JSONObject) jsLinesBG.get(i)).getJSONArray("positions").toString();
            }
            return actualLinesBG;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect number of lines. You must enter the same number of lines as in the game");
        }
        return new String[lines];
    }

    public static double getTotalWin(JSONObject jsObject) {
        JSONArray winsArray = jsObject.getJSONObject("result").getJSONObject("gameInfo").getJSONArray("wins");
        JSONObject winsObject = (JSONObject) winsArray.get(0);
        return winsObject.getDouble("win");
    }

    public static String[] convertSequencesFromJsArrToJavaArr(int sequences, JSONArray jsSequences) {
        try {
            String[] actualSequences = new String[sequences];
            for (int i = 0; i < jsSequences.length(); i++) {
                actualSequences[i] = (jsSequences.get(i)).toString();
            }
            return actualSequences;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect size of  base game sequences:. You must enter the same size of sequences as in the game");
        }
        return new String[sequences];
    }
}