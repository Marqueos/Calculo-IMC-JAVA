import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = myObj.nextLine(); // Salva o que o usuario digitar
        
        double peso = obterValorNumerico("Digite seu peso (utilize o formato 00.00): ");
        double altura = obterValorNumerico("Digite sua altura (utilize o formato 00.00): ");
        
        double IMC = peso / (altura * altura);
        IMC = Math.round(IMC * 10.0) / 10.0;
        
        System.out.println("Seu IMC e: " + IMC);
        System.out.println("Segundo a formula do IMC voce esta:");
        
        if (IMC < 18.5) {
            System.out.println("Baixo peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso Normal");
        } else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (IMC >= 30.0 && IMC <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (IMC >= 35.0 && IMC <= 39.9) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III");
        }
    }

    // Funcao para obter um valor numerico valido a partir da entrada do usuario
    public static double obterValorNumerico(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        double valor = 0.0;
        
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();
                break; // Valor valido, sair do loop
            } else {
                System.out.println("Valor invalido. Tente novamente.");
                scanner.next(); // Descartar entrada invalida
            }
        }
        
        return valor;
    }
}
