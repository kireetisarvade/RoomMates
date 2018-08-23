package RevisionPractice;

class ThisKey {
	 
	 int variable = 5;
	 
	 public static void main(String args[]) {
	 ThisKey obj = new ThisKey();
	 
	 obj.method(20);
	 obj.method();
	 }
	 
	 void method(int variable) {
	 variable = 10;
	 System.out.println("Value of Instance variable :" + this.variable);
	 System.out.println("Value of Local variable :" + variable);
	 }
	 
	 void method() {
	 int variable = 40;
	 System.out.println("Value of Instance variable :" + this.variable);
	 System.out.println("Value of Local variable :" + variable);
	 }
	}