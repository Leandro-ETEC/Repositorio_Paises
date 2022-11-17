package br.com.leandro.paises;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ClasseEstado {
	private String atributoNome;
	private String atributoSigla;
	private int atributoPopulacao;
	public String setNome() {
		while(true) {	
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe o nome do estado");
			this.atributoNome = sc.nextLine();
			Pattern objetoPadrao = Pattern.compile("[A-Za-z ]+");
			Matcher objetoCombinado = objetoPadrao.matcher(this.atributoNome);	
			boolean variavelVerificacao = objetoCombinado.matches();
			if(variavelVerificacao == true) {
				System.out.println("Nome recebido corretamente");
				break;
			}
			else{
				System.out.println("Permitido apenas letras.");
				continue;
			}	
	}
		return atributoNome.toUpperCase();
	}
	
	public String setSigla() {
		while(true) {	
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe a sigla do estado");
			this.atributoSigla = sc.nextLine();
			Pattern objetoPadrao = Pattern.compile("[A-Za-z]{2}");
			Matcher objetoCombinado = objetoPadrao.matcher(this.atributoSigla);	
			boolean variavelVerificacao = objetoCombinado.matches();
			if(variavelVerificacao == true) {
				System.out.println("Nome recebido corretamente");
				break;
			}
			else{
				System.out.println("Permitido apenas 2 letras.");
				continue;
			}	
	}
		return atributoSigla.toUpperCase();
	}
	
}
