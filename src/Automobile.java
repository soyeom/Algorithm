public class Automobile {
    private int speed;

    Automobile(int speed) {
        this.speed = speed;
    }

    void setSpeed(int speed) {
        if(speed > 0)
            this.speed = speed;
    }

    int getSpeed() {
        return this.speed;
    }

    void decreaseSpeed(int howMuch) {
        setSpeed(this.speed -= howMuch);
    }

    void start() {
        System.out.println("start");
    }
    public static void main(String[] args) {
        Automobile honda = new Automobile(100);
        Automobile kia = new Automobile(80);

        honda.start();
        kia.start();

        honda.setSpeed(100);
    }
}
