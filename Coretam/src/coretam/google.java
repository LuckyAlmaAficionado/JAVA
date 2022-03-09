/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coretam;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLEncoder;

/**
 *
 * @author Lucky
 */
public class google {
public static void main(String[] args) throws Exception {
        String google = "http://ajax.googleapis.com/ajax/services/search/web?v=1.0&q=";
        String search = "stackoverflow";
        String charset = "UTF-8";

        URL url = new URL(google + URLEncoder.encode(search, charset));
        Reader reader = new InputStreamReader(url.openStream(), charset);
        GoogleResults results = new Gson().fromJson(reader, GoogleResults.class);

        // Show title and URL of 1st result.
        System.out.println(results.getResponseData().getResults().get(0).getTitle());
        System.out.println(results.getResponseData().getResults().get(0).getUrl());
    }
}
