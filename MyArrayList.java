package MohammadAboHasan_201913064;

public class MyArrayList<E> {
    private int size;
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];
    
    public MyArrayList() {
    }

    public MyArrayList(E[] objects) {
        for(E it : objects)
            add(it);
    }
    
    public void add(E e){
        add(size, e);
    }

    public void add(int index, E e){
        ensureCapacity();
        for (int i = size - 1; i >= index; i--)
            data[i+1] = data[i];
        data[index] = e;
        size++;
    }
    
    public E remove(E e){
        return removeByIndex(indexOf(e));
    }

    public E removeByIndex(int index){
        checkIndex(index);
        E e = data[index];
        for (int i = index; i < size - 1; i++) 
            data[i] = data[i+1];
        data[size - 1] = null;
        size--;
        return e;
    }

    public void clear(){
        data  = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }

    public E get(int index){
        checkIndex(index);
        return data[index];
    }

    public int indexOf(E e){
        for (int i = 0; i < size; i++) 
            if(e.equals(data[i])) return i;
        return -1;
    }
    
    public int lastIndexOf(E e){
        for (int i = size - 1; i >= 0; i--) 
            if(e.equals(data[i])) return i;
        return -1;
    }

    public boolean contains(E e){
        for (int i = 0; i < size; i++)
            if(e.equals(data[i])) return true;
        return false;
    }

    public int size(){
        return size;
    }
    
    private void ensureCapacity() {
        if(size >= data.length){
            E[] newData = (E[]) new Object[size * 2 + 1];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }
    
    private void checkIndex(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if(i < size - 1)
                result.append("\n");
        }
        return result.toString();
    }
}