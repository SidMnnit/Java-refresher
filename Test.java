import javax.rmi.ssl.SslRMIClientSocketFactory;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) throws IOException {

//        //INPUT USING BUFFERED READER
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] parts = br.readLine().split(" ");
//        String str = br.readLine();
//        System.out.println(Arrays.toString(parts));
//        System.out.println(str);

//        //INPUT USING SCANNER
//        Scanner sc = new Scanner(System.in);
//        String strInput = sc.nextLine();
//        int intInput = sc.nextInt();
//        System.out.println("Integer: " + intInput + "String:" + strInput);
//
//        //INPUT IN AN ARRAY USING SCANNER
//        int[] arr  = new int[intInput];
//        for (int i=0;i<intInput;i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("The array:" + Arrays.toString(arr));

        //JAVA COLLECTIONS
        //ROOT INTERFACE: Collections, SUB-INTERFACES: List, Set and Queue
        //LIST INTERFACE: Ordered and duplicates are allowed, CLASSES: ArrayList, LinkedList, Vector and Stack
        //SET INTERFACE: Unordered and no duplicates, CLASSES: HashSet, LinkedHashSet (maintains order of insertion), TreeSet (sorted Set, Redblack tree for impl)
        //QUEUE/DEQUEUE: PriorityQueue (minHeap), ArrayDequeue(resizable circular array), LinkedList (Doubly Linked List can act as queue/dequeue)
        //MAP: Key-value pairs, duplicates not allowed,  HashMap (array + linkedList/tree for hash collision), LinkedHashMap (maintains insertion order)
        //       TreeMap (Sorted Keys, Redblack tree), ConcurrentHashMap(ThreadSafe and modern)


//        //LIST Declaration
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
        //Declaration/init
//        List<Integer> arr = new ArrayList<>(List.of(1,2,3));
//        List<String> str = new ArrayList<>();
//        str.add("sid");
//        str.add("somya");
//        str.add("joey");
//        System.out.println(str);
//
//        //LIST Iteration
//        //1.for loop index based
//        for (int i=0; i<list.size();i++) {
//            System.out.println(list.get(i));
//        }
//
//        //2.for each loop
//        for (Integer item: list) {
//            System.out.println(item);
//        }
//
//        for (String item:  str) {
//            System.out.println(item);
//        }
//
//        //Using Iterators
//        Iterator<Integer> itr = list.iterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//
//        Iterator<String> itr1 = str.iterator();
//        while(itr1.hasNext()) {
//            System.out.println(itr1.next());
//        }
//
//        //Using stream()
//        list.stream().forEach(item -> System.out.println(item));
//        str.stream().forEach(item -> System.out.println(item));
//        //it can also be written as
//        list.stream().forEach(System.out::println);

//        //SET
//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
          //Declaration/initalization in same line
//        Set<Integer> set1 = new HashSet<>(Set.of(1,2,3));
//        //SET ITERATION
//        //for-each
//        for (Integer item: set) {
//            System.out.println(item);
//        }
//        //using iterator
//        Iterator<Integer> itr = set.iterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//        //using stream
//        set.stream().forEach(System.out::println);

//        //MAP
//        Map<String, Integer> map = new HashMap<>();
//        map.put("A", 1);
//        map.put("B", 2);
//        map.put("C", 3);
//        System.out.println(map);

        //Declaration and initialization in one line
//        Map<String, Integer> map1 = new HashMap<>(Map.of("sid",1, "somya", 2));
//
//        //Iterate over keys
//        for (String key: map.keySet()) {
//            System.out.println(key);
//        }
//
//        //Iterate over values
//        for (Integer value : map.values()) {
//            System.out.println(value);
//        }
//
//        //Iterate over key-value pairs
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//           System.out.println(entry.getKey() + "=>" + entry.getValue());
//        }
//
//        //For each loop
//        map.forEach((k,v) -> {
//            System.out.println(k + "->" + v);
//        });


        //QUEUE

//        Queue<String> queue = new LinkedList<>();
//        queue.add("A");
//        queue.add("B");
//        queue.add("C");
//        System.out.println(queue);
//
//        //Inline declaration and initialization
//        Queue<String> queue1 = new LinkedList<>(List.of("sid", "somya", "joey"));
//
//        //Iteration
//        for (String item: queue) {
//            System.out.println(item);
//        }
//
//        while(!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

//        //DEQUEUE
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.addFirst(1);
//        deque.addLast(2);
//        deque.addLast(3);
//
//        System.out.println(deque);
//
//        for (int val: deque) {
//            System.out.println(val);
//        }
//
//        //Checks and removes the element
//        while (!deque.isEmpty()) {
//            System.out.println(deque.pollFirst());
//        }

//        //STACK
//        Stack<Integer> stack= new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        while(!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

        //PRIORITY QUEUE- MIN HEAP

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(5);
//        pq.add(4);
//        pq.add(1);
//        System.out.println(Arrays.toString(pq.toArray()));
//
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }


        //PRIORITY QUEUE- MAX HEAP

//        PriorityQueue<Integer> pqMax = new PriorityQueue<>(Comparator.reverseOrder());

        //NOTE: PriorityQueue does not maintain sorted order during iteration, only peek() and poll() follow heap order.



        //SORTING
//        List<Integer> result = new ArrayList<>(List.of(5,4,8,9,23));
        //sort ascending
//        Collections.sort(result);
//        Collections.sort(result, Collections.reverseOrder());
//        result.sort(null);
//        result.sort(Collections.reverseOrder());
//        System.out.println(result);

//        List<String> names = Arrays.asList("Sid", "Somya", "Joey");
//        names.sort(null);
//        names.sort(Collections.reverseOrder());
//        Collections.sort(names, Collections.reverseOrder());
//        Collections.sort(names);
//        System.out.println(names);

          //CUSTOM SORT USING COMPARATOR
//         names.sort((s1,s2) -> Integer.compare(s1.length(),s2.length()));
//         System.out.println(names);
//        names.sort(Comparator.comparing(Person::getAge))

         //Reversing a list
//        Collections.reverse(names);

        //CONVERSIONS OF COLLECTIONS
        //1. List <->  Set
//        List<String> str = Arrays.asList("sid", "sid", "somya");
//        Set<String> set = new HashSet<>(str);
//        System.out.println(set);
//        List<String> newStr = new ArrayList<>(set);
//        System.out.println(newStr);

        //2. List ↔ Array
//        List<String> str = Arrays.asList("sid", "somya", "joey");
//        String[] arr = str.toArray(new String[0]);
//        System.out.println(Arrays.toString(arr));
//
//        String[] strArr = {"A", "B", "C"};
//        List<String> strList = new ArrayList<>(Arrays.asList(strArr));
//        System.out.println(strList);

        //3. Set <-> Array
//        Set<Integer> set = Set.of(1, 2, 3);
//        Integer[] array = set.toArray(new Integer[0]);
//        Integer[] array1 = {1, 2, 2, 3};
//        Set<Integer> set1 = new HashSet<>(Arrays.asList(array1));

        //4.  Map ➝ List of Keys or Values
//        List<String> keyList = new ArrayList<>(map.keySet());
//        List<Integer> valueList = new ArrayList<>(map.values());

        //5. Map ➝ 2D Array
//        Map<String, Integer> mp = Map.of("A",1, "B", 2);
//        String[][] str = mp.entrySet()
//                .stream()
//                .map(e -> new String[]{e.getKey(), e.getValue().toString()})
//                .toArray(String[][]::new);

        //COUNT FREQ
//        Map<Integer, Integer> map = new HashMap<>();
//        Integer[] arr = {1,2,3,4, 2, 4, 3, 5};
//        for (int i=0; i<arr.length; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
//        }
//        System.out.println(map);


        //QUESTION: Top K frequent words Given an array of strings words and an integer k, return the k most frequent words.
        //The result should be sorted by frequency (desc).
        //If two words have the same frequency, the one with lower alphabetical order comes first.

        // Step 1: Count word frequencies
//        String[] words = {"sid", "somya", "joey", "sid", "somya"};
//        int k = 2;
//        Map<String, Integer> freqMap = new HashMap<>();
//        for (String word : words)
//            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
//
//        //Step 2: Custom comparator for priority queue
//        PriorityQueue<String> minHeap = new PriorityQueue<>(
//                (a,b) -> {
//                    int freqCompare = freqMap.get(a).compareTo(freqMap.get(b));
//                    if (freqCompare == 0)
//                        return b.compareTo(a);  //reverse alphabetical
//                    return freqCompare;
//                }
//        );
//
//        // Step 3: Build heap of size k
//        for (String word : freqMap.keySet()) {
//            minHeap.offer(word);
//            if (minHeap.size() > k)
//                minHeap.poll();
//        }
//
//        // Step 4: Reverse heap output to get most frequent first
//        LinkedList<String> result = new LinkedList<>();
//        while (!minHeap.isEmpty())
//            result.addFirst(minHeap.poll());
//
//       System.out.println(result);

















    }
}
