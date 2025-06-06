public class Worker extends HumanWorker{
    @Override
    public void getSalary () {
        System.out.println("Kendi personelimize maaş veriliyor.");
    }
    @Override
    public void getMeal () {
        System.out.println("Kendi personelimize yemek veriliyor.");
    }
}
