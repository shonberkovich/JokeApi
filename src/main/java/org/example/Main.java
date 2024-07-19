package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
      getJoke();
    }
    public static void getJoke() {
        try {
            CloseableHttpClient client = HttpClients.createDefault();

            URI uri = new URIBuilder("https://v2.jokeapi.dev/joke/Dark?")
                  .setParameter("amount", "4")
//                    .setParameter("lang", "en")
                    .build();

            HttpGet request = new HttpGet(uri);
            CloseableHttpResponse response = client.execute(request);
            String json = EntityUtils.toString(response.getEntity());


            Response response1= new Response();
            response1 = new ObjectMapper().readValue(json, org.example.Response.class);
             System.out.println("You have " + response1.getJokes().length + " jokes");
            for (  Jokes joke :response1.getJokes()){
                if(joke.getType().equals("twopart")) {
                    System.out.println(joke.getSetup() + "\n" + joke.getDelivery()+"\n");
                }
                    else if(joke.getType().equals("single")){
                    System.out.println(joke.getJoke()+"\n");

                    }
                }

//            for (  Joke joke : myResponse.g) {//
//                System.out.println();
//            }
//            response.close();
//            client.close();
        } catch (URISyntaxException e) {
            // Handle URISyntaxException (e.g., invalid URI)
            throw new RuntimeException("URI syntax exception occurred", e);
        } catch (IOException e) {
            // Handle IOException (e.g., network issues, JSON parsing issues)
            throw new RuntimeException("IO exception occurred", e);

        }
    }
//    public static void getJoke1() {
//        CloseableHttpClient client = HttpClients.createDefault();
//        CloseableHttpResponse response = null;
//
//        try {
//            URI uri = new URI("https://v2.jokeapi.dev/joke/Dark?amount=3");
//            HttpGet request = new HttpGet(uri);
//
//            response = client.execute(request);
//
//            String json = EntityUtils.toString(response.getEntity());
//
//            // Mapping JSON to Java object
//            org.example.Response[] jokes = new ObjectMapper().readValue(json, org.example.Response[].class);
//
//
//            for (org.example.Response joke : jokes) {
//                if ("twopart".equals(joke.getType())) {
//                    System.out.println(joke.getSetup() + "\n" + joke.getDelivery() + "\n");
//                } else {
//                    System.out.println(joke.getJoke() + "\n");
//                }
//            }
//        } catch (URISyntaxException | IOException e) {
//            // Handle exceptions
//            e.printStackTrace();
//        } finally {
//            try {
//                if (response != null) {
//                    response.close();
//                }
//                client.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

}