package e_ergasies;

public class Excercise 
{
    int exercisecode;
    int pages;
    String theme;
    String category;
    boolean free_of_charge=false;
    float exercost;
    boolean time_limited=false;
    int exercise_size=1000;
    String expires="";
    
    Excercise()
    {
    }
    
    public Excercise(int exercisecode, int pages, String theme, String category,boolean free_of_charge,float exercost,boolean time_limited,int exercise_size,String expires) 
    {
        this.exercisecode = exercisecode;
        this.pages = pages;
        this.theme = theme;
        this.category = category;
        this.free_of_charge=free_of_charge;
        this.exercost=exercost;
        this.time_limited= time_limited;
        this.exercise_size=exercise_size;
        this.expires=expires;
    }
    
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

    public float getExercost() {
        return exercost;
    }

    public void setExercost(float exercost) {
        this.exercost = exercost;
    }

    public boolean isTime_limited() {
        return time_limited;
    }

    public void setTime_limited(boolean time_limited) {
        this.time_limited = time_limited;
    }

    public int getExercise_size() {
        return exercise_size;
    }

    public void setExercise_size(int exercise_size) {
        this.exercise_size = exercise_size;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
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
