public class result {
  public static list<integer> kthOccurence(int X,List<Integer> arr, List<integer> query_values){
    List<Integer> result = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.size(); i++) {
      if (map.containsKey(arr.get(i))) {
        map.put(arr.get(i), map.get(arr.get(i)) + 1);
      } else {
        map.put(arr.get(i), 1);
      }
    }
    for (int i = 0; i < query_values.size(); i++) {
      if (map.containsKey(query_values.get(i))) {
        result.add(map.get(query_values.get(i)));
      } else {
        result.add(-1);
      }
    }
    return result;
  }
}
