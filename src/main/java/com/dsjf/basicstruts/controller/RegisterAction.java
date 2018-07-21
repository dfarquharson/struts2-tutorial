package com.dsjf.basicstruts.controller;

import com.dsjf.basicstruts.model.Person;
import com.google.common.base.Strings;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    private Person person;

    @Override
    public String execute() throws Exception {
        // call Service class to store person's state in database
        return SUCCESS;
    }

    @Override
    public void validate() {
        if (Strings.isNullOrEmpty(person.getFirstName())) {
            addFieldError("person.firstName", "First name is required");
        }
        if (Strings.isNullOrEmpty(person.getEmail())) {
            addFieldError("person.email", "Email is required");
        }
        if (person.getAge() < 18) {
            addFieldError("person.age", "Age is required and must be 18 or older");
        }
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
