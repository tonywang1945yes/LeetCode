package previous.visitor;

public class Teacher extends Employee {
    public int a=1;
    @Override
    public void accept(Visitor v){
        v.visitTeacher(this);
    }
}
