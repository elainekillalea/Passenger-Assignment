package ie.atu.assign1;

public class Passenger {

    private String title;
    private String name;
    private String id;
    private String phone;
    private int age;

    public void setTitle(String title){
        if (title == "Mr" | title == "Mrs" |title == "Ms") {
            this.title = title;
        }
        else {
            throw new IllegalArgumentException("Title invalid, try again");
        }
    }

    public void setName(String name){
        if(name.length() > 2) {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name invalid, try again");
        }
    }

    public void setId(String id){
        if(id.length() > 9) {
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("Id invalid, try again");
        }
    }

    public void setPhone(String phone){
        if(phone.length() >6) {
            this.phone = phone;
        }
        else{
            throw new IllegalArgumentException("Phone number invalid, try again");
        }

    }

    public void setAge(int age){
        if (age >= 16) {
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("Age invalid, try again");
        }
    }

    public String getTitle(){
        return title;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public String getPhone(){
        return phone;
    }

    public int getAge(){
        return age;
    }

}
