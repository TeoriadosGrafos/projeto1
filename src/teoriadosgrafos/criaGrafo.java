
package teoriadosgrafos;

import java.util.Scanner;


public class criaGrafo {
    
    

    public static void main(String[] args) {
        
        int qV;
        int A1= 0;
        int A2= 0;
        int l=0;
        int c=0;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print ("Digite o numero de Vertices do grafo \n");
        qV = leia.nextInt();
        
        // criar grafo
        
        int m[][] = new int[qV+1][qV+1];
        
         for (int i=0;i< (qV+1);i++) {
            for (int j=0;j< (qV+1);j++){
               
                if(i == 0){
                    m[i][j] = l;
                    l++;
                }
                if ( j == 0) {
                    m[i][j] = c;
                    c++;
                }
                
                
            }
        }
         
        System.out.println ("Informe as ligações a serem adicionadas no grafos. "
                + "Cada ligação é uma aresta, caso queira parar de adicionar ligações"
                + "digite 0 em uma das arestas");
        
        // Adicioanr ligação
        while (A1!=-1 || A2!=-1) {
        System.out.println (" Digite o primeiro Vertice ");
        
        A1 = leia.nextInt();
        
        System.out.println (" liga no vertice");
        A2 = leia.nextInt();
        
         for (int i=0;i< (qV+1);i++) {
            for (int j=0;j< (qV+1);j++){
                if(i==A1 && j==A2) {
                    m[i][j] = 1;
                }  
            }
        } 
    }
        
        System.out.println  ("Grafo ----- \n");
        
        //imprimir grafo
                
        for (int i=0;i< (qV+1);i++) {
            for (int j=0;j< (qV+1);j++){
                System.out.print (" "+ m[i][j]);
            }
            System.out.println ("");
        }
        
    }
    
}
