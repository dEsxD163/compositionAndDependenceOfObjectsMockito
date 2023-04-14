package ru.netology.Films;

public class FilmManager {
    private FilmsItems[] films = new FilmsItems[0];
    private int limit = 5;

    public FilmManager() {

    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(FilmsItems film) {
        FilmsItems[] tmp = new FilmsItems[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmsItems[] findAll() {
        return films;
    }


    public FilmsItems[] filmLast() {
        int resultLenght;
        if (films.length < limit) {
            resultLenght = films.length;
        } else {
            resultLenght = limit;
        }
        FilmsItems[] tmp = new FilmsItems[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
