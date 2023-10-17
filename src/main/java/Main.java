public class Main {
    public static void main(String[] args) {
    TeacherController teacherController = new TeacherController();
    teacherController.createTeacher("Aleksey", 19);

    Teacher teacher = new Teacher("Darya",73);
    teacherController.editTeacher(teacher,"Mary",20);

    Teacher teacher1 = new Teacher("Mary", 18);



    TeacherController teacherController1 = new TeacherController();

        // Создание нового учителя
        teacherController.createTeacher("John", 35);
        // Редактирование существующего учителя
        Teacher teacher2 = new Teacher("Alice", 28);
        teacherController.editTeacher(teacher, "Alice Smith", 29);
        // Создание группы учителей
        System.out.println("-".repeat(45));
        System.out.println("Ниже отображение группы учителей, не смог почему то сделать для них нормальный вывод(");
        TeacherGroup mathTeacherGroup = new TeacherGroup(new MathTeacher());
        mathTeacherGroup.addTeacherInGroup(new Teacher("Bob", 40));
        mathTeacherGroup.addTeacherInGroup(new Teacher("Charlie", 50));
        mathTeacherGroup.printTeachers();

        TeacherGroup englishTeacherGroup = new TeacherGroup(new EnglishTeacher());
        englishTeacherGroup.addTeacherInGroup(new Teacher("Emma", 32));
        englishTeacherGroup.printTeachers();
    }
}


