package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class testEst2 {
    public static void main(String[] args) {
        Estudante p1 = new Estudante();
        Estudante p2 = new Estudante();

        p2.nome = "Maria";
        p2.sexo = 'f';


        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.sexo);
        System.out.println("-------------");
        System.out.println(p2.nome);
        System.out.println(p2.idade);
        System.out.println(p2.sexo);
    }
}
