package moviepackage;

import moviepackage.Director;
import moviepackage.Genre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private int id;

    private String title;

    private int year;
    private Double imdb;
    private List<Genre> genres;
    private List<Director> directors;
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getImdb() {
        return imdb;
    }

    public void setImdb(Double imdb) {
        this.imdb = imdb;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    {
        genres = new ArrayList<>();
        directors = new ArrayList<>();
    }

    public Movie() {
    }

    public Movie(int id, String title, int year, Double imdb) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imdb = imdb;
    }


    public List<Director> allDirectors(){
        List<Director> directors = new ArrayList<>();
        try (Connection conn = Jdbc.getConnection()){
            PreparedStatement st = conn.prepareStatement("select Director.D_id, Director.D_name, Movies.M_title\n" +
                    "from Director\n" +
                    "join Movie_Director ON Director.D_id = Movie_Director.D_id\n" +
                    "join Movies On Movies.M_id = Movie_Director.M_id \n" +
                    "WHERE Movies.m_id = ?");
            ResultSet rs = st.executeQuery();
            st.setInt(1, this.id);
            while(rs.next()){
                directors.add(new Director(rs.getInt(1), rs.getString(2)));
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } return directors;
    }

    // getters and setters

    @Override
    public String toString() {
        return "moviepackage.Movie [title=" + title + ", year=" + year + "]";
    }
}