package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentsStream implements Iterable<StudentGroup> {

    private int idStream;
    private List<StudentGroup> listGroup;

    /**
     * Класс потока студентов
     * 
     * @param idStream  - id потока
     * @param listGroup - список Групп
     */
    public StudentsStream(int idStream, List<StudentGroup> listGroup) {
        this.listGroup = listGroup;
        this.idStream = idStream;

    }

    public int getIdStream() {
        return idStream;
    }

    public void setIdStream(int idStream) {
        this.idStream = idStream;
    }

    public List<StudentGroup> getGroupStr() {
        return listGroup;
    }

    public void setGroupStr(List<StudentGroup> listGroup) {
        this.listGroup = listGroup;
    }

    // Перезагрузка метода iterator для переборка элементов
    // класса StudentsStream
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                if (index < listGroup.size())
                    return true;
                else
                    return false;
            }

            @Override
            public StudentGroup next() {
                return listGroup.get(index++);
            }
        };
    }

    // Перезагрузка метода toString для печати
    // элементов класса StudentsStream
    @Override
    public String toString() {
        return "StudentsStream\n [idStream=" + idStream + ",\n listGroup=" + listGroup + "]";
    }
}
