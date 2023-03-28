package encapsulation26;

public class Encapsulate {
   private String name;
    private int rollNo;
    private int age;

    // get method for name to access private variable name
    public String getName(){
        return name;

    }
    // set method for name to access private variable name
    public void setName(String name){
        this.name = name;
    }
    // get method for roll to access private variable roll no
    public int getRollNo(){
        return rollNo;
    }
    // set method for roll to access private variable roll no
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    // get method for roll to access private variable roll no
    public  int getAge(){
        return age;
    }
    // set method for roll to access private variable roll no
    public void setAge(int age){
        this.age = age;
    }


}
