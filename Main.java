//1.1
// import java.util.Arrays;
// import java.util.List;

// public class Main {
//     public static void main(String[] args) {
//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

//         System.out.println("List of integers: " + numbers);
//     }
// }

//2.1  
// import java.util.Arrays;
// import java.util.List;

// public class Main {
//     public static void main(String[] args) {
//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//         int sum = 0;
//         for (int number : numbers) {
//             sum += number;
//         }

//         System.out.println("List of integers: " + numbers);
//         System.out.println("Sum of all elements: " + sum);
//     }
// }


//1.2
// import java.util.Map;

// public class Main {
//     public static void main(String[] args) {
//         Map<String, Integer> dictionary = Map.of("Avarayt", 451, "Aracani", -69, "Halidzor", 1727, "Artsakh", 2020, "Oshakan", 1827);
        
//         System.out.println(dictionary);
//     }
// }

//2.2
// import java.util.HashMap;
// import java.util.Map;

// public class Main {
//     public static void main(String[] args) {
//         Map<String, Integer> dictionary = Map.of("Avarayt", 451, "Aracani", -69, "Halidzor", 1727, "Artsakh", 2020, "Oshakan", 1827);
//         int sum = 0;
//         for (int value : dictionary.values()) {
//             sum += value;
//         }

//         System.out.println("Dictionary: " + dictionary);
//         System.out.println("Sum of all values: " + sum);
//     }
// }


//1.3
// import java.util.LinkedList;
// import java.util.Queue;

// public class Main {
//     public static void main(String[] args) {

// 		Queue<Integer> queue = new LinkedList<>();
//         queue.add(1);
//         queue.add(2);
//         queue.add(3);
//         queue.add(4);
//         queue.add(5);
        
//         System.out.println("Queue: " + queue);
//     }
// }

//2.3
// import java.util.LinkedList;
// import java.util.Queue;

// public class Main {
//     public static void main(String[] args) {
//         Queue<Integer> queue = new LinkedList<>();
//         queue.add(1);
//         queue.add(2);
//         queue.add(3);
//         queue.add(4);
//         queue.add(5);
        
//         queue.poll(); 
//         queue.poll(); 
        
//         System.out.println("After removing 2 elements I have: " + queue);
//     }
// }



//1.4
// import java.util.Stack;

// public class Main {
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
//         stack.push(4);
//         stack.push(5);

//             System.out.println(stack);
//         }
//     }

//2.4
// import java.util.Stack;

// public class Main {
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
//         stack.push(4);
//         stack.push(5);

//         stack.pop(); 
//         stack.pop(); 

//         System.out.println("After removing 2 elements I have: " + stack);
//     }
// }

//3.1 The question was not understandable for me. I thought you were talking about the list of exercice 1.1 which already is printed

//3.2
// public class Main {
//     public static void main(String[] args) {
//         int number = 301; 

//         int haryuravor = number / 100;
//         int tasnavor = (number / 10) % 10;
//         int miavor = number % 10;
//         int mecaguyn = Math.max(haryuravor, Math.max(tasnavor, miavor));

//         System.out.println("Amenamec tivy: " + mecaguyn);
//     }
// }

//3.3 (This one I've done like  the 3.2 but the dictonory is Math.min)
// public class Main {
//     public static void main(String[] args) {
//         int number = 301; 

//         int haryuravor = number / 100;
//         int tasnavor = (number / 10) % 10;
//         int miavor = number % 10;
//         int poqraguyn = Math.min(haryuravor, Math.min(tasnavor, miavor));

//         System.out.println("Amenapoqr tivy: " + poqraguyn);
//     }
// }

//3.4
// public class Main {
//     public static void main(String[] args) {
//         int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
//         int sum = 0;
//         for (int num : array) {
//             if (num % 2 == 0) {
//                 sum += num;
//             }
//         }
        
//         System.out.println("Zuyg tveri gumary: " + sum);
//     }
// }

//3.4
// public class Main {
//     public static void main(String[] args) {
//         int[] array = {1, 2, 3, 4, 5, 6}; 
//         int sum = 0;
//         for (int num : array) {
//             sum += num;
//         }
//         double average = (double) sum / array.length;

//         System.out.println("Mijin: " + average);
//     }
// }



