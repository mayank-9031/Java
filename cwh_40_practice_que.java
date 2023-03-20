class circle {
    private float radius;
    private float area;
    private float perameter;

    public void setRadius(Float r) {
        radius = r;
    }

    public void setArea(float a) {
        area = 3.142f * radius * radius;
        if (a == area) {
            area = a;
        } else {
            System.out.println("Wrong Area");
        }
    }

    public void setParameter(Float p) {
        perameter = 2 * 3.142f * radius;
        if (p == perameter) {
            perameter = p;
        } else {
            System.out.println("Wrong perameter");
        }
    }
}

public class cwh_40_practice_que {
    public static void main(String[] args) {
        circle gola = new circle();
        gola.setRadius(10.0f);
        // System.out.println(gola.getRadius());
        gola.setArea(314.2f);
        // System.out.println(gola.getArea());
        gola.setParameter(314.2f);
        // System.out.println(gola.getParameter());
    }

}
