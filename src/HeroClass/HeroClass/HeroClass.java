package HeroClass;


import java.util.Arrays;
import java.util.Scanner;


public class HeroClass  extends  GameEntity {
    public enum AttackType {

        SLASH("Slash", 30),
        FIREBALL("Fireball", 20),
        BACKSTAB("Backstab", 10);

        final int damage;
        final String type;

        AttackType(String type, int damage) {
            this.type = type;
            this.damage = damage;
        }
    }

    public int getAttack() {
        Scanner myScanner = new Scanner(System.in);
        while ( true) {
            System.out.println("Enter your attack");
            System.out.println(" this are the options" + Arrays.toString(AttackType.values()));
            String userAttack = myScanner.nextLine().trim().toUpperCase();
            try {
                AttackType attack = AttackType.valueOf(userAttack);
                System.out.println( " you use "  + attack.type + " the damage of the attack is " + attack.damage);
              return attack.damage;
            } catch (IllegalArgumentException e) {
                System.out.println( "this is not the correct attack - try again" );
            }
        }
    }

    private String name;
    private String spec;
    public int hp;
    public double str;
    public double stam;
    public double weapon;

    public HeroClass ( String name , String spec ,   int hp,  double str , double stam , double weapon) {
        this.hp = hp;
        this.stam = stam ;
        this.name = name;
        this.str = str;
        this.spec = spec;
        this.weapon = weapon;
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}

/*  *//*  public int dmg() {
        int randomNum = (int)(Math.random() * 3); // 0, 1, or 2



        if (randomNum == 0) {
            return AttackType.SLASH.damage;
        } else if (randomNum == 1) {
            return AttackType.FIREBALL.damage;
        } else { // randomNum == 2
            return AttackType.BACKSTAB.damage;
        }
    }
*//*

    public static String test3 (int x) {

        if ( x == 15) {

            return AttackType.SLASH.type;

        }else if (x == 30) {

            return AttackType.FIREBALL.type;
        }
        else {
            return AttackType.BACKSTAB.type;
            }
        }


*//*
    public static String test2(  ) {

        return AttackType.FIREBALL.type;

    }*//*



   *//* static void warScream () {


        System.out.println(" For the empreror " + test2());
    }*//*
    public double weaponDmg ( ) {

        return (this.str * this.weapon +  dmg());


    }
   *//* public double toString2() {

        return  + weaponDmg();
    }*//*



    public void healpot () {
       this.hp = this.hp + 50;

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
    public double getWeapon() {
        return weapon;
    }
    public void setWeapon(double weapon) {
        this.weapon = weapon;
    }

    public void warCry() {

        System.out.println(    getName() + " Screams " +   " death and glory!!! " );
    }




    public String getName() {
        return name;
    }

    public String getSpec() {
        return spec;
    }*/



