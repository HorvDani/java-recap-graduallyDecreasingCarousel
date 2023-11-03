public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public boolean addElement(int element) {
        return super.addElement(element);
    }

    @Override
    public CarouselRun run() {
        if(!isRun){
            isRun = true;
            return new GraduallyCarouselRun();
        }
        else {
            return null;
        }
    }
}
