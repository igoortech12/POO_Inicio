import java.util.Locale;
import java.util.Scanner;

public class resolvendo_problema_sem_oo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * CALCULAR A AREA DE DOIS TRIANGULOS E DEPOIS MOSTRAR QUAL DOS DOIS TRIANGULOS
		 * TEM A MAIOR AREA.
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sp1;
		double sp2;
		double area_triangulo1;
		double area_triangulo2;

		System.out.println("Digite as três medidas do 1o triângulo");
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double c1 = sc.nextDouble();

		System.out.println("Digite as três medidas do 2o triângulo");
		double a2 = sc.nextDouble();
		double b2 = sc.nextDouble();
		double c2 = sc.nextDouble();

		sp1 = (a1 + b1 + c1) / 2;
		area_triangulo1 = Math.sqrt(sp1 * (sp1 - a1) * (sp1 - b1) * (sp1 - c1));

		System.out.printf("Triângulo 1 possui área de: %.4f%n ", area_triangulo1);

		sp2 = (a2 + b2 + c2) / 2;
		area_triangulo2 = Math.sqrt(sp2 * (sp2 - a2) * (sp2 - b2) * (sp2 - c2));

		System.out.printf("Triângulo 2 possui área de: %.4f%n ", area_triangulo2);

		if (area_triangulo1 > area_triangulo2) {
			System.out.println("Trângulo 1 possui área maior");
		} else {
			System.out.println("Trângulo 2 possui área maior");
		}

		sc.close();
	}

} //CHAVE FECHAMENTO DA CLASSE
