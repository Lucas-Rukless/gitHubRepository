import javax.swing.JOptionPane;
import java.util.*;

public class mainProg {
	public static void main(String[]args){
		int rn = 0;
		
		choices choice = new choices();
		story story = new story();

		Random rando = new Random();
		rn = rando.nextInt(2);
		
		//System.out.println(rn); //to see the random number that is generated
		story.startAdventure();
		choice.leftOrRight();
		if(choice.getLeftOrRight().equalsIgnoreCase("left")){
			if (rn==0){story.quicksand();}
			if (rn==1){story.asylum_live();}
		}else if(choice.getLeftOrRight().equalsIgnoreCase("right")){
			if (rn==0){story.asylum_live();}
			if (rn==1){story.quicksand();}
		}
		else{
			JOptionPane.showMessageDialog(null, "Since you did not choose\n a giant boulder will now\n come crush you...");
			JOptionPane.showMessageDialog(null, "Your dead!");
			System.exit(0);
		}
		choice.leftOrRight();
		if(choice.getLeftOrRight().equalsIgnoreCase("left")){
			if (rn==0){story.trapdoor_drown();}
			if (rn==1){story.cliff_skydive();}
		}else if(choice.getLeftOrRight().equalsIgnoreCase("right")){
			if (rn==0){story.cliff_skydive();}
			if (rn==1){story.trapdoor_drown();}		}
		else{
			JOptionPane.showMessageDialog(null, "Since you did not choose\n a giant boulder will now\n come crush you...");
			JOptionPane.showMessageDialog(null, "Your dead!");
			System.exit(0);
		}
		choice.leftOrRight();
		if(choice.getLeftOrRight().equalsIgnoreCase("left")){
			if (rn==0){story.lake_boat();}
			if (rn==1){story.cliff_fall();}
		}else if(choice.getLeftOrRight().equalsIgnoreCase("right")){
			if (rn==0){story.cliff_fall();}
			if (rn==1){story.lake_boat();}
		}
		else{
			JOptionPane.showMessageDialog(null, "Since you did not choose\n a giant boulder will now\n come crush you...");
			JOptionPane.showMessageDialog(null, "Your dead!");
			System.exit(0);
		}
		choice.leftOrRight();
		if(choice.getLeftOrRight().equalsIgnoreCase("left")){
			if (rn==0){story.slip_fall();}
			if (rn==1){story.mountaintop();}
		}else if(choice.getLeftOrRight().equalsIgnoreCase("right")){
			if (rn==0){story.mountaintop();}
			if (rn==1){story.slip_fall();}
		}
		else{
			JOptionPane.showMessageDialog(null, "Since you did not choose\n a giant boulder will now\n come crush you...");
			JOptionPane.showMessageDialog(null, "Your dead!");
			System.exit(0);
		}
		choice.leftOrRight();
		if(choice.getLeftOrRight().equalsIgnoreCase("left")){
			if (rn==0){story.snowleopard_attack();}
			if (rn==1){story.ocean_fakeending();}
		}else if(choice.getLeftOrRight().equalsIgnoreCase("right")){
			if (rn==0){story.ocean_fakeending();}
			if (rn==1){story.snowleopard_attack();}
		}
		else{
			JOptionPane.showMessageDialog(null, "Since you did not choose\n a giant boulder will now\n come crush you...");
			JOptionPane.showMessageDialog(null, "Your dead!");
			System.exit(0);
		}
		choice.leftOrRight();
		if(choice.getLeftOrRight().equalsIgnoreCase("left")){
			if (rn==0){story.mineshaft_oceanexit();}
			if (rn==1){story.mineshaft_beachexit();}
		}else if(choice.getLeftOrRight().equalsIgnoreCase("right")){
			if (rn==0){story.mineshaft_beachexit();}
			if (rn==1){story.mineshaft_oceanexit();}
		}
		else{
			JOptionPane.showMessageDialog(null, "Since you did not choose\n a giant boulder fell and\n unfortunately crushed you...");
			JOptionPane.showMessageDialog(null, "Your dead!");
			System.exit(0);
		}
	}
}