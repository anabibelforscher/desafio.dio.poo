import ana.dio.desafio.dominio.Bootcamp;
import ana.dio.desafio.dominio.Curso;
import ana.dio.desafio.dominio.Dev;
import ana.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso primeiroCurso = new Curso();
        primeiroCurso.setTitulo("Fundamentos da Orientação Objetos");
        primeiroCurso.setDescricao("Introdução ao paradigma Orientado a Objeto com Linguagem Java.");
        primeiroCurso.setCargaHoraria(10);

        Curso segundoCurso = new Curso();
        segundoCurso.setTitulo("Arquitetura de Sistemas");
        segundoCurso.setDescricao("Arquiteturas de software, conceitos, aplicações e desenvolvimento de operações.");
        segundoCurso.setCargaHoraria(6);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Abstraindo seu Domínio Através da Orientação a Objetos");
        mentoria.setDescricao("Entenda o que é o domínio de uma aplicação e como começar a modelar um domínio em POO");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setTitulo("Bootcamp Java Developer");
        bootcampJava.setDescricao("Java é uma das linguagens back-end mais utilizada por desenvolvedores de todo o mundo. Neste bootcamp você aprenderá o passo a passo da tecnologia e desenvolverá projetos 100% práticos.");
        bootcampJava.getConteudos().add(primeiroCurso);
        bootcampJava.getConteudos().add(segundoCurso);
        bootcampJava.getConteudos().add(mentoria);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreveBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos da Ana: " + devAna.getConteudosIncritos());
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println("------------------");
        System.out.println("Conteúdos Inscritos da Ana: " + devAna.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos da Ana: " + devAna.getConteudosConcluidos());
        System.out.println("XP adquiridos: " + devAna.calcularTotalXP());

        System.out.println("~~~~~~~~~~~~~~~~~~");

        Dev devFlavia = new Dev();
        devFlavia.setNome("Flavia");
        devFlavia.inscreveBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos da Flávia: " + devFlavia.getConteudosIncritos());
        devFlavia.progredir();
        devFlavia.progredir();
        System.out.println("------------------");
        System.out.println("Conteúdos Inscritos da Flávia: " + devFlavia.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos da Flávia: " + devAna.getConteudosConcluidos());
        System.out.println("XP adquiridos: " + devFlavia.calcularTotalXP());

    }
}

