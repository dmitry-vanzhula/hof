import org.json.JSONArray;
import org.json.JSONObject;

public class JsHandler {

     static JSONObject convertJsStringToJsObject(String content) {
        return new JSONObject(content);

    }

    static JSONArray getJsArrayLines(JSONObject jsObject) {
        JSONArray winsArray = jsObject.getJSONObject("result").getJSONObject("gameInfo").getJSONArray("wins");
        JSONObject winsObject = (JSONObject) winsArray.get(0);
        return winsObject.getJSONArray("lines");
    }

     static String[] convertLinesFromJsArrayToJavaArray(int numberOfLines, JSONArray jsLines) {
        try {
            String[] actualLines = new String[numberOfLines];
            for (int i = 0; i < jsLines.length(); i++) {
                actualLines[i] = ((JSONObject) jsLines.get(i)).getJSONArray("positions").toString();
            }
            return actualLines;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect number of lines. You must enter the same number of lines as in the game");
        }
        return new String[0];
    }

     static double getTotalWin(JSONObject jsObject) {
        JSONArray winsArray = jsObject.getJSONObject("result").getJSONObject("gameInfo").getJSONArray("wins");
        JSONObject winsObject = (JSONObject) winsArray.get(0);
        double win  = winsObject.getDouble("win");
        return win;
    }



}