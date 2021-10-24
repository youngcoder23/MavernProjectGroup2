import java.util.Objects;

/**
 *
 * @author Lonwabo Sibusisiwe Magazi-218331851
 */
    
class Person
{
    String name;
    int age;

    public Person(){}
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    
    
    // methods to set name attribute and age attribute of person object

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    // for testing if two person objects are equal,
    // equals() method is overridden

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.age;
        return hash;
    }
    
    //Testing whether two person objects having same name
    
    public boolean isHavingSameName(Person otherPerson)
    {
        if(this.name.equals(otherPerson.name))
            return true;
        else
            return false;
        
    }
    
    //Testing whether two person objects having same age
    
    public boolean isHavingSameAge(Person otherPerson)
    {
        if(this.age == otherPerson.age)
            return true;
        else
            return false;
        
    }
    
    // Testing whether one person is older than other
     public boolean isOlder(Person other)
     {
         if(this.age > other.age)
             return true;
         else 
             return false;
                 
     }
    
    // Testing whether one person is younger than other
     public boolean isYounger(Person other)
     {
         if(this.age < other.age)
             return true;
         else 
             return false;
                 
     }
}
