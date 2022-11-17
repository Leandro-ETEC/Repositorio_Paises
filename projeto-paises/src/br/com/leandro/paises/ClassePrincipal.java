package br.com.leandro.paises;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassePrincipal {
	
	public static void main(String[] args) {	

		ClasseEstado objetoEstado = new ClasseEstado();
		
		String variavelNome = objetoEstado.setNome();
		String variavelSigla = objetoEstado.setSigla();
		
		System.out.printf("O estado escolhido eh %s e o pais %s.", variavelNome, variavelSigla);
		
	}
	
}