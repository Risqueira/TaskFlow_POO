# Programa Task Flow

## Techlabs Software House

### Dev group 4

O programa Task flow, da *Techlabs Software House*, consiste de um sistema de organização de tarefas pessoais.
Focando na função de simplificar a distribuição e organização de tarefas. Com funções como filtragem e alteração de tarefas pós criação.
O programa é focado na simplicidade, com uma interface feita completamente em Java e integrado com Banco de dados pessoal, para individualização do sistema.

### SM: Henrique Rodrigues

### PO: Arthur Vargas

Dev Team: Vitor Harthmann, Bruno Soares, Otavio Martins, Gabriel Brandão

---

## Tecnologias utilizadas

- ![Java]
- ![Swing]
- ![MySQL]
- ![JDBC]
- ![jBCrypt] (hash seguro de senhas)

## Estrutura do projeto

text
src/br/ulbra/
 ├─ dao/         → Classes DAO (AbstractDAO, CrudRepository, TarefaDao, UsuarioDAO)
 ├─ controller/  → Lógica de controle (UsuarioController, TarefaController)
 ├─ model/       → Modelos (Usuario.java, Tarefa.java)
 ├─ view/        → Interfaces gráficas (CadastroTarefasView, CadastroUsuarioView, DashboardView, LoginUsuarioView, MainView)


---

## Banco de Dados

sql
CREATE TABLE usuario(
    idusuario INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(150) NOT NULL UNIQUE,
    email VARCHAR(100),
    cargo VARCHAR(50) ,
    senha VARCHAR(100) NOT NULL
);

CREATE TABLE tarefa(
    idtarefa INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL UNIQUE,
    descricao text NULL,
    prioridade VARCHAR(20),
    status VARCHAR(20) NOT NULL UNIQUE,
    prazo date,
    idusuario INT(11) SECOND KEY
);

---
