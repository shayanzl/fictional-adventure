import moviepackage.*;

import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.File;

public class Main {

    public static void main(String[] args) {


//        PrintWriter pw = new PrintWriter(System.out, true);
//        pw.println("using printwriter object");
//
//        pw.println("");
//        int i = -7;
//        pw.println(i);
//        double d = 4.5e-7;
//        pw.println(d);


        // Read from a file =========================================
//        try {
//            Scanner input = new Scanner
//                    (new File("/Users/shayanzy/Documents/Ultimate Java Part 1 Fundamentals" +
//                            "/shayan-project/mapsa-bootcamp/src/file.txt")
//            while (input.hasNext()){
//                System.out.println(input.next());
//            }
//        }
//
//        catch (IOException e){
//            System.out.println("File not found");
//
//        }

//        Map<String, Long> getMoviesOfDirector = MovieService.getAllMovies().stream()
//                .map(Movie::allDirectors)
//                .flatMap(List::stream)
//                .collect(Collectors.groupingBy(Director::getName, Collectors.counting()));
//        getMoviesOfDirector.entrySet().forEach(System.out::println);

        Map<String, Long> collect = MovieService.getAllMovies().stream()
                .map(movie->movie.allDirectors())
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Director::getName, Collectors.counting()));

        collect.entrySet().forEach(System.out::println);

    }
}

