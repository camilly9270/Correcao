package com.example.CorrecaoProva.utils;

import com.example.CorrecaoProva.entity.Cliente;
import org.springframework.stereotype.Service;

@Service
public class Calculo {

    public Cliente calc(Cliente cliente){
        if (cliente.getReceita() > 100000.00){
            Double valorIdeal = cliente.getReceita() - 9999.9;
            cliente.setReceita(valorIdeal);
            return cliente;
        }else {
            Double porcentagem = (cliente.getReceita() * 0.05);
            cliente.setReceita(cliente.getReceita() - porcentagem);
            return cliente;
        }
    }
}
