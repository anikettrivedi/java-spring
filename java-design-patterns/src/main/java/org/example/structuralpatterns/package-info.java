/*
*   Structural: The design patterns in this category deals with the class structure such as Inheritance and Composition.
*
*   **** Adapter ****
*   An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly.
*   The main goal for this pattern is to convert an existing interface into another one the client expects.
*   The structure of this pattern is similar to the Decorator. However, the Decorator is usually implemented with the extension in mind.
*   The Adapter is usually implemented after the initial code is written to connect incompatible interfaces.
*
*
*   **** Composite ****
*   The composite pattern is meant to allow treating individual objects and compositions of objects, or “composites” in the same way.
*   It can be viewed as a tree structure made up of types that inherit a base type,
*   and it can represent a single part or a whole hierarchy of objects.
*
*   We can break the pattern down into:
*       component   –   is the base interface for all the objects in the composition.
*                       It should be either an interface or an abstract class with the common methods to manage the child composites.
*       leaf        –   implements the default behavior of the base component. It does not contain a reference to the other objects.
*       composite   –   has leaf elements. It implements the base component methods and defines the child-related operations.
*       client      –   has access to the composition elements by using the base component object.
*
*
*   **** Proxy ****
*   The Proxy pattern allows us to create an intermediary that acts as an interface to another resource,
*   while also hiding the underlying complexity of the component.
*
*   When to use Proxy?
*
*       When we want a simplified version of a complex or heavy object.
*       In this case, we may represent it with a skeleton object which loads the original object on demand,
*       also called as lazy initialization. This is known as the Virtual Proxy
*
*       When the original object is present in different address space,
*       and we want to represent it locally.
*       We can create a proxy which does all the necessary boilerplate stuff like creating and
*       maintaining the connection, encoding, decoding, etc., while the client accesses it as
*       it was present in their local address space. This is called the Remote Proxy
*
*       When we want to add a layer of security to the original underlying object to provide controlled
*       access based on access rights of the client. This is called Protection Proxy
*
*
*   **** Flyweight ****
*   This pattern is used to reduce the memory footprint.
*   It can also improve performance in applications where object instantiation is expensive.
*   Simply put, the flyweight pattern is based on a factory which recycles created objects by storing them after creation.
*   Each time an object is requested, the factory looks up the object in order to check if it’s already been created.
*   If it has, the existing object is returned – otherwise, a new one is created, stored and then returned.
*
*   The flyweight object’s state is made up of an invariant component shared with other similar objects (intrinsic)
*   and a variant component which can be manipulated by the client code (extrinsic).
*
*   It’s very important that the flyweight objects are immutable:
*   any operation on the state must be performed by the factory.
*
*   Use cases: data compression, data caching
*
*
*   **** Facade ****
*   a facade encapsulates a complex subsystem behind a simple interface.
*   It hides much of the complexity and makes the subsystem easy to use.
*   Also, if we need to use the complex subsystem directly, we still can do that;
*   we aren’t forced to use the facade all the time.
*
*   Besides a much simpler interface, there’s one more benefit of using this design pattern.
*   It decouples a client implementation from the complex subsystem.
*   Thanks to this, we can make changes to the existing subsystem and don’t affect a client.
*
* */
package org.example.structuralpatterns;