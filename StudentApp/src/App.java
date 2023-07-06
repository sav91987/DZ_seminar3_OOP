import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentsStream;

public class App {
    public static void main(String[] args) throws Exception {

        Student s11 = new Student("Иван", 25, 121);
        Student s12 = new Student("Игорь", 23, 301);
        Student s13 = new Student("Иван", 22, 121);
        Student s14 = new Student("Игорь", 23, 444);
        Student s15 = new Student("Даша", 23, 171);
        Student s16 = new Student("Лена", 23, 104);

        Student s21 = new Student("Mike", 21, 122);
        Student s22 = new Student("Tom", 22, 308);
        Student s23 = new Student("Ban", 22, 136);
        Student s24 = new Student("Anna", 25, 445);

        Student s31 = new Student("Li Hun", 21, 152);
        Student s32 = new Student("Chao When", 22, 408);
        Student s33 = new Student("Kio Gi", 22, 236);
        Student s34 = new Student("Pao Li", 21, 545);
        Student s35 = new Student("Syao Min", 23, 471);

        List<Student> listStud0 = new ArrayList<Student>();
        listStud0.add(s11);
        listStud0.add(s12);
        listStud0.add(s13);
        listStud0.add(s14);
        listStud0.add(s15);
        listStud0.add(s16);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s21);
        listStud1.add(s22);
        listStud1.add(s23);
        listStud1.add(s24);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s31);
        listStud2.add(s32);
        listStud2.add(s33);
        listStud2.add(s34);
        listStud2.add(s35);

        StudentGroup group4580 = new StudentGroup(listStud0, 4580);
        StudentGroup group4581 = new StudentGroup(listStud1, 4581);
        StudentGroup group4582 = new StudentGroup(listStud2, 4582);

        List<StudentGroup> listGroup = new ArrayList<StudentGroup>();

        listGroup.add(group4580);
        listGroup.add(group4581);
        listGroup.add(group4582);

        StudentsStream stream100 = new StudentsStream(100, listGroup);

        System.out.println("Поток 100\n" + stream100);
        System.out.println("============================= до сортировки ================================");

        for (StudentGroup stdGr : stream100) {
            System.out.println(stdGr);
        }
        System.out.println("============================= после сортировки ============================");

        Collections.sort(stream100.getGroupStr());

        for (StudentGroup stdGr : stream100) {
            System.out.println(stdGr);
        }
    }
}
