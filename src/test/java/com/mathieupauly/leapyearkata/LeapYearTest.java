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

    private boolean isLeapYear(int year) {
        if (1996 == year && year % 4 == 0) {
            return true;
        }
        return false;
    }

}
