package moviepackage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieService {
    public static List<Movie> getAllMovies(){
        List<Movie> movies = new ArrayList<>();
        try (Connection conn = Jdbc.getConnection()) {
            PreparedStatement st = conn.prepareStatement("select * from Movies");
            ResultSet rs = st.executeQuery();
            while ( rs.next()){
                Movie movie = new Movie();
                movie.setId(rs.getInt(1));
                movie.setTitle(rs.getString(2));
                movie.setImdb(rs.getDouble(4));
                movie.setYear(rs.getInt(3));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } return movies;

    }
}
