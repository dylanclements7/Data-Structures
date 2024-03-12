public class Item {
    String ItemName;
    int ItemCost;
    //initializes variables
    public void set_Cost(int new_Cost){
        this.ItemCost = new_Cost;
    }
    //sets the cost
    public void set_ItemName(String new_ItemName){
        this.ItemName = new_ItemName;
    }
    //sets the name

    public String toString() {
        return ItemName+","+ItemCost;
    }
    //returns the data as a comma-seperated string
}
