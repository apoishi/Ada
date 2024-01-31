# AdaTask - Gerenciamento de Tarefas 📋✨

## Descrição

AdaTask é um aplicativo de console para gerenciamento de tarefas. Ele permite aos usuários criar, editar, deletar e visualizar tarefas pessoais e profissionais. O aplicativo simula um banco de dados em memória para armazenar as tarefas.

## Estrutura do Projeto 🏗️

O projeto está dividido em camadas:

- **Camada de Domain (Domínio):**
  - Contém as classes que representam as tarefas e suas regras de negócio.
    - `BaseTask.java`: Classe abstrata que define os atributos básicos de uma tarefa.
    - `PersonalTask.java`: Subclasse de `BaseTask` que representa uma tarefa pessoal.
    - `WorkTask.java`: Subclasse de `BaseTask` que representa uma tarefa de trabalho.
    - `StudyTask.java`: Subclasse de `BaseTask` que representa uma tarefa de estudo.
- **Camada de Repository (Repositório):**
  - Responsável pela "persistência" dos dados em listas.
    - `TaskRepository.java`: Classe que simula o armazenamento das tarefas em listas.
- **Camada de Service (Serviço):**
  - Contém a lógica de aplicação, como operações de manipulação de tarefas.
    - `TaskService.java`: Classe que implementa a lógica de negócio para manipulação das tarefas.
- **Camada de Controller (Controlador):**
  - Gerencia a interação do usuário com o sistema via console.
    - `TaskController.java`: Classe responsável por processar a entrada do usuário e comandar as operações correspondentes.

## Principais Funcionalidades ✅

- Criação de Tarefas: Adicionar novas tarefas com detalhes como título, descrição, prazo, etc.
- Edição de Tarefas: Atualizar detalhes de tarefas existentes.
- Remoção de Tarefas: Deletar tarefas existentes.
- Visualização de Tarefas: Listar todas as tarefas.

## Como Executar ▶️

1. Clone o repositório para sua máquina local.
2. Compile o código-fonte Java.
3. Execute o arquivo Main.java para iniciar o aplicativo.
4. Siga as instruções exibidas no console para interagir com o aplicativo.

## Requisitos do Sistema ⚙️

- Java Development Kit (JDK) 8 ou superior instalado.

## Fluxo de Uso 🔄

1. **Execução do Programa:**
   - O usuário executa o programa Java, geralmente através do arquivo `Main.java`, utilizando um ambiente de desenvolvimento integrado (IDE) ou linha de comando.
   
2. **Interatividade via Console:**
   - Após iniciar o programa, o usuário é apresentado com um menu de opções no console, onde ele pode escolher a operação desejada.
   - As opções podem incluir:
     - Adicionar uma nova tarefa.
     - Remover uma tarefa existente.
     - Atualizar os detalhes de uma tarefa.
     - Exibir todas as tarefas cadastradas.
   
3. **Adição de Tarefas:**
   - Para adicionar uma nova tarefa, o usuário seleciona a opção correspondente no menu.
   - Ele é solicitado a fornecer informações sobre a nova tarefa, como título, descrição, prazo e tipo (pessoal ou trabalho).
   - Após inserir os dados, a tarefa é criada e adicionada à lista de tarefas.
   
4. **Remoção de Tarefas:**
   - Para remover uma tarefa existente, o usuário seleciona a opção correspondente no menu.
   - Ele é solicitado a fornecer o ID da tarefa que deseja remover.
   - Após confirmar a remoção, a tarefa é excluída da lista.
   
5. **Atualização de Tarefas:**
   - Para atualizar os detalhes de uma tarefa, o usuário seleciona a opção correspondente no menu.
   - Ele é solicitado a fornecer o ID da tarefa que deseja atualizar, juntamente com os novos detalhes (como título, descrição, prazo e tipo).
   - Após confirmar as alterações, os detalhes da tarefa são atualizados na lista.
     
6. **Visualização de Tarefas:**
   - Para visualizar todas as tarefas cadastradas, o usuário seleciona a opção correspondente no menu.
   - Todas as tarefas são exibidas no console, mostrando os detalhes de cada uma.

7. **Finalização do Programa:**
  - O usuário pode escolher continuar executando outras operações ou sair do programa, retornando ao sistema operacional.

## Licença 📝

Este projeto é licenciado sob a [MIT License](LICENSE).

