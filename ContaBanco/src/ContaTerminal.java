import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        java.util.Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite número de usuário:");
        int numeroUsuario = scanner.nextInt();

        scanner.close();

        if (numeroAgencia.equals("067-8") && numeroUsuario == 1021) {
            
        String nomeCliente = "MARIO ANDRADE";
        double saldoConta = 237.48;

        System.out.println("Olá "+nomeCliente+ ",obrigado por criar uma conta em nosso banco, " +numeroAgencia+ 
        "conta" +numeroUsuario+ " e seu saldo R$" +saldoConta+ "está disponível para saque");
            
        }


        
    }
}
