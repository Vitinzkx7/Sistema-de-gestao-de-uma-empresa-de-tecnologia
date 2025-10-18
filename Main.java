package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        boolean executando = true;

        while (executando) {
            String opcao = JOptionPane.showInputDialog("""
                    ===== MENU PRINCIPAL =====
                    1 - Cadastrar Funcionário
                    2 - Listar Funcionários
                    3 - Testar Funcionários
                    4 - Sair
                    Escolha uma opção:""");

            if (opcao == null) break; // caso o usuário cancele

            switch (opcao) {
                case "1" -> cadastrarFuncionario(funcionarios);
                case "2" -> listarFuncionarios(funcionarios);
                case "3" -> testarFuncionarios(funcionarios);
                case "4" -> {
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema. Até logo!");
                    executando = false;
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrarFuncionario(List<Funcionario> funcionarios) {
        String tipo = JOptionPane.showInputDialog("""
                Tipo do Funcionário:
                1 - Desenvolvedor
                2 - Gerente
                3 - Estagiário""");

        if (tipo == null) return;

        String nome = JOptionPane.showInputDialog("Nome:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário base:"));

        switch (tipo) {
            case "1" -> {
                String nivel = JOptionPane.showInputDialog("Nível (Junior / Pleno / Senior):");
                funcionarios.add(new Desenvolvedor(nome, salario, nivel));
            }
            case "2" -> {
                String dep = JOptionPane.showInputDialog("Departamento:");
                funcionarios.add(new Gerente(nome, salario, dep));
            }
            case "3" -> {
                String escola = JOptionPane.showInputDialog("Nome da escola:");
                int meses = Integer.parseInt(JOptionPane.showInputDialog("Meses de estágio:"));
                funcionarios.add(new Estagiario(nome, salario, escola, meses));
            }
            default -> JOptionPane.showMessageDialog(null, "Tipo inválido! Funcionário não cadastrado.");
        }
    }

    private static void listarFuncionarios(List<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado ainda.");
            return;
        }

        StringBuilder lista = new StringBuilder("===== LISTA DE FUNCIONÁRIOS =====\n");
        for (Funcionario f : funcionarios) {
            lista.append(f.getClass().getSimpleName())
                    .append(": ").append(f.nome)
                    .append(" — Salário Base: R$ ").append(f.salarioBase)
                    .append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    private static void testarFuncionarios(List<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado para testar.");
            return;
        }

        for (Funcionario f : funcionarios) {
            if (f instanceof Gerente g) {
                JOptionPane.showMessageDialog(null,
                        g.nome + " é um Gerente.\nBônus: R$ " + g.calcularBonus());
            } else if (f instanceof Desenvolvedor d) {
                JOptionPane.showMessageDialog(null,
                        d.nome + " é um Desenvolvedor.\nBônus: R$ " + d.calcularBonus());
            } else if (f instanceof Estagiario e) {
                JOptionPane.showMessageDialog(null,
                        e.nome + " é um Estagiário.\nNão recebe bônus.");
            }
        }
    }
}
