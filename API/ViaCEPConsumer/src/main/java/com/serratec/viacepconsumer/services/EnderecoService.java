package com.serratec.viacepconsumer.services;

import com.serratec.viacepconsumer.model.Endereco;
import com.serratec.viacepconsumer.model.ViaCepDTO;
import com.serratec.viacepconsumer.repository.EnderecoRepo;
import com.serratec.viacepconsumer.restClient.RestViaCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepo enderecoRepo;

    @Autowired
    RestViaCep restViaCep;

    public List<Endereco> findAll(){
        return enderecoRepo.findAll();
    }
    public Endereco findById(Integer id){
        return enderecoRepo.findById(id).get();
    }
    public Endereco create(Endereco enderecoDTO){
        ViaCepDTO enderecoNovo = restViaCep.getViaCep(enderecoDTO.getCep());
        Endereco endereco = new Endereco();

        endereco.setRua(enderecoNovo.getLogradouro());
        endereco.setCidade(enderecoNovo.getLocalidade());
        endereco.setCep(enderecoNovo.getCep());
        endereco.setBairro(enderecoNovo.getBairro());
        endereco.setNumero(enderecoDTO.getNumero());
        endereco.setComplemento(enderecoDTO.getComplemento());

        return  enderecoRepo.save(endereco);
    }

}
