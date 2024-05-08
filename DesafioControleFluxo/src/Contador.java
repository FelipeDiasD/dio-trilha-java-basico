
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Contador {
	
    public static void main(String[] args) throws IOException, ParametrosInvalidosException{
		
        BufferedReader terminal = 
        new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Digite o primeiro parâmetro");
		Integer parametroUm = 0;
        parametroUm = parametroUm.parseInt(terminal.readLine());

		System.out.println("Digite o segundo parâmetro");
		Integer parametroDois = 0;
        parametroDois = parametroDois.parseInt(terminal.readLine());
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.print("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem

        for(int i = 0; i < contagem; i++){
            System.out.print("Contagem: " + i +"\n");
        }
	}
}