/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio.dio.poo;

import desafio.dio.dominio.Bootcamp;
import desafio.dio.dominio.Curso;
import desafio.dio.dominio.Dev;
import desafio.dio.dominio.Mentoria;
import java.time.LocalDate;

/**
 *
 * @author amand
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);
        System.out.println(curso2);
        
         System.out.println("");
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());        
        System.out.println(mentoria);
        
         System.out.println("");
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devNome1 = new Dev();
        devNome1.setNome("Nome1");
        devNome1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Nome1 " + devNome1.getConteudosInscritos());
        
        devNome1.progredir();
        devNome1.progredir();
        System.out.println("-");
       
        System.out.println("Conteudos Inscritos Nome1" + devNome1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Nome1 " + devNome1.getConteudosConcluidos());
         System.out.println("XP: " + devNome1.calcularTotalXP());
        
         System.out.println("");
        
        Dev devNome2 = new Dev();
        devNome2.setNome("Nome2");
        devNome2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Nome2 " + devNome2.getConteudosInscritos());
        
        devNome2.progredir();
        System.out.println("-");
        
        System.out.println("Conteudos Inscritos Nome2" + devNome2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Nome2" + devNome2.getConteudosConcluidos());
        System.out.println("XP: " + devNome2.calcularTotalXP());
        
        
    }
    
}
