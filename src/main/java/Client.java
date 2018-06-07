import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Client {

    private static final String USER_AGENT = "Mozilla/5.0";
    private static String COOKIES = "__RequestVerificationToken=oLBO1oF8ysz4Je7jhPfPqD38mYbnbBGNYPI2fQbo498IXr5_qeOEqtQ7_EmBrZpSI3W8JTpkE-AUhVahJ7Ekctg3ziufdxRpmvgejibu82Y1; ASP.NET_SessionId=t3rnbpvgi22vnxkcccjcpcgk; .AspNet.ApplicationCookie=8jx3O3_n0m-c41XPWhct35duz_IvSbg0MTMs6nFdc6g0gFSmpyL2kB2rFBqmYtrL_NJQPxEs5FSxtrjFHV62ETyjvqLUOfH07ioUSCW70JVyYZeQshYFtd74pwVUP8gCS74gZPnPskhHo14aOJvLFM2smAJoqd6vR29LyZ4UymtBZV26lONq3P8KFwLIapu4JfPxGLqVl9hE4r5-jMlz69JfHOQIB7ou8sAdcPTRcfaEwuNpPpjmqwEYohh77NAkhJKEfTjAC14LLgw0YSBXYk5t1Cg_7YGt-28niLRi18LxhkRZR87kSgDDFCxuKNJhlcwJ0Zo4DZYvUL3c6tXBlvHKH8FWeIkQNFvsboNVvff9QM5BIiHmmVStgcxBuGS8F4qLbUVxEG6etvXVebgoE3LnCAbe3_perCPjCG3GYWhllzHLAM4hDvOzaAJCT513WRHmHSZkIyHrgkKxtcltDkj-Wv_2fJNUt4LEE8RsoXxoXB4jNVJSFNadjMlR1Ets";

    protected static void sendPOST(String url, String setCombination) throws IOException {
        JSONObject data = new JSONObject(setCombination);
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Cookie", COOKIES);
        // For POST only - START
        con.setDoOutput(true);
        OutputStream os = con.getOutputStream();
        os.write(data.toString().getBytes());
        os.flush();
        os.close();
        // For POST only - END
        int responseCode = con.getResponseCode();
        System.out.println("POST Response Code :: " + responseCode);
        String inputLine;
        if (responseCode == HttpURLConnection.HTTP_OK) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response.toString());
        } else {
            System.out.println("POST request not worked");
        }
    }

    protected static String sendGET(String spin) throws IOException {
        String result = null;
        URL url = new URL(spin);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            result = response.toString();
            in.close();
            // print result
            System.out.println(result);
        } else {
            System.out.println("GET request not worked");
        }
        return result;
    }
}

