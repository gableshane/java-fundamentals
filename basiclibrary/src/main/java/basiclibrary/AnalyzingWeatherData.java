package basiclibrary;


import java.util.HashSet;

public class AnalyzingWeatherData {
    public static String maps(int[][] weatherData) {
        HashSet<Integer> temperatures = new HashSet<>();
        int min = weatherData[0][0];
        int max = weatherData[0][0];
        String response = "";
        for (int[] arr : weatherData) {
            for (int num : arr) {
                min = Math.min(min, num);
                max = Math.max(max, num);
                temperatures.add(num);
            }
        }
        response += "High: " + max + "\n";
        response += "\n" + "Low: " + min;
        for(int i = min;i < max;i++) {
            if(!temperatures.contains(i)) {
                response += "\n" + "Never saw temperature: " + i;
            }
        }
        return response.strip();
    }
}
