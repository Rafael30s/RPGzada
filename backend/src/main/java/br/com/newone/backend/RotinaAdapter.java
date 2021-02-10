package br.com.newone.backend;

import java.util.List;
import java.util.Map;

public class RotinaAdapter implements Rotina {


    @Override
    public void cadastrar() {
        //Verificar se já tem no banco

        // instanciar objeto
        Usuario user = new Usuario("Rafael dos Santos", "rafael30s@hotmail.com.br","1234");

        // enviar para o banco

        // resposta de retorno
        System.out.println("ui papai");
    }

    @Override
    public void consultarUsuarios() {
        // aqui vai um select na tabela usuarios
    }


}
