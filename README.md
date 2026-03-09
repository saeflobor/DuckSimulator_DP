# Duck Simulator — Design Patterns Project

A Java-based duck simulator demonstrating five classic design patterns.

## Design Patterns Used

| Pattern | Class(es) | Purpose |
|---|---|---|
| **Adapter** | `GooseAdapter` | Adapts a `Goose` to the `Quackable` interface |
| **Decorator** | `QuackCounter` | Wraps ducks to count total quacks |
| **Abstract Factory** | `AbstractDuckFactory`, `DuckFactory`, `CountingDuckFactory` | Encapsulates duck creation; counting factory auto-wraps with decorator |
| **Composite** | `Flock` | Treats a collection of ducks the same as an individual duck (uses Iterator) |
| **Observer** | `Observable`, `Quackologist`, `Observer`, `QuackObservable` | Tracks individual duck quacking in real time |

## Project Structure

```
src/ducksim/
├── Quackable.java            # Core interface for all ducks
├── MallardDuck.java          # Concrete duck
├── RedheadDuck.java          # Concrete duck
├── RubberDuck.java           # Concrete duck
├── DuckCall.java             # Concrete duck
├── Goose.java                # Adaptee
├── GooseAdapter.java         # Adapter
├── QuackCounter.java         # Decorator
├── AbstractDuckFactory.java  # Abstract Factory
├── DuckFactory.java          # Concrete Factory
├── CountingDuckFactory.java  # Counting Factory
├── Flock.java                # Composite
├── QuackObservable.java      # Observable interface
├── Observable.java           # Observer helper
├── Observer.java             # Observer interface
├── Quackologist.java         # Concrete Observer
└── DuckSimulator.java        # Main simulator
```

## How to Run

```bash
cd src
javac ducksim/*.java
java ducksim.DuckSimulator
```
