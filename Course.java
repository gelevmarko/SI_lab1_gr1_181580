import java.util.ArrayList;
import java.util.List;

public class Course {
    List<Student> students;
    Course()
    {
        students = new ArrayList<>();
    }
    public void addStudent(Student student)
    {
        students.add(student);
    }
    public void removeStudent(Student student)
    {
        if(students.contains(student))
        {
            students.remove(student);
        }
    }
    public double labPointsAverage()
    {
        double allPointsAverage=0;
        for(int i=0;i<students.size();i++)
        {
            allPointsAverage+=students.get(i).getAverage();
        }
        return allPointsAverage/students.size();
    }
    public int numberOfSignatures()
    {
        int numberOfSignatures = 0;
        for(int i=0;i<students.size();i++)
        {
            if(students.get(i).hasSignature())
                numberOfSignatures++;
        }
        return numberOfSignatures;
    }
}
