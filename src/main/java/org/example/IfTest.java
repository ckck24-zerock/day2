package org.example;

public class IfTest {

    public static void main(String[] args) {

        //랜덤 int 값 0.0 - 0.9999 * 3 = 5.9999
        int value = (int) (Math.random() * 6) + 1; //0,1,2

        System.out.println(value);

        int oddEven = value % 2; //2로 나눈 나머지 0,1

        //만일 oddEven값이 0이면 짝수 출력  ==> boolean (참/거짓)

        if(oddEven == 1){
            System.out.println("ODD");
        }else {
            System.out.println("EVEN");
        }


    }
}
