import java.util.Scanner;

public class ExemploIfElse {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
    double nota;
    System.out.println("Digite a nota: ");
    nota = leitor.nextDouble();
    if (nota >= 70)
        System.out.println("Aprovado");
    else
        System.out.println("Reprovado");
    
    }
}
