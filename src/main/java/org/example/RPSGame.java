package org.example;

public class RPSGame {

    public static void main(String[] args) {
        //사용자 값 0,1,2
        int user = (int) (Math.random() * 3);
        //컴 값 0,1,2
        int com = (int) (Math.random() * 3);

        if(user < com) {
            user = user + 3;
        }//end if

        int result = user - com; //0,1,2

        System.out.println("USER: " + user);
        System.out.println("COM: " + com);

        switch (result){
            case 0:
                System.out.println("비김");
                break;
            case 1:
                System.out.println("이김");
                break;
            case 2:
                System.out.println("졌다");
                break;
        }//end switch
    }
}
