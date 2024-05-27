import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ParryWindow parry = new ParryWindow(new CountDownLatch(1));
        Boss boss = new Boss();

        System.out.println("""
                This is a short boss battle HEAVILY inspired by one boss from Lies of P, please enjoy.
                
                [...]
                Exhaustion make you doubt about thy choices, thee try to speak out loud thy name to verify if you're still sane:""");
        Char player = new Char(read.nextLine(), 100,
                rand(90, 100),   // hp
                rand(20, 30),    // str
                rand(20, 35));   // def

        System.out.println("You see an great gate ahead of you, thy journey is almost in the end.\nOpen?");
        read.next();
        System.out.println("""
                Before you take any action the giant rock doors began to move before thy eyes.
                The light from outside slowly enters the room as dust settles on the floor.""");

        while (true) {
            System.out.println("Keep going?"); // for some reason, if you try to input "y", it doesn't recognize the first time
            if (read.nextLine().trim().equalsIgnoreCase("y") ||
                read.nextLine().trim().equalsIgnoreCase("yes"))
                break;
            else
                System.out.println("You don't have a choice. Keep going?");
        }

        System.out.println("""
                From the shadows, a giant made of something that was once flesh appear...
                Prepare thyself.""");

        // <----/Battle/---->
        outerloop:
        while (true) {
            yourTurn(player, boss, read);
            bossTurn(player, boss, parry);
            switch (checkBattleState(player, boss)) {
                case 1:
                    System.out.println("It was not meant to be...\n\n\nYou died.");
                    break outerloop;
                case 2:
                    System.out.println("""
                            The giant fell on the floor, the waning light from it's eyes is the herald of a new era.
                            There is no time to rest, keep going?""");
                    read.next();
                    System.out.println("\nThank you for playing this short story.");
                    break outerloop;
                default:
                    break;
            }
        }
        // <----/Battle/---->
    }

    public static int rand(int floor, int ceiling){
        return new Random().nextInt((ceiling-floor) + 1) + floor;
    }

    public static void delay(double seconds) {
        long milliseconds = (long) (seconds * 1000);
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted!");
        }
    }

    public static int checkBattleState (Char player, Boss boss){
        if (player.getHp() <= 0)
            return  1;
        if (boss.getHp() <= 0)
            return 2;
        return 0;
    }

    public static void bossTurn(Char player, Boss boss, ParryWindow parry) {
        // Receiving Damage
        if (boss.getStagger() >= 200) {
            System.out.println("The " + boss.getName() + " stood up!");
            boss.setFallen(false);
            boss.zeroStagger();
        } else if (boss.getStagger() >= 100) {
            boss.setPrepAttack(false);
            if (!boss.isFallen())
                System.out.print("The " + boss.getName() + " has fallen due your efforts.");
            else
                System.out.print("The " + boss.getName() + " is struggling to get up.");
            return;
        }

        // Dealing Damage
        if (!boss.isPrepAttack()) {
            System.out.println("The entire arena tremble as the " + boss.getName() + " prepares an attack.");
            boss.setPrepAttack(true);
        } else {
            boss.setPrepAttack(false);
            if (player.isEvading()) {
                System.out.println("\nThe impact of his attack in the ground behind you makes you consider" +
                        " the frailty of you body.");
                player.setEvading(false);
            } else {
                player.setEvading(false);
                System.out.println("Here it comes.");

                // THE parry
                CountDownLatch latch = new CountDownLatch(1);
                parry.createAndShow(latch);
                try {
                    latch.await();  // Wait for the parry window to finish
                } catch (InterruptedException e) {
                    System.err.println("Latch interrupted!");
                }

                if (parry.isParried()) {  // Updated to static access to isParried()
                    System.out.println("You parried it with mastery.");
                } else {
                    System.out.println("\nThe hands of the " + boss.getName() + " weigh on you as thy sins.");
                    System.out.println("You received " + (boss.getStr() - player.getDef()) + " of damage");
                    player.getAttacked(boss.getStr() - player.getDef());
                    System.out.println("Your HP: " + player.getHp() + "/100");
                }
            }
        }
    }


    public static void yourTurn(Char player, Boss boss, Scanner read){
        if (player.isEvading()) {
            System.out.println("You recover thy posture from evading such a threat");
            player.setEvading(false);
        }
        outerloop:
        while (true) {
            System.out.println("\nYour turn:\n1. Attack\n2. Check\n3. Item\n4. Evade");
            switch (read.nextInt()) {
                case 1:
                    if (boss.getStagger() >= 100) {
                        System.out.println("1. " + boss.getName() + " (Head wound)");
                        if (read.nextInt() == 1) {
                            boss.addStagger(50);
                            boss.setHp(player.getStr()*12);
                            System.out.println("You attack the wound of the " + boss.getName() + ".\nThy sword" +
                                    " smoothly enters his body dealing " + (player.getStr()*12) + " damage.");
                            break outerloop;
                        } else {System.out.println("Invalid input"); break;}
                    } else {
                        System.out.println("1. " + boss.getName());
                        if (boss.isInspecioned()) {System.out.println("2. It's leg");}
                        // attack target
                        switch (read.nextInt()) {
                            case 1: // his body
                                boss.addStagger(5);
                                boss.setHp(player.getStr());
                                System.out.println("\nYou feel thy sword loosing it's edge when trying to swing it " +
                                        "across the " + boss.getName() + " skin.\nYou dealt " + player.getStr() + " damage");
                                break outerloop;
                            case 2: // his leg
                                if (boss.isInspecioned()) {
                                    boss.addStagger(45);
                                    boss.setHp(player.getStr());
                                    System.out.println("You attack the legs of it, in a closer look you perceive that" +
                                            " this monster was once fought against another hero.");
                                    System.out.println("The " + boss.getName() + " seems to react.\nYou dealt "
                                            + player.getStr() + " damage");
                                    break outerloop;
                                } else {System.out.println("Invalid input"); break;}
                            default:
                                System.out.println("Invalid input"); break;
                        }
                        break;
                    }
                case 2:
                    System.out.println("1. " + boss.getName() + "\n2. You");
                    switch (read.nextInt()) {
                        case 1:
                            System.out.println(boss); break;
                        case 2:
                            System.out.println(player); break;
                        default:
                            System.out.println("Invalid input"); break;
                    }
                    break;
                case 3:
                    if (player.getPotions()>0){
                        System.out.println("You still have " + player.getPotions() + " potions.\nUse one?");
                        if(read.nextLine().equalsIgnoreCase("y") ||
                                read.nextLine().equalsIgnoreCase("yes")) {
                            player.heal();
                            System.out.println("You feel revitalized.\n+60 hp");
                            break outerloop;
                        }
                    } else {System.out.println("No more potions, you used them all.");}
                    break;
                case 4:
                    System.out.println("You evade the next turn.");
                    player.setEvading(true);
                    break outerloop;
                default:
                    System.out.println("Invalid input"); break;
            }
        }
    }
}