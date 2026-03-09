package ducksim;

public class DuckSimulator {

    private static AbstractDuckFactory createCountingDuckFactory() {
        return new CountingDuckFactory();
    }

    private static Quackable createGooseAdapter() {
        return new GooseAdapter(new Goose());
    }

    private static Flock createFlock() {
        return new Flock();
    }

    private static Quackologist createQuackologist() {
        return new Quackologist();
    }

    public static void main(String[] args) {
        AbstractDuckFactory duckFactory = createCountingDuckFactory();
        simulate(duckFactory);
    }

    static void simulate(AbstractDuckFactory duckFactory) {

        Quackable mallardDuck   = duckFactory.createMallardDuck();
        Quackable redheadDuck   = duckFactory.createRedheadDuck();
        Quackable duckCall      = duckFactory.createDuckCall();
        Quackable rubberDuck    = duckFactory.createRubberDuck();
        Quackable gooseDuck     = createGooseAdapter();

        System.out.println("\nDuck Simulator: With Composite - Flocks");

        Flock flockOfDucks = createFlock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = createFlock();
        Quackable mallardOne   = duckFactory.createMallardDuck();
        Quackable mallardTwo   = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour  = duckFactory.createMallardDuck();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        Quackologist quackologist = createQuackologist();
        flockOfDucks.registerObserver(quackologist);

        System.out.println("\n-- Whole Flock Simulation --");
        simulate(flockOfDucks);

        System.out.println("\n-- Mallard Flock Simulation --");
        simulate(flockOfMallards);

        System.out.println("\n-- Individual Duck Simulation --");
        simulate(mallardDuck);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    static void simulate(Quackable duck) {
        duck.quack();
    }
}
