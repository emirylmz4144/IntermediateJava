public class Main {
    public static void main(String[] args)
    {

        Employee employee=new Employee("Emir",2000,50,2002);
        employee.writeInformations(new AddBonusMoney(employee));
    }
}