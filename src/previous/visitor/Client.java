package previous.visitor;

public class Client {
    Employees employees=new Employees();


    public Client() {

    }

    public static void main(String[] args){
        Client c=new Client();
        Visitor visitor1=new PrintVisitor();
        Visitor visitor2=new CalcVisitor();
        c.employees.accept(visitor1);
        c.employees.accept(visitor2);
    }
}
