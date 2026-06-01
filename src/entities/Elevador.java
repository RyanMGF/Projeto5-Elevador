package entities;

public class Elevador {
    public int andarAtual;
    public int totalAndares;
    public int capacidadePessoas;
    public int quantasPessoasEstaoDentro;

    public void entrar(){
         if (quantasPessoasEstaoDentro < capacidadePessoas){
             quantasPessoasEstaoDentro++;
             System.out.printf("Bem-Vindo, temos %d pessoas no elevador.%n", quantasPessoasEstaoDentro);
         } else {
             System.out.println("Você não pode entrar, o elevador está cheio!");
         }
    }
    public void sair(){
        quantasPessoasEstaoDentro --;
        System.out.printf("Até mais! O elevador agora tem %d pessoas.", quantasPessoasEstaoDentro);
    }
    public void subir(){
        if (andarAtual <= totalAndares) {
            andarAtual++;
            System.out.println("Subindo... Andar atual: " + andarAtual);
        } else{
            System.out.println("Grave: O elevador já está no último andar!");
        }
    }
    public void descer(){
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Descendo... Andar atual: " + andarAtual);
        } else{
            System.out.println("Grave: O elevador já está no terréo!");
        }
    }
}
