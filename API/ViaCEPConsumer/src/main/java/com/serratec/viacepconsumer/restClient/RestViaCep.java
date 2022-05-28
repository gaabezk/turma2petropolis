package com.serratec.viacepconsumer.restClient;

import com.serratec.viacepconsumer.model.ViaCepDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestViaCep {

    public ViaCepDTO getViaCep(String cep){
        String url = "https://viacep.com.br/ws/"+ cep +"/json/";
        RestTemplate restT = new RestTemplate();
        ViaCepDTO enderecoRetornado = restT.getForObject(url,ViaCepDTO.class);
        return enderecoRetornado;
    }

}
