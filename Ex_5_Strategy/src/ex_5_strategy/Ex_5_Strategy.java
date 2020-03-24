/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_5_strategy;

import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class Ex_5_Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Informe o valor da nota: ");
            double valor = entrada.nextDouble();
            System.out.print("Informe a UF (1 - SP; 2 - RJ; 3 - CE: ");
            int opcaoUF = entrada.nextInt();
            TipoUf tipoUf = TipoUf.values()[opcaoUF - 1]; 
            
            Uf uf = tipoUf.obterUf();
            double imposto = uf.calculaImposto(valor);
            System.out.println("O valor do imposto é:  R$" + imposto);
        }
    }
    
}
