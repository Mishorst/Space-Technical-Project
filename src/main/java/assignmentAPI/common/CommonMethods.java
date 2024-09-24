package assignmentAPI.common;

import assignmentAPI.POJO.ActivityResponse;

import java.util.List;
import java.util.stream.Collectors;

public class CommonMethods {

//    method to filter prices, which are greater than 0, and sort them
    public List<ActivityResponse> filterAndSort(List<ActivityResponse> activities){
        return activities.stream()
                .filter(activity -> activity.getPrice() > 0)
                .sorted((a, b) -> Double.compare(a.getAccessibility(), b.getAccessibility()))
                .collect(Collectors.toList());
    }
}
