public class WatchMain {
    public static void main(String args[]){
        Watch watch=new Analog();
        watch.showTime();
        watch.changeTime();
        watch=new Digital();
          watch.showTime();
           watch.changeTime();
           Digital digital=new Digital();
           digital.showHeartBeat();
    }
}
