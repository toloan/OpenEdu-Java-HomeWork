import java.util.Scanner;

public class String_HW {
 public static void main(String[] args){
	 int count;
	 count=0;
	 Scanner scanner= new Scanner(System.in);
	 System.out.print("Nhat chuoi");
	 String s=scanner.nextLine();
	 for(int i=0;i<s.length();i++){
		 if(s.charAt(i)=='a')
			 count=count+1;
	 }
	 System.out.println("So a la: " + count);
	//String Snew;
	s=s.trim();
	s=s.replaceAll(" +", " ");
	String[] Lastname=s.split(" ");
	System.out.println(" co "+ Lastname.length + " chu");
	if(Lastname[0].compareTo("Doan")==0)
		System.out.print(true);
	else System.out.print(false);
	scanner.close();
 }
}
