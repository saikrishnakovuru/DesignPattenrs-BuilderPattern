package myCampusTour.campusTourItineraryImpl;

import myCampusTour.campusTourItinerary.ItineraryI;
import myCampusTour.campusTourItineraryUserChoices.BuildingVisitChoice;
import myCampusTour.pojo.StudentActivityDetails;

public class BuildingVisitImpl implements ItineraryI {

    private StudentActivityDetails activityDetails;
    private BuildingVisitChoice choice;

    public BuildingVisitImpl(BuildingVisitChoice buildingChoice) {
        choice = buildingChoice;
        declareValuesBasedOnChoice();
    }

    private void declareValuesBasedOnChoice() {
        try {
            switch (choice) {
                case BUSRIDE_TOUR:
                    activityDetails = new StudentActivityDetails();
                    activityDetails.setCaloriesSpent(20);
                    activityDetails.setDurationOfActivity(9);
                    activityDetails.setCostForActivity(3.0);
                    activityDetails.setCarbonFootPrintMeasureOfCo2(0.65);
                    break;
                case ONFOOT_TOUR:
                    activityDetails = new StudentActivityDetails();
                    activityDetails.setCaloriesSpent(80);
                    activityDetails.setDurationOfActivity(48);
                    activityDetails.setCostForActivity(1.0);
                    activityDetails.setCarbonFootPrintMeasureOfCo2(2.2);
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
        return "Visiting Building  [CaloriesSpent: " + activityDetails.getCaloriesSpent()
                + ",  Duration Of Activity in minutes: "
                + activityDetails.getDurationOfActivity() + ",  Cost of activity in USD:"
                + activityDetails.getCostForActivity() + ",  Carbon foot print measure of Co2: "
                + activityDetails.getCarbonFootPrintMeasureOfCo2() + ",  Building Visit Choice: " + choice + "]";
    }

}
