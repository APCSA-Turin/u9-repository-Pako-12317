public class Truck extends Vehicle{
    
    private int payload;
    
    public Truck(String name, int wheels, int payload){
        super(name, wheels);
        this.payload = payload;
    }

    public int getPayload(){
        return payload;
    }

    public String emptyPayload(){
        payload = 0;
        return "Payload is now empty.";
    }
}
