package samminhch.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashGraph <T> implements Graph <T> {
    private final HashMap<T, HashSet<T>> data;
    //these are only used whenever the connects method is called.
    private final ArrayList<T> path;
    private boolean flag;

    /**
     * The default constructor for the HashGraph class.
     */
    public HashGraph() {
        data = new HashMap<>();
        path = new ArrayList<>();
    }

    /**
     * @return <code>T[]</code>- All the vertices in the graph.
     */
    @Override
    public T[] getVertices() {
        return (T[]) data.keySet().toArray();
    }

    /**
     * @param object the object that's getting accessed.
     * @return <code>T[]</code>- all connections the given vertex has.
     * @throws IllegalArgumentException if specified vertex does not exist.
     */
    @Override
    public T[] getConnections(T object)throws IllegalArgumentException {
        checkExistence(object);
        return (T[]) data.get(object).toArray();
    }

    /**
     * Connects one vertex to another.
     * @param object1 the object that's getting connected.
     * @param object2 the object that object1 is getting connected to.
     */
    @Override
    public void connect(T object1, T object2) {
        if (!(data.containsKey(object2) || data.containsKey(object1)))
            return;
        data.get(object1).add(object2);
    }

    /**
     * Connects one vertex to another bidirectionally.
     * @param object1 the object that's getting connected to object2.
     * @param object2 the object that's getting connected to object1.
     * @return <code>boolean</code> if the connection was successful.
     */
    public boolean biConnect(T object1, T object2) {
        connect(object1, object2);
        connect(object2, object1);
        return true;
    }

    /**
     * Checks if object1 connects to object2.
     * @param object1 parameter 1.
     * @param object2 parameter 2.
     * @return a boolean indicating whether object 1 connects to object 2
     */
    @Override
    public boolean connects(T object1, T object2)throws IllegalArgumentException {
        checkExistence(object1);
        checkExistence(object2);
        flag = false;
        checkConnection(object1, object2);
        path.clear();
        return flag;
    }

    /**
     * Adds a 'vertex' to the graph.
     * @param object the thing that's getting added.
     * @return <code>boolean</code> if the add was successful.
     */
    @Override
    public boolean add(T object) {
        try {
            if (data.get(object) == null) {
                data.put(object, new HashSet<>());
                return true;
            }
        }catch (Exception e) {
            System.out.printf("%s occurred while running method add(%s)", e, object.toString());
            return false;
        }
        return false;
    }

    /**
     * Removes 'vertex' from the graph.
     * @param object the thing that's getting removed.
     * @return <code>boolean</code> if the remove was successful.
     */
    @Override
    public boolean remove(T object) {
        try{
            for (T connection : data.get(object))
                data.get(connection).remove(object);
            data.remove(object);
            return true;
        }catch (Exception e) {
            System.out.printf("%s occurred while running method remove(%s)", e, object.toString());
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (T connection : getVertices())
            str.append(String.format("%s:%s\n", connection, data.get(connection).toString()));
        return str.toString();
    }

    /*
     * PRIVATE METHODS
     */

    /**
     * @param object the object that's getting checked.
     * @throws IllegalArgumentException if object isn't in the Graph.
     */
    private void checkExistence(T object)throws IllegalArgumentException {
        if (!data.containsKey(object))
            throw new IllegalArgumentException(String.format("Graph does not contain argument %s", object));
    }

    /**
     * A recursive method that checks for a connection between two vertices in a graph.
     * @param object1 starting vertex.
     * @param object2 target vertex.
     */
    private void checkConnection(T object1, T object2) {
        if (data.get(object1).contains(object2))
            flag = true;
        else
            for (T connection : data.get(object1)) {
                if (!path.contains(connection)) {
                    path.add(connection);
                    connects(connection, object2);
                }
            }
    }
}