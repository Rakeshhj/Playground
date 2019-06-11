import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int fd=n/100;
    int sd=(n/10)%10;
    int td=n%10;
    int rverseno=(td*100+sd*10+fd);
    System.out.println(rverseno);
  }
}