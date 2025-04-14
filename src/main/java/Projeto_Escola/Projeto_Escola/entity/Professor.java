package Projeto_Escola.Projeto_Escola.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="professores")
public class Professor extends Usuario {
    public Professor(Long id, String nome, int idade, String turma) {
        super(id, nome, idade);
        this.turma = turma;
    }

    @Column(nullable = false)
    private String turma;

    @CollectionTable(name = "uc_professores",joinColumns = @JoinColumn(name= "professor_id"))
    @ElementCollection(targetClass = UnidadesCurriculares.class)
    @Enumerated(EnumType.STRING)
    @Column(name = "unidades_curriculares")

    private List<UnidadesCurriculares> unidadesCurriculares;

}
