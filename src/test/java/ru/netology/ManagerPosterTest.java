package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerPosterTest {

    @Test
    public void findLast() {
        ManagerPoster manager = new ManagerPoster();
        manager.setItems(new String[]{"First", "Second", "Third", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th"});

        String[] expected = {"11th", "10th", "9th", "8th", "7th", "6th", "5th", "4th", "Third", "Second"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldManagerPoster() {
        ManagerPoster manager = new ManagerPoster(5);

        int expected = 5;
        int actual = manager.getFindLast();

        assertEquals(expected, actual);
    }


}