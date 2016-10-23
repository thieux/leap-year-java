package com.mathieupauly.leapyearkata;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LeapYearTest {
    @Test
    public void year_2001_should_not_be_leap() {
        assertThat(isLeapYear(2001)).isEqualTo(false);
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
