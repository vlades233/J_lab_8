/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j_lab_8;

/**
 *
 * @author Vlad
 */
public class Data<K,V> {
     K key;
    V value;
    
    
    Data(K k1, V v2) {
        key = k1;
        value = v2;
    }
    
    
    K getKey() {
        return key;
    }
    
    V getValue() {
        return value;
    }
}
