public class Main {
    public static void main (String [] args){
        IWorkable[] workers = {
                new Worker(),
                new OutsourceWorker(),
                new RobotWorker()
        };

        System.out.println("Çalışanlar iş başında");
        for (IWorkable worker : workers) {
            worker.work ();
        }
        System.out.println("İnsan çalışanlar için işlemler");
        HumanWorker[] humans = {
                new Worker(),
                new OutsourceWorker()
        };
        for (HumanWorker human : humans) {
            human.getSalary();
            human.getMeal();
        }
    }
}