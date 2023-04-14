package ru.netology.Films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    FilmsItems film1 = new FilmsItems("Movie I");
    FilmsItems film2 = new FilmsItems("Movie II");
    FilmsItems film3 = new FilmsItems("Movie III");
    FilmsItems film4 = new FilmsItems("Movie IV");
    FilmsItems film5 = new FilmsItems("Movie V");
    FilmsItems film6 = new FilmsItems("Movie VI");
    FilmsItems film7 = new FilmsItems("Movie VII");

    @Test
    public void addFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        FilmsItems[] expected = {film1, film2, film3};
        FilmsItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm(film1);


        FilmsItems[] expected = {film1};
        FilmsItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNullFilms() {
        FilmManager manager = new FilmManager();

        FilmsItems[] expected = {};
        FilmsItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsLessLimitInReverse() {
        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        FilmsItems[] expected = {film3, film2, film1};
        FilmsItems[] actual = manager.filmLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsEqualsLimitInReverse() {
        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        FilmsItems[] expected = {film5, film4, film3, film2, film1};
        FilmsItems[] actual = manager.filmLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsOverLimitInReverse() {
        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);

        FilmsItems[] expected = {film7, film6, film5, film4, film3};
        FilmsItems[] actual = manager.filmLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsOverLimitInReverseWithParameter() {
        FilmManager manager = new FilmManager(7);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);

        FilmsItems[] expected = {film7, film6, film5, film4, film3, film2, film1};
        FilmsItems[] actual = manager.filmLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
