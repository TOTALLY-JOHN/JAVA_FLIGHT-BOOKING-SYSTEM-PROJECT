package assg3;

public class Flight 
{
    private String flightNo;
    private String flightAirlines;
    private int numOfSeats;
    private int availableNumOfSeats;
    private double economyClassPrice;
    private double economyPremiumClassPrice;
    private double businessClassPrice;
    private double firstClassPrice;
    private double oneWayTicketPrice;
    private double roundTripTicketPrice;
    
    public Flight()
    {
        flightNo = null;
        flightAirlines = null;
        numOfSeats = 0;
        availableNumOfSeats = 0;
        economyClassPrice = 0.0;
        economyPremiumClassPrice = 0.0;
        businessClassPrice = 0.0;
        firstClassPrice = 0.0;
        oneWayTicketPrice = 0.0;
        roundTripTicketPrice = 0.0;
    }
    
    public Flight(String flightNo, String flightAirlines, int numOfSeats, int availableNumOfSeats,
                            double economyClassPrice, double economyPremiumClassPrice, 
                            double businessClassPrice, double firstClassPrice,
                            double oneWayTicketPrice, double roundTripTicketPrice)
    {
        this.flightNo = flightNo;
        this.flightAirlines = flightAirlines;
        this.numOfSeats = numOfSeats;
        this.availableNumOfSeats = availableNumOfSeats;
        this.economyClassPrice = economyClassPrice;
        this.economyPremiumClassPrice = economyPremiumClassPrice;
        this.businessClassPrice = businessClassPrice;
        this.firstClassPrice = firstClassPrice;
        this.oneWayTicketPrice = oneWayTicketPrice;
        this.roundTripTicketPrice = roundTripTicketPrice;
    }
    
    public void setFlightNo(String flightNo)
    {
        this.flightNo = flightNo;
    }
    
    public void setFlightAirlines(String flightAirlines)
    {
        this.flightAirlines = flightAirlines;
    }
    
    public void setNumOfSeats(int numOfSeats)
    {
        this.numOfSeats = numOfSeats;
    }
    
    public void setAvailableNumOfSeats(int availableNumOfSeats)
    {
        this.availableNumOfSeats = availableNumOfSeats;
    }
    
    public void setEconomyClassPrice(double economyClassPrice)
    {
        this.economyClassPrice = economyClassPrice;
    }
    
    public void setEconomyPremiumClassPrice(double economyPremiumClassPrice)
    {
        this.economyPremiumClassPrice = economyPremiumClassPrice;
    }
    
    public void setBusinessClassPrice(double businessClassPrice)
    {
        this.businessClassPrice = businessClassPrice;
    }
    
    public void setFirstClassPrice(double firstClassPrice)
    {
        this.firstClassPrice = firstClassPrice;
    }
    
    public void setOneWayTicketPrice(double oneWayTicketPrice)
    {
        this.oneWayTicketPrice = oneWayTicketPrice;
    }
    
    public void setRoundTripTicketPrice(double roundTripTicketPrice)
    {
        this.roundTripTicketPrice = roundTripTicketPrice;
    }
    
    public String getFlightNo()
    {
        return flightNo;
    }
    
    public String getFlightAirlines()
    {
        return flightAirlines;
    }
    
    public int getNumOfSeats()
    {
        return numOfSeats;
    }
    
    public int getAvailableNumOfSeats()
    {
        return availableNumOfSeats;
    }
    
    public double getEconomyClassPrice()
    {
        return economyClassPrice;
    }
    
    public double getEconomyPremiumClassPrice()
    {
        return economyPremiumClassPrice;
    }
    
    public double getBusinessClassPrice()
    {
        return businessClassPrice;
    }
    
    public double getFirstClassPrice()
    {
        return firstClassPrice;
    }
    
    public double getOneWayTicketPrice()
    {
        return oneWayTicketPrice;
    }
    
    public double getRoundTripTicketPrice()
    {
        return roundTripTicketPrice;
    }
}
