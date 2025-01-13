package service;


import com.fasterxml.jackson.databind.ObjectMapp

import utils.apiUtils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {

    apiUtils ApiUtils = new apiUtils();
    public apiUtils getapiUtils(String cep) throws IOException, InterruptedException{

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/")).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            ApiUtils = mapper.readValue(response.body(), apiUtils.class);

        } catch (Exception e) {
            System.out.println(e.getMessage());


        }
        return ApiUtils;
    }



}


