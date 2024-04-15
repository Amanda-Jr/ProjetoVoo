package vooProjeto;

public class Piloto extends Funcionario{
	
    private int horasVoo;

    public Piloto(String nome, Data dataNascimento, float salario, int horasVoo) {
        super(nome, dataNascimento, salario); 
        this.horasVoo = horasVoo;
    }

    public int getHorasVoo() {
        return horasVoo;
    }

    public void setHorasVoo(int horasVoo) {
        this.horasVoo = horasVoo;
    }
}