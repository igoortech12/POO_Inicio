import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class resolvendo_problema_com_oo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * CALCULAR A AREA DE DOIS TRIANGULOS E DEPOIS MOSTRAR QUAL DOS DOIS TRIANGULOS
		 * TEM A MAIOR AREA.
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Digite as três medidas do 1o triângulo");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite as três medidas do 2o triângulo");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double sp1 = (x.a + x.b + x.c) / 2;
		double area_triangulo1 = Math.sqrt(sp1 * (sp1 - x.a) * (sp1 - x.b) * (sp1 - x.c));

		System.out.printf("Triângulo 1 possui área de: %.4f%n ", area_triangulo1);

		double sp2 = (y.a + y.b + y.c) / 2;
		double area_triangulo2 = Math.sqrt(sp2 * (sp2 - y.a) * (sp2 - y.b) * (sp2 - y.c));

		System.out.printf("Triângulo 2 possui área de: %.4f%n ", area_triangulo2);

		if (area_triangulo1 > area_triangulo2) {
			System.out.println("Trângulo 1 possui área maior");
		} else {
			System.out.println("Trângulo 2 possui área maior");
		}

		sc.close();
	}

}
