//LabProject2.java
//Name: Kristi Hicks, hicksk2
import java.util.Scanner;

public class LabProj2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Door doors[] = new Door[3]; //Creates a doors array 
		Door door1 = new Door(); 
		Door door2 = new Door();
		Door door3 = new Door();
		
		doors[0] = door1;
		doors[1] = door2;
		doors[2] = door3;

		doors[0].name = "Side Door"; //Declares the name for array 0
		doors[1].name = "Front Door"; //Declares the name for array 1
		doors[2].name = "Back Door"; //Declares the name for array 2
		doors[0].state = true; //Declares the state of array 0
		doors[1].state = false; //Declares the state for array 1
		doors[2].state = false; //Declares the state for array 2
		
		for(int i=0;i< 3; i++){
			doors[i].output();
			if (doors[i].state == true){ 
				doors[i].close();
				} 
			else{
					doors[i].open();
				}
		}
		
		System.out.println();
		
		for(int i=0; i<3; i++){
				doors[i].output(); //Outputs the method .output() in class Door
		}
	}
}
/*
*
* Name: Kristi Hicks
* User Name: hicksk2
* Assignment: Lab Project 2
*
* Description:
*   This program creates an array door with size 3. 3 elements are then declares which are 
*   given names (Side, Front, and Back). The doors are then declared states (Open or Closed).
*   The doors are first printed with their declared state. Then they go through a for loop
*   that switchs the current states of all 3 doors and then prints 
*   the new doors with their new states.
*   
* Bug Report:
*   None.
*/

