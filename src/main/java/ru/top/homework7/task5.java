package ru.top.homework7;

import java.util.Scanner;

public class task5 {
    //Королю нужно убить дракона, но в его казне мало средств
//для покупки армии. Нужно создать программу, используя
//методы, которые помогут рассчитать минимальное количество копейщиков, чтобы убить
//дракона. С клавиатуры вводятся данные:
// здоровья дракона;
// атаки дракона;
// здоровье одного копейщика;
// атака одного копейщика.
//Защита, меткость и т. п. не учитывать. Копейщики наносят
//удар первыми (общий нанесенный урон – это сумма атак
//всех живых копейщиков). Если атака дракона превышает
//значение жизни копейщика (например, у копейщика жизни – 10, а атака – 15), то умирает несколько копейщиков, а
//оставшийся урон идет одному из копейщиков.
//Например, жизнь дракона – 500, атака – 55, жизнь одного копейщика – 10, атака –10, а количество копейщиков при
//данных условиях – 20.
//Лог боя для данного примера должен выглядеть так:
//Итерация 15
//Копейщики атакуют (урон 200) – у дракона осталось 300 жизней;
//Дракон атакует – осталось 15 копейщиков, один из которых ранен;
//(осталось 5 жизней);
//Копейщики атакуют – у дракона осталось 150 жизней;
//Дракон атакует – осталось 9 копейщиков;
//Копейщики атакуют – у дракона осталось 60 жизней;
//Дракон атакует – осталось 4 копейщика, один из которых ранен;
//(осталось 5 жизней)
//Копейщики атакуют – у дракона осталось 20 жизней
//Дракон атакует и побеждает
    static int numberOfSpearman = 1;
    static int healthPointSpearman;
    static int attackPointSpearman;
    static int lifeArmy;
    static int healthPointDragon;
    static int attackDragon;
    static int counter = 1;

    public static void main(String[] args) {

        System.out.print("""
                Добро пожаловать в игру "Победи дракона"!
                 Помоги Королю победить дракона, который уже не сколько зим разоряет его королевство!!!Но помни, казна вот вот опустеет, а зима долгая и лютая!
                 Копейщики - это эффективные бойцы для ведения боя как с наземными так и с воздушными целями,а содержать их не дорого :)
                 Найми и обучи минимальное количество копейщиков для победы над драконом.
                """);
        creationDragon();
        creationSpearman();
        logBattle(counter, healthPointDragon, lifeArmy);
    }

    private static void creationDragon() {
        String value = new Scanner(System.in).nextLine();

        //System.out.println("Введите количество очков здоровья Дракона:");
        healthPointDragon = new Scanner(System.in).nextInt();
        System.out.println("Введите силу атаки Дракона:");
        attackDragon = new Scanner(System.in).nextInt();
    }

    private static void creationSpearman() {
        System.out.println("Введи количество очков здоровья одного твоего бойца:");
        healthPointSpearman = new Scanner(System.in).nextInt();
        System.out.println("Введи значение атаки одного твоего бойца:");
        attackPointSpearman = new Scanner(System.in).nextInt();
        lifeArmy = healthPointSpearman * numberOfSpearman;
    }


    private static void logBattle(int loop, int lastHealthDragon, int lastHealthArmy /*int lastAttackArmy*/) {
        System.out.printf("\n==== %s цикл ====\n", loop);
        int attackArmy = attackPointSpearman * numberOfSpearman;
        int healthDragon = lastHealthDragon - attackArmy;
        if (healthDragon <= 0) {
            System.out.println("УРА!!! Дракон повержен!!! Королевство в безопасности!\n ============ VICTORY ==========");
            return;
        } else {
            System.out.printf("Копейщики атаковали дракона с силой %s - у Дракона осталось %s жизней\n", attackArmy, healthDragon);
        }

        int healthArmy = lastHealthArmy - attackDragon;
        for (attackArmy = attackPointSpearman * numberOfSpearman; attackArmy > healthPointDragon; ) {
            if (healthArmy <= 0) {
                System.out.println("Поражение!!! Все копейщики пали смертью храбрых!!!\n ============= GAME OVER =============\n");
                System.out.println("Тренируем новых войнов");
                numberOfSpearman++;
                healthArmy = healthPointSpearman * numberOfSpearman;
                attackArmy = attackPointSpearman * numberOfSpearman;
            } else {
                System.out.println("конец");
            }
            return;
        }
        logBattle(counter++, healthDragon - attackArmy, healthArmy - attackDragon);
    }


}
