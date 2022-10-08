import java.util.*;
public class Array_Operation
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
           
            
            int[] a=new int[]{1,2,3,4,5};
            System.out.println("IF you want to do any opartion on given data is ");
            for(int i=0;i<a.length;i++)
            {
                 System.out.print(a[i]+"  ");
            }
            System.out.println();
            int choice;
             B b1=new B();
            do
            {
            System.out.println("Then");
            System.out.println("press 1 for insert data at specific location : ");
            System.out.println("press 2 for delete data : ");
            System.out.println("press 3 for diaplay data: ");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                   a=b1.insert(a);
                   
                   break;
                case 2:
                   a=b1.delete(a);
                   break;
                case 3:
                   b1.display(a);             
                   break;
            }
            System.out.println("Enter 0 to contniue process: ");
            choice=sc.nextInt();
        }while(choice==0);   
        }    
    }
    
    
    class B
    {   
        Scanner s=new Scanner(System.in);
        int[] insert(int[] arr)
        {
            int b[]=new int[arr.length+1];
            
            System.out.println("Enter position value at you want to insert data");
            int n=s.nextInt();
            System.out.println("Enter data:");
            int n1=s.nextInt();
            for(int i=0;i<(arr.length+1);i++)
            {
                if(i<n-1)
                    b[i]=arr[i];
                else if(i==n-1)
                  {
                    b[i]=n1;
                     System.out.println(b[i]+" is inserted ");
                  }
                else
                    b[i]=arr[i-1];
            }
           
           
           return b;
        }
        void display(int[] arr)
        {   
            System.out.print("After performed operation , element are ");
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+"  ");
            } 
            System.out.println();
        }
    
        int[] delete(int[] arr)
        {
              int[] b=new int[arr.length-1];
              System.out.println("Enter position value at that you want to delete data");
              int n=s.nextInt();
              for(int i=0;i<arr.length;i++)
              {
                  if(i<n)
                      b[i]=arr[i];
                  else if(i==n-1)
                      continue;
                  else 
                      b[i-1]=arr[i];
    
              }
              return b;
        }
    }  

