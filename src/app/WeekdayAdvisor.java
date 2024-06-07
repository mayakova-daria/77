package app;

public class WeekdayAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Stay focused and be productive at work!");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend! How about visiting a park or a museum?");
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + day);
        }
    }
}