package maratonajava.dominio;

public class Cliente {
    public String nome;
    public int idade;
    public double salario;

    public void imprimir2(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
    }
}
