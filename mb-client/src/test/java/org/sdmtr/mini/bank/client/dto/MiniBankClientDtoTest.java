package org.sdmtr.mini.bank.client.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.sdmtr.mini.bank.model.web.request.RequestItem;

public class MiniBankClientDtoTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void clientDtoToJson() throws JsonProcessingException {

        MiniBankClientDto clientDto =
                new MiniBankClientDto(
                        "alex",
                        "Александр",
                        "Котов",
                        "Анатольевич",
                        "cat.kotov@gmailcom",
                        "1234567890"
                );

        RequestItem<MiniBankClientDto> webClientDto = new RequestItem<>(clientDto);

        String jsonClientDto = objectMapper.writeValueAsString(webClientDto);
    }

}
