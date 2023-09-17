package Practika2;

public class zadanie2 {
    public static class Ball {
        private double x = 0.0;
        private double y = 0.0;

        public Ball(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void setXY(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void move(double xDisp, double yDisp) {
            this.x += xDisp;
            this.y += yDisp;
        }

        public String toString() {
            return "Ball{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public static class TestBall {
        public static void main(String[] args) {
            Ball ball = new Ball(1.0, 2.0);
            System.out.println(ball.toString());

            ball.move(3.0, 4.0);
            System.out.println(ball.toString());

            ball.setXY(5.0, 6.0);
            System.out.println(ball.toString());
        }
    }
}