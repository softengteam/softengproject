package e_ergasies;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class e_ergasies extends JFrame
{
    Container c;
    static ArrayList <User> users=new ArrayList <User> ();
    static ArrayList <Writer> writers=new ArrayList <Writer> ();
    static ArrayList <Excercise> excercises=new ArrayList <Excercise> ();
    static ArrayList <Project> projects=new ArrayList <Project> ();
     
    public e_ergasies()
    {
        c=getContentPane();
        c.setLayout(new FlowLayout());
        JButton btnuser=new JButton("User");
        JButton btnwriter=new JButton("Writer");
        JButton btnexit=new JButton("Exit");
        
        c.add(btnuser);
        c.add(btnwriter);
        c.add(btnexit);
        
        btnuser.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new FirstForm().setVisible(true);
            }
        });      
        
        btnwriter.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new FirstFormWriter().setVisible(true);
            }
        }); 
        
        btnexit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               System.exit(0);
            }
        });     
    }
   
    public static void main(String[] args) 
    {
        Writer writer1 =new Writer("writer1","writer1");
        Writer writer2=new Writer("writer2","writer2");
      
        User user1=new User(1,"Nikos","Papadopoulos","papad@gmail.com","user1","user1");
        User user2=new User(2,"Nikos","Papadopoulos","papad@gmail.com","user2","user2");
      
        Excercise exer1=new Excercise(1,100,"Προγραμματισμός σε Java","Programming",false,50);
        Excercise exer2=new Excercise(2,70,"Προγραμματισμός σε C++","Programming",false,100);   
        Excercise exer3=new Excercise(3,200,"Λειτουργικό Σύστημα Unix","Operating Systems",true,0);
        Excercise exer4=new Excercise(4,170,"SQL SERVER","Databases",false,120);
        Excercise exer5=new Excercise(5,70,"Ψηφιακή Επεξεργασία Εικόνας","Design",true,150);
        Excercise exer6=new Excercise(6,80,"Simple Lists","Data Structures",true,250);
        Excercise exer7=new Excercise(7,200,"SQL Server","Databases",true,150);
        Excercise exer8=new Excercise(8,400,"SQL","Databases",true,250);
     
        Project proj1=new Project(1,100,"Introduction to Programming","Programming",true,"6/5/2020",130);
        Project proj2=new Project(2,200,"More Efficient Databases","Databases",false,"15/5/2020",0);
        Project proj3=new Project(3,300,"Distributed Databases","Databases",true,"20/5/2020",200);
        Project proj4=new Project(4,400,"2-D Graphice","Graphice",true,"25/5/2020",90);
        Project proj5=new Project(5,500,"3-D Graphcis","Graphics",false,"30/5/2020",0);
        Project proj6=new Project(6,600,"Trees","Data Structures",true,"6/6/2020",200);
        Project proj7=new Project(7,700,"3-D Animation in Python","Programming",false,"31/5/2020",0);
        Project proj8=new Project(8,800,"Trees in Visual C++","Programming",true,"3/6/2020",180);
        
        writer1.upload_exercise(exer1);
        writer1.upload_exercise(exer2);
        writer1.upload_exercise(exer3);
        writer1.upload_exercise(exer4);
     
        
        writer1.upload_project(proj1);
        writer1.upload_project(proj2);
        writer1.upload_project(proj3);
        writer1.upload_project(proj4);       
       
        writer2.upload_exercise(exer5);
        writer2.upload_exercise(exer6);
        writer2.upload_exercise(exer7);
        writer2.upload_exercise(exer8);
        
        writer2.upload_project(proj5);
        writer2.upload_project(proj6);
        writer2.upload_project(proj7);
        writer2.upload_project(proj8);
        
      
        user1.buy_exercise_for_view(exer1);
        user1.buy_exercise_for_downl(exer1);
        user1.buy_project_for_downl(proj1);
        user1.buy_project_for_view(proj1);
        
        user1.buy_exercise_for_view(exer2); 
        user1.buy_exercise_for_downl(exer2);  
        user1.buy_exercise_for_downl(exer3);  
        user1.buy_project_for_downl(proj2);
        user1.buy_project_for_view(proj2);
        
        user1.buy_exercise_for_view(exer3);
        user1.buy_project_for_view(proj3);
        
        user1.buy_exercise_for_view(exer4);
        user1.buy_project_for_view(proj4);
        
        user2.buy_exercise_for_view(exer5);
        user2.buy_project_for_downl(proj5);
        user2.buy_project_for_view(proj5);
        
        user2.buy_exercise_for_view(exer6);
        user2.buy_project_for_downl(proj6);
        user2.buy_project_for_view(proj6);
        
        user2.buy_exercise_for_view(exer7);
        user2.buy_project_for_view(proj7);
        
        user2.buy_exercise_for_view(exer8);
        user2.buy_project_for_view(proj8);
        
        users.add(user1);
        users.add(user2);
        
        writers.add(writer1);
        writers.add(writer2);
        
        excercises.add(exer1);
        excercises.add(exer2);
        excercises.add(exer3);
        excercises.add(exer4);
        excercises.add(exer5);
        excercises.add(exer6);
        excercises.add(exer7);
        excercises.add(exer8);
        
        e_ergasies er=new e_ergasies();
        
        er.setSize(300,300);
        er.setVisible(true);
    }
}
