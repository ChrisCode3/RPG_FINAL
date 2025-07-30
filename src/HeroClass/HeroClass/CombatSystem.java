package HeroClass;


import java.util.ArrayList;

public class CombatSystem {


    private final HeroClass player;
    private final ArrayList<MonsterClass> manyEnemy;


    public CombatSystem(HeroClass player, ArrayList<MonsterClass> manyEnemy) {

        this.player = player;
        this.manyEnemy = manyEnemy;

    }

        public void Map () {


            int[][] myMap = {
                    {0, 0, 0,},
                    {0, 0, 0},
                    {0, 0, 0}
            };


            int doom  = 2893;

            myMap[0][2] = doom;

            System.out.println( " this is in the myap " +  myMap[0][2]);


        }









    public void Combat() {
        System.out.println("starting life " + player.hp);

        MonsterClass enemy = manyEnemy.get(0);

        while (player.hp > 0 && enemy.hp > 0) {
            System.out.println("   ");
           // System.out.println(enemy.getRandomAttack());
            player.hp = (int) (player.hp - enemy.getRandomAttack());
            System.out.println( "You have " + player.hp + " life left");

           enemy.hp = (int) (enemy.hp - player.getAttack());

            System.out.println( " The monster has " + enemy.getHp() + " life left");
           // enemy.hp = (int) (enemy.hp - player.weaponDmg());

        /*    if (enemy.hp <= 0 && player.hp > 0) {
                System.out.println("Warrior Wins ");
                System.out.println(player.hp);
                //    Warrior.warCry();
            }

            if (player.hp <= 0 && enemy.hp > 0) {
                System.out.println("The monster wins ");
                System.out.println(  "  His life is :" +  enemy.hp);
                //    Wizard.warCry();

            }
*/
            if ( player.hp < 0 ) {

                System.out.println(" you are dead");
            }




        }


    }
}
