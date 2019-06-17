package com.carlosmantilla.javatests.tddReto;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class FizzBuzzTest {

    @Test
    public void return_fizz_when_number_is_divisible_by_3() {
        assertThat(tddReto.fizzBuzz (9), is("FIZZ"));
    }

    @Test
    public void return_buzz_when_number_is_divisible_by_5() {
        assertThat(tddReto.fizzBuzz (10), is("BUZZ"));
    }

    @Test
    public void return_fizzBuzz_when_number_is_divisible_by_3_and_5() {
        assertThat(tddReto.fizzBuzz (15), is("FIZZBUZZ"));
    }

    @Test
    public void return_number_when_number_is_not_divisible_by_none() {
        assertThat(tddReto.fizzBuzz (11), is("11"));
    }


}
