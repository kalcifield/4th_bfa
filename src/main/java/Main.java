import com.flight.app.Flight;
import com.flight.app.FlightAttendant;
import com.flight.app.Passenger;
import com.flight.app.Pilot;
import java.util.ArrayList;

/**
 * Created by bezi on 2017.05.24..
 */
public class Main {
    public static void main(String args[]){
        ArrayList<Passenger> listOfPassengers = new ArrayList<Passenger>();

        System.out.println("Hello world!");
        FlightAttendant test = new FlightAttendant("Józsi", 123, "1999/10/11", 123 , 2);
        Pilot pilot = new Pilot("Józsi", 123, "1999/10/11", 123, true );
        Pilot coPilot = new Pilot("Józsi", 123, "1999/10/11", 123, true );
        Passenger pass = new Passenger();
        Passenger pass2 = new Passenger();

        listOfPassengers.add(pass);
        listOfPassengers.add(pass2);

        Flight smh = new Flight(pilot, coPilot, test, listOfPassengers);



    }
}
