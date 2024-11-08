package com.ujjwal;

/*public class NumbersExample {

    public static void main(String[] args) {
          print1 ( 1 );
          print1 ( 2 );
          print1 ( 3 );
          print1 ( 4 );
          print1 ( 5 );
    }

    static void print1(int n) {
        System.out.println ( n );
    }
}*/

/*public class NumbersExample {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 5) {
            System.out.println(n);
            n++;
        }
    }
}*/

public class NumbersExample {
    public static void main(String[] args) {
        print1 ( 1 );
    }
    static void print1(int n) {
        System.out.println ( n );
        print2 ( 2 );
    }

    static void print2(int n) {
        System.out.println ( n );
        print3 ( 3 );
    }

    static void print3(int n) {
        System.out.println ( n );
        print4 ( 4 );
    }

    static void print4(int n) {
        System.out.println ( n );
        print5 ( 5 );
    }

    static void print5(int n) {
        System.out.println ( n );
    }
}
/*
In this program, the function calls form a sequence where each function calls the next one in line until print5 is reached, which doesn’t call any further functions. Here’s a breakdown of how the function calls work internally and memory management in Java.

1. Function Call Flow and Stack Memory:
The Java Virtual Machine (JVM) uses a call stack to manage method invocations.
Each time a function (method) is called, a new stack frame is created on the call stack. This stack frame contains:
Local variables used within the method.
Return address to go back to the calling method once the current one finishes.
Here’s how the flow proceeds for the code provided:

Step 1: main is called when the program starts.
main calls print1(1), so print1 is pushed onto the stack with n = 1.
Step 2: print1 calls print2(2).
print1 pauses and waits for print2 to complete.
print2 is pushed onto the stack with n = 2.
Step 3: print2 calls print3(3).
print2 pauses and waits for print3 to complete.
print3 is pushed onto the stack with n = 3.
Step 4: print3 calls print4(4).
print3 pauses and waits for print4 to complete.
print4 is pushed onto the stack with n = 4.
Step 5: print4 calls print5(5).
print4 pauses and waits for print5 to complete.
print5 is pushed onto the stack with n = 5.
Step 6: print5 executes and completes.
Since print5 doesn’t call any other method, it returns, and its stack frame is removed.
Step 7: print4 resumes from where it left off after print5 completes.
print4 finishes and returns, removing its frame from the stack.
This process continues until all methods complete, and control returns to main.
2. Heap Memory:
Heap memory in Java is where objects are stored. However, since there are no objects created in this code (only primitive values and method calls), the heap memory isn’t directly used here.
If this code were part of an object or had data stored in objects, those objects would reside in heap memory.
3. How the Call Stack Works in Detail:
The call stack operates on a Last In, First Out (LIFO) basis.
Each method call adds a new frame to the top of the stack.
When a method completes, its frame is removed, and control returns to the frame below it.
Summary of Each Step in the Code Execution:
main calls print1.
print1 calls print2, waits, and so forth.
Each method waits for the next one to complete, then resumes and ends, removing frames in reverse order until control returns to main.
 */
