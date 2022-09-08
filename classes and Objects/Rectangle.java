class AreaOfRect{
    int length,breath;

    void setArea(int l, int b){
        this.length = l;
        this.breath = b;
    }

    int getArea(){
        return length * breath;
    }
}

public class Rectangle {

    public static void main(String[] args) {
        AreaOfRect rect = new AreaOfRect();
        rect.setArea(5, 2);
        System.out.println("Area of rect is: "+rect.getArea());
    }
}

