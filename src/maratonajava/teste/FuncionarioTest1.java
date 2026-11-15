package maratonajava.teste;

import maratonajava.dominio.Funcionario;

public class FuncionarioTest1 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Julia");
        funcionario01.setIdade(21);
        funcionario01.setSalarios(new double[]{100, 200, 300});

        funcionario01.imprimir();
        System.out.println("media: "+funcionario01.getMedia());
    }
}
