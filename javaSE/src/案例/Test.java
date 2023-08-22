package javaSE.src.案例;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws Exception {
        // 替换为你的AppID、API Key和Secret Key
        String appId = "e502a144";
        String apiKey = "ba76502a37088f7e10f1f9d87aa9f0e5";
        String secretKey = "NjA1NWE5MzgzZDJhMDE0YmMyYjU5MDFj";

        // 设置请求头
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        headers.put("X-Appid", appId);
        headers.put("X-CurTime", String.valueOf(System.currentTimeMillis() / 1000));
        headers.put("X-Param", "{\"dev_pid\":\"1537\",\"format\":\"wav\",\"rate\":\"16000\",\"channel\":\"1\",\"speech\":\"test\"}");
        headers.put("X-Sign", secretKey);

        // 发送请求
        String url = "https://openapi.xfyun.cn/v2/aiui";
        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String, String> h : headers.entrySet()) {
            if (!postData.isEmpty()) postData.append('&');
            postData.append(URLEncoder.encode(h.getKey(), StandardCharsets.UTF_8));
            postData.append('=');
            postData.append(URLEncoder.encode(h.getValue(), StandardCharsets.UTF_8));
        }
        byte[] postDataBytes = postData.toString().getBytes(StandardCharsets.UTF_8);
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);

        // 解析结果
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}

