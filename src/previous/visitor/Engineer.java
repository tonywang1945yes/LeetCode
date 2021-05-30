package previous.visitor;

public class Engineer extends Employee {
    public double b=2.5;
    @Override
    public void accept(Visitor v){
        v.visitEngineer(this);
    }
}
