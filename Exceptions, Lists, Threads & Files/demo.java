Bowling Game
      To create a bowling game
      The given code declares a Bowling class with its constructor and addPlayer() method.
      Each player of the game has a name and points, and are stored in the players HashMap.
      The code in main takes 3 players data as input and adds them to the game.
      You need to add a getWinner() method to the class, which calculates and outputs the name of the player with the maximum points.

      Sample Input:
      Dave 42
      Amy 103
      Rob 64

      Sample Output:
      Amy
      
      Code:
import java.util.*; 

public class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner() {
    	String name, winner;
    	int flag, points, max;
    	flag = 0;
    	max = 0;
    	winner = "";
       for (String i : players.keySet()) {
       	name = i;
       	points = players.get(i);
       	if (flag == 0) {
       		winner = name;
       		max = points;
       		flag = 1;
       	}
       	else {
       		if (max < points){
       			max = points;
       			winner = name;
       		}
       	}
       	}
       System.out.println(winner);
       }
}

public class Program {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}
      Input
      John 100
      James 55
      Julie 98

      Your Output: John
      
