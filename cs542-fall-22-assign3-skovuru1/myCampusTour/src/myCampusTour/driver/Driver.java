package myCampusTour.driver;

import java.io.FileWriter;
import java.io.IOException;

import myCampusTour.builderWorkshop.BuilderWorkshopI;
import myCampusTour.builderWorkshopImpl.BuilderWorkshopImpl;
import myCampusTour.campusTourItineraryUserChoices.BuildingVisitChoice;
import myCampusTour.campusTourItineraryUserChoices.CafeteriaChoice;
import myCampusTour.campusTourItineraryUserChoices.LectureChoice;
import myCampusTour.campusTourItineraryUserChoices.PickUpGiftChoice;
import myCampusTour.myTour.AbstractStudentOrientation;
import myCampusTour.util.MyLogger;
import myCampusTour.util.StudentOrientation;

/**
 * @author SAIKRISHNA KOVURU
 *
 */
public class Driver {

	public static void main(String[] args) {
		if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
			System.exit(1);
		}

		FileWriter errorLog;
		BuildingVisitChoice buildingVisitChoice;
		LectureChoice lectureChoice;
		CafeteriaChoice cafeteriaChoice;
		PickUpGiftChoice pickUpGiftChoice;

		try {
			errorLog = new FileWriter(args[0]);
			int debugLevel = 0;

			// setting enum choices
			buildingVisitChoice = BuildingVisitChoice.ONFOOT_TOUR;
			lectureChoice = LectureChoice.LECTURE_CS540;
			cafeteriaChoice = CafeteriaChoice.CAFETERIA_CIW;
			pickUpGiftChoice = PickUpGiftChoice.PICKUP_GIFT_EVENT_CENTER;

			// checking if any of the enum values is left empty or null
			boolean tourChoice = buildingVisitChoice != null && lectureChoice != null && cafeteriaChoice != null
					&& pickUpGiftChoice != null;

			// if condition to check if the debug level is given integer and using null
			// chedk for enum set values.
			if (args[1].matches("\\d+") && tourChoice) {
				debugLevel = Integer.parseInt(args[1]);
				MyLogger.setDebugValue(debugLevel);

				// main logic of builder pattern

				// sending enum values to student orientation.
				AbstractStudentOrientation studentOrientation = new StudentOrientation(buildingVisitChoice,
						lectureChoice, cafeteriaChoice, pickUpGiftChoice);
				// creating workshop object
				BuilderWorkshopI workshopI = new BuilderWorkshopImpl();
				// calling construct.
				workshopI.constructCampusTour(studentOrientation);
			} else {
				// if debug level is not an integer or enum choice is null.
				errorLog.write(
						"Either Debug value has been entered in a non integer format or any choice of tour has been left null");
				MyLogger.writeMessage(
						"Either Debug value has been entered in a non integer format or any choice of tour has been left null",
						null);
				errorLog.flush();
				errorLog.close();
				System.exit(1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
	}
}
