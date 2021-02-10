package br.com.newone.backend;

import br.com.newone.configs.ConnetionConfig;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {
    @GetMapping
    public ResponseEntity listaUsuarios() {
        List<Map<String, Object>> lista = ConnetionConfig.getConnection().queryForList("select * from usuario");
        return ResponseEntity.ok(lista);
    }

}
