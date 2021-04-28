package exercicioapii_matriz6;

import java.util.Random;


public class matriz {
    
    
    public static void inserir(int [][] m){
        
        Random rd = new Random();
        
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                m[i][j] = rd.nextInt(10); // gera números de 0 a 20.
            }
        }
    }
    
    public static void somarMatriz(int [][]a, int[][] b){
        int [][]c=new int[a.length][a[0].length];
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        exibir(c);
    }
    
    
    public static void exibir(int [][] m){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
