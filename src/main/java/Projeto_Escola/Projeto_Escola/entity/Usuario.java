package Projeto_Escola.Projeto_Escola.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public  abstract class Usuario {
    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 100)
    private String nome;
    @Column(nullable = false)
    private int idade;

}


