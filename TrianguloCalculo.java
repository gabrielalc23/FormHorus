import java.util.Scanner;

public class TrianguloCalculo {
	
    public static void main (String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Insira os comprimentos dos tres lados do triangulo: \n\n");
		
        System.out.print(" Insira o comprimento do lado A: ");
        double ladoA = teclado.nextDouble();
        
        System.out.print("Insira o comprimento do lado B: ");
        double ladoB = teclado.nextDouble();
        
        System.out.print("Insira o comprimento do lado C: ");	
        double ladoC = teclado.nextDouble();
        
        double ladoMaior = 0;
		
		if (ladoA >= ladoB && ladoA >= ladoC) {
			
            ladoMaior = ladoA;
			
            if (ladoB + ladoC > ladoA) {
                if (ladoA == ladoB && ladoA == ladoC) {
                    //System.out.printf("Este e um triangulo equilátero.");
                }
                if (ladoA == ladoB && ladoB != ladoC || ladoB == ladoC && ladoC != ladoA || ladoC == ladoA && ladoA != ladoB) {
                    System.out.printf("Este e um triangulo isósceles.");
                }
                if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
                    System.out.printf("Este e um triangulo escaleno.");

					}
				}
			}	
            if (ladoB + ladoC <= ladoA) {
                System.out.printf(" \n Não e possível formar um triangulo com esses lados.");
            }
			
        
		
		if (ladoB >= ladoA && ladoB >= ladoC) {
			
            ladoMaior = ladoB;
			
            if (ladoA + ladoC > ladoB) {
                if (ladoA == ladoB && ladoB != ladoC || ladoB == ladoC && ladoC != ladoA || ladoC == ladoA && ladoA != ladoB) {
                    System.out.printf("Este e um triangulo isósceles.");
                }
                if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
                    System.out.printf("Este e um triangulo escaleno.");
                }
                if (ladoA == ladoB && ladoA == ladoC) {
                    System.out.printf("Este e um triangulo equilátero.");
                }
            }
		
            if (ladoA + ladoC <= ladoB) {
                System.out.printf(" \n Não e possível formar um triangulo com esses lados.");
            }
        }
		
		if (ladoC >= ladoA && ladoC >= ladoB) {
            ladoMaior = ladoC;
            
			if (ladoA + ladoB > ladoC) {
                if (ladoA == ladoC && ladoC != ladoB || ladoB == ladoC && ladoC != ladoA || ladoA == ladoB && ladoB != ladoC) {
                    System.out.printf("Este e um triangulo isósceles.");
                }
                if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
                    System.out.printf("Este e um triangulo escaleno.");
                }
                if (ladoA == ladoB && ladoA == ladoC){
					//System.out.printf("este e um triangulo equilatero");
					
				}
			}
			
		}
		
		if (ladoA > ladoB && ladoA > ladoC) {
			System.out.println("Lado A é o maior.");
		}

		if (ladoB > ladoA && ladoB > ladoC) {
			System.out.println("Lado B é o maior.");
		}

		if (ladoC > ladoA && ladoC > ladoB) {
			System.out.println("Lado C é o maior.");
		}

		if (ladoA == ladoB && ladoB == ladoC) {
			System.out.println(" \n Os três lados são iguais.");
		}
		System.out.printf("O lado maior e " + ladoMaior);	
		
		//Perímetro
		
		
		System.exit(0);
	}
}
