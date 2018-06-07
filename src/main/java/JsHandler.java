import org.json.JSONArray;
import org.json.JSONObject;

public class JsHandler {

    protected static JSONObject convertJsStringToJsObject(String content) {
        return new JSONObject(content);
    }

    protected static JSONArray getJsArrayLines(JSONObject jsObject) {
        JSONArray winsArray = jsObject.getJSONObject("result").getJSONObject("gameInfo").getJSONArray("wins");
        JSONObject winsObject = (JSONObject) winsArray.get(0);
        return winsObject.getJSONArray("lines");
    }

    protected static JSONArray getJsArraySequencesBG(JSONObject jsObject) {
        JSONArray jsonSequencesBG = jsObject.getJSONObject("result").getJSONObject("gameInfo").getJSONArray("symbolsSequences").getJSONArray(0);
        return jsonSequencesBG;
    }

    protected static JSONArray getJsArraySequencesFG(JSONObject jsObject) {
        JSONArray jsonSequencesFG = jsObject.getJSONObject("result").getJSONObject("gameInfo").getJSONArray("symbolsSequences").getJSONArray(1);
        return jsonSequencesFG;
    }

    protected static JSONArray getJsArraySequencesRespins(JSONObject jsObject) {
        JSONArray jsonSequencesRespins = jsObject.getJSONObject("result").getJSONObject("gameInfo").getJSONArray("symbolsSequences").getJSONArray(2);
        return jsonSequencesRespins;
    }

    protected static String[] convertLinesFromJsArrayToJavaArray(int numberOfLines, JSONArray jsonSequencesBG) {
        try {
            String[] actualSequencesBG = new String[5];
            for (int i = 0; i < jsonSequencesBG.length(); i++) {
                actualSequencesBG[i] = (jsonSequencesBG.get(i)).toString();
            }
            return actualSequencesBG;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect number of lines. You must enter the same number of lines as in the game");
        }
        return new String[0];
    }

    protected static double getTotalWin(JSONObject jsObject) {
        JSONArray winsArray = jsObject.getJSONObject("result").getJSONObject("gameInfo").getJSONArray("wins");
        JSONObject winsObject = (JSONObject) winsArray.get(0);
        double win = winsObject.getDouble("win");
        return win;
    }

    protected static String[] convertSequencesFromJsArrayToJavaArray(int numberOfSequences, JSONArray jsonSequences) {
        try {
            String[] actualSequences = new String[numberOfSequences];
            for (int i = 0; i < jsonSequences.length(); i++) {
                actualSequences[i] = (jsonSequences.get(i)).toString();
            }
            return actualSequences;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect number of base game sequences. You must enter the same number of base game sequences as in the game");
        }
        return new String[0];
    }
}