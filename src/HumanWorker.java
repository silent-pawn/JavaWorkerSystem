public abstract class HumanWorker implements IWorkable {
    @Override
    public void work () {
        System.out.println(getClass().getSimpleName()+ " çalışıyor. ");
    }
    public abstract void getSalary();
    public abstract void getMeal ();
}
