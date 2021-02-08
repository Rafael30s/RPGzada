package br.com.newone.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelaInicial {
    @GetMapping
    public String padrao(){
        return "Aqui terá um sistema brabo memo";
    }

}
