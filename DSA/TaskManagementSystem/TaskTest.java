public class TaskTest {

    public static void main(String[] args) {

        TaskLinkedList list =
                new TaskLinkedList();

        list.addTask(
                new Task(
                        101,
                        "Design Database",
                        "Pending"));

        list.addTask(
                new Task(
                        102,
                        "Develop API",
                        "In Progress"));

        list.addTask(
                new Task(
                        103,
                        "Testing",
                        "Pending"));

        list.traverseTasks();

        list.searchTask(102);

        list.deleteTask(102);

        list.traverseTasks();
    }
}