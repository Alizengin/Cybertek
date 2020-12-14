package Inheritance.Repl.ParkingMeter;

public class ParkingMeter {
    public int timeLeft = 0;
    public int maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime = maxTime;
    }
    public boolean add(int given){
        boolean flag = false;
        if (given == 25) {
            if (timeLeft < maxTime) {
                this.timeLeft += 30;
                flag = true;
            }
        }
        return flag;
    }
    public void tick(){
        if (timeLeft > 0){
            this.timeLeft -= 1;
        }
    }
    public boolean isExpired() {
        boolean flag = false;
        if (timeLeft == 0) {
            flag = true;
        }
        return flag;
    }
}
