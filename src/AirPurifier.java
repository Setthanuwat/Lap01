import java.sql.SQLOutput;

public class AirPurifier {
    int AirQuality;
    int Cfilter;
    int Speed;
    int Time1;
    int Time2;
    int Temp;
    String model = "FP-J60TA-W";
    String brand = "SHARP";
    String mode;
    int year = 2020;
    String x;

    AirPurifier(int AirQ, int _Cfiler, int spd, int T1, int T2, int _Temp, int _mode) {
        AirQuality = AirQ;
        Cfilter = _Cfiler;
        Time1 = T1;
        Time2 = T2;
        Temp = _Temp;
        if (_mode == 1) {
            mode = "Healthy";
        } else if (_mode == 2) {
            mode = "Auto";
        } else if (_mode == 3) {
            mode = "Sleep";
        }

    }

    void showAirPurifier() {
        System.out.println("Brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("AirQuality: " + AirQuality);
        System.out.println("Filer: " + Cfilter+"%");
        System.out.println("Time: " + Time1+":"+Time2);
        System.out.println("Temp: " + Temp + "°C");
        System.out.println("mode: " + mode);
        if(Cfilter <= 40 && Cfilter >10)
        {
            System.out.println("Please change the filter !!!");
        }
        if(Cfilter <= 10)
        {
            System.out.println("Warning !!!!!!!!!");
            System.out.println(" pip pip pip pip");
        }
        if (AirQuality < 5)
            System.out.println("what awful weather !");
             System.out.println(" pip pip pip pip");


    }
}
