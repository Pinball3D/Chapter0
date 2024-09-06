public class BasicManipulations {
    public static void main(String[] args) {
        //TASK 1
        /*
        System.out.print("A ");
        System.out.print("OneTwo");
        -- Used print not printLn to keep it on the same line but use two statements
        Console:
        A OneTwo
        */
        //TASK 2
        /*
        System.out.println("B One");
        System.out.println("Two");
        -- Used printLn to make sure the strings print on separate lines
        Console:
        B One
        Two
        */
        //TASK 3
        /*
        System.out.println("C One\nTwo");
        -- Used escaping \n to split on separate lines while using one statement
        Console:
        C One
        Two
        */
        //TASK 4
        /*
        System.out.println("D One");
        System.out.println("Two");
        System.out.print("Three");
        System.out.println("Four");
        -- used one print statement to keep "ThreeFour" on the same line
        Console:
        D One
        Two
        ThreeFour
        */
        //TASK 5
        /*
        System.out.print("E One\nTwo\nThree\nFour");
        -- used one print statement with \n to ensure the outputs were on separate lines
        Console:
        E One
        Two
        Three
        Four
        */
        //TASK 6
        /*
        System.out.println("F One");
        System.out.print("Two\n");
        System.out.print("Three\n");
        System.out.println("Four");
        -- Used \n on the print statements to make a line break.
        Console:
        F One
        Two
        Three
        Four
        */
        //TASK 7
        /*
        System.out.print("G One\nTwo\nThree\nFour\n\"Five\"");
        -- Used \n for line breaks and \" to add quotes around five
        Console:
        G One
        Two
        Three
        Four
        "Five"
         */
        //TASK 8
        /*
        System.out.print("H One\nTwo\nThree\nFour\n\"Five\"\n\tSix");
        -- Used \t for tab, \n for line breaks
        Console:
        H One
        Two
        Three
        Four
        "Five"
	        Six
         */
        //TASK 9
        /*
        System.out.print("I One\nTwo\nThree\nFour\n\"Five\"\n\tSix\n\\Seven/");
        -- Used \\ for single backslash, \t for tab, \n for line breaks
        Console:
        I One
        Two
        Three
        Four
        "Five"
	        Six
	    \seven/
         */
        //TASK 10
        /*
        System.out.println("10");
        System.out.println(10);
        -- on second statement I didn't use " to print the value of 10
        Console:
        10
        10
         */
        //TASK 11
        /*
        System.out.println("10+10");
        System.out.println(10+10);
        -- omitted quotes in second statement to print the sum of 10 and 10
        Console:
        10+10
        20
        */
        //TASK 12
        /*
        System.out.println("10+10");
        System.out.println(10+10);
        System.out.println("The length is "+10);
        -- Used quotes around string but didn't on 10
        Console:
        10+10
        20
        The length is 10
        */
        //TASK 13
        /*
        System.out.println("10+10");
        System.out.println(10+10);
        System.out.println("The length is "+10);
        System.out.print("The width is ");
        System.out.println(5);
        -- used print on "the width is" to make the 5 on the same line
        Console:
        10+10
        20
        The length is 10
        The width is 5
        */
        //TASK 14
        /*
        System.out.println("10+10");
        System.out.println(10+10);
        System.out.println("The length is "+10);
        System.out.print("The width is ");
        System.out.println(5);
        System.out.println("The area is "+5*10+" square inches");
        -- closed string and used + to add the product of 5 and 10 to the string.
        Console:
        10+10
        20
        The length is 10
        The width is 5
        The area is 50 square inches
        */
        //TASK 15
        /*
        System.out.println("10+10");
        System.out.println(10+10);
        System.out.println("The length is "+10);
        System.out.print("The width is ");
        System.out.println(5);
        System.out.println("The area is "+5*10+" square inches");
        System.out.println("The area divided by the width is "+50/5);
        -- used / to divide 50 by 5 and add the output to the string with +
        Console:
        10+10
        20
        The length is 10
        The width is 5
        The area is 50 square inches
        The area divided by the width is 10
        */
        //TASK 16
        /*
        System.out.println("10+10");
        System.out.println(10+10);
        System.out.println("The length is "+10);
        System.out.print("The width is ");
        System.out.println(5);
        System.out.println("The area is "+5*10+" square inches");
        System.out.println("The area divided by the width is "+50/5);
        System.out.println();
        System.out.println("The average of "+5+" and "+10+" is "+(10+5)/2.0);
        -- used + to concatenate, put the .0 on 2 to make sure it outputs 7.5 and not 7
        Console:
        10+10
        20
        The length is 10
        The width is 5
        The area is 50 square inches
        The area divided by the width is 10

        The average of 5 and 10 is 7.5
         */

    }
}
