package br.edu.femass.bibliotecafemass.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoTest {
    private LocalDate DataEmprestimo=LocalDate.now();
    private LocalDate DataDevolucao;
    private Usuario usuario;
    private Copia copia;
    private Emprestimo emprestimo;

    @Test
    void EmprestimoAluno() {

        Emprestimo emprestimo= new Emprestimo(usuario,copia);
        emprestimo.setDataDevolucao(emprestimo.getDataEmprestimo().plusDays(5));
        // assertEquals(emprestimo.getDataDevolucao().minusDays(5),emprestimo.getDataEmprestimo());

    }
    @Test
    void EmprestimoProfessor() {
        Emprestimo emprestimo= new Emprestimo(usuario,copia);
        emprestimo.setDataDevolucao(emprestimo.getDataEmprestimo().plusDays(30));
        //assertEquals(emprestimo.getDataDevolucao().minusDays(30),emprestimo.getDataEmprestimo());

    }

}