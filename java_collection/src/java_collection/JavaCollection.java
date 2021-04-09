package java_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class JavaCollection {

	public static void main(String[] args) {
		
		/* List 인터페이스의 특징
		 * 
		 * 순서가 있는 Collection.(이 순서는 삽입된 순서를 의미한다.)
		 * Data를 중복해서 포함할 수 있다.
		 */
		
		// ArrayList
		ArrayList<String> arrayList = new ArrayList<String>(); // new ArrayList<>() type 생략가능 
		arrayList.add("Array");
		arrayList.add("List");
		System.out.println("=================================================================");
		System.out.println("arrayList 결과 : " + arrayList);
		System.out.println("=================================================================");
		
		// LinkedList
		// 각 링크에는 다른 링크에 대한 연결이 포함. 동적성과 삽입 및 삭제의 용이성.
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.add("Linked"); 
		linkedList.add("List"); 
		System.out.println("=================================================================");
		System.out.println("linkedList 결과 : " + linkedList);
		System.out.println("=================================================================");
		
		// Vector
		// 벡터는 크기를 늘리거나 줄일 수있는 동적 배열과 같다.
		// 배열과 달리 크기 제한이 없기 때문에 n 개의 요소를 저장할 수 있다.
		Vector<String> vector=new Vector<>(); 
		vector.add("Vector1");  
		vector.add("Vector2");  
		System.out.println("=================================================================");
		System.out.println("vector 결과 : " + vector);
		System.out.println("=================================================================");
		
		// Queue
		// Java의 큐는 FIFO 방식. First In First Out 방식으로 요소를 정렬.
		// 대기열에서 첫 번째 요소가 먼저 제거되고 마지막 요소가 마지막에 제거.
		PriorityQueue<String> queue=new PriorityQueue<>(); 
		queue.add("Queue");
		queue.add("Priority");
		
		System.out.println("=================================================================");
		System.out.println(queue.element()); 
		System.out.println(queue.peek()); 
		System.out.println("=================================================================");
		
		// HashSet
		// Set은 중복 요소를 포함 할 수없는 컬렉션
		// 순서의 의미가 없다.
		HashSet<String> set=new HashSet<>();
		
		set.add("Hash");  
		set.add("Set");  
		set.add("Hash");
		set.add("HashSet");
		
		Iterator<String> itr=set.iterator();  
		
		System.out.println("=================================================================");
		System.out.println("HashSet 결과 :");
		while(itr.hasNext()) {
			System.out.println(itr.next());  
		}
		System.out.println("=================================================================");
		
		// TreeSet
		// TreeSet의 요소는 오름차순으로 저장.
		TreeSet<String> tree_set=new TreeSet<>();  
		tree_set.add("d");  
		tree_set.add("c");  
		tree_set.add("b");
		tree_set.add("a");
		tree_set.add("b");
		
		Iterator<String> tree_itr=tree_set.iterator();
		
		System.out.println("=================================================================");
		System.out.println("TreeSet 결과 :");
		while(tree_itr.hasNext()){  
			System.out.println(tree_itr.next());  
		}
		System.out.println("=================================================================");
		
		// HashMap
		Map<String, String> map = new HashMap<>();
		
		// 객체 추가
		map.put("Key", "Value");
		map.put("jayden", "https:jayden-lee.github.io");
		
		// 객체 검색
		boolean isEmpty = map.isEmpty();
		int size = map.size();
		String value = map.get("jayden");
		
		System.out.println("Map Data 가져오는 법 1 ==========================================");
		for (Map.Entry<String, String> entry : map.entrySet()) {
		    System.out.println("Key=" + entry.getKey() + ", Value=" + entry.getValue());
		}
		System.out.println("=================================================================");
		
		System.out.println("Map Data 가져오는 법 2 ==========================================");
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		
		while (iterator.hasNext()) {
		    Map.Entry<String, String> entry = iterator.next();
		    System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());
		}
		System.out.println("=================================================================");
		
		System.out.println("Map Data 가져오는 법 3 ==========================================");
		map.forEach((k, v) -> System.out.println("Key=" + k + ", Value=" + v));
		System.out.println("=================================================================");
		
		System.out.println("Map Data 가져오는 법 4 ==========================================");
		for (String key : map.keySet()) {
		    System.out.println("key=" + key + ", value=" + map.get(key));
		}
		System.out.println("=================================================================");
		
		// 객체 삭제
		map.clear();
		map.remove("jayden");
		
		System.out.println("=================================================================");
		System.out.println("isEmpty 결과 :" + isEmpty);
		System.out.println("size 결과 :" + size);
		System.out.println("value 결과 :" + value);
		System.out.println("=================================================================");

	}

}
