import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTheo = new Dev();
        devTheo.setNome("Théo");
        devTheo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Théo: " + devTheo.getConteudosInscritos());
        devTheo.progredir();
        devTheo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Théo: " + devTheo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Théo: " + devTheo.getConteudosConcluidos());
        System.out.println("XP:" + devTheo.calcularTotalXP());

        System.out.println("---------");

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Felipe: " + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        devFelipe.progredir();
        devFelipe.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Felipe: " + devFelipe.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Felipe: " + devFelipe.getConteudosConcluidos());
        System.out.println("XP:" + devFelipe.calcularTotalXP());









    }
}