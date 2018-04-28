package CollectionTests;

class Book{
    String title;
    String author;
    int year;

    // constructor with arguments
    public Book(String author, String title, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // toString method used for printout the object
    public String toString(){
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
    }

    // getters
    public String  getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    public int hashCode(){
        return year;
    }

    public boolean equals(Object o){
        Book e = (Book) o;
        return (title.equals(e.getTitle())) &&
                (author.equals(e.getAuthor())) &&
                (year == e.getYear());
    }


}