package CollectionTests;

class WarehouseNumber {

    int number;

    // constructor with arguments
    public WarehouseNumber(int number){
        this.number = number;
    }

    // toString method used for printout the object
    public String toString(){
        return "Warehouse number" + number ;
    }

    // getters
    public int  getNumber(){
        return number;
    }


    public int hashCode(){
        return number/100;
    }

    public boolean equals(Object o){
        WarehouseNumber e = (WarehouseNumber) o;
        return (number == e.getNumber());
    }

}