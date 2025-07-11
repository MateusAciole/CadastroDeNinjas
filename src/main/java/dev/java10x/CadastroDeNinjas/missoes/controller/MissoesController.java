package dev.java10x.CadastroDeNinjas.missoes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missoes listadas";
    }

    @PostMapping("/criar")
    public String criarMissoes(){
        return "Missão criada";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada";
    }

    @DeleteMapping("deletar")
    public String deletarMissao(){
        return "Missão deletada";
    }
}
