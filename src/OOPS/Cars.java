package OOPS;

public class Cars{
    int hPower;
    int noOfSeats;
    String name;
    float productCode;
    boolean haveStero;
    boolean haveSunroof;
    int price;
    
    

        

        public Cars() {
            
            // this(100, 4, "ALTO800", 101, true, false, 350000); // this will call Cars constructor with parameters, used to provoide defalt values even if u not pass parameters to a constructor in main() class
        }


        Cars(int hPower, int noOfSeats, String name, float productCode, boolean haveStero, boolean haveSunroof,
            int price) {
        this.hPower = hPower;
        this.noOfSeats = noOfSeats;
        this.name = name;
        this.productCode = productCode;
        this.haveStero = haveStero;
        this.haveSunroof = haveSunroof;
        this.price = price;
    }


    public static void main(String[] args) {
        Cars maruti = new Cars(100, 4, "ALTO800", 101, true, false, 350000);
        Cars audi = new Cars(220, 2, "AUDI-Q7", 102, true, true, 4000000);
        System.out.println(maruti.name);
        System.out.println(maruti.hPower);
        System.out.println(maruti.haveStero);

        System.out.println(audi.name);
        System.out.println(audi.price);
        System.out.println(audi.noOfSeats);

        Cars defualtCars = new Cars();
        System.out.println(defualtCars.name); 
        
        
    }
    
    
    
}


