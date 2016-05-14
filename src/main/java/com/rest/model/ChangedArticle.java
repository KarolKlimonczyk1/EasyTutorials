package com.rest.model;

/**
 * Created by Karol on 5/3/2016.
 */
public class ChangedArticle {

    int topic;
    String content;
    String newTopic;

    public int getTopic() {
        return topic;
    }

    public void setTopic(int topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNewTopic() {
        return newTopic;
    }

    public void setNewTopic(String newTopic) {
        this.newTopic = newTopic;
    }
}
