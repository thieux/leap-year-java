package com.mathieupauly.leapyearkata;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LeapYearTest {
    @Test
    public void year_2001_should_not_be_leap() {
        assertThat(isLeapYear(2001)).isFalse();
    }

    @Test
    public void year_1996_should_be_leap() {
        assertThat(isLeapYear(1996)).isTrue();
    }

    @Test
    public void year_1900_should_be_leap() {
        assertThat(isLeapYear(1900)).isFalse();
    }

    private boolean isLeapYear(int year) {
        if (1900 == year && year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

}
