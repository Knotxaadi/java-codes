

class ExceptionDemo{
    static void checkAge(int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("Age must be 18 plus");
        }else{
            System.out.println("You are eligible for vote");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            checkAge(18);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught:"+e.getMessage());
        }finally{
            System.out.println("Program executed");
        }

        System.out.println("Program Continues...");
    }
}