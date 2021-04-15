public class HomeState implements State
{
    private TV tv;

    /**
     * Displaying the home screen output
     */
    public void pressHomeButton()
    {
        System.out.println("TV is already on the homescreen");
    }

    /**
     * Displaying a load for netflix then changing the state of the tv
     */
    public void pressNetflixButton()
    {
        System.out.println("Loading Netflix...");
        tv.pressNetflixButton();
    }

    /**
     * Displaying the loading for hulu and changing the state
     */
    public void pressHuluButton()
    {
        System.out.println("Loading Hulu...");
        tv.pressHuluButton();
    }

    /**
     * displaying information for the movies
     */
    public void pressMovieButton()
    {
        System.out.println("You must pick an app to show the shows");
    }

    /**
     * Dispalying information for the Tv shows
     */
    public void pressTVButton()
    {
        System.out.println("You must pick an app to show the tv shows");
    }
}
