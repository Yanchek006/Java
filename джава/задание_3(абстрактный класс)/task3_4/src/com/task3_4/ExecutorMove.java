package com.task3_4;

public class ExecutorMove
{
    public static void main(String[] args)
    {
        MovablePoint mp = new MovablePoint(10, 20,2,2);
        MovableCircle mc = new MovableCircle(20, 10, 2, 2, 4);
        System.out.println(mp);
        mp.moveUp();
        mp.moveLeft();
        System.out.println(mp);

        System.out.println(mc);
        mc.moveDown();
        mc.moveRight();
        System.out.println(mc);
    }
}