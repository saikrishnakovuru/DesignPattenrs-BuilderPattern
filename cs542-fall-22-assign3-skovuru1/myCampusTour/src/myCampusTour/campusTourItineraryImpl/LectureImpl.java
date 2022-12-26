package myCampusTour.campusTourItineraryImpl;

import myCampusTour.campusTourItinerary.ItineraryI;
import myCampusTour.campusTourItineraryUserChoices.LectureChoice;
import myCampusTour.pojo.StudentActivityDetails;

public class LectureImpl implements ItineraryI {

    private StudentActivityDetails activityDetails;
    private LectureChoice lectureChoice;

    public LectureImpl(LectureChoice choice) {
        lectureChoice = choice;
        declareValuesBasedOnChoice();
    }

    private void declareValuesBasedOnChoice() {
        try {
            switch (lectureChoice) {
                case LECTURE_CS540:
                    activityDetails = new StudentActivityDetails();
                    activityDetails.setCaloriesSpent(50);
                    activityDetails.setDurationOfActivity(35);
                    activityDetails.setCostForActivity(8);
                    activityDetails.setCarbonFootPrintMeasureOfCo2(1.5);
                    break;
                case LECTURE_CS542:
                    activityDetails = new StudentActivityDetails();
                    activityDetails.setCaloriesSpent(20);
                    activityDetails.setDurationOfActivity(29);
                    activityDetails.setCostForActivity(8.8);
                    activityDetails.setCarbonFootPrintMeasureOfCo2(0.88);
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
        return "Visiting Lecture   [CaloriesSpent: " + activityDetails.getCaloriesSpent()
                + ",  Duration Of Activity in minutes: "
                + activityDetails.getDurationOfActivity() + ",  Cost of activity in USD:"
                + activityDetails.getCostForActivity() + ",  Carbon foot print measure of Co2: "
                + activityDetails.getCarbonFootPrintMeasureOfCo2() + ",  Building Visit Choice: " + lectureChoice + "]";
    }
}
