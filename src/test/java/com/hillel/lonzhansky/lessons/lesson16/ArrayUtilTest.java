package com.hillel.lonzhansky.lessons.lesson16;

import com.hillel.lonzhnasky.lessons.lesson16.ArrayUtil;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilTest {
    static int[] array;

    @BeforeAll
    public static void beforeAll() {
        array = new int[] {1, 2, 3, 4, 5};
    }

    @BeforeEach
    public void beforeEach() {
        array = new int[] {1, 2, 3, 4, (int) (Math.random() * 11)};
    }

    @Test
    public void test1() {

        int index = ArrayUtil.getIndexElementInArray(array, 3);

        assertEquals(2, index);
    }

    @Test
    public void test2() {
        int index = ArrayUtil.getIndexElementInArray(null, 3);

        assertTrue(index == -3);
    }

    @Test
    public void test3() {
        int[] array = {1, 2, 3, 4, 5};
        int index = ArrayUtil.getIndexElementInArray(array, 34545);

        assertEquals(-1, index);
    }

    @Test
    @Disabled("It will be fix soon")
    public void test4() {
        int[] array = {};
        int index = ArrayUtil.getIndexElementInArray(array, 1);

        assertEquals(-2, index);
    }


    @AfterAll
    public static void afterAll() {
        array = null;
    }
}
