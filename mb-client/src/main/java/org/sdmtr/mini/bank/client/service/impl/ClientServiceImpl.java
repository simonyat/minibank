package org.sdmtr.mini.bank.client.service.impl;

import org.sdmtr.mini.bank.client.service.ClientService;
import org.sdmtr.mini.bank.model.business.Client;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Override
    public Client registerClient(Client client) {
        // проверить существование клиента с таким же именем

        // сохранить клиента в базе данных

        return new Client(client.userName(), client.firstName(), client.surName(), client.patronymicName(), client.email(), "******");
    }

    @Override
    public Client loginClient(String clientName, String password) {
        // проверить существование клиента с таким именем и паролем

        // замаскировать пароль клиента
        Client client = new Client(
                clientName,
                "Name",
                "SurName",
                "Patronymic",
                "e-mail",
                "*****"
        );

        return client;
    }

    @Override
    public Client updateClient(Client oldClientData, Client newClientData) {
        // проверить новые данные о клиенте на предмет дублирования

        // сохранить обновления о клиенте в БД

        // вернуть клиента (с замаскированным паролем)
        return newClientData;
    }

    @Override
    public void deleteClient(String clientName) {
        // удалить клиента из базы данных
    }

}
