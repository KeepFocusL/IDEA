package day240510.practice;

public class Room {
    //Room[]（按面积 area）
    int area;
    public Room(int area){
        this.area=area;
    }

    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                '}';
    }
}
