package homeworks.homework_47;

import java.util.*;

public class FindRoute {
    public static void main(String[] args) {
        Map<String, String> directFlights = new HashMap<>();
        directFlights.put("New York", "Chicago");
        directFlights.put("Chicago", "Denver");
        directFlights.put("Denver", "Las Vegas");
        directFlights.put("Boston", "Miami");
        directFlights.put("Miami", "New York");
        directFlights.put("Los Angeles", "San Francisco");
        directFlights.put("San Francisco", "New York");

        List<String> route = findRoute(directFlights, "Boston", "Las Vegas");
        System.out.println(route); // Вывод: ["Boston", "Miami", "New York", "Chicago", "Denver", "Las Vegas"]
    }

    private static List<String> findRoute(Map<String, String> directFlights, String source, String destination) {
        List<String> route = new ArrayList<>();
        route.add(source);

        if (routeSearch(directFlights, source, destination, route)) {
            return route;
        } else {
            return Collections.emptyList();
        }
    }

    private static boolean routeSearch(Map<String, String> directFlights, String currentCity, String destination, List<String> route) {
        if (currentCity.equals(destination)) {
            return true;
        }

        String nextCity = directFlights.get(currentCity);
        if (nextCity != null) {
            route.add(nextCity);
            currentCity = nextCity;

            return routeSearch(directFlights, currentCity, destination, route);
        }

        return false;
    }
}
