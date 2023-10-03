package collectiontutorial;

// A map contains values on the basis of key, i.e. key and value pair. Each key
// and value pair is known as an entry. A Map contains unique keys.

// A Map is useful if you have to search, update or delete elements on the basis
// of a key.

// HashMap HashMap is the implementation of Map, but it doesn't maintain any
// order.
// LinkedHashMap LinkedHashMap is the implementation of Map. It inherits HashMap
// class. It maintains insertion order.
// TreeMap TreeMap is the implementation of Map and SortedMap. It maintains
// ascending order.
// ======================
// public class Colllection_06_Map {
// public static void main(String[] args) {
// // TODO Auto-generated method stub
// {
// Map<String, Integer> hm = new HashMap<String, Integer>();
// hm.put("a", new Integer(100));
// hm.put("b", new Integer(200));
// hm.put("c", new Integer(300));
// hm.put("d", new Integer(400));
//
// Set<Map.Entry<String, Integer>> st = hm.entrySet();// Returns Set view
// //
// for (Map.Entry<String, Integer> me : st) {
// System.out.print(me.getKey() + ":");
// System.out.println(me.getValue());
// }
//
// }
// }
//
// }
//// ==================================
// public class Colllection_06_Map {
//
// public static void main(String[] args) {
// // TODO Auto-generated method stub
//
// Map<String, String> mapA = new HashMap<>();
// mapA.put("key1", "value1");
// mapA.put("key2", "value2");
// Set<Map.Entry<String, String>> st = mapA.entrySet();
//
// for (Map.Entry<String, String> me : st) {
// System.out.print(me.getKey() + ":");
// System.out.println(me.getValue());
// }
// mapA.replace("key1", "val2");
// System.out.println("After replacement");
//
// for (Map.Entry<String, String> me : st) {
// System.out.print(me.getKey() + ":");
// System.out.println(me.getValue());
// }
//
// System.out.println("***********************");
// Map<String, String> mapB = new HashMap<>();
// mapB.putAll(mapA);
// Set<Map.Entry<String, String>> st1 = mapB.entrySet();
//
// for (Map.Entry<String, String> s : st1) {
// System.out.print(s.getKey() + ":");
// System.out.println(s.getValue());
// }
//
// }
// }
// ==================
// public class Colllection_06_Map {
// public static void main(String[] args) {
// Map map = new HashMap();
// // Adding elements to map
// map.put(1, "Java");
// map.put(5, "Python");
// map.put(2, "Scala");
// map.put(6, "Javascript");
// map.put(6, "cpp");
// map.put(7, "cpp");
// map.put("lang1", "cpp");
// map.put("lang2", "Python");
// map.put("lang3", "Java");
//
// // Traversing Map
// Set set = map.entrySet();// Converting to Set so that we can traverse
// Iterator itr = set.iterator();
// while (itr.hasNext()) {
// // Converting to Map.Entry so that we can get key and value separately
// Map.Entry entry = (Map.Entry) itr.next();
// System.out.println(entry.getKey() + " " + entry.getValue());
// }
// }
// }

// ================
