import java.util.HashSet;
import java.util.Set;

public class ch11_9a
{
    /*Write a method hasEven that accepts a set of integers as a parameter and returns true if the set contains at least
    one even integer and false otherwise. If passed the empty set, your method should return false.*/

    public void run()
    {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(5);
        set.add(9);
        set.add(3);
        set.add(11);
        set.add(8);
        set.add(7);
        
        System.out.println(hasEven(set));
    }

    public boolean hasEven(Set<Integer> set)
    {
        boolean hasEven = false;
        if (set.size() == 0)
        {
            return hasEven;
        }else
        {
            for (Integer integer: set)
            {
                if (integer%2 == 0)
                {
                    hasEven = true;
                }
            }
        }
        return hasEven;
    }
}
