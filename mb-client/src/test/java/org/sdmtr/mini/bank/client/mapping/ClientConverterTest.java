package org.sdmtr.mini.bank.client.mapping;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.sdmtr.mini.bank.client.controller.dto.MiniBankClientDto;
import org.sdmtr.mini.bank.client.controller.mapper.ClientConverter;
import org.sdmtr.mini.bank.model.business.Client;

public class ClientConverterTest {


    private ClientConverter mapper = Mappers.getMapper(ClientConverter.class);

    @Test
    void convertDtoToClient() {

        MiniBankClientDto clientDto =
                new MiniBankClientDto(
                        "alex",
                        "Александр",
                        "Котов",
                        "Анатольевич",
                        "cat.kotov@gmailcom",
                        "1234567890"
                );

        Client client = mapper.dtoToClient(clientDto);
    }

    @Test
    void convertClientToDto() {

        Client client = new Client("alex",
                "Александр",
                "Котов",
                "Анатольевич",
                "cat.kotov@gmailcom",
                "1234567890");

        MiniBankClientDto clientDto = mapper.clientToDto(client);
    }

}
