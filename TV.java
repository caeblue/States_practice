public class TV {
    private State homeState;
    private State netflixState;
    private State huluState;
    private State state;


    public TV()
    {
       //wip
    }

    public void pressHomeButton()
    {
        state.pressHomeButton();
    }

    public void pressNetflixButton()
    {
        state.pressNetflixButton();
    }

    public void pressHuluButton()
    {
        state.pressHuluButton();
    }

    public void pressMovieButton()
    {
        state.pressMovieButton();
    }

    public void pressTVButton()
    {
        state.pressTVButton();
    }

    public State getHomeState()
    {
        return homeState;
    }

    public State getNetflixState()
    {
        return netflixState;
    }

    public State getHuluState()
    {
        return huluState;
    }

    public void setState(State state)
    {
        if( state == homeState)
        {
            this.state = homeState;
        }
        if(state == netflixState)
        {
            this.state = netflixState;
        }
        if(state == huluState)
        {
            this.state = huluState;
        }
    }
}
