class Team
{
   private int tid;
   private String tname;
   //private player p[];
   
  Team(int tid,String tname)
   {
     this.tid=tid;
     this.tname=tname;
   }
   
   
   public int getTid()
   {
      return tid;
   }
   
   public String getName()
   {
     return tname;
   }
   void showTeam()
   {
     System.out.println("\n   Team Id: "+tid+"   Team Name: "+tname);  
   }
}