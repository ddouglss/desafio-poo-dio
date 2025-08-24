import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();
//        Conteudo conteudo = new Curso(); //polimorfismo

        System.out.println("==========================================");

        curso.setTitulo("Curso Java");
        curso.setDescricao("Curso de Java");
        curso.setCargaHoraria(120);
        System.out.println(curso);

        System.out.println("==========================================");


        mentoria.setTitulo("mentoria C#");
        mentoria.setDescricao("mentoria de C#");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        System.out.println("==========================================");

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Joao");
        dev.increverBootcamp(bootcamp);
        dev.progredir();
        dev.progredir();

        System.out.println("Countéudos inscritos: " + dev.getConteudosInscritos());
        System.out.println("Countéudos concluidos: " + dev.getConteudosConcluidos());
        System.out.println("Xp total: " + dev.calcularXp());

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.increverBootcamp(bootcamp);
        dev2.progredir();
        System.out.println("Countéudos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Countéudos concluidos: " + dev2.getConteudosConcluidos());







    }
}