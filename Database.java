import java.util.ArrayList;

public class Database
{
    public ArrayList<Person> users = new ArrayList<>();

    public static void main(String[] args)
    {

    }

    public class Person
    {
        private String name;
        private int age;
        private double averageScore;

        private ArrayList<Integer> scores = new ArrayList<>();

        private ArrayList<String > reviews = new ArrayList<>();

        public Person(String n, int a, double avScore)
        {
            name = n;
            age = a;
            averageScore = avScore;
            scores = new ArrayList<>();
            reviews = new ArrayList<>();
        }

    }
}
