package Concepts.SerializationJava;
/*transiet is a modifer applicable only for variables
 * If u dont want to save a value of a particular variable at the time of serializtion use transient keyword which lets jvm ignore the actual value of that keyword and sva ethe defualt value to the file 
 * TRANSIENT MEANS NOT TO SERIALIZE
 * -------------STATIC VS TRANSIENT VS FINAL----------
 * Static variables are not part of the object state and wont take part in serialization 
 * Declaring a Static Variable as transient there is no use or impact
 * variables which are declared as final will participate in serialization regardless if it is also decraled as transient 
 * thus dont declare a transient variable final
 */

public class TransientInSerialization {
    
}
