package simcart.uz.simcart.controller;

import simcart.uz.simcart.service.FilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/filial")
public class FilialController {
    @Autowired
    FilialService filialService;


}
