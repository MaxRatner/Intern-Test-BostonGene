import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Integer> sorted_set_of_numbers_ = new TreeSet<Integer>();
        Bool_ is_finished_ = new Bool_(false);

        Threads.Thread1 first_thread_ = new Threads.Thread1(sorted_set_of_numbers_, is_finished_);
        Threads.Thread2 second_thread_ = new Threads.Thread2(sorted_set_of_numbers_, is_finished_);

        first_thread_.start();
        second_thread_.start();

    }
}
