package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Joke {
    private String jokeType;
    private String category;
    private String setUp;
    private String delivery;








    public String getJokeType() {
        return jokeType;
    }

    public void setJokeType(String jokeType) {
        this.jokeType = jokeType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSetUp() {
        return setUp;
    }

    public void setSetUp(String setUp) {
        this.setUp = setUp;
    }

    public String getDelivery() {
        return delivery;
    }

    public Joke(String jokeType, String category, String setUp, String delivery) {
        this.jokeType = jokeType;
        this.category = category;
        this.setUp = setUp;
        this.delivery = delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
}
