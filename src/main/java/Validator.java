// Добавил класс валидатор что бы OpenClosed соблюдать раньше этот код был в TeacherService
public class Validator {
    public static boolean validateTeacher(Teacher teacher) {
        // Валидация учителя (например, проверка на заполненность полей)
        return teacher.getName() != null && !teacher.getName().isEmpty() && teacher.getAge() > 0;
    }
}
