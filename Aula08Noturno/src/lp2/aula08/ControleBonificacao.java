/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula08;

/**
 *
 * @author Danilo Abreu
 */
public class ControleBonificacao {
    private double totalBonificacao=0;

    public double getTotalBonificacao() {
        return totalBonificacao;
    }
       
    public void setTotalBonificacao(Funcionario f) {
        this.totalBonificacao += f.getBonificacao();
    }
    
    
}
