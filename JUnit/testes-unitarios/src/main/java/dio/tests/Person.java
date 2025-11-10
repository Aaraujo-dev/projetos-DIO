package dio.tests;

public class Person {
    private boolean casado;
    private String nome;
    private int idade;

    Person(String nome, int idade){
        this.nome = nome;
        this.idade=idade;
    }

    @Override
    public String toString() {
        return "Person{" +
                "casado=" + casado +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public boolean estadoCivil(){
        return this.casado;
    }

    public void casar(){
        this.casado = true;
    }

    public void divorciar(){
        this.casado = false;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

}
