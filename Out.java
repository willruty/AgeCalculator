package Age;

import java.util.Scanner;

public class Out {

	public static void main(String[] args) {
		
		Methods metodos = new Methods(23, 8, 2024);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia que você nasceu: ");
		int dia = entrada.nextInt();
		String diaAge = metodos.getDia(dia);
		
		System.out.println("Digite o mês que você nasceu: ");
		int mes = entrada.nextInt();
		String mesAge= metodos.getMes(mes);
		
		System.out.println("Digite o ano que você nasceu: ");
		int ano = entrada.nextInt();
		String anoAge = metodos.getAno(ano);
		
		entrada.close();
		
		System.out.println(metodos.protocoloAniversario(dia, mes));
		
		String saida = "Você tem " + anoAge + mesAge +  diaAge + " de vida!!";
		
		System.out.println(saida);
		
	}
}
