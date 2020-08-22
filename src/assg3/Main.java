package assg3;

import javax.swing.JFrame;
import java.util.ArrayList;

public class Main 
{
    public static ArrayList<Flight> flightList = new ArrayList<>();
    public static ArrayList<Ticket> ticketList = new ArrayList<>();
    
    public static void main(String[] args)
    {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true); 
    }
}
