class box{
    double weight;
    double height;
    double length;

    box(double w , double h , double l){
        weight = w;
        height = h;
        length = l;
    }

    double volume(){
        return weight*height*length;
    }

}

class BoxWeight extends box{
    double weight;
    public BoxWeight(double w, double h,double l, double m) {
        super(w, h, l);
        weight = m;
    }
    
}

class singlein{
    public static void main(String[] args) {
        BoxWeight mybox = new BoxWeight(10,5,2,200);

        System.out.println("The volume of box is:"+mybox.volume());
        System.out.println("The Weight of box is:"+mybox.weight);
    }
}