package com.dsjf.basicstruts.controller;

import static org.assertj.core.api.Assertions.assertThat;

import com.dsjf.basicstruts.model.Person;
import org.junit.jupiter.api.Test;

class RegisterActionTest {

    @Test
    void defaultAgeLessThan() {
        assertThat(new Person().getAge() < 18).isTrue();
    }

}