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


    AirPurifier()
    {
        this(4,70 , 2, 15 ,31,25,1);
    }
    AirPurifier(int AirQ, int _Cfiler, int spd, int T1, int T2, int _Temp, int _mode) {
        this.AirQuality = AirQ;
        this.Cfilter = _Cfiler;
        this.Time1 = T1;
        this.Time2 = T2;
        this.Temp = _Temp;
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
        if (AirQuality > 6 )
        {
            System.out.println("statusAir: Green");
        }
        else if (AirQuality  <6 )
        {
            System.out.println("statusAir: Yellow");
        }
        else if (AirQuality < 4 )
        {
            System.out.println("statusAir: Red");
        }
        if (Cfilter >= 60)
        {
            System.out.println("statusFiler: Green");
        }
        else if (Cfilter < 60)
        {
            System.out.println("statusFiler: Yellow");
        }
        else if (Cfilter <= 10)
        {
            System.out.println("statusFiler: Red");
        }
        System.out.println("AirQuality: " + AirQuality);
        System.out.println("Filer: " + Cfilter+"%");
        System.out.println("Time: " + Time1+":"+Time2);
        System.out.println("Temp: " + Temp + "°C");
        System.out.println("mode: " + mode);
        if(Cfilter <= 40 && Cfilter >10)
        {
            System.out.println("Please change the filter !!!");
        }
        else if(Cfilter <= 10)
        {
            System.out.println("Warning !!!!!!!!!");
            System.out.println(" pip pip pip pip");
        }
        if (AirQuality < 4) {
            System.out.println("what awful weather !");
            System.out.println(" pip pip pip pip");
        }


    }
}
