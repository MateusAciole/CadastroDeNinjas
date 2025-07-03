package dev.java10x.CadastroDeNinjas.ninjas.model;

import dev.java10x.CadastroDeNinjas.missoes.model.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //@ManyToOne um ninja só pode cumprir uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;


}
