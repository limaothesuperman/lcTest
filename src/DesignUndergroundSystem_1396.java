import java.util.HashMap;
import java.util.Map;

public class DesignUndergroundSystem_1396 {
}

class UndergroundSystem {

    Map<Integer, CheckInInfo> checkIns;
    Map<String, Travel> travelTimes;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        travelTimes = new HashMap<>();

    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckInInfo(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        if (checkIns.get(id) != null) {
            CheckInInfo checkInInfo = checkIns.remove(id);
            String travelStations = checkInInfo.stationName + ", " + stationName;
            int travelTime = t - checkInInfo.checkInTime;

            if (travelTimes.containsKey(travelStations)) {
                Travel travelInfo = travelTimes.get(travelStations);
                travelInfo.totalTime += travelTime;
                travelInfo.travelCount++;
            } else {
                travelTimes.put(travelStations, new Travel(travelTime, 1));
            }
        }

    }

    public double getAverageTime(String startStation, String endStation) {
        String travelStations = startStation + ", " + endStation;
        Travel travel = travelTimes.get(travelStations);
        return (double) travel.totalTime / travel.travelCount;

    }
}

class CheckInInfo {
    String stationName;
    int checkInTime;

    public CheckInInfo(String stationName, int checkInTime) {
        this.stationName = stationName;
        this.checkInTime = checkInTime;
    }
}

class Travel {
    int totalTime;
    int travelCount;

    public Travel(int totalTime, int travelCount) {
        this.totalTime = totalTime;
        this.travelCount = travelCount;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */