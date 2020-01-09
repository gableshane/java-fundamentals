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
                min = min > num ? num : min;
                max = max < num ? num : max;
                temperatures.add(num);
            }
        }
        response += "High: " + max + "\n";
        response += "Low: " + min + "\n";
        for(int i = min;i < max;i++) {
            if(!temperatures.contains(i)) {
                response += "Never saw temperature: " + i + "\n";
            }
        }
        return response.strip();
    }
}
