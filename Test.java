
/**
 * Write a description of class Test here.
 *
 * @author Samrat Shrestha
 * @version 15th Feb, 2019
 */
public class Test
{
    public static void main(String args[]){
        /**
         * 
         *making object of VideoGameStation class 
         *and passing gameStation, videoGameName and hourlyRate as argument 
         */
        VideoGameStation videoGameStation = new VideoGameStation("PS4","Fortnite",200);
        /**
          * making object of GameParlour class 
          */
        GameParlour gameParlour = new GameParlour();
        /**
         * This method books videogame station for the user.
         * The user has to pass customerName, customerType,date and
         * duration for booking the videogame
         * 
         */
        videoGameStation.bookVideoGameStation("Samrat Shrestha","Loyal","15/02/2019",3);
        /**
         * This method frees the videoGame if it is not free 
         * and displays suitable message if it is free
         */
        videoGameStation.makeVideoGameAvailable();
       /**
        * This method prints the description of game station i.e. game station name and hourly rate
        */
        System.out.println("Description");
        videoGameStation.gameStationDescription();
        /**
        * This method adds video game station to the list 
        * The argument needed are gameStation name , video game name and hourly rate
        */
        gameParlour.addNewVideoGameStation("PS3", "Fortnite", 110);
        gameParlour.addNewVideoGameStation("PS3", "DOTA", 120);
        gameParlour.addNewVideoGameStation("PS3", "WatchDogs", 130);
        gameParlour.addNewVideoGameStation("PS4", "Fifa 19", 150);
        gameParlour.addNewVideoGameStation("Xbox", "Fifa 19", 140);
        /**
        * This method removes videogame station from the list with index no as argument
        */
        gameParlour.removeVideoGameStation(4);
        /**
        * This method calls the bookVideoGameStation in VideoGameStaion class and books the video game
        * The argument passed are indexNo, customerName, customerType, date and hourly rate 
        */
        gameParlour.bookVideoGameStation(1, "Samrat Shrestha", "Loyal", "15/02/2019",13);
        gameParlour.bookVideoGameStation(0, "Eric Joshi", "Loyal", "15/02/2019",2);
        gameParlour.bookVideoGameStation(3, "Shovan Shah", "Loyal", "15/02/2019",3);
        gameParlour.bookVideoGameStation(2,"Saurav Pathak","Loyal","15/03/2019",4);
        /**
        * This method gets game station from game parlour list and 
        * call the method in VideoGameStation class to make video game available.
        */
       
        gameParlour.makeVideoGameAvailable(1);
        /**
        * This method gets the list of all video game currently	available.
        */
        System.out.println("");
        gameParlour.listGameStation();
        /**
        * This method allows user to search game station with hourly rate and
        * displays user the description of video game station and ends the search.
        */
        System.out.println("");
        gameParlour.searchTerm("PS3", 120);
        /**
        * This method displays customers name along with the name
        * of booked video game stations in ascending order.
        */
        System.out.println("");
        gameParlour.displayAllDetails();

    }
}
