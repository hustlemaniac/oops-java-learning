package converter;

public class time extends converting{
    double hr_min = 60;
    double hr_sec = 3600;
    public double hour_min(double time){
        return convert(time, hr_min);

    }
    public double min_hour(double time){
        return convert(time, (double) 1 / hr_min);

    }
    public double hour_sec(double time){
        return convert(time, hr_sec);

    }
    public double sec_hour(double time){
        return convert(time, (double) 1 / hr_sec);

    }
    
}
