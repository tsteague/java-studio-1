package org.launchcode.java.studios.areaofacircle;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Area 
{

  public static void main( String[] args )
  {
    boolean isValid = false; 

    double radius = 0.0;
    while ( !isValid )
    {
      System.out.print( "Please enter a decimal: " );
      Scanner scanner = null;

      try
      {
        scanner = new Scanner( System.in );
        if ( scanner.hasNextDouble() )
        {
          radius = scanner.nextFloat();
        }
      }
      catch ( InputMismatchException ime )
      {
        System.out.println( "Please enter a decimal: " + radius + " = Invalid" );
        ime.printStackTrace();
        System.exit (1);
      }
      finally
      {
        scanner.close();
      }
  
      //double area = Math.PI * (2 * radius);
      if ( radius <= 0.0 )
      {
        System.out.println( "Invalid entry.  Try again." );
      }
      else
      {
        isValid = true;
      }
    }
    
    double area = Circle.getArea( radius );
  
    System.out.println( "The area of a circle of radius " + radius + " is: " + area );
  }
      
}
