import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionUtils {
    public static HashSet<String> convertToHashSet(ArrayList<String> list) {
        HashSet<String> set = new HashSet<>(list);
        set.clear();  // Elimina todos los elementos del HashSet
        return set;
    }

    public static HashMap<Integer, String> convertToHashMap(HashSet<String> set) {
        HashMap<Integer, String> map = new HashMap<>();
        int index = 0;
        for (String s : set) {
            map.put(index++, s);
        }
        return map;
    }

    public static void createCollections(int value, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(value);
        }
        HashSet<Integer> set = new HashSet<>();
        set.add(value);
    }

    public static void main(String[] args) {
        // Creamos y probamos el método convertToHashSet
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alberto");
        arrayList.add("Fernando");
        arrayList.add("Alberto");
        HashSet<String> resultHashSet = convertToHashSet(arrayList);
        System.out.println("Resultado HashSet: " + resultHashSet);

        // Creamos y probamos el método convertToHashMap
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Perro");
        hashSet.add("Gato");
        HashMap<Integer, String> resultHashMap = convertToHashMap(hashSet);
        System.out.println("Resultado HashMap: " + resultHashMap);

        // Creamos y probamos el método createCollections
        createCollections(5, 10);
    }
}