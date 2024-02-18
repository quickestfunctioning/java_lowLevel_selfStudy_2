package data;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview a = new MovieReview();
        a.title = "인셉션";
        a.review = "인생은 무한 루프";

        MovieReview[] b = new MovieReview[1];

        b[0] = a;


        System.out.println(b[0].title+b[0].review);

    }
}
