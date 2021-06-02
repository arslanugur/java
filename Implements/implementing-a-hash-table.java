Hash Table in Java
      Hash Table is a data structure which maps keys to values. 
      The data is stored in an array format, where each value has its own unique key. 
      Lets define a class HashEntry for our elements. Each element has a string data property.
class HashEntry {
  public String value;
   public HashEntry(String value) {
     this.value = value;
   }
}

      Now we can define our HashMap class, that will implement the hash table logic.
      We will use a simple hashing algorithm, 
      which will calculate the char sum of the string and modulo it by the size of the table. 
      Our data will be stored in a simple array called table.

      //Here is the structure of the HashMap:
public class HashTable {
    static class HashEntry {
        public String value;
        public HashEntry(String value) {
            this.value = value;
        }
    }
    static class HashMap {
        int TABLE_SIZE = 127;
        public HashEntry[] table;
        
        public HashMap() {
        table = new HashEntry[127];
            for (int k = 0; k < TABLE_SIZE; k++)
            table[k] = null;
        }
        
        int HashFunc(String value) {
            int key = 0;
            char[] charArray = value.toCharArray();
            for(int i = 0; i < value.length(); i++) {
                key += charArray[i];
            }
            return key % TABLE_SIZE;
        }
        void insert(String value) {
            int hash = HashFunc(value);
            if(table[hash] == null)
                table[hash] = new HashEntry(value);
        }
        HashEntry search(String value) {
            int hash = HashFunc(value);
            if (table[hash] == null) {
                System.out.println("Value {" + value + "} not found.");
                return null;
            } else {
                return table[hash];
            }
        }
        void remove(String value) {
            int hash = HashFunc(value);
            if (table[hash] != null) {
                table[hash] = null;
            }
        }
    }
    public static void main(String[] args) {
        HashMap hash = new HashMap();
        hash.insert("A");
        hash.insert("B");
        hash.insert("C");
        System.out.println(hash.search("B"));
    }
}
//output: HashTable$HashEntry7a81197d
    /*why is the output resulting to the address?
      because the method search is returning hashEntry object ,not a string .
      Just try this in the main and you will get (B)
      System.out.println(hash.search("B").value);*/

      This hashing algorithm is just a simple example. 
      Real-world hashing functions are more complex, 
      because, for example, 
      these two strings will generate the same hash and cause a collision ("ABC" and "CBA" both have the same key).
      
      
      What is the point of ur constructor (HashMap())? 
      Aren’t the values null by default?
      the constructor HashMap() sets the size of the "table" 
                            and initializes every integer in the "table" is initialized to 'null'...
      Without the constructor the size of the "table" (which is of Integer class) will not be initialized.
      
      This implementation is not safe from collisions?
      we need to implement chaining/linear probing to overcome collision in hash map... 
      Yeah which is not done here.. It would be more complex if we did it in here.. 
      We need to use Linked List to overcome collision.
      if we have lots of elements at some point 
      the Linked List won't be so efficient to avoid collision so instead we would better use the tree map.
      
      In the remove method, the if-null test makes no sense:
 if (table[hash] != null) {

      Once there is no else, why to read the value? Just reset it to null directly.

      ...All on a single code line, please:
table[HashFunc(value)] = null;

      So no int var needed here neither: Just a nice single line procedure.
      
      You can also use the class hashtable when you decide your key and value, like this:
Hashtable h = new Hashtable();
h.put(key, value);

      If I understand well, the value needs to be an object, so you can do two things:
      1. h.put(int, String);
      2. h.put(String, Integer);
      So the value is always an object.
      
