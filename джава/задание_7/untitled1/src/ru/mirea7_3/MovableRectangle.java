package ru.mirea7_3;

public class MovableRectangle implements Movable{
        MovablePoint topLeft;
        MovablePoint bottomRight;

        public MovableRectangle (int x1, int x2, int y1, int y2, int xSpeed, int ySpeed)
        {
            topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
            bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        }

        public boolean isEqual()
        {
            if ((topLeft.xSpeed == bottomRight.xSpeed)&&(topLeft.ySpeed == bottomRight.ySpeed))
                return true;
            else
                return false;
        }

        public void moveUp()
        {
            if (isEqual())
            {
                topLeft.moveUp();
                bottomRight.moveUp();
            }
            else
                System.out.println("Speeds are not equal");
        }

        public void moveDown()
        {
            if (isEqual())
            {
                topLeft.moveDown();
                bottomRight.moveDown();
            }
            else
                System.out.println("Speeds are not equal");
        }

        public void moveLeft()
        {
            if (isEqual())
            {
                topLeft.moveLeft();
                bottomRight.moveLeft();
            }
            else
                System.out.println("Speeds are not equal");
        }

        public void moveRight()
        {
            if (isEqual())
            {
                topLeft.moveRight();
                bottomRight.moveRight();
            }
            else
                System.out.println("Speeds are not equal");
        }


        public String toString() {
            return "MovableRectangle: " +
                    "topLeft= " + topLeft +
                    ", bottomRight= " + bottomRight;
        }
    }