package project;

//package Projects;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//import jdk.internal.misc.FileSystemOption;

public class birpal {

	
 public static void add() throws IOException
 {
	 System.out.println("Enter your file name");
	 Scanner s = new Scanner(System.in);
	 String p = s.nextLine();
	 
	 File f = new File("C:/Users/bskap/OneDrive/Desktop/sumit"+p);
	 
	 if(f.createNewFile())
		 System.out.println("File is created");
	 else
		 System.out.println("File is alredy exist");
 }
 
 
 
 public static void delete()
 {
	 System.out.println("Enter file name for delete ex:- abc.txt");
	 Scanner ss = new Scanner(System.in);
	 String pp = ss.nextLine();
      
	 File ff = new File("C:/Users/bskap/OneDrive/Desktop/sumit"+pp);	
	 
	 if(ff.delete())
		 System.out.println("File is deleted");
	 else
		 System.out.println("File is not deleted or file is not found");
 }
 
 
 
 public static void search()
 {
	 System.out.println("Enter your file name to search");
	 Scanner sss = new Scanner(System.in);
	 String ppp = null;
	 ppp = sss.nextLine();
	 File fff = new File("C:/Users/bskap/OneDrive/Desktop/sumit"+ppp);
	 if( fff.exists())
	 {
		System.out.println("File is available"); 
	 }
	 else 
		 System.out.println("File is not available");
 }
 
 
 
 public static void accendingorder()
 {
	
		
	 File dir = new File("C:/Users/bskap/OneDrive/Desktop/sumit");
	    if(dir.isDirectory())
	    {
	      //  fetching the file from list the directory
	      File[] files = dir.listFiles();

	      System.out.println("All the files including folders");
	      System.out.println("@@@--------------------------------@@@");
	   
	   

	      // sort files by name
	      Arrays.sort(files, new Comparator()
	      {
	        @Override
	        public int compare(Object f1, Object f2) {
	          return ((File) f1).getName().compareTo(((File) f2).getName());
	        }
	      });

	      //  print the file name in accending order.
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	      System.out.println("\nAfter sorting by name");
	      System.out.println("|||----------------------------------|||");

	      // This is through Sort files by size.
	      Arrays.sort(files, new Comparator()
	      {
	        @Override
	        public int compare(Object f1, Object f2)
	        {
	          if (((File) f1).length() < ((File) f2).length())
	          {
	            return -1;
	          }
	          else if (((File) f1).length() > ((File) f2).length())
	          {
	            return 1;
	          }
	          else
	          {
	            return 0;
	          }
	        }
	      });

	      // Prints files in order by file size
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	      System.out.println("\nAfter sorting by length");
	      System.out.println("<<<------------------------------->>>");

	      
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	      System.out.println("-------------------------");
	      System.out.println("-------------------------");
	    }
		
 }
 

 public static void main(String[] args) throws IOException {
	 	System.out.println("##################### WELCOME TO LockedMe.com ####################");
	 	System.out.println("Application Name: Virtual Key Repository\n");
	 	System.out.println("################### Developer Details ###################");
	 	System.out.println("Name: Birpalsingh Kapoor");
	 	System.out.println("Designation: Java Developer");
	 	System.out.println("Date: 30-09-2022");
	    System.out.println("#################################################################");	
	    System.out.println();
	    System.out.println("Press Enter to Start the Application");
	    Scanner s = new Scanner(System.in);
	    String Enter = s.nextLine();
	    System.out.println("--------------------------------------------------------------------");
		while(true)
		{
			System.out.println("Enter 1: Get file names in ascending order");
			System.out.println("Enter 2: For Business Level Operation");
			System.out.println("Enter 3: Close the Application");

			System.out.println("Enter your choice");
			
			Scanner v = new Scanner(System.in);
			
			int option= v.nextInt();

			if(option==1)
			{
				accendingorder();
			}

			else if(option ==2)
			{
				System.out.println("\n--->Select Any one to perform business levele operations");
				System.out.println("\nEnter 1 : Add file");
				System.out.println("Enter 2:  Delete file");
				System.out.println("Enter 3:  Search file");
				System.out.println("Enter 4:  Go back");
				
				System.out.println("Enter your choice :- ");
				
				int input = v.nextInt();
				
				switch(input)
				{
				
				case 1: {	add();  break;  }
					
			    case 2: { delete(); break;  }
				
				case 3: { search(); break;  }
				
				case 4: {  System.out.println("Back is Successful"); break;  }
					   
		     }
		 }
			
			else if(option == 3 )	
			{ 	 System.out.println("<<Thank you for using this Application>>");	
				 System.out.println("-----------------Exit-------------------");
			      System.exit(option); 
			}
			
			else
			{
				System.out.println("Kindly enter valid input");
			}
}
				
}
	}