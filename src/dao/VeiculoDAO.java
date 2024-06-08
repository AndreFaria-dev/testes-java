package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import classes.Veiculo;


public class VeiculoDAO {
	private static final String FILE_NAME="veiculo.txt";
	private List<Veiculo> veiculos;
	
    public VeiculoDAO(){
        veiculos = new ArrayList<>();
        carregarArq();
    }

    private void carregarArq(){
        try(BufferedReader ler = new BufferedReader(new FileReader(FILE_NAME))){
            String linha;
            while ((linha = ler.readLine()) !=null ){
                veiculos.add(Veiculo.conversao(linha));
            }
        }catch (IOException e){
            System.out.println("Nenhum arquivo de veiculos encontrado, criando novo");
        }
    }
}
