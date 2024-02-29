import java.util.ArrayList;
import java.util.Scanner;
public class UseDinnerParty {
    public static void main(String[] args){
        int guestsAmount = 0;
        int choices;
        int dinner_guestsAmount;
        //initialize variables
        ArrayList<String> arrayNames = new ArrayList<>();
        ArrayList<String> arrayDinnerNames = new ArrayList<>();
        //initialize arrays to contain names (creative aspect)
        DinnerParty new_DinnerParty = new DinnerParty();
        Party new_party = new Party();
        Scanner response = new Scanner(System.in);
        System.out.println("Enter number of guests for the party: ");
        guestsAmount = response.nextInt();
        new_party.set_guests(guestsAmount);
        //takes number of guests and sets it in party object
        for (int i = 1; i <= guestsAmount; ++i) {
            Scanner GuestResponse = new Scanner(System.in);
            System.out.println("Enter Guest name" + "["+ i + "]" + "here:");
            String inputName = GuestResponse.nextLine();
            arrayNames.add(inputName);
        }
        //takes guest names and stores them
        System.out.println("This party has "+new_party.get_guests()+" guests:" + arrayNames +"!");
        new_party.display_invitation();
        //displays the invitation with added guest names.
        System.out.println("Enter number of guests for the dinner party: ");
        dinner_guestsAmount = response.nextInt();
        new_DinnerParty.set_guests(dinner_guestsAmount);
        //takes number of guests for the dinner party and sets them in the DinnerParty object using inherited function.
            for (int x = 1; x <= dinner_guestsAmount; ++x) {
                Scanner DinnerGuestResponse = new Scanner(System.in);
                System.out.println("Enter Dinner Guest name " +"["+ x+"]"+ " here: ");
                String DinnerInputName = DinnerGuestResponse.nextLine();
                arrayDinnerNames.add(DinnerInputName);
            }
            //takes and stores names of guests for dinner party.
        System.out.println("Please select a dinner choice: [1]Beef Stroganoff [2]Chicken Soup");
        choices = response.nextInt();
        new_DinnerParty.set_DinnerChoice(choices);
        //takes dinner selection and stores it in DinnerParty object
        System.out.println("The dinner party has "+new_DinnerParty.get_guests()+" guests: "+ arrayDinnerNames +"!"+"\n"+"Menu option "+new_DinnerParty.get_DinnerChoice()+" will be served.");
        new_DinnerParty.display_invitation();
        //displays the invitation with added DinnerGuest names.
    }
}
