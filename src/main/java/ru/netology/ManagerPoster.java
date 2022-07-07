package ru.netology;

public class ManagerPoster {
    protected String[] films = new String[0];
    protected int limit;

    public ManagerPoster(int limit) {
        this.limit = limit;
    }

    public ManagerPoster() {
        limit = 10;
    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];

        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }


    public String[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] ans = new String[resultLength];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = films[films.length - 1 - i];
        }
        return ans;
    }



}