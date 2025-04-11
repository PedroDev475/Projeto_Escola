package Projeto_Escola.Projeto_Escola.apllication.dto;

import Projeto_Escola.Projeto_Escola.entity.UnidadesCurriculares;

import java.util.List;

public record ProfessorDto(Long id, String nome, int idade, String turma, List<UnidadesCurriculares>unidadesCurriculares) {

}
