package assistedPractice;

import java.io.*; 
import java.util.*; 

public class StackProgram 
{    
 // Pushing element on the top of the stack 
 static void stack_push(Stack<Integer> stack) 
 { 
	 System.out.println("Push Operation:"); 
     for(int i = 0; i < 5; i++) 
     { 
         stack.push(i); 
     } 
 } 
   
 // Popping element from the top of the stack 
 static void stack_pop(Stack<Integer> stack) 
 { 
     System.out.println("Pop Operation:"); 

     for(int i = 0; i < 5; i++) 
     { 
         Integer y = (Integer) stack.pop(); 
         System.out.println(y); 
     } 
 } 

 // Displaying element on the top of the stack 
 static void stack_peek(Stack<Integer> stack) 
 { 
     Integer element = (Integer) stack.peek(); 
     System.out.println("Element on stack top: " + element); 
 } 
   
 // Searching element in the stack 
 static void stack_search(Stack<Integer> stack, int element) 
 { 
     Integer pos = (Integer) stack.search(element); 

     if(pos == -1) 
         System.out.println("Element not found"); 
     else
         System.out.println("Element is found at position: " + pos); 
 } 
}