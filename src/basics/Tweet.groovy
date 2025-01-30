package basics

import groovy.transform.ToString

static void main(String[] args) {
    def tweet = new TweetEntity('Raphael', "Hello world!")
    tweet.addRetweet()
    tweet.addFavorite()
    tweet.addFavorite()
    println tweet
}

@ToString
class TweetEntity {
    String username
    String text
    Integer retweets
    Integer favorites
    Date createdOn

    TweetEntity(String user, String tweet) {
        this.username = user
        this.text = tweet
        this.retweets = 0
        this.favorites = 0
        this.createdOn = new Date()
    }

    void addRetweet() {
        this.retweets++
    }

    void addFavorite() {
        this.favorites++
    }
}
