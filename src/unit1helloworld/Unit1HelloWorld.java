/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit1helloworld;

/**
 *
 * @author EricKawamoto
 */
public class Unit1HelloWorld 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    /*
	// Hello, world 1.0
      	System.out.println("Hello, world!");
    */

    /*
	// Hello, world 1.1
        String outStr;
        outStr = "Hello, world!";  
      	System.out.println(outStr);
    */

    /*
	// Hello, world 1.2
        String outStr = "Hello, world!"; 
      	System.out.println(outStr);
    */

    /*
	// Hello, world 1.3
        String outStr = "Hello, "; 
      	System.out.println(outStr + "world!");
    */

    /*
	// Hello, world 1.4
        String outStr1 = "Hello, "; 
        String outStr2 = "world!";
        String outStr3 = outStr1 + outStr2;
      	System.out.println(outStr3);
    */


    /*
	// why won't this work? (slide 24)
        String outStr = "Hello, world!"; 
      	System.out.println(outStr);

        String outStr = "Goodbye, cruel world!"; 
      	System.out.println(outStr);
    */

    /*
	// why won't this work, either? (slide 25)
        String outStr = "Hello, world!"; 
      	System.out.println(outStr);

        outstr = "Hello again, world!"; 
      	System.out.println(outstr);
    */

    /*
	// why does this work instead? (slides 26-28)
        String outStr = "Hello, world!"; 
      	System.out.println(outStr);

        outStr = "Hello, neighbor!"; 
      	System.out.println(outStr);

        outStr = "Goodbye, cruel world!"; 
      	System.out.println(outStr);
    */
        
    /*
	// how about a different way? (slide 29)
        String helloStr = "Hello"; 
        String byeStr = "Goodbye"; 
      	String nbrStr = "neighbor"; 
      	String cruelStr = "cruel"; 
      	String worldStr = "world"; 
        String exclStr = "!";

      	System.out.println(helloStr + ", " + worldStr + exclStr);
      	System.out.println(helloStr + ", " + nbrStr + exclStr);
      	System.out.println(byeStr + ", " + cruelStr + " " + worldStr + exclStr);
    */
    
    // exercise 1
    /*
        String outStr = "Hello, neighbor!";
        System.out.println(outStr);
        
        run:
        Hello, neighbor!
        BUILD SUCCESSFUL (total time: 0 seconds)
    */
    // exercise 2
    /*
        String outStr = "Goodbye, ";
        System.out.println(outStr + "cruel world!");
        
        run:
        Goodbye, cruel world!
        BUILD SUCCESSFUL (total time: 0 seconds)
    */
    }
    
}
