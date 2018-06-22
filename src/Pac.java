
public class Pac implements Frete {

    @Override
    public double calcularFrete(int distancia) {
        //R$ 2 fixos + R$ 0,30 por km
        return 2 + distancia * 0.3;
    }

}
