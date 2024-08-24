import java.util.*;

public class Itinerary {
    public static List<String> findItinerary(Map<String, String> flights) {
        Map<String, String> reverseFlights = new HashMap<>();
        for (Map.Entry<String, String> entry : flights.entrySet()) {
            reverseFlights.put(entry.getValue(), entry.getKey());
        }

        // Find the starting point (source) of the itinerary
        String start = null;
        for (String source : flights.keySet()) {
            if (!reverseFlights.containsKey(source)) {
                start = source;
                break;
            }
        }

        // Build the itinerary using the source-to-destination mapping
        List<String> itinerary = new ArrayList<>();
        String current = start;
        while (current != null) {
            itinerary.add(current);
            current = flights.get(current);
        }

        return itinerary;
    }

    public static void main(String[] args) {
        Map<String, String> flights = new HashMap<>();
        flights.put("Panchkhal" , "Kathmandu");
        flights.put("Kathmandu", "Pokhara");
        flights.put("Pokhara", "USA");
        flights.put("USA", "Egypt");

        List<String> itinerary = findItinerary(flights);
        System.out.println("Itinerary: " + itinerary);
    }
}
