package hu.petrik.Stack;

public class LimitedStack<T> extends Stack<T> {

    private int maxSize;

    public LimitedStack(int maxSize) {

        super();
        this.maxSize = maxSize;

    }

    public boolean isFull() {

        return super.elements.size() == maxSize;

    }

    @Override
    public void push(T element) {

        if (!this.isFull()) {

            super.push(element);

        } else {

            throw new StackFullException();

        }

    }

}
