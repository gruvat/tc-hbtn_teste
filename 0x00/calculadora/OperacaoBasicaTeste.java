public class OperacaoBasicaTeste {

    static boolean testar_soma() {
        return OperacaoBasica.somar(5, 3) == 8;
    }

    static boolean testar_subtracao() {
        return OperacaoBasica.subtrair(5, 3) == 2;
    }

    static boolean testar_multiplicacao() {
        return OperacaoBasica.multiplicar(5, 3) == 15;
    }

    static boolean testar_divisao() {
        return OperacaoBasica.dividir(9, 3) == 3;
    }

}
