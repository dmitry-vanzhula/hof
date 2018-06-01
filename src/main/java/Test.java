import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

class Test {

    public static void main(String[] args) throws Exception {

        File file = new File("src\\main\\resources\\3tiger.json");
        String content = FileUtils.readFileToString(file, "utf-8");

        // Convert JSON string to JSONObject
        JSONObject tomJsonObject = new JSONObject(content);


        JSONArray winsArray = tomJsonObject.getJSONObject("result").getJSONObject("gameInfo").getJSONArray("wins");
        JSONObject winsObject = (JSONObject) winsArray.get(0);
        int win  = winsObject.getInt("win");
        System.out.println(win);

    }

}





