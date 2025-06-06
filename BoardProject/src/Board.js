// board.js
// Exemplo simples de um "board" que armazena e lista tarefas

class Board {
  constructor() {
    this.tasks = [];
  }

  addTask(task) {
    if(task) {
      this.tasks.push(task);
      console.log(`Tarefa "${task}" adicionada!`);
    } else {
      console.log("Insira uma tarefa válida.");
    }
  }

  listTasks() {
    console.log("Tarefas no board:");
    this.tasks.forEach((task, i) => {
      console.log(`${i + 1}. ${task}`);
    });
  }
}

// Exemplo de uso:
const board = new Board();
board.addTask("Estudar Git e GitHub");
board.addTask("Criar portfólio no GitHub");
board.listTasks();
