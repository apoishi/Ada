package br.com.ada.pooii.controller;

import br.com.ada.pooii.domain.BaseTask;
import br.com.ada.pooii.domain.PersonalTask;
import br.com.ada.pooii.domain.WorkTask;
import br.com.ada.pooii.service.TaskService;
import java.util.List;

public class TaskController {
    private TaskService service;

    public TaskController(TaskService taskService) {
        service = taskService;
    }

    public void addTask(BaseTask task) {
        service.addTask(task);
    }

    public void removeTask(int taskId) {
        service.removeTask(taskId);
    }

    public void updateTask(BaseTask task) {
        service.updateTask(task);
    }
    public void displayAllTasks() {
        List<BaseTask> tasks = service.getAllTasks();
        if (tasks.isEmpty()) {
            System.out.println("Não há tarefas para exibir.");
        } else {
            System.out.println("Todas as tarefas:");
            for (BaseTask task : tasks) {
                displayTask(task);
            }
        }
    }

    private void displayTask(BaseTask task) {
        System.out.println("ID: " + task.getId());
        System.out.println("Título: " + task.getTitle());
        System.out.println("Descrição: " + task.getDescription());
        System.out.println("Prazo: " + task.getDeadline());
        if (task instanceof PersonalTask) {
            System.out.println("Tipo: Pessoal");
        } else if (task instanceof WorkTask) {
            System.out.println("Tipo: Trabalho");
        } else {
            System.out.println("Tipo: Desconhecido");
        }
        System.out.println("----------------------------------");
    }
}
