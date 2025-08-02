package HeroClass;


import java.util.Random;

 class MonsterClass  extends  GameEntity{

    private String name;

    public int hp;

    public double str;

    public double stam;


    public MonsterClass(String name, int hp, double str, double stam) {

        this.hp = hp;
        this.name = name;
        this.str = str;

    }


    public enum MonsterAttackType {
        Bite(" Bite", 30),
        Swipe(" Swipe", 20),
        Claw(" Claw", 10);

        final int damage;
        final String type;

        MonsterAttackType(String type, int damage) {

            this.type = type;
            this.damage = damage;


        }


        public int damage() {

            return damage;
        }


        public String type() {

            return type;
        }


    }

 /*   public int dmg() {



        return  MonsterAttackType.Swipe.damage;

        return  MonsterAttackType.Swipe.damage;
        return  MonsterAttackType.Swipe.damage;

    }*/


    public  int getRandomAttack() {
        MonsterAttackType[] values = MonsterAttackType.values();
        Random random = new Random();
        int index = random.nextInt(values.length);  // get random index
        System.out.println(" The attack is" + getRandomAttackType(index) + " for " + values[index].damage() + " damage");
        return values[index].damage();
    }


    public static String getRandomAttackType(int index) {

        MonsterAttackType[] values = MonsterAttackType.values();
        return values[index].type;

    }

/*    public void removeMonster( MonsterClass monsters) {

        monster.remove(MonsterClass);

    }*/


   /* public int dmg() {
        int randomNum = (int)(Math.random() * 3); // 0, 1, or 2



        if (randomNum == 0) {
            return MonsterAttackType.Bite.damage;
        } else if (randomNum == 1) {
            return MonsterAttackType.Swipe.damage;
        } else {
            return MonsterAttackType.Claw.damage;
        }
    }*/




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


    @Override
    public String toString() {

        return this.name;
    }


    }



