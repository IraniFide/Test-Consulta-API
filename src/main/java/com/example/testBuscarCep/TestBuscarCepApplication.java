package com.example.testBuscarCep;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.ApiService;
import utils.apiUtils;

import java.io.IOException;

@SpringBootApplication

public class TestBuscarCepApplication {

    public static void main(String[] args) throws IOException, InterruptedException {

        ApiService apiService = new ApiService();

        System.out.println(apiService.getapiUtils("11925000"));


    }
}

