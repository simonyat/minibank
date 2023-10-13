package org.sdmtr.mini.bank.client.controller;

import org.sdmtr.mini.bank.client.dto.MiniBankClientDto;
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
public class ClientController {

    @PostMapping("/create")
    public ResponseItem<MiniBankClientDto> create(@RequestBody RequestItem<MiniBankClientDto> newClient) {



        ResponseItem<MiniBankClientDto> result =
                new ResponseItem<>("success", newClient.data(), null);


        return result;
    }

}
