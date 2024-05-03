
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ContaTerminal {

    
    public static void main(String[] args) throws Exception {

        BufferedReader reader = 
          new BufferedReader(new InputStreamReader(System.in));

          Integer numero = 0;
          String agencia;
          String nomeCliente;
          Float saldo = (float) 0;
    
        System.out.print("Insira o numero de sua conta: ");
        numero = numero.parseInt(reader.readLine());

        System.out.print("Por favor, insira o numero de sua agencia: ");
        agencia = reader.readLine();
        
        System.out.print("Agora, confirme seu nome completo inserindo-o a seguir: ");
        nomeCliente = reader.readLine();

        //Não faz muito sentido o usuário inserir o saldo mas ok, tá pedindo kk
        System.out.print("Por ultimo, insira o ultimo saldo conhecido de sua conta: ");
        saldo = saldo.parseFloat(reader.readLine());

        

        System.out.println
        ("Ola " +  nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia e " +
        agencia + " numero " + numero + " e seu saldo de R$" + saldo +" ja esta disponivel!");
        
    }
}
