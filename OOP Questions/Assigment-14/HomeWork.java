package Repl.Assig14;

class Atts{
    public String name;
    public String color;
    public int amount;


    public String asString() {
        return "Atts{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", amount=" + amount +
                '}';
    }
}
class LameCalculator{
    public int num1;
    public int num2;

    public void plus(int num1,int num2){
        System.out.println(num1 + num2);
    }
    public void minus(int num1,int num2){
        System.out.println(num1 - num2);
    }
    public void divide(int num1,int num2){
        System.out.println(num1 / num2);
    }
    public void multiple(int num1,int num2){
        System.out.println(num1 * num2);
    }
}
class Db{
    private String data;
    private int yint;

    public void insertData(String data, int yint){
        this.data = data;
        this.yint = yint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }
}
class Person{
    private String firstname,lastName;
    private int age;

    public Person(){
        this.lastName= "undefined";
        this.firstname = "undefined";
        this.age = -1;
    }
    public Person(String firstname, String lastName, int age){
        this.age =age;
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return firstname+" | "+lastName+" | "+age;
    }
}
class TV{
    public int channel =1;
    public int volumeLevel = 1;
    public boolean on = false;
    public String brand = "undefined";

    public TV(){
        System.out.println("Creating TV object using no Args- constructor");

    }
    public TV(String brand){
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel <= 0 && channel >120) {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }else  this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
           if (on && volumeLevel <1 || volumeLevel >7){
               this.volumeLevel = volumeLevel;
           }else System.out.println("ERROR: TV is either OFF or invalid Volume level");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp(){
        channel++;
    }
    public void channelDown(){
        channel--;
    }
    public void volumeUp(){volumeLevel++;}
    public void volumeDown(){volumeLevel--;}
    public void isOn(){}
    public void turnOn(){
        if (on) System.out.println("TV is already ON");
    }
    public void turnOff(){if (!on) System.out.println("TV is already OFF");}
}
class ParkingMeter{
    public int timeLeft;
    public int maxTime;

    public ParkingMeter(){
        timeLeft =0;
    }
    public ParkingMeter(int maxTime){
        this.maxTime = maxTime;
    }

    public boolean add(int addedValue ){
        boolean flag = false;
        if (timeLeft < maxTime){
            if (addedValue == 25){
                timeLeft += 30;
            }flag= true;
        }flag = false;
        return flag;
    }
    public void tick(){if (timeLeft > 0)timeLeft--;}
    public boolean isExpired(){if (timeLeft == 0)return true; else return false;}
}
class GasTank{
    public double amount =0;
    public double capacity;

    public GasTank(double capacity){this.capacity = capacity;}

    public void addGas(double amount){
        if (amount > capacity){
            this.amount=capacity;
        }else this.amount += amount;
    }
    public void useGas(double amount){
        if (amount < 0){
            this.amount = 0;
        }else this.amount = this.amount - amount;
    }
    public boolean isEmpty(){if (amount < 0.1)return true; else return false;}
    public boolean isFull(){if (amount > capacity-0.1)return true; else  return false;}
    public double getGasLevel(){return amount;}
    public double fillUp(){
        double needed;
        needed = capacity - amount;
        amount+= needed;
        return needed;
    }

}
class Value{
    public boolean called = false;
    public int val;
    public Value(){}
    public Value(int x){this.val = x;}

    public void setVal(int x){val =x; called=true;}
    public boolean wasModified(){return called;}
    public int getVal(){return val;}
}
class Telephone{
    public String number;
    public static int quantity = 250;
    public static double total = 15658.92;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
class Calc{
    public static void minus(int a, int b){
        System.out.println(a-b);
    }
    public static void plus(int a, int b){
        System.out.println(a+b);
    }
}
class BankAccount{}
class SavingsAccount extends BankAccount{
    public SavingsAccount(double interestRate){
        this.interestRate = interestRate;
    }
    public double interestRate;

    public double getInterestRate() {
        return interestRate;
    }
}
class Phone{}
class CameraPhone extends Phone{
    public int imageSize;
    public int memorySize;

    public CameraPhone(int imageSize,int memorySize){
            this.imageSize = imageSize;
            this.memorySize = memorySize;
    }
    public int numPictures(){
        return ((memorySize*1000)/ imageSize);
    }

}
class Color{

        private int[] rgb = new int[3];

        public final static int[] WHITE     = new int[]{255, 255, 255};
        public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
        public final static int[] GRAY      = new int[]{128, 128, 128};
        public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
        public final static int[] BLACK     = new int[]{0, 0, 0};
        public final static int[] RED       = new int[]{255, 0, 0};
        public final static int[] PINK      = new int[]{255, 175, 175};
        public final static int[] ORANGE    = new int[]{255, 200, 0};
        public final static int[] YELLOW    = new int[]{255, 255, 0};
        public final static int[] GREEN     = new int[]{0, 255, 0};
        public final static int[] MAGENTA   = new int[]{255, 0, 255};
        public final static int[] CYAN      = new int[]{0, 255, 255};
        public final static int[] BLUE      = new int[]{0, 0, 255};

        public Color(int r, int g, int b){
            this.rgb[0] = r;
            this.rgb[1] = g;
            this.rgb[2] = b;
        }

        public Color() {
            this(255,255,255);
        }

        public String toString() {


            //TODO

            return null; //change this to return colors
        }


    }



public class Assignment14 {
    public static void main(String[] args) {

        System.out.println("*********************QUESTION NUMBER - 1*********************");
        Atts a = new Atts();
        a.name = "table";
        a.color = "brown";
        a.amount = 1;
        System.out.println(a.asString());

        System.out.println("*********************QUESTION NUMBER - 2*********************");

        LameCalculator ls = new LameCalculator();
        ls.plus(1,1);
        ls.minus(2,1);
        ls.divide(4,2);
        ls.multiple(2,4);

        System.out.println("*********************QUESTION NUMBER - 3*********************");
        Db db = new Db();
        db.insertData("aaa",123);

        System.out.println(db.getData());//aaa
        System.out.println(db.getYint());//123

        db.setData("zzz");
        db.setYint(200);

        System.out.println(db.getData());//zzz
        System.out.println(db.getYint());//200

        System.out.println("*********************QUESTION NUMBER - 4*********************");
        Person person = new Person();

        System.out.println(person.getFirstname()); //"undefined"
        System.out.println(person.getLastName()); //"undefined"
        System.out.println(person.getAge()); // -1
        System.out.println(person.toString()); //"undefined | undefined | -1"

        person.setFirstname("John");
        person.setLastName("Doe");
        person.setAge(44);

        System.out.println(person.toString() ); // "John | Doe | 44"

        Person person2 = new Person("Fatima", "Lee", 22);

        System.out.println(person2.getFirstname()); //"Fatima"
        System.out.println(person2.getLastName()); //"Lee"
        System.out.println(person2.getAge()); // 22
        System.out.println(person2.toString()); //"Fatima | Lee | 22"

        System.out.println("*********************QUESTION NUMBER - 10*********************");
        Calc.plus(2,1);
        Calc.minus(10,1);
    }
}

