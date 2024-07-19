package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    //private Boolean error;
    //private String category;

//    private String type;
//    private String setup;
//    private String delivery;
//    private String joke;
private Jokes[] jokes;

    public Jokes[] getJokes() {
        return jokes;
    }

    public void setJokes(Jokes[] jokes) {
        this.jokes = jokes;
    }

//    public int getAmount() {
//        return amount;
//    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }

   // private  int amount;

//    public Boolean getError() {
//        return error;
//    }
//
//    public void setError(Boolean error) {
//        this.error = error;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public String getSetup() {
//        return setup;
//    }
//
//    public void setSetup(String setup) {
//        this.setup = setup;
//    }
//
//    public String getDelivery() {
//        return delivery;
//    }
//
//    public void setDelivery(String delivery) {
//        this.delivery = delivery;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getJoke() {
//        return joke;
//    }
//
//    public void setJoke(String joke) {
//        this.joke = joke;
//    }
    //
//    public List<Joke> getJokeList() {
//        return jokeList;
//    }
//
//
//    public void setJokeList(List<Joke> jokeList) {
//        this.jokeList = jokeList;
//    }
}
