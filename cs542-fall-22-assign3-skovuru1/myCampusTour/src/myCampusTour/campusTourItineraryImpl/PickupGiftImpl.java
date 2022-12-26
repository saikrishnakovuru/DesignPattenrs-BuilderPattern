package myCampusTour.campusTourItineraryImpl;

import myCampusTour.campusTourItinerary.ItineraryI;
import myCampusTour.campusTourItineraryUserChoices.PickUpGiftChoice;
import myCampusTour.pojo.StudentActivityDetails;

public class PickupGiftImpl implements ItineraryI {

    private StudentActivityDetails activityDetails;
    private PickUpGiftChoice pickupGiftChoice;

    public PickupGiftImpl(PickUpGiftChoice choice) {
        pickupGiftChoice = choice;
        declareValuesBasedOnChoice();
    }

    private void declareValuesBasedOnChoice() {
        try {
            switch (pickupGiftChoice) {
                case PICKUP_GIFT_EVENT_CENTER:
                    activityDetails = new StudentActivityDetails();
                    activityDetails.setCaloriesSpent(40);
                    activityDetails.setDurationOfActivity(20);
                    activityDetails.setCostForActivity(5.5);
                    activityDetails.setCarbonFootPrintMeasureOfCo2(1.2);
                    break;
                case PICKUP_GIFT_UNIVERSITY_UNION:
                    activityDetails = new StudentActivityDetails();
                    activityDetails.setCaloriesSpent(55);
                    activityDetails.setDurationOfActivity(30);
                    activityDetails.setCostForActivity(4.56);
                    activityDetails.setCarbonFootPrintMeasureOfCo2(0.75);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    @Override
    public double getCarbonFootPrintMeasureOfCo2() {
        return activityDetails.getCarbonFootPrintMeasureOfCo2();
    }

    @Override
    public double getCostForActivity() {
        return activityDetails.getCostForActivity();
    }

    @Override
    public double getDurationOfActivity() {
        return activityDetails.getDurationOfActivity();
    }

    @Override
    public double getCaloriesSpentOnActivity() {
        return activityDetails.getCaloriesSpent();
    }

    @Override
    public String toString() {
        return "Pickup Gift        [CaloriesSpent: " + activityDetails.getCaloriesSpent()
                + ",  Duration Of Activity in minutes: "
                + activityDetails.getDurationOfActivity() + ",  Cost of activity in USD: "
                + activityDetails.getCostForActivity() + ",  Carbon foot print measure of Co2: "
                + activityDetails.getCarbonFootPrintMeasureOfCo2() + ",  Building Visit Choice: " + pickupGiftChoice
                + "]";
    }
}
