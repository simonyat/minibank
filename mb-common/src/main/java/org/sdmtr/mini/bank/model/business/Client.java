package org.sdmtr.mini.bank.model.business;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {

    private final String userName;
    private final String firstName;
    private final String surName;
    private final String patronymicName;
    private final String email;
    private final String password;
}
