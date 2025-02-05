import java.util.*;
class TournamentApp
{
   public static void main(String x[])
   {
      Scanner sc=new Scanner(System.in);
      
      Player p[]=null;
      Team t[]=null;
      Matches m=null;
      Tournament t1=null;
       Boolean flag=false;
           int choice=0;
           int k=0;
          boolean f=false; 
        do{
             System.out.println("\nPress 1: Add Player:");
             System.out.println("Press 2: Add Team");
             System.out.println("Press 3: Add Player In A Team");
             System.out.println("Press 4: Create Match");
             System.out.println("Press 5:Allocate team to match");
             System.out.println("Press 6:View All Team:");
             System.out.println("Press 7:Show team wise player list");
             System.out.println("Press 8:show player wise run");
             System.out.println("Press 9:Team wise player run aggregate");
             System.out.println("Press 10:decide the winner");
             System.out.print("\nEnter Choice: ");
             choice =sc.nextInt();
             
        if(choice==1)
        {
           f=true;
        }     
        if(f)
        {
             switch(choice)
             {
                 case 1:
                 {
                  if(k>0)
                  {
                    k=0;
                  }
                 System.out.println("\n====================================");
                   System.out.print("\nEnter Total Player: ");
                   int s=sc.nextInt();
                   
                   p=new Player[s];
                    for(int i=0;i<s;i++)
                    {
                      System.out.println("\nEnter "+(i+1)+" Player Detail: ");
                      System.out.print("Enter Id: ");
                      int pid=sc.nextInt();
                      
                      sc.nextLine();
                      System.out.print("Enter Name: ");
                      String name=sc.nextLine();
                      
                      System.out.print("Enter Age: ");
                      int age=sc.nextInt();
                      
                      p[i]=new Player(pid,name,age);
                    }
                    break;
                    
                 }//close 1 case;
                 
                 case 2:
                 {
                   
                   k++;
                   if(k>1)
                   {k=0;
                      break;
                   }
                    System.out.println("\n====================================");
                    System.out.print("\nEnter Total Team: ");
                    int s=sc.nextInt();
                    
                    t=new Team[s];
                    
                    for(int i=0;i<s;i++)
                    {
                       System.out.println("\nEnter "+(i+1)+" Team Deatil: ");
                       System.out.print("Enter Id: ");
                       int id=sc.nextInt();
                       
                       sc.nextLine();
                       System.out.print("Enter Name: ");
                       String name=sc.nextLine();
                       
                       t[i]=new Team(id,name);
                    }
                    
                    break;
                 }//case 2 close;
                 
                 
                 case 3:
                 {
                  if(k>1)
                  {
                    System.out.println("*  Already Team Create  *");
                     break;
                  }
                  if(k>0)
                  {k++;
                    for(int i=0;i<t.length;i++)
                    {
                       t[i].showTeam();
                       System.out.println("\nId\t\tName\t\tAge\t\tTeam");
                       
                       for(int j=0;j<p.length;j++)
                        {
                           p[j].playerDetail();
                        }
                      System.out.print("\nEnter How Many Player You Want: ");
                      int n=sc.nextInt();
                      for(int j=0;j<n;j++)
                      {
                         System.out.print("Enter "+(j+1)+" Player Id: ");
                         int id=sc.nextInt();
                         
                         Boolean flag1=false;
                         for(int k1=0;k1<p.length;k1++)
                         {
                             if(id==p[k1].getPid())
                             {  flag1=true;
                                
                                //System.out.print("Enter Team Name: ");
                                
                                
                                   if(p[k1].getTname().equals(" "))
                                   {
                                        p[k1].setTname(t[i].getName());

                                   }
                                   else
                                   {
                                     System.out.println("*  He's Player Already Another Team  *");
                                     j=j-1;
                                    }
                                
                             }
                         }
                         if(flag1!=true)
                         {
                           System.out.println("*  Wrong Player Id:  *");
                           j=j-1;
                         }
                      }
                    }
                   }
                   else
                   {
                     System.out.println("*  Team Not Found  *");
                   }
                    break;
                 }//case 3 close;
                 case 4:
                 {
                 
                   if(k>1)
                   {k++;
                       System.out.println("\n====================================");
                       System.out.print("\nEnter Match Id: ");
                       int id=sc.nextInt();
                       
                       System.out.print("Enter Match Over: ");
                       int over=sc.nextInt();
                       
                       sc.nextLine();
                       System.out.print("Enter Match Name: ");
                       String name=sc.nextLine();
                       
                       System.out.print("Enter Match Location: ");
                       String location=sc.nextLine();
                       
                       m=new Matches(id,over,name,location);
                   }
                   else
                   {
                     System.out.println("* Team Not Found  *");
                   }
                    break;
                 }//case 4 close;
                 
                 case 5:
                 {
                   if(k>3)
                  {
                    System.out.println("*  Already allocate team to match  *");
                     break;
                  }
                   if(k>2)
                   {k++;
                     flag=true;
                     for(int i=0;i<p.length;i++)
                     {
                        System.out.println("\nPlayer id: "+p[i].getPid());
                        System.out.println("Player Name: "+p[i].getName());
                        System.out.print("Enter Run: ");
                        int r=sc.nextInt();
                        
                        p[i].setRun(r);
                     }
                     m.setTeam(t);
                     System.out.println("*  Team Add Successfully  *");
                   }
                   else
                   {
                     System.out.println("*  Match Not Create:  *");
                   }
                    break;
                 }//case 5 close;
                 
                 case 6:
                 {
                   if(k>1)
                   {
                      t1=new Tournament(m,t,p);
                      t1.Allteam();
                    }
                   else
                   {
                     System.out.println("*  Team Not Available  *");
                   }
                    break;
                 }// case 6 close
                 
                 case 7:
                 {
                    if(k>2)
                   {
                     t1.Showteamwiseplayer();
                   }
                   else
                   {
                     System.out.println("*  Player Not Available  *");
                   }
                   break;
                 }//case 7 close;
                 
                 case 8:
                 {
                    if(flag)
                    {
                       t1.showplayerwiserun();
                    }
                    else
                    {
                      System.out.println("*  Run Not Add:  *");
                    }
                    break;
                 }//case 8 close;
                 
                 case 9:
                 {
                    if(k>3)
                    {
                       t1.showaggregaterun();
                    }
                    else
                    {
                       System.out.println("*  Run Not Add:  *");
                    }
                    break;
                 }//case 9 close;
                 
                 case 10:
                 {
                    if(k>3)
                    {
                        t1.decideWinner();
                    }
                    else
                    {
                       System.out.println("*  Run Not Declare  *");
                    }
                 }
                 
              }//close switch case;
        }
        else
        {
          System.out.println("*  Tournament Not Found:  *");
        }   
        }while(choice!=0);
   }
}