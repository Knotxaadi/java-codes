class Area{
    double calculate(double r){
        return 3.14*r*r;
    }

    double calculate(double l,double b){
        return l*b;
    }

    double calculate(int h,int b){
        return 0.5*h*b;
    }
}

class methodoverloading{
    public static void main(String[] args) {
        Area a = new Area();

        System.out.println("area of circle:"+a.calculate(5));
        System.out.println("area of Rectangle:"+a.calculate(10,20));
        System.out.println("area of Triangle:"+a.calculate(5,3));
    }
}