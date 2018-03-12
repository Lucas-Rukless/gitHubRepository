import javax.swing.JOptionPane;

public class story {
	
	public void startAdventure(){
		JOptionPane.showMessageDialog(null, "(Captain Ravnar) \n Welcome youngster, it seems your interested in navigating the unknown lands...");
		JOptionPane.showMessageDialog(null, "Remeber this will be kind of like a maze...");
		JOptionPane.showMessageDialog(null, "Good luck out there!");
		JOptionPane.showMessageDialog(null, "You can either choose to go through the left cave or the right gate...");
		JOptionPane.showMessageDialog(null, "Which do you choose youngster?");
	}
	public void quicksand(){
		JOptionPane.showMessageDialog(null, "It seems you've run into some fast acting quick sand...");
		JOptionPane.showMessageDialog(null, "Your journey unfortunately ends here.");
		System.exit(0);
	}
	public void cliff_fall(){
		JOptionPane.showMessageDialog(null, "You've run onto a cliff but left your parachute behind!");
		JOptionPane.showMessageDialog(null, "Your journey unfortunately ends here.");
		System.exit(0);
	}
	public void trapdoor_drown(){
		JOptionPane.showMessageDialog(null, "It seems you've run onto a trap door...");
		JOptionPane.showMessageDialog(null, "You fall over 200 ft into a pool of water \n you've gone so deep you unfortunatley drown...");
		JOptionPane.showMessageDialog(null, "Your journey unfortunatley ends here.");
		System.exit(0);
	}
	public void slip_fall(){
		JOptionPane.showMessageDialog(null, "After a quick crossing of the lake, you land at the bottom of a mountain...");
		JOptionPane.showMessageDialog(null, "While ascending a mountain you lost your footing near the top...");
		JOptionPane.showMessageDialog(null, "You tried to regain any kind of traction \n but you quickly fell farther and farther down the mountain...");
		JOptionPane.showMessageDialog(null, "You lost conscience half down the mountain and by the end you were gone...");
		JOptionPane.showMessageDialog(null, "Your journey unfortunatley ends here.");
		System.exit(0);
	}
	public void snowleopard_attack(){
		JOptionPane.showMessageDialog(null, "Five minutes in to the hike down you see movement in the trees...");
		JOptionPane.showMessageDialog(null, "You pick up the first sharp stick you see...");
		JOptionPane.showMessageDialog(null, "You keep your head looking left and right...");
		JOptionPane.showMessageDialog(null, "Suddenly a snow leopard jumps out right in front of you \n you try defending your self but the leopard over powers you...");
		JOptionPane.showMessageDialog(null, "Your journey unfortunatley ends here.");
		System.exit(0);
	}
	public void asylum_live(){
		JOptionPane.showMessageDialog(null, "You've run into an asylum, but you had some complications on the way...");
		JOptionPane.showMessageDialog(null, "On the way you found some huge rats, \n fortunaltly there was a fire axe nearby you used to fend them off.");
		JOptionPane.showMessageDialog(null, "Now there are two doors in front of you, do you choose left or right?");
	}
	public void mountaintop(){
		JOptionPane.showMessageDialog(null, "After the long sail through the night...");
		JOptionPane.showMessageDialog(null, "It seems you've made your way to a snowy mountain top after a long and brutal climb...");
		JOptionPane.showMessageDialog(null, "There is a meadian of trees allowing you to down to the left or the right...");
		JOptionPane.showMessageDialog(null, "Which way do you choose to go?");
	}
	public void cliff_skydive(){
		JOptionPane.showMessageDialog(null, "You've run onto the edge of cliff...");
		JOptionPane.showMessageDialog(null, "You remember Captain Ravnar told you that you have a parachute in you bag...");
		JOptionPane.showMessageDialog(null, "You jump, terrified because fog roles in just as you jump \n and now you can't see the ground or wall of the cliff...");
		JOptionPane.showMessageDialog(null, "You pull the chute the second you see a tree top, \n you fall through multiple branches and land hanging from a branch...");
		JOptionPane.showMessageDialog(null, "You've landed in a jungle with a large river in front of you \n its large enough for you not to see the other side because of the fog...");
		JOptionPane.showMessageDialog(null, "Do you head to the left of the river or the right?");
	}
	public void lake_boat(){
		JOptionPane.showMessageDialog(null, "You've run into a lake and you see two boats...");
		JOptionPane.showMessageDialog(null, "One of them is a on your right and one of them is on your left...");
		JOptionPane.showMessageDialog(null, "Do you choose the right or the left boat?");
	}
	public void ocean_fakeending(){
		JOptionPane.showMessageDialog(null, "Half way down the mountain you build yourself some skies to make the journey faster...");
		JOptionPane.showMessageDialog(null, "You reach the bottom and see a body of water in the distance...");
		JOptionPane.showMessageDialog(null, "You head that direction and relize it's an ocean with a beach...");
		JOptionPane.showMessageDialog(null, "You see an extraction boat and start to run towards it...");
		JOptionPane.showMessageDialog(null, "Your at the shoreline when all of a sudden you fall into a mineshaft and go unconscious.");
		JOptionPane.showMessageDialog(null, "You wake up and see theres a path to your left and right, which way do you head?");
	}
	public void mineshaft_beachexit(){
		JOptionPane.showMessageDialog(null,"After a short time walking through the mine you see a light...");
		JOptionPane.showMessageDialog(null,"You head towards it and realize it's a way out...");
		JOptionPane.showMessageDialog(null,"You get to the exit but there's no way you can jump out or climb out...");
		JOptionPane.showMessageDialog(null,"You take a large piece of wood and start to shovel away the sand \n it takes you a couple of hours but finally you can get to the surface...");
		JOptionPane.showMessageDialog(null,"You see the same extraction boat to your left and start to swim out to them \n they throw out a booey and pull you in...");
		JOptionPane.showMessageDialog(null,"Everyone congratulates you for completing the journey and ask you many question...");
		JOptionPane.showMessageDialog(null,"(Captain Ravnar)\n congratulations youngster, your the first to report back about the unkown lands \n thank you for risking your life for an outrageous adventure!");   
	}
	public void mineshaft_oceanexit(){
		JOptionPane.showMessageDialog(null,"After a long walk you see part of the mineshaft is flooded, \n you think maybe its the ocean so you look for someway to get out...");
		JOptionPane.showMessageDialog(null,"Just ahead you see a dim light and run towards it...");
		JOptionPane.showMessageDialog(null,"Its an exit strait up to the ocean, \n you take a deep breath and jump out swimming to the top as fast as you possibly can...");
		JOptionPane.showMessageDialog(null,"You reach the surface gasping for breath, you see the sam extraction boat throw out a booey and puul you...");
		JOptionPane.showMessageDialog(null,"Everyone congratulates you for completing the journey and ask you many question...");
		JOptionPane.showMessageDialog(null,"(Captain Ravnar)\n congratulations youngster, your the first to report back about the unkown lands \n thank you for risking your life for an outrageous adventure!");
	}
}
