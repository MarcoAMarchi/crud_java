package br.com.soften.crud.controller;

import br.com.soften.crud.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Sale")
public class SaleController {

    @Autowired
    private SaleService saleService;



}
