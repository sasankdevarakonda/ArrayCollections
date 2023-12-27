public class StudentArray {
    String name;
    int id;

    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StudentArray(String name, int id){
        this.id=id;
        this.name=name;

    }

}
