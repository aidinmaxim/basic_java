package homeworks.homework_18;

/**
 * 29.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Dog {
    private String name;
    private int jumpHeight;
    private final int maxJumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    public void train() {
        if (jumpHeight >= maxJumpHeight) {
            System.out.println(name + " достиг максимальной высоты прыжка. Больше тренировок не требуется.");
        }

        jumpHeight += 10;
        System.out.println(name + " тренируется. Теперь его высота прыжка составляет " + jumpHeight + " см.");
    }

    public void jump(int barrierHeight) {
        if (jumpHeight >= barrierHeight) {
            System.out.println(name + " успешно перепрыгнул барьер высотой " + barrierHeight + " см.");
            return;
        }

        if (!canTrainForBarrier(barrierHeight)) {
            System.out.println(name + " не в состоянии тренироваться для преодоления барьера.");
            return;
        }

        System.out.println(name + " не в состоянии перепрыгнуть барьер высотой " + barrierHeight + " см.");
        System.out.println(name + " начинает тренировку для преодоления барьера.");

        while (jumpHeight < barrierHeight) {
            train();
        }

        System.out.println(name + " успешно перепрыгнул барьер высотой " + barrierHeight + " см.");
    }

    private boolean canTrainForBarrier(int barrierHeight) {
        return (barrierHeight <= maxJumpHeight);
    }
}

/*
 Написать класс Собака. Собака должна иметь имя и высоту прыжка Должна уметь прыгать и должна уметь тренироваться.
 За каждую тренировку высота прыжка увеличивается на 10 сантиметров Максимальная высота,
 которую может натренировать собака не может быть больше, чем 2 раза высоту первоначального прыжка.

 Также должен быть метод взять барьер. В параметрах метод принимает высоту прыжка.
 Если собака в состоянии преодолеть этот барьер - прыгает. Если не в состоянии,
 нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
 Если да -> идем тренироваться -> берет барьер
 */