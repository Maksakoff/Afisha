package ru.netology.afisha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillboardManagerTest {


    @Test
    void setMoviesFeed() {
        BillboardManager manager = new BillboardManager();

        String[] moviesFeed = new String[]{"Film1", "Film2", "Film3", "Film4"};
        manager.setMoviesFeed(moviesFeed);
        String[] expected = new String[]{"Film1", "Film2", "Film3", "Film4"};
        String[] actual = manager.getMoviesFeed();

        assertArrayEquals(expected, actual);
    }

    @Test
    void setLimitFilms() {
        BillboardManager manager = new BillboardManager();
        int limitFilms;
        manager.setLimitFilms(5);
        int expected = 5;
        int actual = manager.getLimitFilms();

        assertEquals(expected, actual);
    }

    @Test
    void add() {
        BillboardManager manager = new BillboardManager();

        String[] moviesFeed = new String[]{"Film1", "Film2", "Film3", "Film4"};
        manager.setMoviesFeed(moviesFeed);
        String[] expected = new String[]{"Film1", "Film2", "Film3", "Film4", "Film5"};

        String addMovie = "Film5";
        manager.add(addMovie);
        String[] actual = manager.getMoviesFeed();

        assertArrayEquals(expected, actual);
    }

    @Test
    void addFirst() {
        BillboardManager manager = new BillboardManager();

        String[] moviesFeed = new String[0];
        manager.setMoviesFeed(moviesFeed);
        String[] expected = new String[]{"Film1"};

        String addMovie = "Film1";
        manager.add(addMovie);
        String[] actual = manager.getMoviesFeed();

        assertArrayEquals(expected, actual);
    }

    @Test
    void addSecond() {
        BillboardManager manager = new BillboardManager();

        String[] moviesFeed = new String[]{"Film1"};
        manager.setMoviesFeed(moviesFeed);
        String[] expected = new String[]{"Film1", "Film2"};

        String addMovie = "Film2";
        manager.add(addMovie);
        String[] actual = manager.getMoviesFeed();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findAll() {
        BillboardManager manager = new BillboardManager();

        String[] moviesFeed = new String[]{"Film1", "Film2", "Film3", "Film4"};
        manager.setMoviesFeed(moviesFeed);
        String[] expected = new String[]{"Film1", "Film2", "Film3", "Film4"};

        manager.findAll();
        String[] actual = manager.getMoviesFeed();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastLimit() {
        BillboardManager manager = new BillboardManager();

        String[] moviesFeed = new String[]{"Film1", "Film2", "Film3", "Film4"};
        manager.setMoviesFeed(moviesFeed);
        String[] expected = new String[]{"Film4", "Film3", "Film2", "Film1"};

        manager.findLast();
        String[] actual = manager.getMoviesFeed();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastLimitOne() {
        BillboardManager manager = new BillboardManager();

        String[] moviesFeed = new String[]{"Film1"};
        manager.setMoviesFeed(moviesFeed);
        String[] expected = new String[]{"Film1"};

        manager.findLast();
        String[] actual = manager.getMoviesFeed();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastUnlimited() {
        BillboardManager manager = new BillboardManager(2);

        String[] moviesFeed = new String[]{"Film1", "Film2", "Film3", "Film4"};
        manager.setMoviesFeed(moviesFeed);
        String[] expected = new String[]{"Film4", "Film3"};

        manager.findLast();
        String[] actual = manager.getMoviesFeed();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastUnlimitedBig() {
        BillboardManager manager = new BillboardManager(4);

        String[] moviesFeed = new String[]{"Film1", "Film2", "Film3", "Film4"};
        manager.setMoviesFeed(moviesFeed);
        String[] expected = new String[]{"Film4", "Film3", "Film2", "Film1"};

        manager.findLast();
        String[] actual = manager.getMoviesFeed();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastUnlimitedLarge() {
        BillboardManager manager = new BillboardManager(5);

        String[] moviesFeed = new String[]{"Film1", "Film2", "Film3", "Film4"};
        manager.setMoviesFeed(moviesFeed);
        String[] expected = new String[]{"Film4", "Film3", "Film2", "Film1"};

        manager.findLast();
        String[] actual = manager.getMoviesFeed();

        assertArrayEquals(expected, actual);
    }
}