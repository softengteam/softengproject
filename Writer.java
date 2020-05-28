package e_ergasies;

import java.time.LocalDate;
import java.util.ArrayList;

public class Writer 
{
    String username;
    String password;
    int count_exercises_uploaded=0;
    int count_projects_uploaded=0;
    LocalDate last_upload;
    float donation;
    ArrayList <Project> projectsuploaded=new ArrayList <Project>();
    ArrayList <Excercise> exercisesuploaded=new ArrayList <Excercise>();
    
    public Writer(String username, String password) 
    {
        this.username = username;
        this.password=password;
        this.donation=0;
    }
    
    ArrayList <Excercise> ListExercsisesuploaded()
    {
        return exercisesuploaded;
    }
    
    ArrayList <Project> ListProjectsuploaded()
    {
        return projectsuploaded;
    }
    
    void upload_project(Project p)
    {
       projectsuploaded.add(p);
    }
    
    void upload_exercise(Excercise e)
    {
       exercisesuploaded.add(e);
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getCount_exercises_uploaded() 
    {
        return count_exercises_uploaded;
    }

    public void setCount_exercises_uploaded(int count_exercises_uploaded) 
    {
        this.count_exercises_uploaded = count_exercises_uploaded;
    }

    public int getCount_projects_uploaded()
    {
        return count_projects_uploaded;
    }

    public void setCount_projects_uploaded(int count_projects_uploaded)
    {
        this.count_projects_uploaded = count_projects_uploaded;
    }

    public LocalDate getLast_upload()
    {
        return last_upload;
    }

    public void setLast_upload(LocalDate last_upload)
    {
        this.last_upload = last_upload;
    }
   
    public void set_donation(float donation)
    {
        this.donation=donation;
    }
    
    public float get_donation()
    {
        return donation;
    }
}
