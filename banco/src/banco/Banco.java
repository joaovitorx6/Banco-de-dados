
package banco;
import java.util.Scanner;
public class Banco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcaoLaco = 1;
        int opcaoMenu = 0;
        
        System.out.println("Bem-vindo, escolha uma opção do menu.");
           System.out.println("---------------Menu----------------\n"
                            + "[1]-Registra músico \n"
                            + "[2]-Procurar Músico \n"
                            + "[3]-Atualizar dados de um  músico \n"
                            + "[4]-Deletar músico \n"
                            + "[5]-Criar evento \n"
                            + "[6]-Procurar evento \n"
                            + "[7]-Listar eventos \n"
                            + "[8]-Atualizar dados de um evento \n"
                            + "[9]-Deletar evento \n"
                            + "[10]-Registrar promotor \n"
                            + "[11]-Procurar promotor \n"
                            + "[12]-Listar promotores \n"
                            + "[13]-Atualizar dados do promotor \n"
                            + "[14]-Deletar promotor \n"
                            + "[15]-Criar proposta \n"
                            + "[16]-Procurar proposta \n"
                            + "[17]-Listar propostas de um evento \n"
                            + "[18]-Listar propostas de um músico \n"
                            + "[19]-Listar propostas de um promotor \n"
                            + "[20]-Atualizar dados de uma proposta \n"
                            + "[21]-Deletar proposta \n"
                            + "[22]-Finalizar acordo \n "
                            + "[0]-Sair\n"
                            + "----------------------------------------");
        
       while(opcaoLaco != 0){
           
           
           opcaoMenu = input.nextInt();
           
           
         switch(opcaoMenu){
             
            case 0:
                    System.out.println("Obrigado por utilizar o sistema, volte sempre!!!");
                    opcaoLaco = 0 ;
                    break;
                    
            case 1:
                String nome = null, telefone = null, email = null, tipo = null, descricao = null, generoMusical = null;
                int Id;
                System.out.println("[1]-Registra músico");
                  
                    break;
            
            case 2:
                  System.out.println("[2]-Procurar Músico ");
                    break;
            
            case 3:
                  System.out.println("[3]-Atualizar dados de um  músico");
                    break;
            
            case 4:
                  System.out.println("[4]-Deletar músico");
                    break;
                          
            case 5:
                System.out.println("[5]-Criar evento");
                    break; 
             
            case 6:
                System.out.println("[6]-Procurar evento");
                    break; 
             
            case 7:
                System.out.println("[7]-Listar eventos");
                    break; 
             
            case 8:
                System.out.println("[8]-Atualizar dados de um evento");
                    break;
             
            case 9:
                System.out.println("[9]-Deletar evento");
                    break; 
             
            case 10:
                System.out.println("[10]-Registrar promotor");
                    break; 
             
            case 11:
                System.out.println("[11]-Procurar promotor");
                    break; 
             
            case 12:
                System.out.println("[12]-Listar promotores");
                    break; 
                    
            case 13:
                System.out.println("[13]-Atualizar dados do promotor");
                    break;        
                    
            case 14:
                System.out.println("[14]-Deletar promoto");
                    break;        
                    
            case 15:
                System.out.println("[15]-Criar proposta");
                    break;        
                    
            case 16:
                System.out.println("[16]-Procurar proposta");
                    break;        
            case 17:
                System.out.println("[17]-Listar propostas de um evento");
                    break;  
            case 18:
                System.out.println("[18]-Listar propostas de um músico");
                    break;  
            case 19:
                System.out.println("[19]-Listar propostas de um promotor");
                    break;
            case 20:
                System.out.println("[20]-Atualizar dados de uma proposta");
                    break;
            case 21:
                System.out.println("[21]-Deletar proposta");
                    break;
                    
            case 22:
                System.out.println("[22]-Finalizar acordo");
                    break;        
                    
         } 
           

           
       }
       
       
    
     
        
    }
    
}
