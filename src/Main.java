public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(150);
        boss.setDefenseType("Magic");

        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());
        System.out.println(" ");

        Hero[] heroes = createHeroes();
        System.out.println("Heroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() + ", Damage: " + hero.getDamage() +
                    (hero.getSuperpower() != null ? ", Superpower: " + hero.getSuperpower() : ""));
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(500, 50, "Fireball");
        Hero hero2 = new Hero(600, 60);
        Hero hero3 = new Hero(700, 70, "Invisibility");

        return new Hero[]{hero1, hero2, hero3};
    }
}
