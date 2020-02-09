
import application.ConstantSensor;
import application.Sensor;
import application.Thermometer;
import application.AverageSensor;

public class main {

    public static void main(String[] args) {
        Thermometer meter = new Thermometer();
        meter.on();
        AverageSensor ka = new AverageSensor();
        ka.addSensor(meter);
        ka.off();
        ka.on();
    }

}
