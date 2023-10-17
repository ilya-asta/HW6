import java.util.ArrayList;
import java.util.List;
//Добавил этот класс для представления интерфейса TeacherInterface
public class MathTeacher implements TeacherInterface{
    @Override
    public List<Teacher> getTeachers() {
        List<Teacher> mathTeachers = new ArrayList<>();

        // Добавление учителей математики в список
        mathTeachers.add(new Teacher("John Doe", 30));
        mathTeachers.add(new Teacher("Jane Smith", 35));
        mathTeachers.add(new Teacher("Mark Johnson", 40));

        return mathTeachers;

    }

}
