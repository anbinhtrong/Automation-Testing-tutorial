package com.browsers.test;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TamChieu on 3/6/2017.
 */
public class ChromeTest {

    public ChromeTest(){
        String exePath = ".//libs//browser-drivers//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
    }

    public void callIt(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://nois-222-server:12314/api/common/clearcache/");
    }

    public void clearCache() throws IOException {
        String textView = new String();
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://nhatkyhoctap.blogspot.com/2017/03/cai-at-webdriver-voi-intellij-idea-va.html");
        HttpResponse response = client.execute(request);

        // Get the response
        BufferedReader rd = new BufferedReader
                (new InputStreamReader(
                        response.getEntity().getContent()));

        String line = "";
        while ((line = rd.readLine()) != null) {
            textView += line;
        }
        System.out.println(textView);
    }
}
