/*
Izzah Manzoor
manzoorizzah@gmail.com
l164048@lhr.nu.edu.pk
Advanced Programming Assignment 2

The following code shows working of NavigableSet,NavigableMap,HashSet,TreeSet,Array,ArrayList,Vector,SortedSet
*/
package l164048_a2;
import java.util.*;   
public class L164048_A2 {

    public static void main(String[] args) {
        System.out.println("\n The following code shows working of NavigableSet,NavigableMap,HashSet,TreeSet,List,Array,ArrayList,Vector,SortedSet \n");
        
        // creating an Array
        System.out.println("Array Example\n");
        int[] arr = new int[2]; 
        
        // adding elements
        arr[0] = 1; 
        arr[1] = 2; 
        
        //traversing the array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("arraylength"+arr.length);
        
        // creating an ArrayList using List interface
        System.out.println("========================\nArrayList Example\n");
        ArrayList<String> ArrayListObject = new ArrayList<String>(); 
  
        // adding object to arraylist 
        ArrayListObject.add("I am a student at Fast."); 
        ArrayListObject.add("Fast is a top computer science university."); 
        ArrayListObject.add("I like coding."); 
  
        // traversing elements using Iterator' 
        System.out.println("ArrayList elements are:"); 
        Iterator Iterator1 = ArrayListObject.iterator(); 
        while (Iterator1.hasNext()) 
            System.out.println(Iterator1.next()); 
        
        
        // creating Vector 
        System.out.println("========================\nVector Example");
        Vector<String> VectorObject = new Vector<String>(); 
        
        // adding object to Vector
        VectorObject.add("Apple"); //method of Collection
        VectorObject.addElement("Mango"); //method of Vector
        VectorObject.addElement("Lemon"); 
  
        // traversing elements using Enumeration 
        System.out.println("\nVector elements are:"); 
        Enumeration e = VectorObject.elements(); 
        while (e.hasMoreElements()) 
            System.out.println(e.nextElement());
        
       
        //Creating List
         System.out.println("========================\n List Example using Linked List");
        List ListObject = new LinkedList();
        
        // adding object to list
        ListObject.add(3);
        ListObject.add(2);
        ListObject.add(1);
        ListObject.add(4);
        ListObject.add(5);
        ListObject.add(6);
        ListObject.add(6);

         // traversing elements using Iterator' 
        System.out.println("\nList elements are:"); 
        Iterator Iterator2 = ListObject.iterator();
        while(Iterator2.hasNext()){
           System.out.println(Iterator2.next());
        }
        
        // Create a TreeSet 
         System.out.println("========================\n TreeSet example");
        TreeSet<String> TreeSetObject = new TreeSet<String>(); 
  
        // add elements to HashSet 
        TreeSetObject.add("dog"); 
        TreeSetObject.add("cat"); 
        TreeSetObject.add("snake"); 
        TreeSetObject.add("lion"); 
  
        // Duplicate removed 
        TreeSetObject.add("lion"); 
  
        // Displaying TreeSet elements 
        System.out.println("\nTreeSet contains: "); 
        for (String TemporaryValue : TreeSetObject) { 
            System.out.println(TemporaryValue); 
        } 
        //Traversing element through Iterator in descending order
        System.out.println("\ndescending order");  
         Iterator i=TreeSetObject.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
 
       
        
         // Create a HashSet 
        System.out.println("========================\n HashSet example");
        HashSet<String> HashSetObject = new HashSet<String>(); 
  
        // add elements to HashSet 
        HashSetObject.add("card"); 
        HashSetObject.add("mobile"); 
        HashSetObject.add("computer"); 
        HashSetObject.add("Technology"); 
  
        // Duplicate removed 
        HashSetObject.add("computer"); 
  
        // Displaying HashSet elements 
        System.out.println("HashSet contains: "); 
        for (String temp : HashSetObject) { 
            System.out.println(temp); 
        } 
        
      
        //creating sortedset
        System.out.println("========================\n SortedSet example");
        SortedSet set = new TreeSet();   
        // Add the elements in the given set.  
        set.add("Lays");  
        set.add("salanty");  
        set.add("Oye Hoi");  
        set.add("cheetos");  
        System.out.println("The list of elements is given as:");  
        for (Object object : set) {  
            System.out.println(object); 
        }  
        //Returns the first element  
        System.out.println("The first element is given as: " + set.first());     
        //Returns the last element  
        System.out.println("The last element is given as: " + set.last());  
        //Returns a view of the portion of the given set whose elements are strictly less than the toElement.   
        System.out.println("The respective element is given as: " + set.headSet("cheetos"));  
        //Returns a view of the map whose keys are strictly less than the toKey.  
        System.out.println("The respective element is given as: " + set.tailSet("Oye hoi"));  
           
        
        
        //creating navigableSet
        System.out.println("========================\n NavigableSet example");   
           
        NavigableSet<String> navigableSet = new TreeSet<String>(Arrays.asList("X", "B", "A", "Z", "T"));
         
	Iterator<String> iterator = navigableSet.descendingIterator();

	System.out.println("Original Set :");
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}

	iterator = navigableSet.iterator();

	System.out.println("Sorted Navigable Set :");

	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}

	System.out.println("Head Set:"+ navigableSet.headSet("X")+"\n");

	System.out.println("Tail Set : "+ navigableSet.tailSet("T", false)+"\n");

	System.out.printf("Sub Set :"+navigableSet.subSet("B", true, "X", true)+"\n");

	System.out.printf("Last Element : "+ navigableSet.last()+"\n");

	System.out.printf("First Element : "+ navigableSet.first()+"\n");

	System.out.printf("Reverse Set : "+ navigableSet.descendingSet()+"\n");

	System.out.printf("Original Set : "+ navigableSet+"\n");
        
        
        
        //creating navigableMap
        System.out.println("\n========================\n NavigableMap example");
        
        NavigableMap<String, Integer> navigableMap = new TreeMap<String, Integer>(); 
        navigableMap.put("C", 88); 
        navigableMap.put("A", 99); 
        navigableMap.put("R", 44); 
        navigableMap.put("Q", 55); 
  
        System.out.printf("Descending Set  :"+ navigableMap.descendingKeySet()+"\n"); 
        System.out.printf("Floor Entry  : "+navigableMap.floorEntry("Q")+"\n"); 
        System.out.printf("First Entry  : "+navigableMap.firstEntry()+"\n"); 
        System.out.printf("Last Key : "+ navigableMap.lastKey()+"\n"); 
        System.out.printf("First Key : "+navigableMap.firstKey()+"\n"); 
        System.out.printf("Original Map : "+ navigableMap+"\n"); 
        System.out.printf("Reverse Map : "+navigableMap.descendingMap()+"\n");
    }
}