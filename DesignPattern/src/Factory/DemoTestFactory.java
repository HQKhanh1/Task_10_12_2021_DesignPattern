package Factory;

public class DemoTestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "8 GB", "500 GB", "5 GHz");
        Computer server = ComputerFactory.getComputer("server", "32 GB", "5 TB", "5 GHz");
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
