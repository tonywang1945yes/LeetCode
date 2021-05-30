package previous.visitor;

public class CalcVisitor extends Visitor {
    public void visitTeacher(Teacher t){
        System.out.println(t.a);
    }

    public void visitEngineer(Engineer e){
        System.out.println(e.b);
    }
}
