package servletpackage;

import javax.inject.Inject;

//@Inject
public class Planet {
    String naming;

    public String getNaming() {
        return naming;
    }

    public void setNaming(String naming) {
        this.naming = naming;
    }

    //@Inject
//    Planet(String naming){
//
//        this.naming = naming;
//    }

    Planet(){
        this.naming = "thisnamingNameSetByEmptyConstructor";
    }
    int timer=0;

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
public void startTimer(){
        new Thread(new  PlanetTimer()).start();
}
    class PlanetTimer implements Runnable{
        @Override
        public void run() {
            while(++timer<15){
                try {
                    Thread.sleep(500);
                    System.out.println(timer);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
