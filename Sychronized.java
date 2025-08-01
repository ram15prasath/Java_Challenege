class CakeCount{
    int cakeCout=0;
    public synchronized void increment(){
         cakeCout++;
    }
}
class Team implements Runnable{
    CakeCount counter;
    Team(CakeCount counter){
        this.counter=counter;
    }
    public void run() {
        for (int i=0;i<100;i++){
            counter.increment();
        }
    }
}

public class Sychronized {
    public static void main(String[] args) {
        CakeCount cake=new CakeCount();

        Thread team1=new Thread(new Team(cake));
        Thread team2=new Thread(new Team(cake));

        team1.start();
        team2.start();

        try {
            team1.join();
            team2.join();
        }catch (Exception E){
            System.out.println(E.getMessage());
        }
        System.out.println(cake.cakeCout);


    }

}
