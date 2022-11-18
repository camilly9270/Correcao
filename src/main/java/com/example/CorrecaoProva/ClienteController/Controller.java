package com.example.CorrecaoProva.ClienteController;
import com.example.CorrecaoProva.entity.Cliente;
import com.example.CorrecaoProva.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class Controller {
    @Autowired
    private ClienteRepository clienteRepository;
    @PostMapping
    @ResponseBody
    public Cliente create(@RequestBody Cliente cliente){
        Cliente clienteSaved = clienteRepository.save(cliente);
        return clienteSaved;
    }

}
