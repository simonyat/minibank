package org.sdmtr.mini.bank.client.controller.dto;

import java.io.Serializable;

/**
 *
 * @param userName
 * @param firstName
 * @param surName
 * @param patronymicName
 * @param email
 * @param password
 */
public record MiniBankClientDto(String userName,
                                String firstName,
                                String surName,
                                String patronymicName,
                                String email,
                                String password) implements Serializable {

}
