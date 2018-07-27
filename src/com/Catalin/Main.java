package com.Catalin;

public class Main {

    public static void main(String[] args) {
        /**This is the result of having public fields in the Player class. This was the "bad example":
         */
//        /** Encapsulation is the mechanism that allows you to restrict external access to objects in order to prevent
//         * un-authorize access to your class inner-working.
//         * We're not talking about security but about preventing other classes or pieces of code from accessing certain
//         * areas. This ca be useful when making changes to the code, ensuring that the protected areas can't be altered
//         * or broken by recent changes.
//         */
//        Player player = new Player();
////        player.name = "Catalin";
//        /** Another problem is that we might forget to initialize every field, again, this might not be a problem in
//         * a smaller application but think about a bigger application, maybe one that was not designed by you. It would
//         * be pretty frustrating to figure out which field was not initialized.
//         */
//        player.health = 20;
//        /** Allowing anyone to change the value of this field directly can result in different errors or unintended
//         * behavior. This could bypass the game rules or any validations that were set in the Player class.
//         */
//        player.weapon = "Sword";
//        /** As you can see, these fields can be accessed directly from this class because they were declared public.
//         */
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        /**By being able to access the fields from the Player class, we're taking control of the Player class data and
//         * we're able to break the rules. For example when the health should have been -1, we can change the health pool
//         * from 10 to 200.
//         */
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        /** Now for a "good example", proper encapsulation.
         */
        EnhancedPlayer player = new EnhancedPlayer("Catalin", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());
        /** The user can no longer directly access the fields with player. , instead, the getter will be used. This means
         * that the user can not directly access or change the health field or any other conditions that were set in
         * the EnhancedPlayer class.
         */
    }
}
