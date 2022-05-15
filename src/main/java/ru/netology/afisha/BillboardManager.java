package ru.netology.afisha;

public class BillboardManager {

    private String[] moviesFeed = new String[0];
    private int limitFilms = 10;

    public BillboardManager() {
    }

    public BillboardManager(int limitFilms) {
        this.limitFilms = limitFilms;
    }

    public String[] getMoviesFeed() {
        return moviesFeed;
    }

    public void setMoviesFeed(String[] moviesFeed) {
        this.moviesFeed = moviesFeed;
    }

    public int getLimitFilms() {
        return limitFilms;
    }

    public void setLimitFilms(int limitFilms) {
        this.limitFilms = limitFilms;
    }

    public void add(String movieAdd) {
        int length = moviesFeed.length + 1;
        String[] tmp = new String[length];
        for (int i = 0; i < length - 1; i++) {
            tmp[i] = moviesFeed[i];
        }
        tmp[length - 1] = movieAdd;
        moviesFeed = tmp;
    }

    public void findAll() {
        getMoviesFeed();
    }

    public void findLast() {
        int resultLength = moviesFeed.length;
        if (resultLength > limitFilms) {
            resultLength = limitFilms;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = moviesFeed.length - i - 1;
            result[i] = moviesFeed[index];
        }
        moviesFeed = result;
    }
}