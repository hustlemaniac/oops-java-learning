package converter;
public class currency extends converting{
    double d_i = 82.05;
    double e_i = 91.89;
    double i_y = 1.70;

    public double Dollar_Inr(double amount){
        return convert(amount, d_i);

    }
    public double Inr_Dollar(double amount){
        return convert(amount, (double) 1 / d_i);

    }
    public double Euro_Inr(double amount){
        return convert(amount, e_i);

    }
    public double Inr_Euro(double amount){
        return convert(amount, (double) 1 / e_i);

    }
    public double Yen_Inr(double amount){
        return convert(amount, (double) 1 / i_y);

    }
    public double Inr_Yen(double amount){
        return convert(amount, i_y);

    }
    
}
