package virtual_pet;


public abstract class Organic extends Pet {
    double hunger;
    int happiness;
    int thirst;

    public Organic(String petName, String petColor, int age, double hunger, int thirst, int happiness, boolean isAlive) {
        super(petName, petColor, age, isAlive);
        this.hunger = hunger;
        this.happiness = happiness;
        this.thirst = thirst;
    }

    public void care() {
        happiness = happiness + 3;
    }

    public abstract void petReport();

    @Override
    public boolean getIsAlive() {
        return super.getIsAlive();
    }


    @Override
    public void tick() {
        happiness--;
        age++;
        thirst++;

        if (age <= 10) {
//            System.out.println("A year has passed and " + petName + " is now " + age + ".");
        }
        if (age == 11) {
            isAlive = false;
            System.out.println(petName + " has grown old and weak.");
            System.out.println(petName + " has died!");
        }

        double v = .5;
        if (age == 0 || age == 1) {
            hunger = hunger + v;
//            System.out.println(new StringBuilder().append("Your pet ").append(petName).append("'s hunger has changed to ").append(hunger).toString());
        } else if (age > 1 && age <= 10) {
            hunger = hunger + (v + v);
//            System.out.println(new StringBuilder().append("Your pet ").append(petName).append("'s hunger has changed to ").append(hunger).toString());
        } else {
            System.out.println();
        }

        if (happiness >= 10) {
            happiness = 10;
            System.out.println(petName + " is as happy as can be! Great work!");
        }
        if (happiness <= 0) {
            isAlive = false;
            System.out.println("Oh no! " + petName + "'s poor heart can't take it anymore...");
            System.out.println(petName + " has died!");
        }

        if (hunger <= 0) {
            hunger = 0;
            System.out.println("Woah! " + petName + " is full as can be! They'll grow big and strong in no time!");
        }
        if (hunger >= 12) {
            isAlive = false;
            System.out.println("OH NO! You've neglected to feed " + petName + "!");
            System.out.println(petName + " has died!");
        }

        if (thirst >= 12) {
            isAlive = false;
            System.out.println("OH NO! You've neglected to water " + petName + "!");
            System.out.println(petName + " has died!");
        }
    }

    public abstract void feed();

    public void water() {
        thirst -= 2;
        thirst = Math.max(0, thirst);
    }
    public double getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHappiness() {
        return happiness;
    }
}
