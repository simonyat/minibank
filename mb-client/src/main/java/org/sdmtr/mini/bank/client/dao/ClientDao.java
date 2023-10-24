package org.sdmtr.mini.bank.client.dao;

import org.sdmtr.mini.bank.model.business.Client;

public interface ClientDao {

    Client findClientByUserName();

    Client createClient(Client client);

}
