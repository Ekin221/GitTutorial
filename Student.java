public class Student {
    //instance variables
    private String name;
    private int ID;
    private Address addr;

    //constructor
    public Student(String name, int ID, Address addr){
        this.name = name;
        this.ID = ID;
        this.addr = addr;
    }
    public String toString(){
        return name + ", " + ID + ", " + addr;
    }
    
}
