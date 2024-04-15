package vooProjeto;

public class Funcionario extends Pessoa {

    protected float salario;
    

    public Funcionario() {
    	
    }
  
    
    public Funcionario(String nome, Data dataNascimento, float salario) {
        super(nome, dataNascimento);
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}