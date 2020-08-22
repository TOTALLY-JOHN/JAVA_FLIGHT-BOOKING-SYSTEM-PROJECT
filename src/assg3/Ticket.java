package assg3;

public class Ticket 
{
    private String departure;
    private String destination;
    private String departDate;
    private String returnDate;
    private String ticketType;
    private String classType;
    private int numOfTickets;
    private String seatNo;
    private String flightNo;
    private String airlines;
    private double totalPrice;
    
    public Ticket()
    {
        departure = null;
        destination = null;
        departDate = null;
        returnDate = null;
        ticketType = null;
        classType = null;
        numOfTickets = 0;
        seatNo = null;
        flightNo = null;
        airlines = null;
        totalPrice = 0.0;
    }
    
    public Ticket(String departure, String destination, String departDate, String returnDate, String ticketType,
                            String classType, int numOfTickets, String seatNo, String flightNo, String airlines, double totalPrice)
    {
        this.departure = departure;
        this.destination = destination;
        this.departDate = departDate;
        this.returnDate = returnDate;
        this.ticketType = ticketType;
        this.classType = classType;
        this.numOfTickets = numOfTickets;
        this.seatNo = seatNo;
        this.flightNo = flightNo;
        this.airlines = airlines;
        this.totalPrice = totalPrice;
    }
    
    public void setDeparture(String departure)
    {
        this.departure = departure;
    }
    
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    
    public void setDepartDate(String departDate)
    {
        this.departDate = departDate;
    }
    
    public void setReturnDate(String returnDate)
    {
        this.returnDate = returnDate;
    }
    
    public void setTicketType(String ticketType)
    {
        this.ticketType = ticketType;
    }
    
    public void setClassType(String classType)
    {
        this.classType = classType;
    }
    
    public void setNumOfTickets(int numOfTickets)
    {
        this.numOfTickets = numOfTickets;
    }
    
    public void setSeatNo(String seatNo)
    {
        this.seatNo = seatNo;
    }
    
    public void setFlightNo(String flightNo)
    {
        this.flightNo = flightNo;
    }
    
    public void setAirlines(String airlines)
    {
        this.airlines = airlines;
    }
    
    public void setTotalPrice(double totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    
    public String getDeparture()
    {
        return departure;
    }
    
    public String getDestination()
    {
        return destination;
    }
    
    public String getDepartDate()
    {
        return departDate;
    }
    
    public String getReturnDate()
    {
        return returnDate;
    }
    
    public String getTicketType()
    {
        return ticketType;
    }
    
    public String getClassType()
    {
        return classType;
    }
    
    public int getNumOfTickets()
    {
        return numOfTickets;
    }
    
    public String getSeatNo()
    {
        return seatNo;
    }
    
    public String getFlightNo()
    {
        return flightNo;
    }
    
    public String getAirlines()
    {
        return airlines;
    }
    
    public double getTotalPrice()
    {
        return totalPrice;
    }
}
