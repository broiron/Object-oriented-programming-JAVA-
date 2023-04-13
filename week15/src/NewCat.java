public class NewCat implements Cloneable {
    String name;
    String breed;
    java.time.LocalDateTime birthday;

    public NewCat(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.birthday = LocalDateTime.now();
    }

    @Override
    public Object clone throws CloneNotSupportedException {
        NewCat catClone = (NewCat) super.clone();
        catClone.name = this.name;
        catClone.breed = this.breed;
        catClone.birthday = this.birthday;
        return catClone;
    }

    @Override
    public boolean equals(Object o){
        if (o == null) return false;
        if(!(o instanceof NewCat)) return false;
        NewCat d = (NewCat) o;
        return d.name.equals(name) && d.bread.equals(breed)  && d.birthday.equals.(birthday);
    }
    public int hashCode() {
        return java.util.Objects.hash(name, breed, birthday);
    }
}