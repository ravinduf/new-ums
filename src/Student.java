public class Student extends Course{
    private String Name;
    private int age;

    public Student(){
        super();
        this.Name=null;
        this.age=0;
    }

    public Student(String name,int age,String [] Course){
        super(Course);
        if (name!=null)
            this.Name=name;
        else
            this.Name="0";
        if (age>0)
            this.age=age;
        else
            this.age=0;

    }



    public void setName(String name){
        this.Name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return this.Name;
    }

    public int getAge(){
        return this.age;
    }
}
