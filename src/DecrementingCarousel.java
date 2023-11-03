public class DecrementingCarousel {

    static int[] carousel;
    protected final int capacity;
    protected int index = 0;
    protected boolean isRun = false;

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        carousel = new int[capacity];
    }

    public boolean addElement(int element){
        if(element > 0 && index < capacity && !isRun){
            carousel[index] = element;
            index++;
            return true;
        }else {
            return false;
        }
    }

    public CarouselRun run(){
        if(!isRun){
            isRun = true;
            return new CarouselRun();
        }else{
            return null;
        }
    }
}
