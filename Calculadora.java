package ejemploSumaResta;

import java.util.Scanner;
public class ejemploSumaResta {
	public static void main(String[] args) {
		Scanner scnIngreso = new Scanner(System.in);
		double a=0, b=0;
		int opcion=0;
		double r=0.0;
		
		System.out.println("Ingrese A: ");
		a=scnIngreso.nextInt();
		System.out.println("Ingrese B: ");
		b=scnIngreso.nextInt();
		
		System.out.println("ESCOJA OPCI�N: \n 1 --> SUMA\n 2 --> RESTA\n 3 --> MULTIPLICA\n 4 --> DIVIDE\n 5 --> POTENCIACION (A^B)\n 6 --> SIN(radianes)\n 7 --> COS(radianes)");
		
		opcion=scnIngreso.nextInt();
		
		switch (opcion){
		case 1:
			r=a+b;
			break;
		case 2:
			r=a-b;
			break;
		case 3:
			r=a*b;
			break;
		case 4:
			r=(a/b);
			break;
			
		case 5:
			r= Math.pow(a, b);
			break;

		case 6:
			r= Math.sin(a);
			break;

		case 7:
			r= Math.cos(a);
			break;	

		default:
			System.out.println("\n \t NO SE RECONOCE LA OPCION");
		
		}
		
		System.out.println(" Resultado= "+r);
		
			
	}
}
