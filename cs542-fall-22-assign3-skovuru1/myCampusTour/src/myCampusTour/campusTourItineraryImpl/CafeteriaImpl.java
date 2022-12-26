package myCampusTour.campusTourItineraryImpl;

import myCampusTour.campusTourItinerary.ItineraryI;
import myCampusTour.campusTourItineraryUserChoices.CafeteriaChoice;
import myCampusTour.pojo.StudentActivityDetails;

public class CafeteriaImpl implements ItineraryI {

    private StudentActivityDetails activityDetails;
    private CafeteriaChoice cafeteriaChoice;

    public CafeteriaImpl(CafeteriaChoice choice) {
        cafeteriaChoice = choice;
        declareValuesBasedOnChoice();
    }

    private void declareValuesBasedOnChoice() {

        try {
            switch (cafeteriaChoice) {
                case CAFETERIA_CIW:
                    activityDetails = new StudentActivityDetails();
                    activityDetails.setCaloriesSpent(100);
                    activityDetails.setDurationOfActivity(60);
                    activityDetails.setCostForActivity(10);
                    activityDetails.setCarbonFootPrintMeasureOfCo2(1.75);
                    break;
                case CAFETERIA_MOUNTAIN_VIEW:
                    activityDetails = new StudentActivityDetails();
                    activityDetails.setCaloriesSpent(40);
                    activityDetails.setDurationOfActivity(35);
                    activityDetails.setCostForActivity(10.5);
                    activityDetails.setCarbonFootPrintMeasureOfCo2(1.15);
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
        return "Cafeteria          [CaloriesSpent: " + activityDetails.getCaloriesSpent()
                + ",  Duration Of Activity in minutes: "
                + activityDetails.getDurationOfActivity() + ",  Cost of activity in USD:"
                + activityDetails.getCostForActivity() + ",  Carbon foot print measure of Co2: "
                + activityDetails.getCarbonFootPrintMeasureOfCo2() + ",  Building Visit Choice: " + cafeteriaChoice
                + "]";
    }
}
