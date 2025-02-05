class Matches
{
  private int over;
  private int mid;
  private String mname;
  private String location;
  private Team team[];
  
    Matches(int mid,int over,String mname,String location)
    {
        this.over=over;
        this.mid=mid;
        this.mname=mname;
        this.location=location;
    }
    
    public int getMid()
    {
       return mid;
    }
    
    public int getOver()
    {
       return over;
    }
    
    public String getMname()
    {
      return mname;
    }
    
    public String getLocation()
    {
       return location;
    }
    
    public void setTeam(Team team[])
    {
       this.team=team;
    }
    
    public Team[] getTeam()
    {
       return team;
    }
}