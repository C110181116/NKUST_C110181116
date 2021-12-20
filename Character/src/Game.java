import java.sql.Statement;
import java.util.*;

public class Game {
    public static void main(String[] args) {
        boolean role1Empty = false ,role2Empty = false;
        System.out.println("選擇角色1職業：1.狂戰士 2.弓箭手 3.魔法師");
        Scanner role1Career = new Scanner(System.in);
        int career1Code = role1Career.nextInt();
        if(career1Code == 1){
            role_1 role1 = new role_1("狂戰士","大劍",30,5,15,"斬擊");
            role1.getRole1Status();
        }else if(career1Code == 2){
            role_1 role1 = new role_1("弓箭手","弓",15,10,30,"連射");
            role1.getRole1Status();
        }else if(career1Code == 3){
            role_1 role1 = new role_1("魔法師","法杖",10,40,30,"小火球");
            role1.getRole1Status();
        }else{
            System.out.println("未選擇職業");
            role1Empty = true;
        }
        System.out.println("選擇角色2代碼：1.狂戰士 2.弓箭手 3.魔法師");
        Scanner role2Career = new Scanner(System.in);
        int career2Code = role2Career.nextInt();
        if(career2Code == 1){
            role_2 role2 = new role_2("狂戰士","大劍",30,5,15,"斬擊");
            role2.getRole2Status();
        }else if(career2Code == 2){
            role_2 role2 = new role_2("弓箭手","弓",15,10,30,"連射");
            role2.getRole2Status();
        }else if(career2Code == 3){
            role_2 role2 = new role_2("魔法師","法杖",10,40,30,"小火球");
            role2.getRole2Status();
        }else{
            System.out.println("未選擇職業");
            role2Empty = true;
        }
//        if()
//        while ((role1Empty && role2Empty) == false){
//
//        }
    }
}
