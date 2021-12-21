public class role_2 {
    String Career; //職業
    int HP; //血量
    int MP; //魔力
    int ATT; //攻擊力
    String weapon; //武器
    String Skill; //技能
    int damageRange; //傷害範圍

    role_2(String roleCareer,String roleWeapon, int roleHP, int roleMP, int roleATT, String roleSkill) {
        Career = roleCareer;
        HP = roleHP;
        MP = roleMP;
        ATT = roleATT;
        weapon = roleWeapon;
        Skill = roleSkill;
        damageRange = (int)(Math.random() * ATT);
    }
    void getRole2Status() {
        System.out.println("=====玩家2訊息=====");
        System.out.println("職業：" + Career);
        System.out.println("武器：" + weapon);
        System.out.println("Attack：" + ATT);
        System.out.println("HP：" + HP);
        System.out.println("MP：" + MP);
        System.out.println("技能：" + Skill);
        System.out.println("==================");
    }
}
