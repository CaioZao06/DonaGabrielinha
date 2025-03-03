import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calcular vendas = new Calcular();
        int opcao = 0;
            do {
                    System.out.println("Digite uma das opções:");
                    System.out.println("[1] - Calcular preço total");
                    System.out.println("[2] - Calcular troco");
                    System.out.println("[3] - Sair");
                    opcao = scan.nextInt();

                switch (opcao) {
                    case 1:
                        double total = vendas.calcPreco();
                        System.out.println("O preço total da venda é: R$ " + total);
                        break;
                    case 2:
                        double troco = vendas.troco();
                        if (troco >= 0) {
                            System.out.println("O troco a ser dado ao cliente é: R$ " + troco);
                        } else {
                            System.out.println("Valor recebido é insuficiente. Falta R$ " + (-troco));
                        }
                        break;
                    case 3:
                        System.out.println("Saindo!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (opcao != 3);
        }
    }