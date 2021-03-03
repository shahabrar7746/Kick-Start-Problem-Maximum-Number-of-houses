
import java.awt.Desktop;
import java.net.URI;
import java.util.*;

public class newprograms {

       public  static void main (String[] args) {


Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> nums = new PriorityQueue();
		int a1 = 0;
		int a2 = sc.nextInt();
		
		
		
		for(int j = 0;j<a2;j++) {
			int sizeofarray = sc.nextInt();
			int dollars = sc.nextInt();
			int a[] = new int[sizeofarray];
		for(int i = 0;i<a.length;i++) {
			a[i] = sc.nextInt();
			nums.add(a[i]);
		}
		for(int i = 0;i<a.length;i++ ) {
			if(!nums.isEmpty()) {
			if(dollars < nums.peek()) {
				
			}else {
				dollars = dollars - nums.poll();
				a1++;
			}
		}
		}
		}
		System.out.println(a1);
	}
	
}
		