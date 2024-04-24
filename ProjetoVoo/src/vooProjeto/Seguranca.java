package vooProjeto;

public class Seguranca extends Funcionario {

	 private float pesoMaximoMalas = 25;

	 public Seguranca(String nome, Data dataNascimento, float salario) {
		 super(nome, dataNascimento, salario);
	 }

	 public float getPesoMaximoMalas() {
	     return pesoMaximoMalas;
	 }

	 public void setPesoMaximoMalas(float pesoMaximoMalaS) {
	     this.pesoMaximoMalas = pesoMaximoMalaS;
	 }

	 public boolean verificarPesoMalas(float pesoMala) {
	     if(pesoMala > pesoMaximoMalas) {
	    	 return false;
	     }else {
	    	 return true;
	     }
	 }
}
