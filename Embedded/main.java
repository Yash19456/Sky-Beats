import java.sql.*;
import java.util.*;
public class main {
	
	public static void stakeholderlist() {
		System.out.println("1. Customer");
		System.out.println("2. Employee");
		System.out.println("3. Producer");
		System.out.println("4. Manager");
		System.out.println("5. ADCompany");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Class.forName("com.mysql.jdbc.Driver"); 
		Scanner sc=new Scanner(System.in);
        
        System.out.println("New USER(n) OR Existing USER(e)");
        String ch2=sc.next();
        
        if (ch2.compareTo("e")==0) {
        	System.out.println("You want to enter as an existing : ");
            stakeholderlist();
            int ch1=sc.nextInt();
            
            if (ch1==1) {
            	customer c=new customer();
            	c.existing();
            }
            else if (ch1==2) {
            	
            
            }
            else if (ch1==3) {
            	
            }
            else if (ch1==4) {
            	
            }
            else if (ch1==5){
            	
            }
            else {
            	System.out.println("Invalid Choice");
            }
        }
        else if (ch2.compareTo("n")==0) {
        	System.out.println("You want to enter as a new : ");
            stakeholderlist();
            int ch1=sc.nextInt();
            
            if (ch1==1) {
            	customer c=new customer();
            	c.newCustomer();
            }
            else if (ch1==2) {
            
            }
            else if (ch1==3) {
            	
            }
            else if (ch1==4) {
            	
            }
            else if (ch1==5){
            	
            }
            else {
            	System.out.println("Invalid Choice");
            }
        }
        else {
        	System.out.println("Invalid Choice");
        }
        
        
//        st.close();
//        con.close();


	}

}