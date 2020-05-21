import com.sun.javafx.collections.ElementObservableListDecorator;

import java.util.*;

public class MostFrequentWithEqualProbability {

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,3,4,7,2,2,2};

        Map<Integer, Element> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                Element temp = map.get(arr[i]);
                temp.count++;
                temp.indexes.add(i);
                map.put(arr[i], temp);
            } else {
                Element element = new Element();
                element.count = 1;
                element.indexes.add(i);
                map.put(arr[i], element);
            }
        }

        Set<Integer> keySet = map.keySet();
        int maxCount = 0;
        List<Integer> maxCountIndexes = new ArrayList<>();
        for (Integer key : keySet) {
            Element element = map.get(key);
            if(element.count > maxCount) {
                maxCount = element.count;
                maxCountIndexes = element.indexes;
            }
        }
        System.out.println(maxCountIndexes);
        Random random = new Random();
        int randomIndex = random.nextInt(maxCountIndexes.size());
        System.out.println(randomIndex);
    }
}

class Element {
    int count;
    List<Integer> indexes;

    public Element() {
        this.indexes = new ArrayList<>();
    }
}
