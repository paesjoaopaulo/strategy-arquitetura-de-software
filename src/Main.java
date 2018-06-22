
public class Main {

    public static void main(String[] args) {

        Venda sedex = new Venda(100);
        System.out.println("Sedex: R$" + sedex.calcularFrete(new Sedex()));

        Venda pac = new Venda(100);
        System.out.println("PAC: R$" + pac.calcularFrete(new Pac()));

        Venda inLoco = new Venda(100);
        System.out.println("No local: R$" + inLoco.calcularFrete(new Local()));

    }

}
