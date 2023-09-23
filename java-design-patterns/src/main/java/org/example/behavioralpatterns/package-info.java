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
*
* */
package org.example.behavioralpatterns;