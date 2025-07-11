package dev.java10x.CadastroDeNinjas.ninjas.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Bem vindo!";

    }

    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    @GetMapping("/listar")
    public String listarNinjas(){
        return "Ninjas listados";
    }

    @GetMapping("/listarID")
    public String listarNinjaId(){
        return "Ninja por ID listado";
    }

    @PutMapping("/alterarID")
    public String alterarNinjaId(){
        return "Ninja alterado por ID";
    }

    @DeleteMapping("/deletarId")
    public String deletarNinjaId(){
        return "Ninja deletado por ID";
    }




}
