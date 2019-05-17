package banco;

import java.util.Scanner;
public class Banco {

	public static void main(String[] args) {
		
	        Scanner input = new Scanner(System.in);
	        int opcaoLaco = 1;
	        int opcaoMenu = 0;
	        int id = 0, opcaoLoop = -1, opcaoSubMenu = -1, idade;
	        float valorRef;
	        String tipo, generoMusical, descricao, nome, telefone, email, titulo, local, data, hora, cnpj;
	        
	       while(opcaoLaco != 0){
	           
	    	   System.out.println("Bem-vindo, escolha uma opÃ§Ã£o do menu.");
		       System.out.println("---------------Menu----------------\n"
		                            + "[1]-Registra mÃºsico \n"
		                            + "[2]-Procurar MÃºsico \n"
		                            + "[3]-Atualizar dados de um  mÃºsico \n"
		                            + "[4]-Deletar mÃºsico \n"
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
		                            + "[18]-Listar propostas de um mÃºsico \n"
		                            + "[19]-Listar propostas de um promotor \n"
		                            + "[20]-Atualizar dados de uma proposta \n"
		                            + "[21]-Deletar proposta \n"
		                            + "[22]-Finalizar acordo \n "
		                            + "[0]-Sair\n"
		                            + "----------------------------------------");
		        					opcaoMenu = input.nextInt();
	           
	           
	         switch(opcaoMenu){
	             
	            case 0:
	                    System.out.println("Obrigado por utilizar o sistema, volte sempre!!!");
	                    opcaoLaco = 0 ;
	                    break;
	                    
	            case 1:
//	                String nome = null, telefone = null, email = null, tipo = null, descricao = null, generoMusical = null;
//	                int Id;
	            	System.out.println("[1] Registrar Musico");
	            	System.out.println("######################");
	            	input.nextLine(); //Limpando o scanner.
	            	
	            	System.out.println("Digite o seu nome:");
	                nome = input.nextLine();
	                System.out.println("Digite o seu telefone:");
	                telefone = input.nextLine();
	                System.out.println("Digite a sua idade:");
	                idade = input.nextInt();
	                System.out.println("Digite o seu email:");
	                email = input.nextLine();
	                input.nextLine(); //Limpando o scanner.
	                System.out.println("Digite o seu tipo:");
	                tipo = input.nextLine();
	                System.out.println("Digite a sua descrição:");
	                descricao = input.nextLine();
	                System.out.println("Digite o seu gênero musical:");
	                generoMusical = input.nextLine();
	                break;
	            
	            case 2:
	            	  System.out.println("[2] Procurar Musico");
	            	  System.out.println("######################");
	                  System.out.println("Digite o id do músico:");
	                  id = input.nextInt();
//	                MÉTODO PARA PROCURAR O MÚSICO.
	                  break;
	            
	            case 3:
	            	System.out.println("[3] Atualizar dados do músico");
	          	  	System.out.println("######################");
	          	  	
	          	  	System.out.println("Digite o id do musico que deseja alterar:");
	        	  	id = input.nextInt();
	        	  	
	            	while (opcaoLoop!=0){
	                  System.out.println("Digite qual dado você deseja alterar:");
	                  System.out.println("[1] Nome");
	                  System.out.println("[2] Telefone ");
	                  System.out.println("[3] Idade ");
	                  System.out.println("[4] Email ");
	                  System.out.println("[5] Tipo ");
	                  System.out.println("[6] Gênero Musical");
	                  System.out.println("[7] Descricao");
	                  System.out.println("[0] Sair");
	                  opcaoSubMenu = input.nextInt();
	                  
	                  switch (opcaoSubMenu){
	                  	case 0:
	                  		opcaoLoop = 0;
	                  		break;
	                  	case 1:
	                  		break;
	                  	case 2:
	                  		break;
	                  	case 3:
	                  		break;
	                  	case 4:
	                  		break;
	                  	case 5:
	                  		break;
	                  	case 6:
	                  		break;
	                  	case 7:
	                  		break;
	                  	default:
	                  		break;
	                  }
//	                  SWITCH CASE.
	            	}
	            	break;
	            
	            case 4:
	            	System.out.println("[4] Deletar Musico");
	            	System.out.println("######################");
	            	System.out.println("Digite o id do músico:");
	                id = input.nextInt();
//	                MÉTODO DE DELETAR.
	                break;
	                          
	            case 5:
	                System.out.println("[5]-Criar evento");
	                System.out.println("######################");
	                System.out.println("Digite o id do promotor ao qual você quer vincular o evento:");
	                id = input.nextInt();
	                input.nextLine(); //Limpando o scanner.
//	                BUSCA O CONTRATANTE, CASO FOR NULL, RETORNA UMA EXCEÇÃO.
	                System.out.println("Digite o titulo do evento:");
	                titulo = input.nextLine();
	                System.out.println("Digite a data do evento:");
	                data = input.nextLine();
	                System.out.println("Digite a hora do evento:");
	                hora = input.nextLine();
	                System.out.println("Digite a descricao do evento:");
	                descricao = input.nextLine();
	                System.out.println("Digite o valor de referência do evento:");
	                valorRef = input.nextFloat();
	                input.nextLine(); //Limpando o scanner.
	                System.out.println("Digite o local do evento:");
	                local = input.nextLine();
	                break; 
	             
	            case 6:
	                System.out.println("[6]-Procurar evento");
	                System.out.println("######################");
	                System.out.println("Digite o id do evento:");
	                id = input.nextInt();
	                break; 
	             
	            case 7:
	                System.out.println("[7]-Listar eventos");
	                System.out.println("######################");
	                System.out.println("Listagem.");
	                 break; 
	             
	            case 8:
	                System.out.println("[8]-Atualizar dados de um evento");
	          	  	System.out.println("######################");
	          	  	
	          	  	System.out.println("Digite o id do evento que você deseja alterar:");
	          	  	id = input.nextInt();
	          	  	
	            	while (opcaoLoop!=0){
	                  System.out.println("Digite qual dado você deseja alterar:");
	                  System.out.println("[1] Titulo");
	                  System.out.println("[2] Descricao ");
	                  System.out.println("[3] Data ");
	                  System.out.println("[4] Hora ");
	                  System.out.println("[5] Valor de referência ");
	                  System.out.println("[6] Local");
	                  System.out.println("[0] Sair");
	                  opcaoSubMenu = input.nextInt();
	                  
	                  switch (opcaoSubMenu){
	                  	case 0:
	                  		opcaoLoop = 0;
	                  		break;
	                  	case 1:
	                  		break;
	                  	case 2:
	                  		break;
	                  	case 3:
	                  		break;
	                  	case 4:
	                  		break;
	                  	case 5:
	                  		break;
	                  	case 6:
	                  		break;
	                  	default:
	                  		break;
	                  }
	            	}
	                break;
	             
	            case 9:
	            	System.out.println("[10]-Deletar evento");
	                System.out.println("######################");
	            	System.out.println("Digite o id do evento:");
	                id = input.nextInt();
//	                MÉTODO DE DELETAR.
	                break; 
	             
	            case 10:
	                System.out.println("[10]-Registrar promotor");
	                System.out.println("######################");
	                System.out.println("Digite o nome do promotor:");
	                nome = input.nextLine();
	                input.nextLine(); //Limpando o scanner.
	                System.out.println("Digite o idade do promotor:");
	                idade = input.nextInt();
	                input.nextLine(); //Limpando o scanner.
	                System.out.println("Digite o telefone do promotor:");
	                telefone = input.nextLine();
	                System.out.println("Digite o email do promotor:");
	                email = input.nextLine();
	                System.out.println("Digite o cnpj do promotor:");
	                cnpj = input.nextLine();
	                break; 
	             
	            case 11:
	                System.out.println("[11]-Procurar promotor");
	                System.out.println("######################");
	            	System.out.println("Digite o id do promotor:");
	                id = input.nextInt();
	                break; 
	             
	            case 12:
	                System.out.println("[12]-Listar promotores");
	                System.out.println("######################");
	                System.out.println("Listagem");
	                break; 
	                    
	            case 13:
	                System.out.println("[13]-Atualizar dados do promotor");
	                System.out.println("######################");
	                
	                System.out.println("Digite o id do promotor você que deseja alterar:");
	          	  	id = input.nextInt();
	          	  	
	            	while (opcaoLoop!=0){
	                  System.out.println("Digite qual dado você deseja alterar:");
	                  System.out.println("[1] Nome");
	                  System.out.println("[2] Idade");
	                  System.out.println("[3] Telefone");
	                  System.out.println("[4] Email");
	                  System.out.println("[5] CPNJ");
	                  System.out.println("[0] Sair");
	                  opcaoSubMenu = input.nextInt();
	                  
	                  switch (opcaoSubMenu){
	                  	case 0:
	                  		opcaoLoop = 0;
	                  		break;
	                  	case 1:
	                  		break;
	                  	case 2:
	                  		break;
	                  	case 3:
	                  		break;
	                  	case 4:
	                  		break;
	                  	case 5:
	                  		break;
	                  	default:
	                  		break;
	                  }
	            	}
	                break;       
	                    
	            case 14:
	                System.out.println("[14]-Deletar promotor");
	                System.out.println("######################");
	            	System.out.println("Digite o id do promotor:");
	            	id = input.nextInt();
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
	                System.out.println("[18]-Listar propostas de um mÃºsico");
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
	             default: 
	            	 break;
	         } 
	           

	           
	       }
	}
}