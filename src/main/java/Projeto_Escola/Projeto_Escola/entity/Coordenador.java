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
public class Coordenador extends Usuario{

    public Coordenador(Long id, String nome, int idade, List<Professor> equipeProfessores) {
        super(id, nome, idade);
        this.equipeProfessores = equipeProfessores;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "coordenador_equipe",
            joinColumns = @JoinColumn(name = "coordernador_id"),
            inverseJoinColumns = @JoinColumn(name = "professsor_id")
    )
   private List<Professor> equipeProfessores;
}
