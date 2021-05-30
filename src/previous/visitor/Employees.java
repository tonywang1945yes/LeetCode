package previous.visitor;

import java.util.ArrayList;

public class Employees {
    ArrayList<Employee> people=new ArrayList<>();

    public Employees() {
        people=new ArrayList<>();
        people.add(new Teacher());
        people.add(new Teacher());
        people.add(new Engineer());
    }

    public ArrayList<Employee> getPeople() {
        return people;
    }

    public void accept(Visitor v){
        for(Employee e:people){
            e.accept(v);
        }
    }
}
