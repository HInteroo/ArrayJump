
//you can also use imports, for example:
//import java.util.*;
import java.util.ArrayList;
import java.util.Random;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");
public class arrayJump {
	
	public int solution(int[] A) {
			int jump = 0;
			int index=0;
			boolean done = false;
			ArrayList<Integer> contain = new ArrayList<Integer>();
			while (!done){
				if(-1<index){
					if(index<A.length) {
						if(!contain.contains(index)){
							contain.add(index);
							index = (A[index]+index);
							jump++;
						}
						else{
							jump = -1;
							break;
						}
					}
					else {
						break;
					}
				}
				else{
					jump = -1;
					done = true;
				}
			}
			return jump;
	}
	public static void main(String[] args) {
		int A[] = new int[100000];
//		int A[] = {2,3,-1,1,3};
		Random random=new Random();
		for(int i =0; i<99999; i++){
			int randomNumber=(random.nextInt(1000+1000)-1000);
			A[i] = randomNumber;
		 }
		arrayJump sol = new arrayJump();
		System.out.println("\n"+sol.solution(A));
	}
}