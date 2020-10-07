package com;

public class Main {

    public static void main(String[] args) {
        System.out.println("EX. 1\n");
        //EX. 1
     Box box1= new Box();
     Box box2= new Box(3);
     Box box3= new Box(5,6,1);
       // System.out.println(box3.height+" "+box3.width+" "+box3.depth);

        System.out.println("EX. 2\n");
        //EX. 2
	Queue q1= new Queue();
	Queue q2= new Queue(3);
	q1.push(3);
	q2.push(3);
	q1.push(2);
	q2.push(2);
	q1.push(1);
	q2.push(1);
	q1.show();
	q2.show();
	q1.pop();
	q2.pop();
	q1.show();
	q2.show();

	//EX. 3

    System.out.println("EX. 3\nSurface: "+box3.surface()+" Volume:"+box3.volume());

    q2.show();
    q1.show();
    q2.isempty();
    q2.isfull();
    q1.isempty();
    q1.isfull();
    /*
    System.out.println("");
    q1.pop();
    q1.pop();
    q1.show();
    q1.isempty();
    q2.push(1);
    q2.show();
    q2.isfull();
    */
    }
}
