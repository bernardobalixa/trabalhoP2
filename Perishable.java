import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Perishable extends Product implements Freshness{

    private Date limitDate;
    
    public Perishable(String name, double cost, String limitDate) throws ParseException{
        super(name, cost);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        this.limitDate = dateFormat.parse(limitDate);
    }

    public boolean isOutDated(){ 
        Date today = new Date();

        if (today.compareTo(this.limitDate) > 0)
            return true;

        return false;
    };

    public boolean isFromToday(){
        Date today = new Date();

        if (today.compareTo(this.limitDate) == 0)
            return true;

        return false;
    };


}