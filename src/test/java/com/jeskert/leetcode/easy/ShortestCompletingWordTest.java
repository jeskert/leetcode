package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestCompletingWordTest {

    ShortestCompletingWord shortestCompletingWord = new ShortestCompletingWord();

    @Test
    public void test1() {
        String licensePlate = "1s3 PSt";
        String[] words = new String[]{"step", "steps", "stripe", "stepple"};
        assertEquals("steps", shortestCompletingWord.shortestCompletingWord(licensePlate, words));
    }

    @Test
    public void test2() {
        String licensePlate = "1s3 456";
        String[] words = new String[]{"looks", "pest", "stew", "show"};
        assertEquals("pest", shortestCompletingWord.shortestCompletingWord(licensePlate, words));
    }

    @Test
    public void test3() {
        String licensePlate = "Ah71752";
        String[] words = new String[]{"suggest", "letter", "of", "husband", "easy", "education", "drug", "prevent", "writer", "old"};
        assertEquals("husband", shortestCompletingWord.shortestCompletingWord(licensePlate, words));
    }

    @Test
    public void test4() {
        String licensePlate = "OgEu755";
        String[] words = new String[]{"enough", "these", "play", "wide", "wonder", "box", "arrive", "money", "tax", "thus"};
        assertEquals("enough", shortestCompletingWord.shortestCompletingWord(licensePlate, words));
    }

    @Test
    public void test5() {
        String licensePlate = "iMSlpe4";
        String[] words = new String[]{"claim", "consumer", "student", "camera", "public", "never", "wonder", "simple", "thought", "use"};
        assertEquals("simple", shortestCompletingWord.shortestCompletingWord(licensePlate, words));
    }
}
