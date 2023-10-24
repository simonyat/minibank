package org.sdmtr.mini.bank.client.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.sdmtr.mini.bank.client.controller.dto.MiniBankClientDto;
import org.sdmtr.mini.bank.model.business.Client;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ClientConverter {

    @Mapping(source = "userName", target = "userName")
    Client dtoToClient(MiniBankClientDto clientDto);

    @Mapping(source = "userName", target = "userName")
    MiniBankClientDto clientToDto(Client client);

}
