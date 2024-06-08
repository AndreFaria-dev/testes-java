package exercicio_pratico_java;

import java.util.Scanner;

import classes.Caminhao;
import classes.Onibus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Enviar a pasta src zipada para o professor
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Criar Veiculo");
            System.out.println("2. Listar Veiculos");
            System.out.println("3. Atualizar Veiculo");
            System.out.println("4. Deletar Veiculo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            int option = scanner.nextInt();  // Lê a opção escolhida
            scanner.nextLine();  // Consumir nova linha
            
            switch (option) {
			case 1: {
				System.out.flush(); //Limpar e reescrever
				System.out.println("0. Criar Veiculo Generico");
	            System.out.println("1. Criar Onibus");
	            System.out.println("2. Criar Caminhao");
	            option = scanner.nextInt();
	            scanner.nextLine();
	            
	            int ano;
	            int quantidade;
	            String placa;
	            
	            switch (option) {
	            	case 1: //Onibus
	            		
	            		System.out.flush();
	    	            System.out.println("1. Informe o ano");
	    	            ano = scanner.nextInt();
	    	            
	    	            System.out.println("2. Informe a placa");
	    	            placa = scanner.next();
	    	            
	    	            System.out.println("2. Informe o n. de assentos");
	    	            quantidade = scanner.nextInt();
	    	            
	    	            Onibus onibus = new Onibus(placa,ano);
	    	            onibus.setAssentos(quantidade);
	    	            
	            	break;
	            	case 2:
	            		System.out.flush();
	            		
	    	            System.out.println("1. Informe o ano");
	    	            ano = scanner.nextInt();
	    	            
	    	            System.out.println("2. Informe a placa");
	    	            placa = scanner.next();
	    	            
	    	            System.out.println("2. Informe a quantidade de eixos");
	    	            quantidade = scanner.nextInt();
	    	            
	    	            Caminhao caminhao = new Caminhao(placa, quantidade, ano);
	    	            
	    	            //Gravar no arquivo
	            	break;
	            	
	            	default:
	            		System.out.flush();
	    	            System.out.println("1. Informe o ano");
	    	            scanner.nextInt();
	    	            
	    	            System.out.println("2. Informe a placa");
	    	            scanner.next();
	            		break;
	            }
	            
				break;
			}
			default:
				System.out.println("Saindo...");
			}
		}
	}

}
