import java.util.ArrayList;

public class ImprovedDotCom {
    
    ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locs)
    {
        locationCells = locs;
    }
    
    public String checkYourself(String stringGuess) {
        
        String result = "miss";
        
        if (locationCells.contains(stringGuess)) {
            locationCells.remove(stringGuess);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }   
        }
        System.out.println(result);
        return result;
    }
}