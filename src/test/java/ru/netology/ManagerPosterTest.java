package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ManagerPosterTest {

    @Test
    public void shouldAllFilms() {
        ManagerPoster manager = new ManagerPoster();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");

        String[] actual = manager.findAll();
        String[] expected = {
                "Film1",
                "Film2",
                "Film3",
                "Film4"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindWithLimit() {
        ManagerPoster manager = new ManagerPoster(12);
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");
        manager.add("Film12");

        String[] actual = manager.findAll();
        String[] expected = {
                "Film1",
                "Film2",
                "Film3",
                "Film4",
                "Film5",
                "Film6",
                "Film7",
                "Film8",
                "Film9",
                "Film10",
                "Film11",
                "Film12",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithLimit() {
        ManagerPoster manager = new ManagerPoster(10);
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");
        manager.add("Film12");

        String[] actual = manager.findLast();
        String[] expected = {
                "Film12",
                "Film11",
                "Film10",
                "Film9",
                "Film8",
                "Film7",
                "Film6",
                "Film5",
                "Film4",
                "Film3",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithoutLimit() {
        ManagerPoster manager = new ManagerPoster();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");

        String[] actual = manager.findLast();
        String[] expected = {
                "Film6",
                "Film5",
                "Film4",
                "Film3",
                "Film2",
                "Film1",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastOverLimit() {
        ManagerPoster manager = new ManagerPoster(11);
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");

        String[] actual = manager.findLast();
        String[] expected = {
                "Film7",
                "Film6",
                "Film5",
                "Film4",
                "Film3",
                "Film2",
                "Film1",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

}