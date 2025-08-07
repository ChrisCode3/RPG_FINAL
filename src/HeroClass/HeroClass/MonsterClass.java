package HeroClass;

import java.util.Random;

public class MonsterClass  extends  GameEntity{

    private String name;
    public int hp;
    public double str;
    public double stam;


    public MonsterClass(String name, int hp, double str, double stam) {
        this.hp = hp;
        this.name = name;
        this.str = str;
    }

    // enum to cleanly have the separate attack types and damage
    public enum MonsterAttackType {
        Bite(" Bite", 10),
        Swipe(" Swipe", 10),
        Claw(" Claw", 10);

        final int damage;
        final String type;

        MonsterAttackType(String type, int damage) {
            this.type = type;
            this.damage = damage;
        }

        public int damage() {return damage;}
        public String type() {return type;}}


    // method to generate random attack from monster and returns the damage
    public  int getRandomAttack() {
        MonsterAttackType[] values = MonsterAttackType.values();
        Random random = new Random();
        int index = random.nextInt(values.length);  // get random index
        System.out.println(" The attack is" + getRandomAttackType(index) + " for " + values[index].damage() + " damage");
        return values[index].damage();
    }
    //  method to return the type of the random attack used.
    public static String getRandomAttackType(int index) {

        MonsterAttackType[] values = MonsterAttackType.values();
        return values[index].type;

    }

    @Override
    public String toString() {
        return this.name;
    }

   // various methods for future features
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public double getStr() {
        return str;
    }
    public void setStr(double str) {
        this.str = str;
    }
    public double getStam() {
        return stam;
    }
    public void setStam(double stam) {
        this.stam = stam;
    }

    }



