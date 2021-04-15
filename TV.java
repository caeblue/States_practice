public class TV {

    private State homeState;
    private State netflixState;
    private State huluState;
    private State state;


    /**
     * creating and setting new instances of each state, and setting a base case state
     */
    public TV()
    {
        this.homeState= new HomeState(this);
        this.huluState= new HuluState(this);
        this.netflixState= new NetflixState(this);
        this.state = homeState;
    }

    /**
     * getting home state
     * @return homestate variable
     */
    public State getHomeState()
    {
        return homeState;
    }

    /**
     * getting netflix state
     * @return netflixstate varaible
     */
    public State getNetflixState()
    {
        return netflixState;
    }

    /**
     * getting hulu state 
     * @return hulustate varaiable
     */
    public State getHuluState()
    {
        return huluState;
    }

    /**
     * setting the state, will change based on class
     * @param state 
     */
    public void setState(State state)
    {
       this.state = state;
    }

    /**
     * Calling to press the button to run that method
     */
    public void pressHomeButton()
    {
        state.pressHomeButton();
    }

    /**
     * Calling to press the button to run that method
     */
    public void pressNetflixButton()
    {
        state.pressNetflixButton();
    }

    /**
     * Calling to press the button to run that method
     */
    public void pressHuluButton()
    {
        state.pressHuluButton();
    }

    /**
     * Calling to press the button to run that method
     */
    public void pressMovieButton()
    {
        state.pressMovieButton();
    }

    /**
     * Calling to press the button to run that method
     */
    public void pressTVButton()
    {
        state.pressTVButton();
    }


}