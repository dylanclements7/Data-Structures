public class Party {
    int guestsAmount = 0;
    //initialize # of guests
    public int get_guests(){
        return guestsAmount;
    }
//get guests
    public void set_guests(int new_guestsAmount){
        this.guestsAmount = new_guestsAmount;
    }
//set guests
    public void display_invitation(){
        System.out.println("Please come to my party!");
    }
    //display line
}
