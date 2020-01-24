public class Lecturer extends Course{
    private String Name;
    private int age;

    public Lecturer(){
        super();
        this.Name=null;
        this.age=0;
    }

    public Lecturer(String Name,int age,String [] Course){
        super(Course);
        this.Name=Name;
        this.age=age;

    }

    public void setName(String Name){
        this.Name=Name;
    }

    public void setAge(String Age){
        this.age=age;
    }

    public String getName(){
        return this.Name;
    }

    public int getAge(){
        return this.age;
    }
}

