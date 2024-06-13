package application;

import java.util.Scanner;

public class Program {
	
	public static int saldo(int vitorias, int derrotas) {
		return vitorias - derrotas;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Muito bem Jovem Aventureiro, agora vamos ver se o seu Herói é mesmo valente!");
		System.out.print("Nos diga quantas Vitórias você conseguiu até agora: ");
		int vitorias = sc.nextInt();
		System.out.print("Muito bem! Agora nos diga quantas derrotas você teve: ");
		int derrotas = sc.nextInt();
		saldo(vitorias, derrotas);
		
		int saldoVitorias = saldo(vitorias, derrotas);
		
		String nivel = "";
		
		if (saldoVitorias < 10) {
			nivel = "Ferro";
		}
		else if (saldoVitorias >= 11 && saldoVitorias <= 20) {
			nivel = "Bronze";
		}
		else if (saldoVitorias >= 21 && saldoVitorias <= 50) {
			nivel = "Prata";
		}
		else if (saldoVitorias >= 51 && saldoVitorias <= 80) {
			nivel = "Ouro";
		}
		else if (saldoVitorias >=81 && saldoVitorias <= 90) {
			nivel = "Diamante";
		}
		else if (saldoVitorias >= 91 && saldoVitorias <= 100) {
			nivel = "Lendario";
		}
		else if (saldoVitorias >= 101) {
			nivel = "Imortal";
		}
		
		System.out.println("O Herói tem o saldo de " + saldoVitorias + " Vitórias, e está no nível " + nivel );
		
		sc.close();

	}

}
