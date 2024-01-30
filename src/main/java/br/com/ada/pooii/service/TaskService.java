package br.com.ada.pooii.service;

import br.com.ada.pooii.domain.BaseTask;
import br.com.ada.pooii.repository.TaskRepository;
import java.util.List;

public class TaskService {
    private TaskRepository repository;

    public TaskService(TaskRepository repo) {
        repository = repo;
    }

    public void addTask(BaseTask task) {
        repository.addTask(task);
    }

    public void removeTask(int taskId) {
        repository.removeTask(taskId);
    }

    public void updateTask(BaseTask task) {
        repository.updateTask(task);
    }

    public List<BaseTask> getAllTasks() {
        return repository.getAllTasks();
    }

    public BaseTask getTaskById(int taskId) {
        return repository.getTaskById(taskId);
    }
}

