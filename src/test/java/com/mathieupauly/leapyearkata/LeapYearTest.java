package com.mathieupauly.leapyearkata;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LeapYearTest {
    @Test
    public void year_2001_should_not_be_leap() {
        assertThat(isLeapYear(2001)).isFalse();
    }

    private boolean isLeapYear(int year) {
        return false;
    }

}
