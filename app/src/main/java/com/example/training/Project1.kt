package com.example.training

fun main() {
    /*
    Let the user input data and handle the exception then let the user enter data again until they type "exit"
    */
    val todo = Todo()
    var task1 = Task(1, "Homework", "Due date 10/1/2023")
    var task2 = Task(2, "Project", "Due date 12/1/2023")
    var task3 = Task(3, "Midterm", "Due date 20/1/2023")
    var task4 = Task(4, "Final", "Due date 10/2/2023")
    todo.addTask(task1)
    todo.addTask(task2)
    todo.addTask(task3)
    println("--------------------------------------------------------------------------")
    todo.showTasks()
    println("--------------------------------------------------------------------------")
    todo.removeTask(task1)
    todo.removeTask(task4)
    task2 = Task(2, "Project", "Due date 10/2/2023", true)
    todo.changeTask(task2)
    println("--------------------------------------------------------------------------")
    todo.showTasks()
    println("--------------------------------------------------------------------------")
    todo.printTask(3)
}

data class Task(
    val id: Int,
    val name: String,
    val note: String,
    var isCompleted: Boolean = false
)

class Todo {

    var tasks = arrayListOf<Task>()
        private set

    fun showTasks() {
        // TODO: Prints all the tasks
        for (i in tasks)
            println("Task id: ${i.id}, Name: ${i.name}, Note: ${i.note}, Is it done? ${i.isCompleted}")
    }

    fun printTask(num: Int) {
        // TODO: Print the specific task
        for (i in tasks) {
            if (i.id == num) {
                println("Task id: ${i.id}, Name: ${i.name}, Note: ${i.note}, Is it done? ${i.isCompleted}")
                return
            }
        }
        println("Did not find task with id: $num")
    }

    fun addTask(task: Task) {
        // TODO: Adds the given task
        if (task !in tasks) {
            tasks.add(task)
            println("Task added successfully")
        } else {
            println("There is already a task with the same id: ${task.id}")

        }
    }

    fun removeTask(task: Task) {
        // TODO: Removes the given task

        if (task in tasks) {
            tasks.remove(task)
            println("Task with id: ${task.id} deleted successfully")
            return
        } else {

            println("Did not find task with id: ${task.id}")
        }
    }

    fun changeTask(task: Task) {
        // TODO: Changes the task with the given dataclass
        for (i in 0 until tasks.size) {
            if (task.id == tasks[i].id) {
                tasks[i].isCompleted = !task.isCompleted
                println("Task with id: ${tasks[i].id} changed successfully")
                return
            }
        }
        println("Did not find task with id: ${task.id}")
    }

}
