package e_ergasies;

public class Excercise 
{
    int exercisecode;
    int pages;
    String theme;
    String category;
    boolean free_of_charge=false;
    float exercost;

    public Excercise(int exercisecode, int pages, String theme, String category,boolean free_of_charge,float exercost) 
    {
        this.exercisecode = exercisecode;
        this.pages = pages;
        this.theme = theme;
        this.category = category;
        this.free_of_charge=free_of_charge;
        this.exercost=exercost;
    }
    
    public Excercise(int exercisecode, int pages, String theme, String category) 
    {
        this.exercisecode = exercisecode;
        this.pages = pages;
        this.theme = theme;
        this.category = category;
    }
    
    public void setExercisecost(float exercost) 
    {
        this.exercost = exercost;
    }

    public void setExercisecode(int exercisecode) 
    {
        this.exercisecode = exercisecode;
    }

    public void setPages(int pages) 
    {
        this.pages = pages;
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

    public int getExercisecode() 
    {
        return exercisecode;
    }

    public int getPages() 
    {
        return pages;
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
    
    public float get_exercost()
    {
        return exercost;
    }
}
