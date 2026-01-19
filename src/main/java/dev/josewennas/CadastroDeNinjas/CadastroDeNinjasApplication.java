package dev.josewennas.CadastroDeNinjas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadastroDeNinjasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroDeNinjasApplication.class, args);
	}

    //olá Wennas!
    int numero = 6;
    int soma;
    public int soma(){
        return soma = numero + numero;
    }

    int divisao;

    public int divisao(){
        return divisao = numero / 2 ;
    }

    int multiplicacao;

    public int multiplicacao(){
        return multiplicacao = numero * 2;
    }

    public int maiorMenor(){
        if(multiplicacao > 0){
            return multiplicacao;
        }else {
            return soma;
        }
    }

}
