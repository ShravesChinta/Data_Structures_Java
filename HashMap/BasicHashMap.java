import java.util.*;
public class Main
{
	public static void main(String[] args) {
	HashMap<String, Integer> happy=new HashMap<>();
	happy.put("A",1);
	happy.put("B",2);
	happy.put("C",3);
    happy.put("D",4);
    happy.put("E",5);
    happy.put("F",6);
    System.out.println(happy);
    System.out.println(happy.keySet());
    happy.putIfAbsent("F",44);
    System.out.println(happy);
    System.out.println(happy.containsKey("B"));
    System.out.println(happy.containsValue(5));
    System.out.println(happy.replace("A",23456));
    System.out.println(happy);
    System.out.println(happy.values());
    
    
    for(String s:happy.keySet())
    {
       System.out.println(s+" "+ ":" + happy.get(s));
        
    }
	}
	
}


/***
Output
{A=1, B=2, C=3, D=4, E=5, F=6}
[A, B, C, D, E, F]
{A=1, B=2, C=3, D=4, E=5, F=6}
true
true
1
{A=23456, B=2, C=3, D=4, E=5, F=6}
[23456, 2, 3, 4, 5, 6]
A :23456
B :2
C :3
D :4
E :5
F :6

***/
