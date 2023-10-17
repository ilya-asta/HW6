import java.util.List;
//я создаю интерфейс, который
// будет использоваться вместо конкретного
// класса Teacher в классе TeacherGroup
//Теперь я могу создать классы-реализации интерфейса
// TeacherInterface,
// которые представят различные типы учителей.
// в моем случае я создал для примера у класса MathTeacher и EnglishTeacher
//Вроде как это принцип Барбары Лисков)

public interface TeacherInterface {
    List<Teacher> getTeachers();
}
