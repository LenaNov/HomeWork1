public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        super(500, 10);
        this.name=name;
    }

    @Override
    void Run (int distanceR) {
        if (distanceR <= super.run & distanceR != 0) {
            System.out.println("Собака " + name + " пробежала " + distanceR + " м.");
        } else if (distanceR != 0){
            System.out.println("Собака " + name + " вместо " + distanceR + " пробежала " + (run+1) + " м. и умерла :( RIP ");
        } else {
            System.out.println("Собака " + name + " осталась на месте, ей не нужно бежать");
        }
    }

    @Override
    void Swim (int distanceS) {
        if (distanceS <= super.swim & distanceS != 0) {
            System.out.println("Собака " + name + " проплыла " + distanceS + " м.");
        } else if (distanceS != 0){
            System.out.println("Собака " + name + " вместо " + distanceS +" проплыла " + (super.swim+1) + " м. и утонула :( RIP");
        } else {
            System.out.println("Собака " + name + " выбралась на берег, невредима");
        }
    }



}
