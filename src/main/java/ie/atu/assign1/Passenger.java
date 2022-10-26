package ie.atu.assign1;

public class Passenger {

    private String title;
    private String name;
    private String id;
    private String phone;
    private int age;

    public void setTitle(String title){
        switch (title) {
            case "Mr", "Mrs", "Ms" -> this.title = title;
            default -> {
            }
        }

    }

    public void setName(String name){
        if(name.length() > 2){
          this.name = name;
        }

    }

    public void setId(String id){
        if(id.length() > 9) {
            this.id = id;
        }
    }

    public void setPhone(String phone){
        if(phone.length() >6) {
            this.phone = phone;
        }
    }

    public void setAge(int age){
        if(age >= 16) {
            this.age = age;
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
