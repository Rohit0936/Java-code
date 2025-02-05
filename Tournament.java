class Tournament
{
   private Matches match;
   private Team team[];
   private Player player[];
   
   Tournament(Matches match,Team team[],Player player[])
   {
       this.match=match;
       this.team=team;
       this.player=player;
   }
   
   public Matches getMatch()
   {
      return match;
   }
   
   public Team[] getTeam()
   {
     return team;
   }
   
   public Player[] getPlayer()
  {
     return player;
   }
   
   public void Allteam()
   {
      for(int i=0;i<team.length;i++)
        {
             System.out.println("\n   Team Id: "+team[i].getTid()+"   Team Name: "+team[i].getName());
        }
   }
   
   public void Showteamwiseplayer()
   {
       for(int i=0;i<team.length;i++)
         {
            System.out.println("\n   Team Id: "+team[i].getTid()+"   Team Name: "+team[i].getName());         
            System.out.println("\nId\t\tName\t\tAge");
                for(int j=0;j<player.length;j++)
                   {
                      if(team[i].getName().equals(player[j].getTname()))
                       {
                           System.out.println(player[j].getPid()+"\t\t"+player[j].getName()+"\t\t"+player[j].getAge());
                       }
                   }
         }

   }
   
   public void showplayerwiserun()
   {
       System.out.println("\nId\t\tName\t\tAge\t\tRun");
        for(int j=0;j<player.length;j++)
          {
                 System.out.println(player[j].getPid()+"\t\t"+player[j].getName()+"\t\t"+player[j].getAge()+"\t\t"+player[j].getRun());
          }

   }
   
   public void showaggregaterun()
   {
       for(int i=0;i<team.length;i++)
       {int total=0;
          team[i].showTeam();
          System.out.println("\nId\t\tName\t\tAge\t\tRun");
          for(int j=0;j<player.length;j++)
          {
            if(team[i].getName().equals(player[j].getTname()))
             {
               System.out.println(player[j].getPid()+"\t\t"+player[j].getName()+"\t\t"+player[j].getAge()+"\t\t"+player[j].getRun());
                total=total+player[j].getRun();
             }
          }
          System.out.println("------------------------------");
          System.out.print("TotalRun: "+total+"\n");
       }
   } 
   
   public void decideWinner()
   {
     int max=0;
     String name="";
        for(int i=0;i<team.length;i++)
       {int total=0;
          for(int j=0;j<player.length;j++)
          {
            if(team[i].getName().equals(player[j].getTname()))
             {
                  total=total+player[j].getRun();
             }
          }
          
          if(max<total);
          {
             max=total;
             name=team[i].getName();
          }
        }
       System.out.println("\n*   "+name+" Is a Winner:   *"+" Run ="+max);
   }
}
