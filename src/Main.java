public class Main {
    public static void main(String[] args) {
        // Empty Case
        CarouselRun run = new GraduallyDecreasingCarousel(7).run();
        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1

        System.out.println("***********************");

        // Regular Case
        DecrementingCarousel carousel = new GraduallyDecreasingCarousel(7);

        carousel.addElement(20);
        carousel.addElement(30);
        carousel.addElement(10);

        CarouselRun run1 = carousel.run();

        System.out.println(run1.isFinished()); //false

        System.out.println(run1.next()); //20
        System.out.println(run1.next()); //30
        System.out.println(run1.next()); //10

        System.out.println(run1.next()); //19
        System.out.println(run1.next()); //29
        System.out.println(run1.next()); //9

        System.out.println(run1.next()); //17
        System.out.println(run1.next()); //27
        System.out.println(run1.next()); //7

        System.out.println(run1.next()); //14
        System.out.println(run1.next()); //24
        System.out.println(run1.next()); //4

        System.out.println(run1.next()); //10
        System.out.println(run1.next()); //20

        System.out.println(run1.next()); //5
        System.out.println(run1.next()); //15

        System.out.println(run1.next()); //9

        System.out.println(run1.next()); //2

        System.out.println(run1.isFinished()); //true
        System.out.println(run1.next()); //-1
        
    }
}