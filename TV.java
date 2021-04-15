public class TV {
    private State homeState;
    private State netflixState;
    private State huluState;
    private State state;


    public TV()
    {
      //wip
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
        else
        {
            this.state=state;
        }
    }
    public void pressHomeButton()
    {
        setState(state);
        state.pressHomeButton();
    }

    public void pressNetflixButton()
    {
        setState(state);
        state.pressNetflixButton();
    }

    public void pressHuluButton()
    {
        setState(state);
        state.pressHuluButton();
    }

    public void pressMovieButton()
    {
        setState(state);
        state.pressMovieButton();
    }

    public void pressTVButton()
    {
        setState(state);
        state.pressTVButton();
    }


}