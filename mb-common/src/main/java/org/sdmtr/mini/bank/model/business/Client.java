package org.sdmtr.mini.bank.model.business;

import java.io.Serializable;

public record Client(
        String userName,
        String firstName,
        String surName,
        String patronymicName,
        String email,
        String password) implements Serializable {

}
