package com.todo;

import com.todo.model.Task;
import com.todo.service.TaskService;

public class Main {
    public static void main(String[] args) {
        
        TaskService test = new TaskService();

        test.addToTask("Faculdade", "Alisson", "Estudar para prova");

        test.addToTask("Curso", "Caio", "Fazer projeto");

        test.addToTask("Ingles", "Joao", "Rever Aula");

        System.out.println(test.viewTask());

        test.removeTask("Caio");

        System.out.println(test.viewTask());
    }
}