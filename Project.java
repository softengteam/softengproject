package e_ergasies;
import java.time.LocalDate;

public class Project 
{
    int pcode;
    int loc;
    String theme;
    String category;
    boolean free_of_charge=false;
    String datetim;
    float projectcost;
    
     public Project(int pcode, int loc, String theme, String category) 
     {
        this.pcode = pcode;
        this.loc = loc;
        this.theme = theme;
        this.category = category;
        free_of_charge=false;
        datetim = "";
        projectcost=0;
    }
     
     public Project(int pcode, int loc, String theme, String category,boolean freeof,String lcd) 
     {
        this.pcode = pcode;
        this.loc = loc;
        this.theme = theme;
        this.category = category;
        free_of_charge=freeof;
        datetim = lcd;
    } 
     
     public Project(int pcode, int loc, String theme, String category,boolean freeof,String lcd,float projectcost) 
     {
        this.pcode = pcode;
        this.loc = loc;
        this.theme = theme;
        this.category = category;
        free_of_charge=freeof;
        datetim = lcd;
        this.projectcost=projectcost;
    } 
     
    public void setprojectcost(float projectcost)
    {
        this.projectcost=projectcost;
    }
    
    public void seProjectcode(int pcode)
    {
        this.pcode = pcode;
    }

    public void setPages(int loc) 
    {
        this.loc = loc;
    }

    public void setTheme(String theme) 
    {
        this.theme = theme;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public void setFree_of_charge(boolean free_of_charge) 
    {
        this.free_of_charge = free_of_charge;
    }

    public int getpcodecode() 
    {
        return pcode;
    }

    public int getLoc() 
    {
        return loc;
    }

    public String getTheme() 
    {
        return theme;
    }

    public String getCategory() 
    {
        return category;
    }

    public boolean isFree_of_charge() 
    {
        return free_of_charge;
    }
    
    public float getprojectcost()
    {
        return projectcost;
    }
    
}
