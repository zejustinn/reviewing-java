public class Person {
    private int id;
    private final String name;
    private final Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Person(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Person(int id, String name, int gender) {
        this.id = id;
        this.name = name;
        this.gender = this.getGender(gender);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private Gender getGender(int genderId){
        if(genderId == 1)
            return Gender.MALE;

        if(genderId == 2)
            return Gender.FEMININE;

        return Gender.UNDEFINED;
    }

    public int getGender() {
        if(this.gender == Gender.MALE)
            return 1;

        if(this.gender == Gender.FEMININE)
            return 2;

        return 0;
    }
}
