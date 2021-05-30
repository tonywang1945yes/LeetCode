package previous.visitor;

public class PrintVisitor extends Visitor {
    public void visitTeacher(Teacher t){
        System.out.println("visit Teacher");
    }

    public void visitEngineer(Engineer e){
        System.out.println("visit Engineer");
    }
}
