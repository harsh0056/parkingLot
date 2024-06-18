package Models;

import java.util.HashMap;

public interface FloorRegistry<K,V> {

    V getPrototype(K key);

    void setPrototype(K key, V value);

}
