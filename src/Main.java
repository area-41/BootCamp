import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprendendo Java do Zero ao avancado.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Curso de Java Script para iniciantes.");
        curso2.setCargaHoraria(6);

        System.out.println(curso1);
        System.out.println(curso2);

        Conteudo conteudo = new Curso();
        Conteudo conteudo2 = new Mentoria();



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java para Apps");
        mentoria1.setDescricao("Aprenda a utilizar Java para criar aplicativos.");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Total");
        bootcamp.setDescricao("Descricao do bootcamp de Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Victor: " + devVictor.getConteudosInscritos());
        devVictor.progredir();
        devVictor.progredir();
        devVictor.progredir();
        System.out.println("***");
        System.out.println("Conteudos Inscritos Victor: " + devVictor.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Victor: " + devVictor.getConteudosConcluidos());
        System.out.println("XP: " + devVictor.calcularTotalXp());

        System.out.println("------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("***");
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }
}
