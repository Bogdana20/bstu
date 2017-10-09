package stu.vt41.mandrikova_b;

import java.util.Scanner;

public abstract class Sports_eq {
    protected String name = "";
    protected String sporttype = "";
    protected String Weight = "";

    public abstract void init(Scanner scanner);
    public String  getSportType(){
        return sporttype;
    }


    public String getName(){
        return name;
    }
    public String getWeight(){
        return Weight;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSportType(String sporttype){
        this.sporttype = sporttype;
    }
}
