package org.example;

public class NestedLoop {

    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 10 ; i++) { // i = 1

            System.out.println("i:  " + i);

            inner:
            for (int j = 0; j < 10 ; j++) {
                System.out.println("i : j  " + i +" : "+ j);
                if(j == 5){
                    break outer;
                }
            }

        }//end for

    }
}
