package myCampusTour.util;

import java.util.ArrayList;
import java.util.List;

import myCampusTour.campusTourItinerary.ItineraryI;
import myCampusTour.campusTourItineraryImpl.BuildingVisitImpl;
import myCampusTour.campusTourItineraryImpl.CafeteriaImpl;
import myCampusTour.campusTourItineraryImpl.LectureImpl;
import myCampusTour.campusTourItineraryImpl.PickupGiftImpl;
import myCampusTour.campusTourItineraryUserChoices.BuildingVisitChoice;
import myCampusTour.campusTourItineraryUserChoices.CafeteriaChoice;
import myCampusTour.campusTourItineraryUserChoices.LectureChoice;
import myCampusTour.campusTourItineraryUserChoices.PickUpGiftChoice;
import myCampusTour.myTour.AbstractStudentOrientation;
import myCampusTour.util.MyLogger.DebugLevel;

public class StudentOrientation extends AbstractStudentOrientation {

    private PickUpGiftChoice pickupGiftChoice;
    private CafeteriaChoice cafeteriaChoice;
    private LectureChoice lectureChoice;
    private BuildingVisitChoice buildingVisitChoice;

    private ItineraryI gift;
    private ItineraryI cafeteria;
    private ItineraryI lecture;
    private ItineraryI building;

    private int totalCaloriesSpent;
    private float totalCarbonFootPrintMeasureOfCo2;
    private float totalCostOfActivity;
    private int totalDurationOfActivity;

    private List<ItineraryI> constructedObjects;

    public StudentOrientation(BuildingVisitChoice selectBuilding, LectureChoice lecture, CafeteriaChoice cafeteria,
            PickUpGiftChoice pickupGift) {
        pickupGiftChoice = pickupGift;
        cafeteriaChoice = cafeteria;
        lectureChoice = lecture;
        buildingVisitChoice = selectBuilding;
        // array list to store all objects.
        constructedObjects = new ArrayList<>();
        // create itinerary objects based on choice.
        createObjectesOnUserChoice();
        // adding objects to arrayList.
        addItineraryObjectsToArrayList();
    }

    private void createObjectesOnUserChoice() {
        gift = new PickupGiftImpl(pickupGiftChoice);
        cafeteria = new CafeteriaImpl(cafeteriaChoice);
        lecture = new LectureImpl(lectureChoice);
        building = new BuildingVisitImpl(buildingVisitChoice);
    }

    private void addItineraryObjectsToArrayList() {
        constructedObjects.add(gift);
        constructedObjects.add(cafeteria);
        constructedObjects.add(lecture);
        constructedObjects.add(building);
    }

    @Override
    public void buildTourOfPickupGift() {
        totalCaloriesSpent += gift.getCaloriesSpentOnActivity();
        totalCarbonFootPrintMeasureOfCo2 += gift.getCarbonFootPrintMeasureOfCo2();
        totalCostOfActivity += gift.getCostForActivity();
        totalDurationOfActivity += gift.getDurationOfActivity();
    }

    @Override
    public void buildTourOfSelectingCafeteria() {
        totalCaloriesSpent += cafeteria.getCaloriesSpentOnActivity();
        totalCarbonFootPrintMeasureOfCo2 += cafeteria.getCarbonFootPrintMeasureOfCo2();
        totalCostOfActivity += cafeteria.getCostForActivity();
        totalDurationOfActivity += cafeteria.getDurationOfActivity();
    }

    @Override
    public void buildTourOfSelectingLecture() {
        totalCaloriesSpent += lecture.getCaloriesSpentOnActivity();
        totalCarbonFootPrintMeasureOfCo2 += lecture.getCarbonFootPrintMeasureOfCo2();
        totalCostOfActivity += lecture.getCostForActivity();
        totalDurationOfActivity += lecture.getDurationOfActivity();
    }

    @Override
    public void buildTourOfVisitingBuildings() {
        totalCaloriesSpent += building.getCaloriesSpentOnActivity();
        totalCarbonFootPrintMeasureOfCo2 += building.getCarbonFootPrintMeasureOfCo2();
        totalCostOfActivity += building.getCostForActivity();
        totalDurationOfActivity += building.getDurationOfActivity();
    }

    @Override
    public void displayTheResults() {
        for (ItineraryI itinerary : constructedObjects) {
            MyLogger.writeMessage(itinerary.toString(), DebugLevel.CONSTRUCTOR);
        }
        MyLogger.writeMessage(this.toString(), DebugLevel.CONSTRUCTOR);
    }

    @Override
    public String toString() {
        return "\n" + "overall Student " + "\n" + "Total Calories Spent = " + totalCaloriesSpent + "\n"
                + "Total CarbonFootPrint Measure Of Co2 = " + totalCarbonFootPrintMeasureOfCo2 + "\n"
                + "Total Cost For Activity in minutes = " + totalCostOfActivity + "\n"
                + "Total Duration Of Activity in minutes = "
                + totalDurationOfActivity + "]";
    }
}