/**
 * Created by Pavilion on 11-5-2016.
 */
public class Driver {
    //private kan niet buiten class gebruikt
        private Vehicle vehicle;
        public void Drive(){
            System.out.println("hallo");
        this.vehicle.move();
    }
}
interface Vehicle {
    void move();
}

class Car implements Vehicle{
    public void move(){
        System.out.println("testttt");
    }
}