import java.util.*;

public class AvailableSeat {

    int no=33;
    // Seating arrangements for the three shows
    static Map<String, List<String>> show1Seats = new LinkedHashMap<>();
    static Map<String, List<String>> show2Seats = new LinkedHashMap<>();
    static Map<String, List<String>> show3Seats = new LinkedHashMap<>();

    void assignSeatForShow(){
        show1Seats.put("Platinum", new ArrayList<>(Arrays.asList("A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9")));
        show1Seats.put("Gold", new ArrayList<>(Arrays.asList("B1", "B2", "B3", "B4", "B5", "B6")));
        show1Seats.put("Silver", new ArrayList<>(Arrays.asList("C2", "C3", "C4", "C5", "C6", "C7")));

        show2Seats.put("Platinum", new ArrayList<>(Arrays.asList("A1", "A2", "A3", "A4", "A5", "A6", "A7")));
        show2Seats.put("Gold", new ArrayList<>(Arrays.asList("B2", "B3", "B4", "B5", "B6")));
        show2Seats.put("Silver", new ArrayList<>(Arrays.asList("C1", "C2", "C3", "C4", "C5", "C6", "C7")));

        show3Seats.put("Platinum", new ArrayList<>(Arrays.asList("A1", "A2", "A3", "A4", "A5", "A6", "A7")));
        show3Seats.put("Gold", new ArrayList<>(Arrays.asList("B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8")));
        show3Seats.put("Silver", new ArrayList<>(Arrays.asList("C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9")));
    }
}
