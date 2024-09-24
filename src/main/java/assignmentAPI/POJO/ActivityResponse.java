package assignmentAPI.POJO;

import lombok.Data;

@Data
public class ActivityResponse {
    private String activity;
    private String type;
    private int participants;
    private double price;
    private String link;
    private String key;
    private double accessibility;

    public ActivityResponse(String activity, String type, int participants, double price, String link, String key, double accessibility) {
        this.activity = activity;
        this.type = type;
        this.participants = participants;
        this.price = price;
        this.link = link;
        this.key = key;
        this.accessibility = accessibility;
    }

    @Override
    public String toString() {
        return "Activity=" + activity + ", Price=" + price + ", Accessibility=" + accessibility;
    }
}
