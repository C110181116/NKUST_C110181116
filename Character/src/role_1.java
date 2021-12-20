import java.util.Random;

public class role_1 {
    String Career;
    int HP; //data member
    int MP; //data member
    int ATT; //data member
    String weapon;
    String Skill;
    int damageRange;

    role_1(String roleCareer,String roleWeapon, int roleHP, int roleMP, int roleATT, String roleSkill) {
        Career = roleCareer;
        HP = roleHP;
        MP = roleMP;
        ATT = roleATT;
        weapon = roleWeapon;
        Skill = roleSkill;
        damageRange = (int)(Math.random() * ATT);
    }
    void getRole1Status() {
        System.out.println("=====玩家1訊息=====");
        System.out.println("職業：" + Career);
        System.out.println("武器：" + weapon);
        System.out.println("Attack：" + ATT);
        System.out.println("HP：" + HP);
        System.out.println("MP：" + MP);
        System.out.println("技能：" + Skill);
        System.out.println("==================");
    }
}
