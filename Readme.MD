# 📝 To-Do List - Projeto Simples em Java

Este é um projeto simples de gerenciamento de tarefas (To-Do List) desenvolvido em Java, utilizando os conceitos de orientação a objetos e a biblioteca Lombok para simplificar o código.

## 📦 Estrutura do Projeto

- `Main.java`: Classe principal com exemplos de uso da aplicação.
- `Task.java`: Classe modelo que representa uma tarefa, contendo:
  - `name`: nome da tarefa
  - `id`: identificador único
  - `description`: descrição da tarefa
- `TaskService.java`: Classe responsável por gerenciar as tarefas:
  - Adicionar tarefas
  - Listar todas as tarefas
  - Buscar tarefa por nome
  - Remover tarefa por ID

## 🚀 Funcionalidades

- ✅ Adicionar nova tarefa
- 📋 Listar tarefas existentes
- 🔍 Buscar tarefa por nome
- ❌ Remover tarefa por ID

## 🛠 Tecnologias Utilizadas

- Java 17+ (ou compatível)
- [Lombok](https://projectlombok.org/) - para geração automática de getters, setters e construtores

## ▶️ Como Executar

1. Certifique-se de que o Lombok esteja instalado e configurado na sua IDE (como IntelliJ ou Eclipse).
2. Compile os arquivos `.java`.
3. Execute a classe `Main` para ver o funcionamento do projeto.

```bash
javac com/todo/model/Task.java com/todo/service/TaskService.java com/todo/Main.java
java com.todo.Main
