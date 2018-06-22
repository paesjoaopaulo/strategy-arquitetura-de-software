
public class Sedex implements Frete {

    @Override
    public double calcularFrete(int distancia) {
        //R$ 12 fixos + R$ 0,50 por km
        return 12 + distancia * 0.5;
    }

}
