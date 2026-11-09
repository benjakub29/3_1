
public class Main         
{
public static void main(String[] args) 
  {
 int wys = 6;
    
  //1
  for(int i = 1; i <=wys; i++)
    {
         for (int j = 1; j <= i; j++)
          {
            System.out.print("*");
          }
      System.out.println();
    }   
      System.out.println();
  
//2
  for(int i = 1; i <=wys; i++)
    {
         for (int j = 1; j <= wys-i; j++)
          {
            System.out.print(" ");
          }
         for (int k = 1; k<=i; k++)
          {
            System.out.print("*");
          }
      System.out.println();
    }
      System.out.println();


  //3
    for(int i = wys; i >=1; i--)
      {
           for (int j = 1; j <= i; j++)
            {
              System.out.print("*");
            }
        System.out.println();
      }   
    System.out.println();
    
      //4
    for(int i = wys; i >=1; i--)
      {
           for (int j = 1; j <= wys-i; j++)
            {
              System.out.print(" ");
            }
           for (int k = 1; k<=i; k++)
            {
              System.out.print("*");
            }
        System.out.println();
      }

    
    for(int i = wys; i >= 1; i--)
      {
           for (int j = 1; j <= wys-i; j++)
            {
              System.out.print("*");
            }
           for (int k = 1; k<=i; k++)
            {
              System.out.print(" ");
            }
        System.out.println();
      }
    
    
  }
}

