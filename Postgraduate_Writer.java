
package e_ergasies;

public class Postgraduate_Writer extends Writer
{
    float diplom_grade;
    String faculty;
    String type_of_study;
    
    public Postgraduate_Writer(String username, String password,float diplom_grade,String faculty,String type_of_study)
    {
        super(username,password);
        this.diplom_grade=diplom_grade;
        this.type_of_study=type_of_study;
    }

    public float getDiplom_grade() 
    {
        return diplom_grade;
    }

    public void setDiplom_grade(float diplom_grade) 
    {
        this.diplom_grade = diplom_grade;
    }

    public String getFaculty() 
    {
        return faculty;
    }

    public void setFaculty(String faculty) 
    {
        this.faculty = faculty;
    }

    public String getType_of_study() 
    {
        return type_of_study;
    }

    public void setType_of_study(String type_of_study) 
    {
        this.type_of_study = type_of_study;
    }

    
}
