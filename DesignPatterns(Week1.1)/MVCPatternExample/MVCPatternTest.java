public class MVCPatternTest {

    public static void main(String[] args) {

        Student student =
                new Student("Tejasree", 101, "A");

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(student, view);

        controller.updateView();

        System.out.println();

        controller.setStudentName("Tejasree K");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}