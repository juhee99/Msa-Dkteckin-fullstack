package exam1;

public class MorningGreetingImpl implements Greeting{

    public MorningGreetingImpl() {

    }

    @Override
    public void greet() {
        System.out.println("상쾌한 아침입니다.");
    }
}
