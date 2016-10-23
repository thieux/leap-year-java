package com.mathieupauly.leapyearkata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(Parameterized.class)
public class LeapYearTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2001, false},
                {1996, true},
                {1900, false},
                {2000, true},
        });
    }

    private int year;
    private boolean expected;

    public LeapYearTest(int year, boolean expected) {
        this.year = year;
        this.expected = expected;
    }

    @Test
    public void leap_year() {
        assertThat(isLeapYear(year)).isEqualTo(expected);
    }

    private boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
    }

}
