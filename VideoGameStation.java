import java.io.Serializable;

public class VideoGameStation implements Serializable, Comparable<VideoGameStation>, VideoGameStationInterface {

    //Q.no 1 defining attributes
    private String gameStation;
    private String videoGameName;
    private String customerName;
    private String customerType;
    private String bookingDate;
    private int duration;
    private int hourlyRate;
    private boolean availableStatus;

    //Qno 2 Constructors
    //Non Parameterized Constructor
    public VideoGameStation() {
    }

    //parameterized constructor
    public VideoGameStation(String gameStation, String videoGameName, int hourlyRate) {
        this.gameStation = gameStation;
        this.videoGameName = videoGameName;
        this.hourlyRate = hourlyRate;
        this.customerName = "";
        this.customerType = "";
        this.bookingDate = "";
        this.duration = 0;
        this.availableStatus = true;

    }

    //Qno 3 Getters
    public String getGameStation() {
        return gameStation;
    }

    public String getVideoGameName() {
        return videoGameName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public int getDuration() {
        return duration;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public boolean isAvailableStatus() {
        return availableStatus;
    }
//Q.No 4 setters

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    /**
     * 5 function to book video game station
     *
     * @param customerName
     * @param customerType
     * @param bookingDate
     * @param duration
     */
    @Override
    public void bookVideoGameStation(String customerName, String customerType, String bookingDate, int duration) {
        if (availableStatus != true) {
            System.out.println("The video game is not available at the current moment.Please come back later ");
            System.out.println("The video game is booked on " + this.bookingDate + " for " + this.duration + " hours");
        } else {
            this.customerName = customerName;
            this.customerType = customerType;
            this.bookingDate = bookingDate;
            this.duration = duration;
            this.availableStatus = false;
        }
    }

    /**
     * 6 function that makes Video game available, if video game staion is
     * already free- suitable message is displayed
     */
    @Override
    public void makeVideoGameAvailable() {
        if (availableStatus == true) {
            System.out.println("The video game that you requested for is free");
        } else {
            customerName = "";
            customerType = "";
            bookingDate = "";
            duration = 0;
            availableStatus = true;
        }
    }

    /**
     * 7 function to display game station description . ie gameStation and
     * hourly rate
     */
    @Override
    public void gameStationDescription() {
        System.out.println("Game Station Name: " + getGameStation());
        System.out.println("Hourly Rate: " + getHourlyRate());
    }

    /**
     * function needed to sort arraylist
     *
     * @param vgs
     * @return
     */
    @Override
    public int compareTo(VideoGameStation vgs) {
        int res = 0;
        int result1 = this.customerName.compareToIgnoreCase(vgs.customerName);
        int result2 = this.videoGameName.compareToIgnoreCase(vgs.videoGameName);
        if (result1 != 0) {
            res = result1;
        } else if (result2 != 0) {
            res = result2;
        }
        return res;
    }

}
