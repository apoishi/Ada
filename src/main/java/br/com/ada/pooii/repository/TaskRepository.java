package br.com.ada.pooii.repository;

import br.com.ada.pooii.domain.BaseTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskRepository {
    private List<BaseTask> tasks;
    private int nextId = 1;

    public TaskRepository() {
        tasks = new ArrayList<>();
    }

    public void addTask(BaseTask task) {
        task.setId(nextId++);
        tasks.add(task);
    }

    public void removeTask(int taskId) {
        Iterator<BaseTask> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            BaseTask task = iterator.next();
            if (task.getId() == taskId) {
                iterator.remove();
                return;
            }
        }
    }

    public void updateTask(BaseTask updatedTask) {
        for (int i = 0; i < tasks.size(); i++) {
            BaseTask task = tasks.get(i);
            if (task.getId() == updatedTask.getId()) {
                tasks.set(i, updatedTask);
                return;
            }
        }
    }

    public List<BaseTask> getAllTasks() {
        return tasks;
    }

    public BaseTask getTaskById(int taskId) {
        for (BaseTask task : tasks) {
            if (task.getId() == taskId) {
                return task;
            }
        }
        return null;
    }
}
