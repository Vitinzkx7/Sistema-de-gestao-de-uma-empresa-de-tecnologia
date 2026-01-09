# Sistema de Gestão de Funcionários - Empresa de Tecnologia

![Java](https://img.shields.io/badge/Java-17-red?logo=java)
![Maven](https://img.shields.io/badge/Maven-Build-blue?logo=apachemaven)
![IDE](https://img.shields.io/badge/IDE-IntelliJ%20IDEA%202025.2-black?logo=intellijidea)
![License](https://img.shields.io/badge/license-Educational-green)
![Status](https://img.shields.io/badge/status-Completed-success)

> Projeto desenvolvido em **Java 17 com Maven**, simulando o sistema de gestão de funcionários de uma empresa de tecnologia.  
> O sistema utiliza **herança**, **interfaces**, **polimorfismo** e **JOptionPane** para criar uma interface simples e funcional.

---

##  Conceitos de POO Aplicados

| Conceito | Aplicação |
|-----------|------------|
| **Abstração** | Classe `Funcionario` define a estrutura comum. |
| **Herança** | Classes `Desenvolvedor`, `Gerente` e `Estagiario` herdam de `Funcionario`. |
| **Polimorfismo** | Métodos sobrescritos exibem comportamento específico. |
| **Interface** | `Bonus` garante contrato para cálculo de bônus. |
| **Encapsulamento** | Atributos com acesso protegido e métodos controlados. |

---

##  Estrutura de Classes

###  Classe Abstrata: `Funcionario`
Atributos: `nome`, `salarioBase`  
Métodos:  
- `exibirDados()`  
- `calcularSalarioFinal()` *(abstrato)*

---

###  Classe: `Desenvolvedor`
- Atributo adicional: `nivel` → Junior, Pleno ou Senior
###  Classe: `Gerente`
- Atributo adicional: `departamento`
- Regras:
  - Salário final: +30%
  - Bônus: 15% do salário final

---

###  Classe: `Estagiario`
- Atributos adicionais: `nomeEscola`, `mesesEstagio`
- Regras:
  - Salário final é apenas o salário base
  - Não possui bônus

---

##  Interface (via `JOptionPane`)

O sistema é totalmente interativo e usa janelas gráficas para entrada e saída de dados.  




# # Ideias Futuras

Persistência em arquivo .json ou .txt

Conexão com Banco de Dados MYSQL

Relatórios em PDF com iText

Sistema de login (usuário/senha) com Spring Boot ou JWT

 Este projeto foi desenvolvido para a disciplina “Laboratório de Técnicas de Programação Orientada a Objetos”, ministrada pela professora Débora Pereira Coura.
