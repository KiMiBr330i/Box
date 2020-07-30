//---------------------------------------------------------------------------------
// Lab3 Exercise 4 Box project
//  Kip Brower CPSC 50100-002
// A program that prints a box of stars of a given size and row value.
//---------------------------------------------------------------------------------
class Box {

	int size = 0;

	public static void main(String[] args) {

		Box box5 = new Box(); // New Box object created
		box5.setSize(5); //invoked setter method to change the size variable
		box5.printBox(); 
	}
	//method to print asterisk character is box form
	public void printBox() {

		char star = '*';

		for (int row = 1; row <= size; row++) { // row print
			for (int column = 1; column <= size; column++) // column print

				System.out.print(star);
			System.out.println();
		}
	}
	//Setter to change the size value for rows and columns
	public void setSize(int size) {
		size = 5;
	}

}
