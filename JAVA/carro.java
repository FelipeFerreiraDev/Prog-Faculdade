/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
*
*/


import java.util.Scanner;

class Carro {
    String marca;
    String modelo;
    int ano;
    int portas;

    void Exibe() {
        System.out.printf("A marca do carro é: %s", marca);
        System.out.printf("\nSeu Modelo é: %s", modelo);
        System.out.printf("\nSeu ano de fabricação é: %d", ano);
        System.out.printf("\nPossuindo %d portas\n\n", portas);
    }   
}

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);
        Scanner ler3 = new Scanner(System.in);

        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        
        System.out.print("Digite o nome da marca do carro: ");
        carro.marca = ler.nextLine();
        System.out.print("Digite o nome do modelo do carro: ");
        carro.modelo = ler.nextLine();
        System.out.print("Digite o ano do carro: ");
        carro.ano = ler.nextInt();
        System.out.print("Digite a quantidade de portas do carro: ");
        carro.portas = ler.nextInt();
        
        carro.Exibe();
        
        System.out.print("Digite o nome da marca do carro: ");
        carro2.marca = ler2.nextLine();
        System.out.print("Digite o nome do modelo do carro: ");
        carro2.modelo = ler2.nextLine();
        System.out.print("Digite o ano do carro: ");
        carro2.ano = ler2.nextInt();
        System.out.print("Digite a quantidade de portas do carro: ");
        carro2.portas = ler2.nextInt();
        
        carro2.Exibe();
        
        System.out.print("Digite o nome da marca do carro: ");
        carro3.marca = ler3.nextLine();
        System.out.print("Digite o nome do modelo do carro: ");
        carro3.modelo = ler3.nextLine();
        System.out.print("Digite o ano do carro: ");
        carro3.ano = ler3.nextInt();
        System.out.print("Digite a quantidade de portas do carro: ");
        carro3.portas = ler3.nextInt();
        
        carro3.Exibe();
   }
}