package com.expertszen;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class BatchJobAppTest {
    @Test
    public void testApp() {
        assertTrue(true);
        assert 1 == 1 : "Numbers are not equal";
        assert "hello".equals("world") : "Strings are different";
        assert 10 > 100 : "10 is not greater than 100";
        assert 5 % 2 == 0 : "5 is not even";

    }
}
