package example2.refactor;

/**
 *  -> Easy to Add / Remove Components
 *  -> Reusable Director methods
 */
public class Client {

    public static void main(String[] args) {

        Computer gamingPC = ComputerDirector.buildGamingPC();
        Computer officePC = ComputerDirector.buildOfficePC();
        Computer homePC = ComputerDirector.buildSimplePC();

        System.out.println(gamingPC);
        System.out.println(officePC);
        System.out.println(homePC);
    }
}
