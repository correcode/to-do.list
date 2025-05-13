package com.todo.service;


import java.util.ArrayList;
import java.util.List;

import com.todo.model.Task;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class TaskService {
    
    List<Task> taskList = new ArrayList<>();

    public void addToTask(String name, String id, String description) {
        this.taskList.add(new Task(name, id, description));
    }

    public List<Task> viewTask() {
        return taskList;
    }

    public List<Task> findToTask(String name) {
        Task findToTask = taskList.stream()
            .filter(t -> t.getName().equalsIgnoreCase(name))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Task Not Found"));

        return List.of(findToTask);
    }

    public List<Task> removeTask(String id) {
        Task taskToRemove = taskList.stream()
            .filter(t -> t.getId().equals(id))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Task Not Found"));

        taskList.remove(taskToRemove);
        return taskList;
    }



}
