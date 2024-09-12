public class Animal {
    int run;
    int swim;

    protected Animal (int run, int swim) {
        this.run=run;
        this.swim=swim;
    }


    void Run (int distanceR) {
        System.out.println ("Животное пробежало " + run + " метров");
    }

    void Swim (int distanceS) {
        System.out.println ("Животное проплыло " + swim + " метров");
    }
}
