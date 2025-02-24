package classes;
import java.util.Scanner;
public class Celular {

    private String modelo = "Modelo padrão";
    public String marca;
    public double tamanhoTela;
    public int quantCamera;
    protected double bateria;
    private boolean ligado;

    //Criando um Scanner Global.
    private static final Scanner entradaDados = new Scanner(System.in);

    //Apresenta os valores dos atributos do objeto criado.
    public void status() {
        //this. serve para referência ao objeto que fez a chamada a classe, isso indica direto qual o objeto ao qual fez a chamada ao metodo.
        System.out.println("O modelo do celular é: " + this.modelo);
        System.out.println("A marca do celular é: " + this.marca);
        System.out.println("O tamanho da tela do celular é: " + this.tamanhoTela);
        System.out.println("A bateria do celular está em: " + this.bateria + "%");
        System.out.println("Seu celular tem: " + this.quantCamera + " câmeras");
        System.out.println("Seu celular está: " + (this.ligado ? "Ligado" : "Desligado"));
    }

    //Liga o objeto Celular.
    public void ligar(){
        this.ligado = true;
        System.out.println("Celular ligando!");
        System.out.println("Seu celular está: Ligado.");
    }

    //Desliga o objeto Celular.
    public void desligar(){
        this.ligado = false;
        System.out.println("Celular desligando!");
        System.out.println("Celular está desligado!");
    }

    //O objeto celular tira uma foto.
    public void foto(){
        if (this.ligado == true) {
            System.out.println("Deseja tirar uma foto?");
            String tirarFoto = entradaDados.next(); //usando o Scanner global
            System.out.println(" ");
            //.equalsIgnoreCase serve para
            if (tirarFoto.equalsIgnoreCase("sim")) {
                System.out.println("Foto tirada");
            } else {
                System.out.println("Foto não tirada");
            }
        } else {
            System.out.println("Erro!");
        }
    }

    //Fecha a entrada de novos dados
    public void fecharScanner(){
        entradaDados.close();
    }

}
