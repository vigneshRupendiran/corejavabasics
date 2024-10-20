package com.corejava.threadsbasics;

//Case 2: Difference between case2.start() VS case2.run()

/**
 * 1.In the case of case2.start(), a NEW thread will be created.
 * 2.If we did not call the case2.start() thread will not be created.
 * 3.if we call the case2.run() method instead of case2.start(), it will act as a Normal Method call
 * which was initiated by main THREAD
 * {main() method is executed by main thread by default, it is java nature},
 *  & Child Thread will not be created, so it is NOT a Best Practise.
 *  4.Output is always same if re-run every time.
 */
public class Case2 {
    public static void main(String[] args) {
        MyThreadCase2 case2 = new MyThreadCase2();
        case2.run(); //bad practise - thread won't be created.

        //case2.start(); //it helps to create a new child thread

        for (int loopmain = 1; loopmain <= 5; loopmain++) {
            System.out.println(" This is Main Thread : "+loopmain);
        }
    }
}

class MyThreadCase2 extends Thread{
    @Override
    public void run(){
        for (int loop = 1; loop <= 5; loop++) {
            System.out.println(" This is run method == "+loop);
        }
    }
}
