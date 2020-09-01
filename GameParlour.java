import java.util.ArrayList;
import java.util.Collections;

public class GameParlour implements GameParlourInterface {

    //8 make arraylist of videogamestation
    ArrayList<VideoGameStation> list = new ArrayList<>();
    // defining videogamestation
    VideoGameStation videoGameStation;

    /**
     * 9 function to add video game station in list
     *
     * @param gameStation
     * @param videoGameName
     * @param hourlyRate
     */
    @Override
    public void addNewVideoGameStation(String gameStation, String videoGameName, int hourlyRate) {
        //creating videogamestation class object
        videoGameStation = new VideoGameStation(gameStation, videoGameName, hourlyRate);
        // update list
        list.add(videoGameStation);
    }

    /**
     * 10 function to remove video game station using index no
     *
     * @param indexNo
     */
    @Override
    public void removeVideoGameStation(int indexNo) {
        if (indexNo >= 0 && list.size() > indexNo) {
            //remove data from list using indexNO
            list.remove(indexNo);
        } else {
            //Error
            System.out.println("The number that you entered is not valid");
            System.out.println("Please enter the number again");

        }
    }

    /**
     * 11 function to book video game station. it calls bookVideoGameStation
     * from VideoGameStaion class. if index no is not in range, suitable message
     * is displayed
     *
     * @param indexNo
     * @param customerName
     * @param customerType
     * @param bookingDate
     * @param duration
     */
    @Override
    public void bookVideoGameStation(int indexNo, String customerName, String customerType, String bookingDate, int duration) {

        if (indexNo >= 0 && list.size() > indexNo) {
            videoGameStation = list.get(indexNo);
            //call bookvideogamestation function  to book 
            videoGameStation.bookVideoGameStation(customerName, customerType, bookingDate, duration);
            //update list
            list.set(indexNo, videoGameStation);
        } else {
            System.out.println("The number that you entered is not valid");

        }
    }

    /**
     * 12 function to make video game available using index no
     *
     * @param indexNo
     */
    @Override
    public void makeVideoGameAvailable(int indexNo) {
        if (indexNo >= 0 && list.size() > indexNo) {
            videoGameStation = list.get(indexNo);
            videoGameStation.makeVideoGameAvailable();
            list.set(indexNo, videoGameStation);
        }
    }

    /**
     * 13 function to list available game stations along with index no
     */
    @Override
    public void listGameStation() {
        System.out.println("List of video game station!!!!");
        for (VideoGameStation vgs : list) {
            //list all the game station currently avalable
            if (vgs.isAvailableStatus()) {
                System.out.println("Index no: " + list.indexOf(vgs));
                vgs.gameStationDescription();
            }
        }
    }

    /**
     * 14 function to search game station and hourly rate. Suitable message is
     * displayed upon error
     *
     * @param searchGameStation
     * @param searchHourlyRate
     */
    @Override
    public void searchTerm(String searchGameStation, int searchHourlyRate) {
        boolean temp = false;
        System.out.println("Searching VideoGame Station");
        for (VideoGameStation vgs : list) {
            //searching condition
            if (vgs.isAvailableStatus()) {
                if (vgs.getGameStation().equals(searchGameStation) && vgs.getHourlyRate() <= searchHourlyRate) {
                    temp = true;
                    System.out.println("Index no: "+list.indexOf(vgs));
                    vgs.gameStationDescription();
                    break;
                }
            }
        }
        if (temp == false) {
            System.out.println("The video game station that you are searching for is not available at the moment");
        }
    }

    /**
     * 15 function to display all the details such as customer name , customer
     * type, game station and hourly rate
     */
    @Override
    public void displayAllDetails() {
        //Sorting 
        System.out.println("Description along with sorting");
        Collections.sort(list);
        for (VideoGameStation vgs : list) {
            if(vgs.isAvailableStatus()==false){
                System.out.println("Customer Name: " + vgs.getCustomerName());
                vgs.gameStationDescription();

        }
    }
    }
}
