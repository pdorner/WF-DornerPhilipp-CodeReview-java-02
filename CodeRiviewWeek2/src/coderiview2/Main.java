package coderiview2;

public class Main {

	public static void main(String[] args) {
		Exercise e1 = new Exercise ("Push-ups", "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. \n"
				+ "Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.", 30, false);
		Exercise e2 = new Exercise ("Planks", "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. \n"
				+ "Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.", 90, false);
		Exercise e3 = new Exercise ("Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. \n"
				+ "Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.", 45, true);
		Exercise e4 = new Exercise ("Backward Kick", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. \n"
				+ "Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.", 60, false);
		Exercise e5 = new Exercise ("Leg Curl", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. \n"
				+ "Stay for 15 seconds, then repeat with your other leg.", 90, true);
		Exercise e6 = new Exercise ("Sidewards Back Stretch", "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.", 60, true);
		Exercise [] exarr = {e1, e2, e3, e4, e5, e6};
		System.out.println("--------------------------------------------------------------");
//		System.out.println("All Exercises");
//		for (Exercise e : exarr) {
//			e.print();
//		}
//		
//		System.out.println("--------------------------------------------------------------");
//		System.out.println("Exercises on the floor");
//		for (Exercise e : exarr) {
//			if (!e.isPostion()) 
//				e.print();			
//			
//			
//		}
		
		System.out.println("--------------------------------------------------------------");	
		System.out.println("Exercises that are on the floor and take more than a minute");
		for (Exercise e : exarr) {
			if (!e.isPostion() && e.getSec() > 60)
				e.print();	
		}
		System.out.println("--------------------------------------------------------------");	

	}

}
