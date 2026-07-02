public class TaskLinkedList {

    class Node {

        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public void addTask(Task task) {

        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
        }
        else {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println("Task Added");
    }

    public void traverseTasks() {

        System.out.println("\nTask List:");

        Node temp = head;

        while (temp != null) {

            temp.task.display();
            temp = temp.next;
        }
    }

    public void searchTask(int taskId) {

        Node temp = head;

        while (temp != null) {

            if (temp.task.taskId == taskId) {

                System.out.println("\nTask Found:");
                temp.task.display();
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }

    public void deleteTask(int taskId) {

        if (head == null)
            return;

        if (head.task.taskId == taskId) {

            head = head.next;

            System.out.println("\nTask Deleted");
            return;
        }

        Node temp = head;

        while (temp.next != null &&
               temp.next.task.taskId != taskId) {

            temp = temp.next;
        }

        if (temp.next != null) {

            temp.next = temp.next.next;

            System.out.println("\nTask Deleted");
        }
        else {

            System.out.println("Task Not Found");
        }
    }
}