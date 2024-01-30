package br.com.ada.pooii;

import br.com.ada.pooii.controller.TaskController;
import br.com.ada.pooii.domain.PersonalTask;
import br.com.ada.pooii.domain.WorkTask;
import br.com.ada.pooii.domain.BaseTask;
import br.com.ada.pooii.service.TaskService;
import br.com.ada.pooii.repository.TaskRepository;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskRepository repository = new TaskRepository();
        TaskService service = new TaskService(repository);
        TaskController controller = new TaskController(service);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Atualizar tarefa");
            System.out.println("4 - Exibir todas as tarefas");
            System.out.println("0 - Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Saindo do programa.");
                    return;
                case 1:
                    addTask(scanner, controller);
                    break;
                case 2:
                    removeTask(scanner, controller);
                    break;
                case 3:
                    updateTask(scanner, controller);
                    break;
                case 4:
                    controller.displayAllTasks();
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        }
    }

    private static void addTask(Scanner scanner, TaskController controller) {
        System.out.println("Digite o título da tarefa:");
        String title = scanner.nextLine();
        System.out.println("Digite a descrição da tarefa:");
        String description = scanner.nextLine();
        System.out.println("Digite o prazo da tarefa (dd/mm/aaaa):");
        String deadlineStr = scanner.nextLine();
        Date deadline = parseDate(deadlineStr);
        System.out.println("Digite o tipo da tarefa (P para pessoal, W para trabalho):");
        String taskType = scanner.nextLine();
        BaseTask taskToAdd;
        if (taskType.equalsIgnoreCase("P")) {
            taskToAdd = new PersonalTask();
        } else if (taskType.equalsIgnoreCase("W")) {
            taskToAdd = new WorkTask();
        } else {
            System.out.println("Tipo de tarefa inválido.");
            return;
        }
        taskToAdd.setTitle(title);
        taskToAdd.setDescription(description);
        taskToAdd.setDeadline(deadline);
        controller.addTask(taskToAdd);
        System.out.println("Tarefa adicionada com sucesso.");
    }

    private static void removeTask(Scanner scanner, TaskController controller) {
        System.out.println("Digite o ID da tarefa a ser removida:");
        int taskIdToRemove = scanner.nextInt();
        controller.removeTask(taskIdToRemove);
        System.out.println("Tarefa removida com sucesso.");
    }

    private static void updateTask(Scanner scanner, TaskController controller) {
        System.out.println("Digite o ID da tarefa a ser atualizada:");
        int taskIdToUpdate = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o novo título da tarefa:");
        String updatedTitle = scanner.nextLine();
        System.out.println("Digite a nova descrição da tarefa:");
        String updatedDescription = scanner.nextLine();
        System.out.println("Digite o novo prazo da tarefa (dd/mm/aaaa):");
        String updatedDeadlineStr = scanner.nextLine();
        Date updatedDeadline = parseDate(updatedDeadlineStr);
        System.out.println("Digite o novo tipo da tarefa (P para pessoal, W para trabalho):");
        String updatedTaskType = scanner.nextLine();
        BaseTask updatedTask;
        if (updatedTaskType.equalsIgnoreCase("P")) {
            updatedTask = new PersonalTask();
        } else if (updatedTaskType.equalsIgnoreCase("W")) {
            updatedTask = new WorkTask();
        } else {
            System.out.println("Tipo de tarefa inválido.");
            return;
        }
        updatedTask.setId(taskIdToUpdate);
        updatedTask.setTitle(updatedTitle);
        updatedTask.setDescription(updatedDescription);
        updatedTask.setDeadline(updatedDeadline);
        controller.updateTask(updatedTask);
        System.out.println("Tarefa atualizada com sucesso.");
    }

    private static Date parseDate(String dateString) {
        return new Date();
    }
}
