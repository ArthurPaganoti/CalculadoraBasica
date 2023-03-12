class Operacao {

    double soma(double valorUm, double valorDois) {
        return valorUm + valorDois;

    }

    double subtracao(double valorUm, double valorDois) {
        return valorUm - valorDois;
    }

    double divisao(double valorUm, double valorDois) {
        return valorUm / valorDois;
    }

    double multiplicacao(double valorUm, double valorDois) {
        return valorUm * valorDois;
    }

    double potencia(double valorUm) {
       return Math.pow(valorUm , 2);
    }

    double raizQuadrada(double valorUm) {
        return Math.sqrt(valorUm);
    }
}