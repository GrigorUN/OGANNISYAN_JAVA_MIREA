package Practika13;

public class Shirt {
    String Num;
    String Size;
    String Type;
    public Shirt(String Specifications){
       String[] SpecificationsList = Specifications.split(",");
       Num = SpecificationsList[0];
       Size = SpecificationsList[1];
       Type = SpecificationsList[2];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "Num='" + Num + '\'' +
                ", Size='" + Size + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getNum() {
        return Num;
    }

    public void setNum(String num) {
        Num = num;
    }
}
