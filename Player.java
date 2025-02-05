
class Player
{
    private int pid;
    private String name;
    private int age;
    private int run=0;
    private String tname=" ";
    
   Player(int pid,String name,int age)
   {
      this.pid=pid;
      this.name=name;
      this.age=age;
    }
    
   
   public int getPid()
   {
     return pid;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public void setTname(String tname)
   {
      this.tname=tname;
   }
   
   public String getTname()
   {
      return tname;
   }
   public void setRun(int run)
   {
      this.run=run;
   }
   
   public int getRun()
   {
     return run;
   }
          
   public void playerDetail()
   {
      System.out.println(pid+"\t\t"+name+"\t\t"+age+"\t\t"+tname);
   }               
}