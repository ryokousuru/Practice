package com.practice.java;

public class                                                                                                   Main {

    public static void main(String[] args) {
        // write your code here
        /*
         * I'll start by demonstrating about how array elements
         * work with standard operators
         * */

        //array declarationS
        String[] a_ray = new String[5];

        //elements of the array
        a_ray[0] = "Number one";
        a_ray[1] = "Number one plus one";
        a_ray[2] = "Next one after that";
        a_ray[3] = "a-ray 3 is actually the fourth";
        a_ray[4] = "It\'s because computers actually begin at 0 and not 1";

        //int array declaration
        int[]monorail = new int[5];

        //array elements
        monorail[0]=7;
        monorail[1]=8;
        monorail[2]=12;
        monorail[3]=17;
        monorail[4]=21;

        System.out.println("The first two parts of a_ray are " + a_ray[0] + " and " + a_ray[1]);

        System.out.println("The first two monorails add up to " + ((int)monorail[0] + (int)monorail[1]));




    }
}
