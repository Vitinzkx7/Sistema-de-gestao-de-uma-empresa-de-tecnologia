package org.example;

import javax.swing.*;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salarioBase, String departamento) {
        super(nome, salarioBase);
        this.departamento = departamento;
    }

    public double calcularBonus() {
        return salarioBase * 0.20;
    }

    @Override
    public void exibirDados() {
        JOptionPane.showMessageDialog(null,
                "Gerente: " + nome +
                        "\nDepartamento: " + departamento +
                        "\nSalário Base: R$ " + salarioBase +
                        "\nBônus: R$ " + calcularBonus());
    }
}
