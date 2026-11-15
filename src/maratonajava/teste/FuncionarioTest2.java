package maratonajava.teste;

import maratonajava.dominio.Funcionario2;
import maratonajava.dominio.ImpressoraFuncionario2;

public class FuncionarioTest2 {
    public static void main(String[] args) {
        Funcionario2 funcionario2 = new Funcionario2();
        Funcionario2 funcionario3 = new Funcionario2();
        Funcionario2 funcionario4 = new Funcionario2();
        ImpressoraFuncionario2 impressoraFuncionario2 = new ImpressoraFuncionario2();

        funcionario2.nome = "Joao";
        funcionario2.sexo = 'M';
        funcionario2.idade = 12;
        funcionario2.salario = 2000;

        funcionario3.nome = "Maria";
        funcionario3.salario = 3000;
        funcionario3.idade = 22;
        funcionario3.sexo = 'F';

        funcionario4.nome = "Juliao";
        funcionario4.idade = 21;
        funcionario4.sexo = 'M';
        funcionario4.salario = 5000;

        impressoraFuncionario2.imprimir(funcionario2);
        impressoraFuncionario2.imprimir(funcionario3);
        impressoraFuncionario2.imprimir(funcionario4);
    }
}
