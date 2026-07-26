package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class testEst1 {
    public static void main(String[] args) {
        Estudante p1 = new Estudante();
        p1.nome = "Geyciane";
        p1.idade = 20;
        p1.sexo = 'F';
        System.out.println(p1.nome + " tem " + p1.idade + " anos e é do sexo " + p1.sexo);
        System.out.println("--------------");

        Estudante p2 = new Estudante();
        p2.nome = "Gilmar";
        p2.idade = 21;
        p2.sexo = 'M';
        System.out.println(p2.nome + " tem " + p2.idade + " anos e do sexo " + p2.sexo);
    }
}
