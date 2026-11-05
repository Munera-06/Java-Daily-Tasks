/*Question:

Write a Java program to find and print the elements that appear only once in an array. Use nested for loops to compare each element with the elements before and after it. Use a boolean variable to identify duplicate elements.*/

package Package1;

public class Day8_Task12 {

	public static void main(String[] args) {
		int a[]= {1,2,3,1,2,3,2,5};
		for(int i=0; i<a.length; i++) //0<5--t  //1<5--t  //2<5--t  //3<5--t //4<5--t //5<5--f
		{
			boolean temp=false; //
			for(int j=0;j<i;j++) //0
			{
				if(a[i]==a[j])
				{
					temp=true;
					break;
				}
			}
			for(int j=i+1;j<a.length;j++) //1<5--t  2<5--t  3<5--t  //2<5--t 3<5--t 4<5--t   //3<5--t 4<5--t 5<5--f  //4<5--t 5<5--f //5<5--f
			{
				if(a[i]==a[j]) //1==2--f 1==3--f 1==1--t  //2==3--f  2==1--f  2==2--t  //3==1--f  3==2--f  //1==2--f
				{
					temp=true; 
					break;
				}
			}
			if(temp==false)
			{
				System.out.println(a[i]);
			}
		}
	
	}
}

