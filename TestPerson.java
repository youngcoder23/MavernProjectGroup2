/**
 *
 * @author Lonwabo Sibusisiwe Magazi-218331851
 */
public class TestPerson 
{
    // main method    
    public static void main(String[] args) 
    {
    
        // testing all the methods 
        // one true and one false case for each of the methods is tested.
        Person p1 = new Person();
        p1.setName("Aviwe");
        p1.setAge(15);
        
        Person p2 = new Person("Asemahle",24);
        Person p3 = new Person("Aviwe",30);
        System.out.println("Is P1 equal to P2 ?:"+p1.equals(p2));
        System.out.println("Is P1 equal to P3 ?:"+p1.equals(p3));
        System.out.println("Is P1 having same name as P2 ?:"+p1.isHavingSameName(p2));
        System.out.println("Is P1 having same name as P3 ?:"+p1.isHavingSameName(p3));
        System.out.println("Is P1 having same age as P2 ?:"+p1.isHavingSameAge(p2));
        System.out.println("Is P1 having same age as P3 ?:"+p1.isHavingSameAge(p3));
        System.out.println("Is P1 Older than P2 ?:"+p1.isOlder(p2));
        System.out.println("Is P3 Older than P1 ?:"+p3.isOlder(p1));
        System.out.println("Is P1 Younger than P2 ?:"+p1.isYounger(p2));
        System.out.println("Is P1 Younger than P3 ?:"+p1.isYounger(p3));
        
    
    }
    
    
}
