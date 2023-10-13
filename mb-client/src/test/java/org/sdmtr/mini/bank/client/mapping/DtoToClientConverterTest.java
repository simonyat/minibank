package org.sdmtr.mini.bank.client.mapping;

import org.junit.jupiter.api.Test;
import org.sdmtr.mini.bank.client.dto.MiniBankClientDto;
import org.sdmtr.mini.bank.client.mapper.DtoToClientConverter;
import org.sdmtr.mini.bank.model.business.Client;

public class DtoToClientConverterTest {

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

        Client client = DtoToClientConverter.mapper.dtoToClient(clientDto);

    }

}
