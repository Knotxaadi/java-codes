abstract  class shape{
    abstract double area();
}

class circle extends shape{
    double area(){
        return 3.14*25;
    }
}

class rectangel extends shape{
    double area(){
        return 24;
    }
}

class triangle extends shape{
    double area(){
        return  10.5;
    }
}

public class abstractm{
    public static void main(String[] args) {
        shape s = new circle();
        System.out.println("area of circle:"+s.area());

        shape r = new rectangel();
        System.out.println("area of circle:"+r.area());

        shape t = new triangle();
        System.out.println("area of circle:"+t.area());
    }
}