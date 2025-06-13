package com.springintro.introtospring;

public class Greeting {

    private final long id;
    private final long randId;
    private final String content;

    //constructor
    public Greeting(long id, long randId, String content) {
        this.id = id;
        this.randId = randId;
        this.content = content;
    }

    //getters
    public long getId() {
        return id;
    }

    public long getRandomId() {
        return randId;
    }

    public String getContent() {
        return content;
    }
}
