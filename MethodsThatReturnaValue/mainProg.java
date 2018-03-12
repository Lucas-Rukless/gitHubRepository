import javax.swing.JOptionPane;
import acm.util.RandomGenerator;


import acm.util.RandomGenerator;
public class mainProg {
	public static void main(String[]args){
		int rn = 0;
		choices choice = new choices();
		story story = new story();
		/*RandomGenerator rando = RandomGenerator.getInstance();
		rando = new RandomGenerator();
		rn = rando.nextInt(11);*/
		
		story.startAdventure();
		choice.leftOrRight();
		if(choice.getLeftOrRight().equalsIgnoreCase("left")){
			story.quicksand();
		}else if(choice.getLeftOrRight().equalsIgnoreCase("right")){
			story.asylum_live();
		}
		else{
			JOptionPane.showMessageDialog(null, "Since you did not choose\n a giant boulder will now\n come crush you...");
			JOptionPane.showMessageDialog(null, "Your dead!");
			System.exit(0);
		}
		choice.leftOrRight();
		if(choice.getLeftOrRight().equalsIgnoreCase("left")){
			story.trapdoor_drown();
		}else if(choice.getLeftOrRight().equalsIgnoreCase("right")){
			story.cliff_skydive();
		}
		else{
			JOptionPane.showMessageDialog(null, "Since you did not choose\n a giant boulder will now\n come crush you...");
			JOptionPane.showMessageDialog(null, "Your dead!");
			System.exit(0);
		}
		choice.leftOrRight();
		if(choice.getLeftOrRight().equalsIgnoreCase("left")){
			story.lake_boat();
		}else if(choice.getLeftOrRight().equalsIgnoreCase("right")){
			story.cliff_fall();
		}
		else{
			JOptionPane.showMessageDialog(null, "Since you did not choose\n a giant boulder will now\n come crush you...");
			JOptionPane.showMessageDialog(null, "Your dead!");
			System.exit(0);
		}
		choice.leftOrRight();
		if(choice.getLeftOrRight().equalsIgnoreCase("left")){
			story.slip_fall();
		}else if(choice.getLeftOrRight().equalsIgnoreCase("right")){
			story.mountaintop();
		}
		else{
			JOptionPane.showMessageDialog(null, "Since you did not choose\n a giant boulder will now\n come crush you...");
			JOptionPane.showMessageDialog(null, "Your dead!");
			System.exit(0);
		}
		choice.leftOrRight();
		if(choice.getLeftOrRight().equalsIgnoreCase("left")){
			story.snowleopard_attack();
		}else if(choice.getLeftOrRight().equalsIgnoreCase("right")){
			story.ocean_fakeending();
		}
		else{
			JOptionPane.showMessageDialog(null, "Since you did not choose\n a giant boulder will now\n come crush you...");
			JOptionPane.showMessageDialog(null, "Your dead!");
			System.exit(0);
		}
		choice.leftOrRight();
		if(choice.getLeftOrRight().equalsIgnoreCase("left")){
			story.mineshaft_oceanexit();
		}else if(choice.getLeftOrRight().equalsIgnoreCase("right")){
			story.mineshaft_beachexit();
		}
		else{
			JOptionPane.showMessageDialog(null, "Since you did not choose\n a giant boulder fell and\n unfortunately crushed you...");
			JOptionPane.showMessageDialog(null, "Your dead!");
			System.exit(0);
		}
	}
}
