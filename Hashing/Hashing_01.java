import java.util.HashSet;
import java.util.Iterator;

class Hashing_01{
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // duplicate so it will not be stored

        System.out.println(set);
        //Size
        System.out.println("Initial size of set is : "+set.size());

        //Search --> contains()
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }

        if(!set.contains(7)){
            System.out.println("Does not contain 7");
        }

        //Delete --> ,remove()
        set.remove(3);
        System.out.println("Deleted 3 from set");

        //Iterator
        Iterator it = set.iterator();

        //hasNext-> return true if element is present or false and next -> return next value from set without any order --> Functions in iterator.
        System.out.println("Iterating using iterator");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }




        System.out.println("\n=================================");
        System.out.println("After Every Operation");
        System.out.println(set);

    }
}