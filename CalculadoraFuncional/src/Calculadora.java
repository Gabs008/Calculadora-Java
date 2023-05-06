import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int n1,n2;
        int resultado;
        String op;
    
        
        System.out.println("Informe o Primeiro Valor: ");
        n1 = entrada.nextInt();
        System.out.println("Informe o segundo Valor: ");
        n2 = entrada.nextInt();
        System.out.println("Digite o nome da operação desejada: ");
        op = entrada.next();

        if (op.equals("somar")){
            resultado = n1 + n2;
            System.out.println("O resultado é " + resultado);
        } else if (op.equals("subtrair")){
            resultado = n1 - n2;
            System.out.println("O resultado é " + resultado);
        } else if (op.equals("multiplicar")){
            resultado = n1 * n2;
            System.out.println("O resultado é " + resultado);
        } else if (op.equals("dividir")){
            resultado = n1 / n2;
            System.out.println("O resultado é " + resultado);
        }
        
        

    }


}
