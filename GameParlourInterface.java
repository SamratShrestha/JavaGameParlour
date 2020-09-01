public interface GameParlourInterface {

    public void addNewVideoGameStation(String gameStation, String videoGameName, int hourlyRate);

    public void removeVideoGameStation(int indexNo);

    public void bookVideoGameStation(int indexNo, String customerName, String customerType, String bookingDate, int duration);

    public void makeVideoGameAvailable(int indexNo);

    public void listGameStation();

    public void searchTerm(String searchGameStation, int searchHourlyRate);

    public void displayAllDetails();

}
