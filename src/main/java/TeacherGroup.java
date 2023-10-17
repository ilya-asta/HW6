import java.util.ArrayList;
import java.util.List;

//сюда имплементировал интерфейс MaxTeachersInUniversity, что бы тут не было переменных
//плюс добавил сюда TeacherInterface там описал более подробно, для чего я это сделал

public class TeacherGroup implements MaxTeachersInUniversity{
    private Teacher teacher;
    private List<Teacher> teachers = new ArrayList<>();
    private TeacherInterface teacherInterface;
    public TeacherGroup(TeacherInterface teacherInterface) {
        this.teacherInterface = teacherInterface;
    }

//    public TeacherGroup(Teacher teacher) {
//        this.teacher = teacher;

    public void printTeachers() {
        List<Teacher> teachers = teacherInterface.getTeachers();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void addTeacherInGroup(Teacher teacher){
        if(teachers.contains(teacher)&&teachers.size()<maxTeachersInUniversity) {
            teachers.add(teacher);
        }
    }
    public void removeTeacherInGroup(Teacher teacher){
        teachers.remove(teacher);
    }



    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teacher=" + teacher +
                ", teachers=" + teachers +
                ", teacherInterface=" + teacherInterface +
                '}';
    }
}

//    private Teacher teacher;
//    public TeacherGroup(Teacher teacher) {
//        this.teacher = teacher;
//    }
//
//    public Teacher getTeacher() {
//        return teacher;
//    }
//
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }
//}
