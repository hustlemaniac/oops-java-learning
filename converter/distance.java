package converter;

public class distance extends converting{
    double km_m = 1000;
    double mi_km = 1.60934;
    public double kilometer_meter(double distance){
        return convert(distance, km_m);

    }
    public double meter_kilometer(double distance){
        return convert(distance, (double) 1 / km_m);

    }
    public double miles_kilometer(double distance){
        return convert(distance, mi_km);

    }
    public double kilometer_miles(double distance){
        return convert(distance, (double) 1 / mi_km);

    }
    
}
