//Door.java
//Name: Kristi Hicks, hicksk2
public class Door extends LabProj2{ //extends the class LabProj2
	String name;
	boolean state; //true for open, false for closed
	
	public void open(){
		this.state = true;
	}
	public void close(){
		this.state = false;
	}
	public void output(){
		System.out.print(name);
		System.out.print(" : ");
		
		if(state){
			System.out.println("open");
		}
		else{
			System.out.println("closed");
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
