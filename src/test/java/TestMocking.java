import assignmentAPI.POJO.ActivityResponse;
import assignmentAPI.common.CommonMethods;
import assignmentAPI.data.BaseAPIData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestMocking {
    BaseAPIData baseAPIData = new BaseAPIData();
    CommonMethods commonMethods = new CommonMethods();

    @Test
    public void testFilterAndSortActivities(){
        List<ActivityResponse> activities = baseAPIData.getMockedActivitiesData();
        List<ActivityResponse> filteredActivities = commonMethods.filterAndSort(activities);

        Assert.assertFalse(filteredActivities.isEmpty(), "Filtered activities is empty");

        System.out.println("Filtered activities");
        filteredActivities.forEach(System.out::println);
    }
}
