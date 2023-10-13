package org.sdmtr.mini.bank.client.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.sdmtr.mini.bank.client.dto.MiniBankClientDto;
import org.sdmtr.mini.bank.model.business.Client;

@Mapper
public interface DtoToClientConverter {

    DtoToClientConverter mapper = Mappers.getMapper(DtoToClientConverter.class);

    @Mapping(source = "userName", target = "userName")
    Client dtoToClient(MiniBankClientDto clientDto);

}
