package HeroClass;


import java.util.Arrays;
import java.util.Scanner;

public class HeroClass  implements   GameEntity {
    // enums to control and select the type of attacks and damage available.
    public enum AttackType {
        SLASH("Slash", 2000),
        FIREBALL("Fireball", 20),
        BACKSTAB("Backstab", 10);

        final int damage;
        final String type;

        AttackType(String type, int damage) {
            this.type = type;
            this.damage = damage;
        }
    }
// method for the player to select which attack to use - also throw an error if the player does not select one of the 3 options availible.
    public int getAttack() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your attack");
            System.out.println("These are the options " + Arrays.toString(AttackType.values()));
            String userAttack = myScanner.nextLine().trim().toUpperCase();
            try {
                AttackType attack = AttackType.valueOf(userAttack);
                System.out.println(" you use " + attack.type + " the damage of the attack is " + attack.damage);
                return attack.damage;
            } catch (IllegalArgumentException e) {
                System.out.println("this is not the correct attack - try again");
            }
        }
    }

    private String name;
    private String spec;
    public int hp;
    public double str;
    public double stam;
    public double weapon;

    public HeroClass(String name, String spec, int hp, double str, double stam, double weapon) {
        this.hp = hp;
        this.stam = stam;
        this.name = name;
        this.str = str;
        this.spec = spec;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return this.name;
    }

// various methods for future features
    public void healpot() {this.hp = this.hp + 50;}
    public int getHp() {return hp;}
    public void setHp(int hp) {this.hp = hp;}
    public double getStr() {return str;}
    public void setStr(double str) {this.str = str;}
    public double getStam() {return stam;}
    public void setStam(double stam) {this.stam = stam;}
    public double getWeapon() {return weapon;}
    public void setWeapon(double weapon) {this.weapon = weapon;}
}

