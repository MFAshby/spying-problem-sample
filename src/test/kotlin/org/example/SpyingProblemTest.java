package org.example;


import org.junit.Test;

import static org.mockito.Mockito.*;

public class SpyingProblemTest {
    private SomeClass underTest = spy(new SomeClass());

    @Test
    public void cantVerifySpies() {

        // WHEN
        underTest.doThing1();

        // THEN
        verify(underTest, times(1)).doThing2();
    }

    @Test
    public void cantVerifySpies2() {

        // WHEN
        underTest.doThing1();

        // THEN
        verify(underTest, times(1)).doThing2();
    }
}