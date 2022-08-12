package simcart.uz.simcart.controller;

import simcart.uz.simcart.payload.ApiResponse;
import simcart.uz.simcart.payload.ClientDto;
import simcart.uz.simcart.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @PostMapping("/buySimCard")
    public HttpEntity<?> buySimCard(@RequestBody ClientDto clientDto) {
        ApiResponse response = clientService.buySimcard(clientDto);
        return ResponseEntity.status(response.isSuccess() ? 200 : 409).body(response);
    }

}
