package org.example;

import javax.swing.*;

public class Estagiario extends Funcionario {
    private String escola;
    private int mesesEstagio;

    public Estagiario(String nome, double salarioBase, String escola, int mesesEstagio) {
        super(nome, salarioBase);
        this.escola = escola;
        this.mesesEstagio = mesesEstagio;
    }

    @Override
    public void exibirDados() {
        JOptionPane.showMessageDialog(null,
                "Estagiário: " + nome +
                        "Escola: " + escola +
                        "Meses de Estágio: " + mesesEstagio +
                        "Salário Base: R$ " + salarioBase +
                        "Não recebe bônus.");
    }
}
