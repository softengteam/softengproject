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
    boolean time_limited=false;
    int project_size=1000;
    String expires="";
    
    
    public Project()
    {
    }
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
     
     public Project(int pcode, int loc, String theme, String category,boolean freeof,String lcd,float projectcost,boolean time_limited,int project_size,String expires) 
     {
        this.pcode = pcode;
        this.loc = loc;
        this.theme = theme;
        this.category = category;
        free_of_charge=freeof;
        datetim = lcd;
        this.time_limited=time_limited;
        this.project_size=project_size;
        this.expires=expires;
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

    public int getPcode() {
        return pcode;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public String getDatetim() {
        return datetim;
    }

    public void setDatetim(String datetim) {
        this.datetim = datetim;
    }

    public float getProjectcost() {
        return projectcost;
    }

    public void setProjectcost(float projectcost) {
        this.projectcost = projectcost;
    }

    public boolean isTime_limited() {
        return time_limited;
    }

    public void setTime_limited(boolean time_limited) {
        this.time_limited = time_limited;
    }

    public int getProject_size() {
        return project_size;
    }

    public void setProject_size(int project_size) {
        this.project_size = project_size;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
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
