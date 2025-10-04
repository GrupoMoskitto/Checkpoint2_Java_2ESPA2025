import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Produto p1 = new Produto(1, "CD Greatest Hits", 25, 29.99);
        Produto p2 = new Produto(2, "CD Slipknot Vol.3", 10, 39.90);
        Produto p3 = new Produto(3, "Placa de video NVIDIA", 50, 79.00);
        Produto p4 = new Produto(4, "Mouse HyperX", 15, 120.00);

        Produto p5 = new Produto();
        p5.setNumeroItem(5);
        p5.setNomeProduto("Teclado Mecânico");
        p5.setQuantidadeEstoque(20);
        p5.setPreco(250.00);

        Produto p6 = new Produto();
        p6.setNumeroItem(6);
        p6.setNomeProduto("Fone Bluetooth");
        p6.setQuantidadeEstoque(30);
        p6.setPreco(150.00);


        p1.setAtivo(false);


        System.out.println("--- Produtos Fixos ---");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);


        int maxSize;
        do {
            System.out.println("Insira o número de produtos que gostaria de adicionar:");
            System.out.println("Digite 0 para não adicionar mais produtos:");
            maxSize = sc.nextInt();
            if (maxSize < 0) {
                System.out.println("Valor incorreto inserido!");
            }
        } while (maxSize < 0);

        if (maxSize == 0) {
            System.out.println("Não há produtos inseridos pelo usuário!");
        } else {
            Produto[] produtos = new Produto[maxSize];
            for (int i = 0; i < maxSize; i++) {
                sc.nextLine();
                System.out.print("Digite o número do item: ");
                int tempNumber = sc.nextInt();
                sc.nextLine();
                System.out.print("Digite o nome do produto: ");
                String tempName = sc.nextLine();
                System.out.print("Digite a quantidade em estoque: ");
                int tempQty = sc.nextInt();
                System.out.print("Digite o preço: ");
                double tempPrice = sc.nextDouble();

                produtos[i] = new Produto(tempNumber, tempName, tempQty, tempPrice);
            }

            System.out.println("\n--- Produtos Inseridos pelo Usuário ---");
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }

        sc.close();
    }
}
