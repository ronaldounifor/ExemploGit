public class Pedido {

    double getTotal() {
        return 100.0 + CalculadoraImposto.impostoProduto(getTotal());
    }

    void finalizar(FormaPagamento f){

    }
}
