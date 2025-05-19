package example1.refactor;

public class Runner {

    public static void main(String[] args) throws CloneNotSupportedException {

        Resume originalResume = new Resume("Architect", "Alice", "Java");

        Resume clonedResume = (Resume) originalResume.clone();
        clonedResume.setAuthor("Bob");

        System.out.println("Original Author : " + originalResume.getAuthor());
        System.out.println("Cloned Author : " + clonedResume.getAuthor());

    }
}
