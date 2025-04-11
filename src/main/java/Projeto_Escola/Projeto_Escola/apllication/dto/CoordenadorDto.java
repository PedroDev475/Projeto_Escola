package Projeto_Escola.Projeto_Escola.apllication.dto;

import java.util.List;

public record CoordenadorDto(Long id, String nome, int idade, List<ProfessorDto> equipe ) {

}
