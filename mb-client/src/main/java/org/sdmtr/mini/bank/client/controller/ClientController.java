package org.sdmtr.mini.bank.client.controller;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.sdmtr.mini.bank.client.dto.MiniBankClientDto;
import org.sdmtr.mini.bank.client.mapper.ClientConverter;
import org.sdmtr.mini.bank.client.service.ClientService;
import org.sdmtr.mini.bank.model.web.request.RequestItem;
import org.sdmtr.mini.bank.model.web.response.ResponseItem;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/minibank/client")
@RequiredArgsConstructor
public class ClientController {

    private final
    ClientConverter mapper = Mappers.getMapper(ClientConverter.class);

    private final ClientService clientService;

    @PostMapping("/create")
    public ResponseItem<MiniBankClientDto> create(@RequestBody RequestItem<MiniBankClientDto> newClient) {

        ResponseItem<MiniBankClientDto> result =
                new ResponseItem<>("success",
                        mapper.clientToDto(
                        clientService.registerClient(
                                mapper.dtoToClient(newClient.data()))
                        ),
                        null);
        return result;
    }

}
