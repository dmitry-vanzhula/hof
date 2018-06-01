import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ClientPost {

    private static final String POST_URL = "http://testcase-kiev.dublin.local/console/settestingdata";
    private static final String USER_AGENT = "Mozilla/5.0";
    private static String cookies = "__RequestVerificationToken=hQkY4jylUpkUpNF3jUdKSuj82WkNxMiVaI27moLkKA-P5K16FjkH6G93DH9Oj6w7bAuBQltKCv_vq3QGoAe7t9E2vYLU8_Y2aZqa-phFifQ1; ASP.NET_SessionId=ci2hqfzigopkuy034oszjc2v; .AspNet.ApplicationCookie=gggnWQgNs8MLCcSOCpIQOl6OWk3byaZpp-PY7kupSSRv-NABr6xYTWlmA_jUqf800xuZGE5P5I4lKoQIQjSC1BtmOaHRYiy7gGs6z5oi1eRNsqA3PO3H_fMcL2s2bqLuoUJGzP0lrqUSNyxcoA0WsV2yC6Cy_wloy_65zUPqcsulUuVvLZxhQ6RaoptgTu3mEp-FN2BkitK33KGyHZfGqUJfFDOpfYjpDDHUZqZjbB-xvzHdMJOLIhFQ4UApIoPUobIWnxxKWazGcAw_ZA1O41jBP3-VHVDBtxLSKTzXv5aN_6d_LVIgDRhkH1pgs6MABhx8dpcFsBGGYcnMIJAlrCGy7Y9lIqXbks9E2btGwnkDmdMnUZDTjoUCAlM3gmOB1wXdlDEdKKl18MD_x8ZcA1HWmXM-d_gmrcDIf_BuFna-fNZjJ5Yw4Mg2WNRNnHu3U6cD3rakbmoaQcJQ6P3AywXuF2D8Sgs_OD6bJQvaVMHNo4GERdp3ohWYe6HB4wG8";

    private static void sendPOST() throws IOException {
        Map<String, Object> jsonValues = new HashMap<>();
        jsonValues.put("data","{\"baseFeatures\":[{\"id\":0,\"name\":\"Primary game\",\"type\":\"BaseSpin\",\"wheelsState\":[[\"5\",\"6\",\"6\",\"6\"],[\"5\",\"7\",\"7\",\"7\"],[\"5\",\"7\",\"7\",\"7\"],[\"5\",\"7\",\"7\",\"7\"],[\"5\",\"7\",\"7\",\"7\"]]}]}");
        JSONObject data = new JSONObject(jsonValues);
        URL obj = new URL(POST_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Cookie", cookies);
        // For POST only - START
        con.setDoOutput(true);
        OutputStream os = con.getOutputStream();
        os.write(data.toString().getBytes());
        os.flush();
        os.close();
        // For POST only - END
        int responseCode = con.getResponseCode();
        System.out.println("POST Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response.toString());
        } else {
            System.out.println("POST request not worked");
        }
    }
}

