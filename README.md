## Decorator Pattern

It should be used to add attach responsibilities to any object dynamically.
Decorators provide an alternative to subclassing for extending functionality.

Neither objects nor decorators have no knowledge of the decorating/being decorated. This enables decoupling.

### Key principles:

- Objects should be close to modification but open to extension
- Only apply OCP to those aspects that undergo lots of modification. Applying OCP everywhere can lead to a bad design.

### Understanding the code

- This is a simulation of a Cafe Coffee Day
- When customers request for a beverage, they like to have add-ons like cream, marshmallows, etc.
- The beverage can be `decorated WITH` cream and marshmallows
- After being decorated, the beverage's cost will vary acc to the decorators
- The beverage has no knowledge of being decorated hence no 

### Running the code

```
cd src/main/java
javac DuckSimulator.java
java DuckSimulator

```
