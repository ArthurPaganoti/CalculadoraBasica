import java.util.Scanner;

public class MenuCalculadora {
    public static void main(String[] args) {

        Operacao op = new Operacao();
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("Selecione alguma das opções abaixo: ");
        System.out.println("=======================");
        System.out.println("0 - Sair");
        System.out.println("=======================");
        System.out.println("1 - Soma");
        System.out.println("=======================");
        System.out.println("2 - Subtração");
        System.out.println("=======================");
        System.out.println("3 - Divisão");
        System.out.println("=======================");
        System.out.println("4 - Multiplicação");
        System.out.println("=======================");
        System.out.println("5 - Potencia");
        System.out.println("=======================");
        System.out.println("6 - Raiz Quadrada");
        System.out.println("=======================");
        int menu = sc.nextInt();

        switch (menu) {

            default:
                System.out.println("Selecione uma opção valida!");

            case 0:
                break;

            case 1:
                System.out.println("=======================");
                System.out.println("Entre com o primeiro valor: ");
                System.out.println("=======================");
                double valorUm = sc.nextDouble();
                System.out.println("=======================");
                System.out.println("Entre com o segundo valor: ");
                System.out.println("=======================");
                double valorDois = sc.nextDouble();
                op.soma(valorUm, valorDois);
                System.out.println("O resultado é: " + op.soma(valorUm, valorDois));
                break;

            case 2:
                System.out.println("=======================");
                System.out.println("Entre com o primeiro valor: ");
                System.out.println("=======================");
                double valor1 = sc.nextDouble();
                System.out.println("=======================");
                System.out.println("Entre com o segundo valor: ");
                System.out.println("=======================");
                double valor2 = sc.nextDouble();
                op.subtracao(valor1, valor2);
                System.out.println("O resultado é: " + op.subtracao(valor1, valor2));
                break;

            case 3:
                System.out.println("=======================");
                System.out.println("Entre com o primeiro valor: ");
                System.out.println("=======================");
                double valor = sc.nextDouble();
                System.out.println("=======================");
                System.out.println("Entre com o segundo valor: ");
                System.out.println("=======================");
                double valordois = sc.nextDouble();
                op.divisao(valor, valordois);
                System.out.println("O resultado é: " + op.divisao(valor, valordois));
                break;

            case 4:
                System.out.println("=======================");
                System.out.println("Entre com o primeiro valor: ");
                System.out.println("=======================");
                double valorPrimario = sc.nextDouble();
                System.out.println("=======================");
                System.out.println("Entre com o segundo valor: ");
                System.out.println("=======================");
                double valorSecundario = sc.nextDouble();
                op.multiplicacao(valorPrimario, valorSecundario);
                System.out.println("O resultado é: " + op.multiplicacao(valorPrimario, valorSecundario));
                break;

            case 5:
                System.out.println("=======================");
                System.out.println("Entre com um valor: ");
                System.out.println("=======================");
                double valor11 = sc.nextDouble();
                op.potencia(valor11);
                System.out.println("O resultado é: " + op.potencia(valor11));
                break;

            case 6:
                System.out.println("=======================");
                System.out.println("Entre com um valor: ");
                System.out.println("=======================");
                double valor12 = sc.nextDouble();
                op.raizQuadrada(valor12);
                System.out.println("O resultado é: " + op.raizQuadrada(valor12));
                break;
        }
        sc.close();
    }
}
