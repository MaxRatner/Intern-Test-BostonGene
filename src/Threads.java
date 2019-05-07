import java.util.Scanner;
import java.util.TreeSet;

public class Threads {

    static class Thread1 extends Thread {

        private TreeSet<Integer> sorted_set_of_numbers_;
        private Bool_ is_finished_;
        private Integer number_to_store_;
        private Integer previous_digit_;

        public Thread1(TreeSet<Integer> sorted_set_of_numbers_, Bool_ is_finished_) {
            this.sorted_set_of_numbers_ = sorted_set_of_numbers_;
            this.is_finished_ = is_finished_;
            this.number_to_store_ = 0;
        }

        private Integer Get_number_from_string_(String number_str_) {
            for (String temporary_ : number_str_.split(" ")) {

                if (temporary_.equals("-1")) {
                    is_finished_.change_value_(true);
                    break;
                }


                if (temporary_.equals("one")) {
                    number_to_store_ += 1;
                    previous_digit_ = 1;
                    continue;
                }
                if (temporary_.equals("two")) {
                    number_to_store_ += 2;
                    previous_digit_ = 2;
                    continue;
                }
                if (temporary_.equals("three")) {
                    number_to_store_ += 3;
                    previous_digit_ = 3;
                    continue;
                }
                if (temporary_.equals("four")) {
                    number_to_store_ += 4;
                    previous_digit_ = 4;
                    continue;
                }
                if (temporary_.equals("five")) {
                    number_to_store_ += 5;
                    previous_digit_ = 5;
                    continue;
                }
                if (temporary_.equals("six")) {
                    number_to_store_ += 6;
                    previous_digit_ = 6;
                    continue;
                }
                if (temporary_.equals("seven")) {
                    number_to_store_ += 7;
                    previous_digit_ = 7;
                    continue;
                }
                if (temporary_.equals("eight")) {
                    number_to_store_ += 8;
                    previous_digit_ = 8;
                    continue;
                }
                if (temporary_.equals("nine")) {
                    number_to_store_ += 9;
                    previous_digit_ = 9;
                    continue;
                }

                if (temporary_.equals("ten")) {
                    number_to_store_ += 10;
                    continue;
                }
                if (temporary_.equals("eleven")) {
                    number_to_store_ += 11;
                    continue;
                }
                if (temporary_.equals("twelve")) {
                    number_to_store_ += 12;
                    continue;
                }
                if (temporary_.equals("thirteen")) {
                    number_to_store_ += 13;
                    continue;
                }
                if (temporary_.equals("fourteen")) {
                    number_to_store_ += 14;
                    continue;
                }
                if (temporary_.equals("fifteen")) {
                    number_to_store_ += 15;
                    continue;
                }
                if (temporary_.equals("sixteen")) {
                    number_to_store_ += 16;
                    continue;
                }
                if (temporary_.equals("seventeen")) {
                    number_to_store_ += 17;
                    continue;
                }
                if (temporary_.equals("eighteen")) {
                    number_to_store_ += 18;
                    continue;
                }
                if (temporary_.equals("nineteen")) {
                    number_to_store_ += 19;
                    continue;
                }

                if (temporary_.equals("twenty")) {
                    number_to_store_ += 20;
                    continue;
                }
                if (temporary_.equals("thirty")) {
                    number_to_store_ += 30;
                    continue;
                }
                if (temporary_.equals("forty")) {
                    number_to_store_ += 40;
                    continue;
                }
                if (temporary_.equals("fifty")) {
                    number_to_store_ += 50;
                    continue;
                }
                if (temporary_.equals("sixty")) {
                    number_to_store_ += 60;
                    continue;
                }
                if (temporary_.equals("seventy")) {
                    number_to_store_ += 70;
                    continue;
                }
                if (temporary_.equals("eighty")) {
                    number_to_store_ += 80;
                    continue;
                }
                if (temporary_.equals("ninety")) {
                    number_to_store_ += 90;
                    continue;
                }

                if (temporary_.equals("hundred")) {
                    number_to_store_ += previous_digit_ * 100;
                    number_to_store_ -= previous_digit_;
                    continue;
                }
                if (temporary_.equals("thousand")) {
                    number_to_store_ *= 1000;
                }
            }
            return number_to_store_;
        }

        // Reading new numbers
        @Override
        public void run() {

            Scanner user_input_ = new Scanner(System.in);

            while (!is_finished_.return_value_()) {

                String number_str_ = user_input_.nextLine();
                number_to_store_ = Get_number_from_string_(number_str_);

                if (is_finished_.return_value_()) {
                    break;
                }
                if (number_to_store_ == 0) {
                    continue;
                }
                sorted_set_of_numbers_.add(number_to_store_);
                //System.out.println(sorted_set_of_numbers_.first());
                previous_digit_ = 0;
                number_to_store_ = 0;
            }
        }
    }

    static class Thread2 extends Thread {

        private TreeSet<Integer> sorted_set_of_numbers_;
        private Bool_ is_finished_;

        public Thread2(TreeSet<Integer> sorted_set_of_numbers_, Bool_ is_finished_) {
            this.sorted_set_of_numbers_ = sorted_set_of_numbers_;
            this.is_finished_ = is_finished_;
        }

        // Deleting and printing min element
        @Override
        public void run() {
            while (!is_finished_.return_value_()) {
                try {
                    Thread.sleep(5000);
                    //Otherwise ge
                    // t the min number and delete it
                    if (!sorted_set_of_numbers_.isEmpty()) {
                        System.out.println();
                        System.out.println(sorted_set_of_numbers_.pollFirst());
                    }
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        }
    }
}
