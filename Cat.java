public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        super(200, 0);
        this.name=name;
    }

    @Override
    void Run (int distanceR) {
        if (distanceR <= super.run & distanceR != 0) {
            System.out.println("Кот " + name + " пробежал " + distanceR + " м.");
        } else if (distanceR != 0){
            System.out.println("Кот " + name + " не побежал, слишком длинная дистанция");
        } else {
            System.out.println("Кот " + name + " остался на месте, не нужно бежать");
        }
    }

    @Override
    void Swim (int distanceS) {
        if (distanceS != super.swim) {
            System.out.println("Кот " + name + " не может плавать, утонул :( RIP");
        } else {
            System.out.println("Кот " + name + " выбрался на берег, невредим");
        }
    }
}
