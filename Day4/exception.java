// New exception class
class MyException extends Exception {
    public MyException(String message) { // constructor 
        super(message);
    }
}

class TestMyException {
    // Throws a MyException if the input n is negative
	int Factorial(int n) throws MyException {
		if (n < 0) {
            throw new MyException("Exception from method1 Factorial");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }

	public void computeFactorial() {
		System.out.println("Compute Function is running");
		try {
			System.out.println("Factorial (-5) = " + Factorial(-5));
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	public void DivideByZero(int num) throws MyException { 
        // Throws a MyException if the input num is zero
		int output = 0;
		if (num == 0) {
            throw new MyException("Exception from method2 divideByZero");
        }
		else {
			output = 10 / num;
        }
	}

	public void ArrayOutOfRange(int index) throws MyException {
        //Throws a MyException if the input index is out of the range of the array
		int arr[] = {1, 2, 3};
		int new_arr[];
		if (index >= 0 && index < arr.length)
			new_arr = new int[]{arr[index]};
		else
            throw new MyException("Exception from method1 ArrayOutOfRange");
	}

	public static void main(String[] args) {
		TestMyException t = new TestMyException(); // creates an instance of TestMyException 

		try {
            // first
            t.computeFactorial();

            // sec
            int val = 0;
            try {
                t.DivideByZero(val);
            } catch (MyException e) {
                e.printStackTrace();
            }

            // third
            int val2 = 10;
            try {
                t.ArrayOutOfRange(val2);
            } catch (MyException e) {
                e.printStackTrace();
            }
        } finally {
            // Code that will be executed regardless of whether an exception is thrown or not
            System.out.println("Finally block executed");
        }
	}
}
