public class Course{
    private String [] Course;

    public Course(){
        this.Course[]={0};
    }
    public Course(String [] course){

            for (int i=0;i<course.length;i++){
               
            }

    }


    public void getCourse(){
        for (int i=0;i<this.Course.length;i++){
            System.out.println(this.Course[i]);
        }
    }
}