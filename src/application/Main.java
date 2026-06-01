package application;
import entities.Elevador;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Elevador elevador = new Elevador();

     elevador.andarAtual = 0;
     elevador.totalAndares = 10;
     elevador.capacidadePessoas = 5;
     elevador.quantasPessoasEstaoDentro = 3;
     int opcao;
     boolean continuar = true;
     while (continuar) {
         System.out.println("Digite a opcao desejada: 1 - Entrar | 2 - Sair | 3 - Subir | 4 - Descer\n");
         switch (opcao = sc.nextInt()) {
             case 1:
                 elevador.entrar();
                 break;
             case 2:
                 elevador.sair();
                 continuar = false;
                 break;
             case 3:
                 elevador.subir();
                 break;
             case 4:
                 elevador.descer();
                 break;
         }
     }








     sc.close();
    }
}
