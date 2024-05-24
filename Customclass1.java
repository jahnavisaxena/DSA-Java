class employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String n){
        name=n;
        return n;
    }
}


public class q1 {
    public static void main(String[] args) {
        employee jahnavi=new employee();
        employee tanay=new employee();
        jahnavi.name="Jahnavi";
        jahnavi.salary=900000;

        tanay.name="tanay";
        tanay.salary=910000;

        System.out.println(jahnavi.getSalary());
        System.out.println(jahnavi.getName());
        System.out.println(jahnavi.setName("Riya"));

        System.out.println(tanay.getSalary());
        System.out.println(tanay.getName());
        System.out.println(tanay.setName("tanman"));

        }
}
