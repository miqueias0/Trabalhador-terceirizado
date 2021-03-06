package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Trabalhador;
import entidades.TrabalhadorTerceirizado;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Trabalhador trabalhador = new Trabalhador();
		System.out.print("Entre com o numero de trabalhadores: ");
		List<Trabalhador> lista = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Trabalhador #" + i + " dados:");
			System.out.print("Terceirizado (s/n)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			Integer horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			Double valor = sc.nextDouble();
			Double adicional;
			if (resp == 's') {
				System.out.print("Valor adicional: ");
				adicional = sc.nextDouble();
				trabalhador = new TrabalhadorTerceirizado(adicional, nome, horas, valor);
				lista.add(trabalhador);
			} else {
				trabalhador = new Trabalhador (nome, horas, valor);
				lista.add(trabalhador);
			}

		}
		System.out.println("Pagamentos:");
		for (Trabalhador c: lista) {
			System.out.println(c.getNome() + " - $ " + c.pagamento());
		}				
		sc.close();
	}

}
