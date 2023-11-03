public class GraduallyCarouselRun extends CarouselRun{
    int decrement = 1;

    @Override
    public int next() {
        if (isFinished()) {
            return -1;
        } else {
            while (array[position %= array.length] <= 0) {
                position++;
                if (position == array.length) {
                    decrement++;
                }
            }
        }
        int value = array[position];
        array[position++] -= decrement;

        if (position == array.length) {
            decrement++;
        }
        return value;
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }
}
