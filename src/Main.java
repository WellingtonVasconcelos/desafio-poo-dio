import br.com.wellington.desafio.dominio.Bootcamp;
import br.com.wellington.desafio.dominio.Curso;
import br.com.wellington.desafio.dominio.Dev;
import br.com.wellington.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
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

        Dev devWellington = new Dev();
        devWellington.setNome("Wellington");
        devWellington.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Wellington" + devWellington.getConteudoInscritos());
        devWellington.prodredir();
        devWellington.prodredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Wellington" + devWellington.getConteudoInscritos());
        System.out.println("Conteudos Conluidos Wellington" + devWellington.getConteudoConcluido());
        System.out.println("XP : " +devWellington.calcularTotalXp());



        System.out.println("---------------");
        Dev devCaroline = new Dev();
        devCaroline.setNome("Carolene");
        devCaroline.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Caroline" + devCaroline.getConteudoInscritos());
        devCaroline.prodredir();
        devCaroline.prodredir();
        devCaroline.prodredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Caroline" + devCaroline.getConteudoInscritos());
        System.out.println("Conteudos Conluidos Caroline" + devCaroline.getConteudoConcluido());
        System.out.println("XP : " +devCaroline.calcularTotalXp());
    }
}
