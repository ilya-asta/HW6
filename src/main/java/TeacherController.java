// тут все подстроил под работу с валидатором
public class TeacherController {

    private TeacherService teacherService;
    private TeacherView teacherView;
    private Validator validator;
    public TeacherController() {
        this.validator = new Validator();

        this.teacherView = new TeacherView();
    }

    public void createTeacher(String name, int age) {
        Teacher teacher = new Teacher(name, age);
        if (validator.validateTeacher(teacher)) {
            teacherView.displayTeacher(teacher);
        } else {
            System.out.println("Ошибка валидации учителя");
        }
    }

    public void editTeacher(Teacher teacher, String name, int age) {
        teacher.setName(name);
        teacher.setAge(age);
        if (validator.validateTeacher(teacher)) {
            teacherView.displayTeacher(teacher);
        } else {
            System.out.println("Ошибка валидации учителя");
        }
    }
}
