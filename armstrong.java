
class armstrong{
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Enter one number as command line");
            return;
        }

        int num = Integer.parseInt(args[0]);
        int temp = num , rem=0 , sum = 0;

        while(num>0){
            rem = num % 10;
            sum += rem*rem*rem;
            num /= 10;
        }

        if(sum == temp){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("Number is not armstrong");
        }

    }
}