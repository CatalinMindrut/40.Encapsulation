package com.Catalin;

public class Player {
    /** Class without encapsulation:
     */
//    public String name;
    public String fullName;
    /** We've changed the name of the field "name" and this change should not affect any other class because this is an
     * internal change. The internal field name. But switching to the Main class that is calling this class, you can see
     * that the line where the name of the player is set will now have an error. Because the name of the field changed.
     * This means that any change made in this class will also have to be updated in the Main class. For an application
     * like this, that is this small, this might not seem like a big issue but in a bigger application with multiple
     * classes and fields, this could become a bigger time consuming issue.
     */
    public int health;
    public String weapon;

    public  void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            //Reduce the number of lives remaining for the player
        }
    }
    public int healthRemaining(){
        return this.health;
    }


//    private String name;
//    private int health = 100;
//    private String weapon;
//
//    public Player(String name, int health, String weapon) {
//        this.name = name;
//
//        if(health >0 && health <=100) {
//            this.health = health;
//        }
//
//        this.weapon = weapon;
//    }
//
//
//    public void loseHealth(int damage, int fallDamage) {
//        this.health = this.health - damage;
//        if (this.health - damage <= 0) {
//            System.out.println("Player is knocked out.");
//        } else if (this.health - fallDamage <= 0) {
//            System.out.println("Player fell and broke his neck.");
//        }else if(health >0 && health <100){
//            System.out.println("Player is wounded.");
//        }
//        if(health == 100 || health >100){
//            health = 100;
//            System.out.println("Player is at full health.");
//        }
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getHealth() {
//        return health;
//    }
//
//    public String getWeapon() {
//        return weapon;
//    }
}
