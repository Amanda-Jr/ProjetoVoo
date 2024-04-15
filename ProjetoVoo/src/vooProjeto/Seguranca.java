package vooProjeto;

public class Seguranca extends Funcionario {

    private float pesoMaximoMalas = 25;
    static Data dataNsc = new Data(15, 02, 1990);

    public Seguranca() {
        super("Marcelo", dataNsc, 12000);
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