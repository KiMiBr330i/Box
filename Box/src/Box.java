
class Box {

	int size = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	
	int size = 0;
	Box box5 = new Box();	
	box5.setSize(5);
	box5.printBox();
	}
	

		public void printBox() {
		
		char star = '*';
		int max = size;
		for (int i = 0 ; i < max ; i++) {
			for (int j=i ; j < max ; j++)
	
				System.out.print(star); }
		}
		
		public void setSize(int size) {
			this.size = 5;
		}
		public int getSize() {
			return size;
		}
		
	}
	
