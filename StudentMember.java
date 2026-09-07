public class StudentMember extends Member{

    public StudentMember(String name){
        super(name);
    }
    @Override 
    public String id(){
        return "Student";
    }
}
