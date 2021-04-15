import java.util.ArrayList;

public class HuluState implements State
{
    private TV tv;

    /**
     * Displaying the home button information and changing the state
     */
    public void pressHomeButton()
    {
        System.out.println("Loading the Home Screen...");
        tv.pressHomeButton();
    }

    /**
     * Displaying a load for netflix and changing the state
     */
    public void pressNetflixButton()
    {
        System.out.println("Loading the Netflix app...");
        tv.pressNetflixButton();
    }

    /**
     * Displaying the loading for hulu 
     */
    public void pressHuluButton()
    {
        System.out.println("We are on the Hulu app...");
    }

    /**
     * creating a movie list and filling it 
     * displaying information for the movies and looping through to display them
     */
    public void pressMovieButton()
    {
        ArrayList<String> movies = new ArrayList<String>();
        movies.add("Mamma Mia");
        movies.add("Mamma Mia, Here we go again");
        movies.add("Night at the Museum");
        movies.add("Grave of the FireFlies");
        movies.add("Juno");

        System.out.println("Loading Hulu Movies..");
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
        tvShows.add("Dexter");
        tvShows.add("Cowboy Bepop");
        tvShows.add("Supernatural");
        tvShows.add("The Masked Singer");
        tvShows.add("Adventure Time");

        System.out.println("Loading Hulu Shows..");
        for(int i =0; i < 5; i++)
        {
            System.out.println("- " + tvShows.get(i));
        }
    }
    
}
