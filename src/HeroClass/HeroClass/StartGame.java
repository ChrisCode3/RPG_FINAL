package HeroClass;


import java.util.ArrayList;

public class StartGame {



  ArrayList<MonsterClass> monsters = new ArrayList<>();


  ArrayList<HeroClass> classes = new ArrayList<>();


    public void printMonsterslist() {

        int monstersAmount = 0;

        for (MonsterClass monster : monsters) {


            monstersAmount = monstersAmount +1;


            System.out.println("-----");

            System.out.println(" The name of the monster is " + monster.getName());
            System.out.println("Life is left:  " + monster.getHp());
            System.out.println("-----");

            System.out.println("There are " + monstersAmount + " Monster left in the game");


        }

    }

    public void removeMonster(MonsterClass monster) {

        monsters.remove(monster);

    }











}
