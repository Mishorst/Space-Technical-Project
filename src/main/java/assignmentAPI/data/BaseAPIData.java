package assignmentAPI.data;

import assignmentAPI.POJO.ActivityResponse;

import java.util.Arrays;
import java.util.List;

public class BaseAPIData {
//    generated mocked data according to given example in assignment #2

    public List<ActivityResponse> getMockedActivitiesData(){
        return Arrays.asList(
                new ActivityResponse("Explore the nightlife", "social", 1, 0.1, "", "2237769", 0.32),
                new ActivityResponse("Go hiking", "recreational", 2, 0.0, "", "2237770", 0.10),
                new ActivityResponse("Watch a movie", "entertainment", 1, 0.3, "", "2237771", 0.40),
                new ActivityResponse("Learn to code", "education", 1, 0.0, "", "2237772", 0.20),
                new ActivityResponse("Read a book", "education", 1, 0.4, "", "2237781", 0.50),
                new ActivityResponse("Take a cooking class", "cooking", 2, 0.2, "", "2237782", 0.35),
                new ActivityResponse("Go for a run", "recreational", 1, 0.0, "", "2237783", 0.15),
                new ActivityResponse("Do a puzzle", "recreational", 1, 0.1, "", "2237784", 0.25),
                new ActivityResponse("Play board games", "social", 4, 0.0, "", "2237785", 0.12),
                new ActivityResponse("Write in a journal", "relaxation", 1, 0.05, "", "2237786", 0.18),
                new ActivityResponse("Meditate", "relaxation", 1, 0.0, "", "2237787", 0.08),
                new ActivityResponse("Visit a museum", "cultural", 2, 0.3, "", "2237788", 0.45),
                new ActivityResponse("Volunteer at a local charity", "charity", 1, 0.0, "", "2237789", 0.12),
                new ActivityResponse("Take a photography walk", "recreational", 1, 0.2, "", "2237790", 0.28),
                new ActivityResponse("Listen to a podcast", "entertainment", 1, 0.0, "", "2237791", 0.07),
                new ActivityResponse("Practice yoga", "relaxation", 1, 0.1, "", "2237792", 0.30),
                new ActivityResponse("Go stargazing", "recreational", 1, 0.0, "", "2237793", 0.14),
                new ActivityResponse("Host a game night", "social", 4, 0.0, "", "2237794", 0.09),
                new ActivityResponse("Try a new recipe", "cooking", 1, 0.3, "", "2237795", 0.42),
                new ActivityResponse("Organize a scavenger hunt", "recreational", 2, 0.25, "", "2237796", 0.37)
        );
    }
}
