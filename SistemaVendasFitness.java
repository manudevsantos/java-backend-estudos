import java.util.Scanner; // Import necessário para o Scanner funcionar

public class SistemaVendasFitness {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        // Sistema de vendas - Acessórios fitness

       // declarando variáveis


        // Estoque de produtos

        int anilhaQuantEstoque;
        int halterQuantEstoque;
        int barraQuantEstoque;
        int ketlebellQuantEstoque;
        int colchoneteQuantEstoque;


        // valor de cada produto

        double anilha = 19.00;
        double halter = 18.00;
        double barra = 85.00;
        double ketlebell = 22.00;
        double colchonete = 60.00;


        // Cliente, carrinho e pagamento

        int compraCliente= 0;
        double carrinhoCliente = 0.00;
        double pagamento = 0.00;
        double troco = 0.00;


        // Armazenando estoque

        System.out.println("Quantidade de anilhas no estoque: ");
        anilhaQuantEstoque = scan.nextInt();
        System.out.println();

        System.out.println("Quantidade de  halteres no estoque: ");
        halterQuantEstoque = scan.nextInt();
        System.out.println();

        System.out.println("Quantidade de  barras no estoque: ");
        barraQuantEstoque = scan.nextInt();
        System.out.println();

        System.out.println("Quantidade de ketlebells no estoque: ");
        ketlebellQuantEstoque = scan.nextInt();
        System.out.println();

        System.out.println("Quantidade de colchonetes no estoque: ");
        colchoneteQuantEstoque = scan.nextInt();
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();


        // Compra do cliente, valor do carrinho, pagamento e troco

        System.out.println("Quantas anilhas você deseja comprar? ");
        compraCliente= scan.nextInt();
        System.out.println();


            if (compraCliente <= anilhaQuantEstoque) {

                carrinhoCliente += (compraCliente*anilha);
                anilhaQuantEstoque -= compraCliente;

                System.out.println("O valor das anilhas é R$ "+ (compraCliente*anilha));
                System.out.println();
                System.out.println("-------------------------------------------------------------");
                System.out.println();
            }
            else {

                System.out.println("-------------------------------------------------------------");
                System.out.println("Desculpe, não possuímos essa quantidade, temos apenas " + anilhaQuantEstoque + " anilhas.");
                System.out.println("-------------------------------------------------------------");
                System.out.println();
            }

        System.out.println("Quantos halteres você deseja comprar?");
        compraCliente = scan.nextInt();
        System.out.println();

            if (compraCliente <= halterQuantEstoque) {

                carrinhoCliente += (compraCliente*halter);
                halterQuantEstoque -= compraCliente;

                System.out.println("O valor total dos halteres é R$" + (compraCliente*halter));
                System.out.println();
                System.out.println("-------------------------------------------------------------");
                System.out.println();

             } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Desculpe, não temos essa quantidade no estoque. Temos apenas " + halterQuantEstoque + " halteres.");
                System.out.println("-------------------------------------------------------------");
                System.out.println();
            }

        System.out.println("Quantas barras você deseja comprar?");
        compraCliente = scan.nextInt();
        System.out.println();

            if (compraCliente <= barraQuantEstoque) {
                carrinhoCliente += (compraCliente*barra);
                barraQuantEstoque -= compraCliente;
                
                System.out.println("O valor das barras é de R$" + (compraCliente*barra));              
                System.out.println();
                System.out.println("-------------------------------------------------------------");
                System.out.println();

            } else {

                System.out.println("-------------------------------------------------------------");
                System.out.println("Desculpe, não temos essa quantidade de barras, temos apenas " + barraQuantEstoque + " barras");
                System.out.println("-------------------------------------------------------------");
                System.out.println();
            }

        System.out.println("Quantos ketlebells você deseja comprar? ");
        compraCliente= scan.nextInt();
        System.out.println();


            if (compraCliente <= ketlebellQuantEstoque) {

                carrinhoCliente += (compraCliente*ketlebell);
                ketlebellQuantEstoque -= compraCliente;

                System.out.println("O valor dos ketlebells é R$ "+ (compraCliente*ketlebell));
                System.out.println();
                System.out.println("-------------------------------------------------------------");
                System.out.println();

            }
            else {

                System.out.println("-------------------------------------------------------------");
                System.out.println("Desculpe, não possuímos essa quantidade, temos apenas " + ketlebellQuantEstoque + " ketlebells.");
                System.out.println("-------------------------------------------------------------");
                System.out.println();
            }
            
        System.out.println("Quantos colchonetes você deseja comprar? ");
        compraCliente= scan.nextInt();
        System.out.println();


            if (compraCliente <= colchoneteQuantEstoque) {

                carrinhoCliente += (compraCliente*colchonete);
                colchoneteQuantEstoque -= compraCliente;

                System.out.println("O valor dos colchonetes é R$ "+ (compraCliente*colchonete));
                System.out.println();
                System.out.println("-------------------------------------------------------------");
                System.out.println();
            }
            else {

                System.out.println("-------------------------------------------------------------");
                System.out.println("Desculpe, não possuímos essa quantidade, temos apenas " + colchoneteQuantEstoque + " colchonetes.");
                System.out.println("-------------------------------------------------------------");
                System.out.println();
            }


        System.out.println("     > O valor total do seu carrinho é de R$ " + carrinhoCliente + " <");
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();
    
        System.out.println("Qual valor em dinheiro você deseja pagar?");
        pagamento = scan.nextDouble();
        System.out.println();


            if (pagamento >= carrinhoCliente) {

                troco = (pagamento-carrinhoCliente);

                System.out.println("================ COMPROVANTE DE PAGAMENTO ===================");
                System.out.println();
                System.out.println("           Compra aprovada, seu troco é de R$ " + troco);
                System.out.println("                Obrigada pela preferência!");
                System.out.println();
                System.out.println("=============================================================");

            } else {

                System.out.println();
                System.out.println("-------------------------------------------------------------");
                System.out.println();
                System.out.println("Pagamento recusado! para completar o pagamento Restam R$ " + (carrinhoCliente-pagamento));
                System.out.println();
                System.out.println("-------------------------------------------------------------");
                System.out.println();
  
            }

             scan.close();
        }
           
        }
