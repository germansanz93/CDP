import abstract_factory.ComputerFactory;
import abstract_factory.PCFactory;
import abstract_factory.ServerFactory;
import model.Computer;

public class Main {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory(){
        Computer pc = ComputerFactory.getComputer(new PCFactory("16 GB", "1TB", "3.2 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("32 GB", "2 TB", "4.0GHz"));
        System.out.println(String.format("PC Config: %s", pc));
        System.out.println(String.format("Server Config: %s", server));
    }
}