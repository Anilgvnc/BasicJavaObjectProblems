package classapplications;

/**
 *
 * @author guven
 */

public class ClassApplications {

    public static void main(String[] args) {
        //Geometry: the Circle2D
        Circle2D circle = new Circle2D(2, 2, 5.5);
        System.out.printf("c1 contains (3,3) %b\n", circle.contains(3, 3));
	System.out.printf("c1 contains new Circle2D(3, 4, 10.5) %b\n", circle.contains(new Circle2D(4, 5, 10.5)));
	System.out.printf("c1 overlaps new Circle2D(3, 5, 2.3) %b\n", circle.overlaps(new Circle2D(3, 5, 2.3)));
        
        //Anagram Application
        Anagram anagram = new Anagram();
        anagram.setLetters();
        anagram.isAnagram();
    }
    
}
