import br.com.desfio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //criando curso 1
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.getCargaHoraria(6);

        //criando curso 2
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(6);


        //criando mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao de java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescrcao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlcione = new Dev();
        devAlcione.setNome("Alcione");
        devAlcione.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" +devAlcione.getConteudosInscritos());

        devAlcione.progredir();

        System.out.println("Conteúdos Inscritos" +devAlcione.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos" +devAlcione.getConteudosConcluidos());
        System.out.println("XP: "+devAlcione.calcularTotalxp());

        System.out.println("----------------------------");
        Dev devFrancisca = new Dev();
        devFrancisca.setNome("Franscica");
        devFrancisca.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" +devFrancisca.getConteudosInscritos());

        devFrancisca.progredir();
        devFrancisca.progredir();
        devFrancisca.progredir();

        System.out.println("Conteúdos Inscritos" +devFrancisca.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" +devFrancisca.getConteudosConcluidos());
        System.out.println("XP: "+devFrancisca.calcularTotalxp());
    }
}


















