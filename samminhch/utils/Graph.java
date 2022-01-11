package samminhch.utils;

public interface Graph <T> {
    boolean add(T object);
    boolean remove(T object);
    void connect(T object1, T object2);
    boolean biConnect(T object1, T object2);
    boolean connects(T object1, T object2);
    T[] getVertices();
    T[] getConnections(T object);
    String toString();
}
