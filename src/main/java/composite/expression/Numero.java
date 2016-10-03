package composite.expression;

public class Numero implements Expresion {

    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int operar() {
        return this.numero;
    }

    @Override
    public String toString() {
        return ("" + this.numero);
    }
}
