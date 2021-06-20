import java.util.Random;

public class HomeWorkApp6 {

    private static Random random = new Random();

    public static void main (String[] args) {

        Animal[] animalsArray = new Animal[11];
        animalsArray[0] = new Cat("Барсик");
        animalsArray[1] = new Cat("Гав");
        animalsArray[2] = new Cat("Бегемот");
        animalsArray[3] = new Cat("Азраэль");
        animalsArray[4] = new Cat("Соня");
        animalsArray[5] = new Dog("Рекс");
        animalsArray[6] = new Dog("Стрелка");
        animalsArray[7] = new Dog("Пушок");
        animalsArray[8] = new Dog("Бублик");
        animalsArray[9] = new Dog("Шарик");
        animalsArray[10] = new Cat("Агент");

        int k = 0;
        int s = 0;
        int limDistanceR = 510; // определим максимальную дистанцию, которая сможет случайно получиться для бега
        int limDistanceS = 20; // определим максимальную дистанцию, которая сможет случайно получиться для плаванья

        for (Animal animal:animalsArray) {
            boolean running = random.nextBoolean(); // случайным образом определим животное бежит или плывет
            if (animal instanceof Cat) {
                k++;
                if (running) {
                    ((Cat) animal).Run(random.nextInt(limDistanceR));
                } else {
                    ((Cat) animal).Swim(random.nextInt(limDistanceS));
                }
            } else if (animal instanceof Dog) {
                s++;
                if (running) {
                    ((Dog) animal).Run(random.nextInt(limDistanceR));
                } else {
                    ((Dog) animal).Swim(random.nextInt(limDistanceS));
                }
            }
        }
        System.out.println("Котов всего " + k);
        System.out.println("Собак всего " + s);
        System.out.println("Животных всего " + animalsArray.length);
    }


}
