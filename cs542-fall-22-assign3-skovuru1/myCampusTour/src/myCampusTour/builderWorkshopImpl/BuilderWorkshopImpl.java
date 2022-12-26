package myCampusTour.builderWorkshopImpl;

import myCampusTour.builderWorkshop.BuilderWorkshopI;
import myCampusTour.myTour.AbstractStudentOrientation;

public class BuilderWorkshopImpl implements BuilderWorkshopI {

    @Override
    public void constructCampusTour(AbstractStudentOrientation studentOrientation) {
        studentOrientation.buildTourOfPickupGift();
        studentOrientation.buildTourOfSelectingCafeteria();
        studentOrientation.buildTourOfSelectingLecture();
        studentOrientation.buildTourOfVisitingBuildings();
        studentOrientation.displayTheResults();
    }

}
