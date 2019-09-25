package movies;

public class Movie {

    private String name;
    private String category;

    public Movie(String movieName, String movieCategory) {
        setName(movieName);
        setCategory(movieCategory);
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

}
