package org.example.lld.consistantHashing;

import java.util.*;

/**
 * ConsistentHashing is a class that implements the consistent hashing algorithm to distribute keys among servers.
 */
public class ConsistentHashing {

    // TreeMap to store the hash ring with server positions
    private final TreeMap<Long, String> ring;

    // Number of replicas for each server on the ring
    private final int numberOfReplicas;

    /**
     * Constructor to initialize the ConsistentHashing object.
     *
     * @param numberOfReplicas Number of replicas for each server on the ring.
     */
    public ConsistentHashing(int numberOfReplicas) {
        this.ring = new TreeMap<>();
        this.numberOfReplicas = numberOfReplicas;
    }

    /**
     * Adds a server to the hash ring with the specified number of replicas.
     *
     * @param server The name of the server to be added.
     */
    public void addServer(String server) {
        for (int i = 0; i < numberOfReplicas; i++) {
            long hash = generateHash(server + i);
            ring.put(hash, server);
        }
    }

    /**
     * Removes a server and its replicas from the hash ring.
     *
     * @param server The name of the server to be removed.
     */
    public void removeServer(String server) {
        for (int i = 0; i < numberOfReplicas; i++) {
            long hash = generateHash(server + i);
            ring.remove(hash);
        }
    }

    /**
     * Retrieves the server assigned to a given key.
     *
     * @param key The key for which the server is to be determined.
     * @return The name of the server to which the key is assigned.
     */
    public String getServer(String key) {
        if (ring.isEmpty()) {
            return null;
        }
        long hash = generateHash(key);
        if (!ring.containsKey(hash)) {
            // If the exact hash is not found, find the next available server in the ring
            SortedMap<Long, String> tailMap = ring.tailMap(hash);
            hash = tailMap.isEmpty() ? ring.firstKey() : tailMap.firstKey();
        }
        return ring.get(hash);
    }

    /**
     * Generates a hash value for the given key using the MD5 algorithm.
     *
     * @param key The key for which the hash is generated.
     * @return The generated hash value.
     */
    private int generateHash(String key) {
        // Using the built-in hashCode method for simplicity
        return key.hashCode();
    }


    /**
     * Main method for testing the ConsistentHashing implementation.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        ConsistentHashing ch = new ConsistentHashing(3);
        ch.addServer("server1");
        ch.addServer("server2");
        ch.addServer("server3");


        System.out.println("key108986746: is assigned to server: " + ch.getServer("key108986746"));
        System.out.println("key678905435: is assigned to server: " + ch.getServer("key67890"));

        ch.removeServer("server1");
        System.out.println("After removing server1");

        System.out.println("key108986746: is assigned to server: " + ch.getServer("key108986746"));
        System.out.println("key67890: is assigned to server: " + ch.getServer("key67890"));
    }
}
