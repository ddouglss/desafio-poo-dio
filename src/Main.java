import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        List<Curso> cursos = List.of(
                new Curso("Curso C#", "Curso de C#", 240),
                new Curso("Curso js", "Curso de js", 120)
        );
        cursos.forEach(System.out::println);

        System.out.println("==========================================");

        curso.setTitulo("Curso Java");
        curso.setDescricao("Curso de Java");
        curso.setCargaHoraria(120);
        System.out.println(curso);

        System.out.println("==========================================");


        List<Mentoria> mentorias = List.of(
                new Mentoria("mentoria java", "mentoria de java", LocalDate.now())

        );
        mentorias.forEach(System.out::println);
        System.out.println("==========================================");

        mentoria.setTitulo("mentoria C#");
        mentoria.setDescricao("mentoria de C#");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);


    }
}