package org.example;

import javax.swing.*;

public class Desenvolvedor extends Funcionario {
    private String nivel;

    public Desenvolvedor(String nome, double salarioBase, String nivel) {
        super(nome, salarioBase);
        this.nivel = nivel;
    }

    public double calcularBonus() {
        return switch (nivel.toLowerCase()) {
            case "junior" -> salarioBase * 0.05;
            case "pleno" -> salarioBase * 0.10;
            case "senior" -> salarioBase * 0.15;
            default -> 0;
        };
    }

    @Override
    public void exibirDados() {
        JOptionPane.showMessageDialog(null,
                "Desenvolvedor: " + nome +
                        "\nNível: " + nivel +
                        "\nSalário Base: R$ " + salarioBase +
                        "\nBônus: R$ " + calcularBonus());
    }
}
