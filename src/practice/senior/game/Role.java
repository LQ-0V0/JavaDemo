package practice.senior.game;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String talent;

    String[] boytalent = {"天下无双" , "一骑当千" , "无名鼠辈"};
    String[] girltalent = {"倾国倾城" , "貌美如花" , "惨不忍睹"};

    public Role(){

    }

    public Role(String name , int blood , char gender){
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setTalent(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(char gender) {
        Random r = new Random();

        if (gender == '男'){
            int index = r.nextInt(boytalent.length);
            this.talent = boytalent[index];
        }else if (gender == '女'){
            int index = r.nextInt(girltalent.length);
            this.talent = girltalent[index];
        }else{
            this.talent = "不堪入目";
        }
    }

    //定义攻击方法,方法调用者攻击参数
    public void attack(Role role){
        //造成1~20点血
        Random rand = new Random();
        int hurt =rand.nextInt(20) + 1;

        //被攻击后的剩余血量
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);

        System.out.println(this.getName() + "攻击了" + role.getName() + "造成" + hurt + "的伤害");
        System.out.println(role.getName() + "当前剩余" + remainBlood + "血量");

    }

    public void showRoleInfo(){
        System.out.println("name:" +getName());
        System.out.println("blood:" +getBlood());
        System.out.println("gender:" +getGender());
        System.out.println("talent:" +getTalent());
    }
}
