import java.util.Scanner;
public class calculadora {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       String op;
       double n1, n2, resp;
       System.out.println("Escolha uma das quatro operações abaixo, para começar a fazer os calculos");
       System.out.println("+, -, *, ou /");
       op = teclado.nextLine();
       System.out.println("Insira o 1° valor");
       n1 = teclado.nextDouble();
       System.out.println("Insira o 2° Valor");
       n2 = teclado.nextDouble();
       teclado.close();
       resp = 0;
       if(op.equals("+")) {
          resp = n1 + n2;
     } else if (op.equals("-")){
          resp = n1 - n2;
       } else if (op.equals("*")){
          resp = n1 * n2;
       } else if (op.equals("/")){
          resp = n1 / n2;
       } else {
        System.out.println("Erro no sistema, por favor tente novamente");
        System.exit(0);  
       }
        System.out.println("O resultado é " + resp);
    }
}