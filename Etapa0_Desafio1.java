import java.util.Scanner; 
public class Desafio {
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o número de verificações"); //Retirar para envio
        int n = input.nextInt(); 
        verificador(n);
        
    }
    
    public static void verificador(int num) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o resultado do teste GADO"); //Tirar depois de testar
 
        int dano = 0;
        
        for(int i = 0; i < num; i++) {
            
            String result = input.nextLine();
            char[] verif = result.toCharArray();
            
            for (int j = 0; j < verif.length; j++) {
                
                if (verif[j] == '+') { 
                    dano++;
                }
                
            }
            
            if (dano != 0) {
                System.out.println("Dano de nivel " + dano);
            }
            
            else {
                System.out.println("O combustivel nao possui dano");
            }
            
            dano = 0;
            
        }
        
    }
    
}
