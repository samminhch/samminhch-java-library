package samminhch.utils;


/**
 * The interface Graph.
 *
 * @param <T> The Object datatype fo the Graph
 * @author samminhch
 * @since 2020
 */
public interface Graph<T> {
    /**
     * Add a vertex to the graph.
     *
     * @param object the object
     * @return a boolean indicating if the object was added without errors
     */
    boolean add(T object);

    /**
     * Remove a vertex from the Graph.
     *
     * @param object the object
     * @return a boolean indicating if the object was added without errors
     */
    boolean remove(T object);

    /**
     * Connects the first vertex to the second vertex
     *
     * @param object1 the first vertex
     * @param object2 the second vertex
     * @return a boolean indicated whether the connection was successful
     */
    boolean connect(T object1, T object2);

    /**
     * Connects one vertex to another bidirectionally.
     *
     * @param object1 the object 1
     * @param object2 the object 2
     * @return a boolean indicated whether the connection was successful
     */
    default boolean biConnect(T object1, T object2) {
        return connect(object1, object2) && connect(object2, object1);
    }

    /**
     * Checks if object1 connects to object2.
     *
     * @param object1 the object 1
     * @param object2 the object 2
     * @return a boolean indicating whether object 1 connects to object 2
     */
    boolean connects(T object1, T object2);

    /**
     * Get vertices t [ ].
     *
     * @return the t [ ]
     */
    T[] getVertices();

    /**
     * Get connections t [ ].
     *
     * @param object the object
     * @return the t [ ]
     */
    T[] getConnections(T object);

    String toString();
}
