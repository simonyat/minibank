package org.sdmtr.mini.bank.client.service;

import org.sdmtr.mini.bank.model.business.Client;

/**
 * Сервис работы с клиентом и данными о нем.
 */
public interface ClientService {

    /**
     * Регистрация клиента после проверки на дубликат имени клиента
     * и его злектронного адреса.
     *
     * @param client - клиент, подлижащий регистрации.
     * @return клиент, созданный в банке.
     */
    Client registerClient(Client client);

    /**
     * Вход пользователя в систему мини банка по имени и паролю.
     *
     * @param clientName - имя клиента (nickname).
     * @param password - пароль пользователя.
     * @return клиент, прошедший идентификацию.
     */
    Client loginClient(String clientName, String password);

    /**
     * Обновление информации о клиенте
     *
     * @param oldClientData - клиент, информацию о котором необходимо обновить (берется из сессии).
     * @param newClientData - клиент с обновленной информацией.
     * @return обновленный клиент.
     */
    Client updateClient(Client oldClientData, Client newClientData);

    /**
     * Удаление клиента и всех его счетов после проверки что все счета клиента обнулены.
     *
     * @param clientName - имя клиента (nickname).
     */
    void deleteClient(String clientName);


}
