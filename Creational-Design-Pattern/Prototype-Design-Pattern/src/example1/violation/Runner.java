package example1.violation;

/**
 * -> Copy logic duplicated for each document type.
 * -> Manual and Error Prone.
 * -> Break Open-Closed Principle.
 */
public class Runner {

    public static void main(String[] args) {

        Resume originalResume = new Resume("Software Engineer Resume", "John Doe", "Java, Spring, Microservices" );


        // manual duplication
        Resume duplicateResume = new Resume(originalResume.getTitle(), originalResume.getAuthor(), originalResume.getContent());
        duplicateResume.setContent("Design Pattern");

        System.out.println("Original Content : " + originalResume.getContent());
        System.out.println("Duplicate Content : " + duplicateResume.getContent());
    }
}
