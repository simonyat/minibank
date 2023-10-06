package org.sdmtr.mini.bank.model;

public enum AccountType {
    THRIFT_BOX("Кубышка");

    final String name;

    AccountType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
