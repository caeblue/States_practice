import java.util.ArrayList;

public class NetflixState implements State
{
    private TV tv;

     /**
     * Setting the tv to a local variable 
     * @param tv
     */
    public NetflixState(TV tv)
   {
       this.tv=tv;
   }
     /**
     * Displaying the home screen output and changing the state
     */
    public void pressHomeButton()
    {
        System.out.println("Loading the Home Screen...");
        tv.setState(tv.getHomeState());
    }

    /**
     * Displaying a load for netflix 
     */
    public void pressNetflixButton()
    {
        System.out.println("We are already on the Netflix app...");
    }

    /**
     * Displaying the loading for hulu and changing the state
     */
    public void pressHuluButton()
    {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
    }

    /**
     * creating a movie list and filling it 
     * displaying information for the movies and looping through to display them
     */
    public void pressMovieButton()
    {
        ArrayList<String> movies = new ArrayList<String>();
        movies.add("Shrek");
        movies.add("Cars");
        movies.add("Princess and the Frog");
        movies.add("Tinkerbell");
        movies.add("Aladdin");

        System.out.println("Loading Netflix Movies..");
        for(int i =0; i < 5; i++)
        {
            System.out.println("- " + movies.get(i));
        }
       
    }

    /**
     * Creating a tv list and filling it 
     * Displaying information for the Tv shows
     */
    public void pressTVButton()
    {
        ArrayList<String> tvShows = new ArrayList<String>();
        tvShows.add("Criminal Minds");
        tvShows.add("Hannibal");
        tvShows.add("Puss in Boots");
        tvShows.add("Demon Slayer");
        tvShows.add("Great British Bake Off");

        System.out.println("Loading Netflix Shows..");
        for(int i =0; i < 5; i++)
        {
            System.out.println("- " + tvShows.get(i));
        }
    }
}
