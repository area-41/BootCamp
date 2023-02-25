import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java para Apps");
        mentoria1.setDescricao("Aprenda a utilizar Java para criar aplicativos.");
        mentoria1.setData(LocalDate.now());


        System.out.println(mentoria1);
    }
}
