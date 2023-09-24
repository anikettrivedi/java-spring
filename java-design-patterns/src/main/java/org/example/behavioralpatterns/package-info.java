/*
*   Behavioral: This type of design patterns provide solution for the better interaction between objects,
*   how to provide loose coupling, and flexibility to extend easily in the future.
*
*
*   **** Template Method ****
*   It makes it easier to implement complex algorithms by encapsulating logic in a single method.
*
*
*   **** Mediator ****
*   The intent of the Mediator Pattern is to reduce the complexity and dependencies between tightly coupled objects
*   communicating directly with one another.
*   This is achieved by creating a mediator object that takes care of the interaction between dependent objects.
*   Consequently, all the communication goes through the mediator.
*   This promotes loose coupling, as a set of components working together no longer have to interact directly.
*   Instead, they only refer to the single mediator object.
*   This way, it is also easier to reuse these objects in other parts of the system
*
*   When to use?
*
*   The Mediator Pattern is a good choice if we have to deal with a set of objects that are tightly coupled
*   and hard to maintain. This way we can reduce the dependencies between objects and decrease the overall complexity.
*   Additionally, by using the mediator object, we extract the communication logic to the single component,
*   therefore we follow the Single Responsibility Principle.
*   Furthermore, we can introduce new mediators with no need to change the remaining parts of the system.
*   Hence, we follow the Open-Closed Principle.
*   Sometimes, however, we may have too many tightly coupled objects due to the faulty design of the system.
*   If this is a case, we should not apply the Mediator Pattern. Instead, we should take one step back and rethink
*   the way we’ve modeled our classes.
*   As with all other patterns, we need to consider our specific use case before blindly implementing the Mediator Pattern.
*
*
*   **** Chain of Responsibility ****
*   Wikipedia defines Chain of Responsibility as a design pattern consisting of
*   “a source of command objects and a series of processing objects”.
*   Each processing object in the chain is responsible for a certain type of command, and when the processing is done,
*   it forwards the command to the next processor in the chain.
*   The Chain of Responsibility pattern is handy for:
*       Decoupling a sender and receiver of a command
*       Picking a processing strategy at processing-time
*
*
*   **** Observer ****
*   Observer is a behavioral design pattern.
*   It specifies communication between objects: observable and observers.
*   An observable is an object which notifies observers about the changes in its state.
*   For example, a news agency can notify channels when it receives news.
*   Receiving news is what changes the state of the news agency, and it causes the channels to be notified.
*
*
*   **** Strategy ****
*   Essentially, the strategy pattern allows us to change the behavior of an algorithm at runtime.
*   Typically, we would start with an interface which is used to apply an algorithm,
*   and then implement it multiple times for each possible algorithm.
*
*
*   **** Command ****
*   The command pattern is a behavioral design pattern and is part of the GoF  formal list of design patterns.
*   Simply put, the pattern intends to encapsulate in an object all the data required for performing a given action (command),
*   including what method to call, the method’s arguments, and the object to which the method belongs.
*   This model allows us to decouple objects that produce the commands from their consumers,
*   so that’s why the pattern is commonly known as the producer-consumer pattern.
*
*
*   **** State ****
*   The main idea of State pattern is to allow the object for changing its behavior without changing its class.
*   Also, by implementing it, the code should remain cleaner without many if/else statements.
*   Imagine we have a package which is sent to a post office, the package itself can be ordered,
*   then delivered to a post office and finally received by a client. Now, depending on the actual state,
*   we want to print its delivery status.
*   The simplest approach would be to add some boolean flags and apply simple if/else statements within each of our methods in the class.
*   That won’t complicate it much in a simple scenario.
*   However, it might complicate and pollute our code when we’ll get more states to process which will result in
*   even more if/else statements.
*   Besides, all logic for each of the states would be spread across all methods.
*   Now, this is where the State pattern might be considered to use.
*   Thanks to the State design pattern, we can encapsulate the logic in dedicated classes,
*   apply the Single Responsibility Principle and Open/Closed Principle, have cleaner and more maintainable code.
*
*
*   **** Visitor ****
*   The purpose of a Visitor pattern is to define a new operation without introducing the modifications to an existing object structure.
*   Imagine that we have a composite object which consists of components.
*   The object’s structure is fixed – we either can’t change it, or we don’t plan to add new types of elements to the structure.
*   Now, how could we add new functionality to our code without modification of existing classes?
*   The Visitor design pattern might be an answer. Simply put, we’ll have to do is to add a function which accepts
*   the visitor class to each element of the structure.
*   That way our components will allow the visitor implementation to “visit” them and perform any required action on that element.
*   In other words, we’ll extract the algorithm which will be applied to the object structure from the classes.
*   Consequently, we’ll make good use of the Open/Closed principle as we won’t modify the code,
*   but we’ll still be able to extend the functionality by providing a new Visitor implementation.
*
*
*   **** Interpreter ****
*   The pattern defines the grammar of a particular language in an object-oriented way which can be evaluated by the interpreter itself.
*   Having that in mind, technically we could build our custom regular expression, a custom DSL interpreter, or we could parse any
*   of the human languages, build abstract syntax trees and then run the interpretation.
*   These are only some of the potential use cases, but if we think for a while, we could find even more usages of it,
*   for example in our IDEs, since they’re continually interpreting the code we’re writing and thus supplying us with priceless hints.
*   The interpreter pattern generally should be used when the grammar is relatively simple.
*   Otherwise, it might become hard to maintain.
*
*
*   **** Iterator ****
*   Used to provide a standard way to traverse through a collection (List/Map/Set/etc)
*
*
*   **** Memento ****
*   The Memento Design Pattern, described by the Gang of Four in their book, is a behavioral design pattern.
*   The Memento Design Pattern offers a solution to implement undoable actions.
*   We can do this by saving the state of an object at a given instant and restoring it if the actions performed since need to be undone.
*   Practically, the object whose state needs to be saved is called an Originator.
*   The Caretaker is the object triggering the save and restore of the state, which is called the Memento.
*   The Memento object should expose as little information as possible to the Caretaker.
*   This is to ensure that we don’t expose the internal state of the Originator to the outside world,
*   as it would break encapsulation principles. However, the Originator should access enough information in order to restore
*   to the original state.
*
* */
package org.example.behavioralpatterns;