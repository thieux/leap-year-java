package com.mathieupauly.leapyearkata;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LeapYearTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{2001, false}});
    }

    private int year;
    private boolean expected;

    public LeapYearTest() {
        year = 2001;
        expected = false;
    }

    @Test
    public void year_2001_should_not_be_leap() {
        assertThat(isLeapYear(year)).isEqualTo(expected);
    }

    @Test
    public void year_1996_should_be_leap() {
        assertThat(isLeapYear(1996)).isEqualTo(true);
    }

    @Test
    public void year_1900_should_be_leap() {
        assertThat(isLeapYear(1900)).isEqualTo(false);
    }

    @Test
    public void year_2000_should_be_leap() {
        assertThat(isLeapYear(2000)).isEqualTo(true);
    }

    private boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
    }

}
