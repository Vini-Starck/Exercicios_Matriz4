package exercicioapii_matriz6;


public class ExercicioAPII_matriz6 {
    public static void main(String[] args) {
        int [][] a = new int[5][5];
        int [][] b = new int[5][5];
        
        
        
        matriz.inserir(a);
        System.out.println("\n=== Matriz A ===\n");
        matriz.exibir(a);
        matriz.inserir(b);
        System.out.println("\n=== Matriz B ===\n");
        matriz.exibir(b);
        System.out.println("\n=== Matrizes somadas ===\n");
        matriz.somarMatriz(a, b);
    }
}
