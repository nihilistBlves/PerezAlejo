package org.PerezAlejo.tema9.ej01;

public class PruebaRefactorizada {

	public static void main(String[] args) {
		new PruebaRefactorizada().f();
	}

	private void printSeparador(String caracter, int cantidadSaltos, int cantidadCaracteres) {
		for (int i = 0; i < cantidadSaltos; i++) {
			for (int j = 0; j < cantidadCaracteres; j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
	} 
	
    private void f() {
    	printSeparador("=", 2, 15);
        System.out.println("TEMA 1. CONTROL de VERSIONES");
        printSeparador("=", 2, 15);
        System.out.println("1. Conceptos generales");
        printSeparador("*", 1, 7);
        System.out.println("2. Repositorio centralizado. SVN");
        printSeparador("*", 1, 7);
        System.out.println("3. Repositorio distribuido. GIT");
        printSeparador("=", 2, 15);
        System.out.println("\n\n");
        printSeparador("=", 2, 20);
        System.out.println("REFACTORIZACIÓN");
        printSeparador("=", 2, 20);
        System.out.println("1. Bad smells");
        printSeparador("*", 1, 7);
        System.out.println("2. Refactorizaciones habituales");
        printSeparador("*", 1, 7);
        System.out.println("3. Refactorizando con Eclipse");
        printSeparador("=", 2, 20);
    }

}
