
public class Venda {

    public int distancia;

    public Venda() {
    }

    public Venda(int distancia) {
        this.distancia = distancia;
    }

    public double calcularFrete(Frete frete) {
        return frete.calcularFrete(this.distancia);
    }
}
