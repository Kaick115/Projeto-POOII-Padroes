package listafesta;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarInfo1(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
