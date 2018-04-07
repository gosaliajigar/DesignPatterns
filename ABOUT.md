## Abstract Factory ##
----------------------
 - It isolates concrete classes. 
 - The Abstract Factory pattern helps you control the classes of objects that an application creates.
 - Because a factory encapsulates the responsibility and the process of creating product objects, it isolates clients from implementation classes.
 - Clients manipulate instances through their abstract interfaces. Product class names are isolated in the implementation of the concrete factory; they do not appear in client code.
 - It makes exchanging product families easy. The class of a concrete factory appears only once in an application - that is, where it's instantiated. This makes it easy to change the concrete factory an application uses. It can use different product configurations simply by changing the concrete factory. Because an abstract factory creates a complete family of products, the whole product family changes at once.
 - It promotes consistency among products. When product objects in a family are designed to work together, it's important that an application use objects from only one family at a time. AbstractFactory makes this easy to enforce.
 - Supporting new kinds of products is difficult. Extending abstract factories to produce new kinds of Products isn't easy. That's because the AbstractFactory interface fixes the set of products that can be created. Supporting new kinds of products requires extending the factory interface, which involves changing the AbstractFactory class and all of its subclasses.
 - As with factories in general, the Abstract Factory's responsibility is limited to the creation of instances, and thus the testable issue is whether or not the right set of instances is created under a given circumstance. Often, this is covered by the test of the entities that use the factory, but if it is not, the test can use type-checking to determine that the proper concrete types are created under the right set of circumstances.
 - When we use the Abstract Factory we gain protection from illegitimate combinations of service objects. This means we can design the rest of the system for maximum flexibility, since we know that the Abstract Factory will eliminate any concerns of the flexibility yielding bugs. Also, the consuming entity (Client) or entities will be incrementally simpler, since they can deal with the components at the abstract level.
 - The Abstract Factory holds up well if the maintenance aspects are limited to new sets, or a given set changing an implementation. On the other hand, if an entirely new abstract concept enters the domain, then the maintenance issues will be more profound as the Abstract Factory interface, all the existing factory implementations, and the Client entities will all have to be changed.
 - This is not a "fault" of the pattern, but rather points out the degree to which object-oriented systems are vulnerable to missing/new abstractions.

Real Life Example : 

## Adapter ##
-------------
 - Adapters vary in the amount of work they do to adapt Adaptee to the Target interface. There is a spectrum of possible work, from simple interface conversion - for example, changing the names of operations - to supporting an entirely different set of operations. The amount of work Adapter does depends on how similar the Target interface is to Adaptee's.
 - Pluggable adapters : 
 	 - A class is more reusable when you minimize the assumptions other classes must make to use it. By building interface adaptation into a class, you eliminate the assumption that other classes see the same interface. Put another way, interface adaptation lets us incorporate our class into existing systems that might expect different interfaces to the class.
	 - Using two-way adapters to provide transparency. A potential problem with adapters is that they aren't transparent to all clients. An adapted object no longer conforms to the Adaptee interface, so it can't be used as is wherever an Adaptee object can. Two-way adapters can provide such transparency. Specifically, they're useful when two different clients need to view an object differently.
	 - To test the Adapter, you can use a Mock or Fake object in place of the foreign object (which would normally be adapted). The Mock or Fake can return predictable behavior for the adapter to convert.
	 - The Adapter is a very low-cost solution, and is therefore quite commonplace. The cost is the creation of an additional class, but the benefits is Encapsulated reuse of existing behavior.
	 - Polymorphism (through an up-cast) with a foreign class.
	 - Promotes the Open-Closed Principle.
	 - If the construction of the foreign class was not encapsulated (which is common), the Adapter can encapsulate it in its constructor. However, an object factory is preferred.
	 - Class and Object Adapters have different trade-offs.
 - A Class Adapter: 
	 - adapts Adaptee to Target by committing to a concrete Adapter class. As a consequence, a Class Adapter won't work when we want to adapt a class and all its subclasses. lets Adapter override some of Adaptee's behavior, since Adapter is a subclass of Adaptee.
	 - Introduces only one object, and no additional pointer indirection is needed to get to the adaptee.
 - An Object Adapter : 
	 - lets a single Adapter work with many Adaptees - that is, the Adaptee itself and all of its subclasses (if any). The Adapter can also add functionality to all Adaptees at once.
	 - makes it harder to override Adaptee behavior. It will require subclassing Adaptee and making Adapter refer to the subclass rather than the Adaptee itself.

Real Life Example : 

## Bridge ##
------------
 - Decoupling interface and implementation. An implementation is not bound permanently to an interface. The implementation of an abstraction can be configured at run-time. It's even possible for an object to change its implementation at run-time.
 - Decoupling Abstraction and Implementor also eliminates compile-time dependencies on the implementation. Changing an implementation class doesn't require recompiling the Abstraction class and its clients. This property is essential when you must ensure binary compatibility between different versions of a class library.
 - Improved extensibility. You can extend the Abstraction and Implementor hierarchies independently.
 - Hiding implementation details from clients. You can shield clients from implementation details, like the sharing of implementor objects and the accompanying reference count mechanism (if any).
 - The Behavior Classes will probably be testable on their own (unless they are Adapters and/or Fa√ßades, in which case see the testing forces accompanying those patterns). However the entity classes are dependant upon behaviors, and so a Mock or Fake object can be used to control the returns from these dependencies, and also to check on the action taken upon the behavior by the entity, if this is deemed an appropriate thing to test.
 - The Bridge creates flexibility because the entities and behaviors can each vary without necessarily affecting the other.
 - Both the Entities and Behaviors are open-closed, if we build the bridge in an object factory, which is recommended.
 - If the Entities are highly orthoganal from one another, the Behavior interface will tend to be broad.
 - The interface of the Behavior can require changes over time, which can cause maintenance problems. Specifically, if new Entities that may be added to the system in the future are unlikely to be satisfied with the current Behavior interface, then this interface may bloat, requiring potentially extensive maintenance.
 - The delegation from the Entities to the Behaviors can degrade performance.

## Builder ##
-------------
 - It lets you vary a product's internal representation.
 - The Builder object provides the director with an abstract interface for constructing the product.
 - The interface lets the builder hide the representation and internal structure of the product.
 - It also hides how the product gets assembled. Because the product is constructed through an abstract interface, all you have to do to change the product's internal representation is define a new kind of builder.
 - It isolates code for construction and representation.
 - The Builder pattern improves modularity by encapsulating the way a complex object is constructed and represented.
 - Clients needn't know anything about the classes that define the product's internal structure; such classes don't appear in Builder's interface.
 - It gives you finer control over the construction process.
 - Unlike creational patterns that construct products in one shot, the Builder pattern constructs the product step by step under the director's control.
 - Only when the product is finished does the director retrieve it from the builder.
 - Hence the Builder interface reflects the process of constructing the product more than other creational patterns.
 - This gives you finer control over the construction process and consequently the internal structure of the resulting product.

Real Life Example : StringBuilder, StringBuffer etc.

## Chain of Responsibility ##
-----------------------------
 - Reduced coupling.
 - The pattern frees an object from knowing which other object handles a request. 
 - An object only has to know that a request will be handled "appropriately." 
 - Both the receiver and the sender have NO explicit knowledge of each other, and an object in the chain doesn't have to know about the chain's structure.
 - As a result, Chain of Responsibility can simplify object interconnections. 
 - Instead of objects maintaining references to all candidate receivers, they keep a single reference to their successor.
 - Added flexibility in assigning responsibilities to objects.
 - Chain of Responsibility gives you added flexibility in distributing responsibilities among objects. 
 - You can add or change responsibilities for handling a request by adding to or otherwise changing the chain at run-time. 
 - You can combine this with sub-classing to specialize handlers statically.
 - Receipt isn't guaranteed. Since a request has no explicit receiver, there's no guarantee it'll be handled, the request can fall off the end of the chain without ever being handled. 
 - A request can also go unhandled when the chain is not configured properly.
 - The chain may get lengthy, and may introduce performance problems.

Real Life Examples : Coin Sorting Machine, ATM Money Dispenser, Servlet Filter, Javaís Exception Handling Mechanism, etc.

## Command ##
-------------
 - The Command pattern has the following consequences:
 - Command decouples the object that invokes the operation from the one that knows how to perform it.
 - Commands are first-class objects. They can be manipulated and extended like any other object.
 - You can assemble commands into a composite command. In general, composite commands are an instance of the Composite pattern.
 - It's easy to add new Commands, because you don't have to change existing classes.

## Composite ##
---------------
 - defines class hierarchies consisting of primitive objects and composite objects.
 - Primitive objects can be composed into more complex objects, which in turn can be composed, and so on recursively.
 - Wherever client code expects a primitive object, it can also take a composite object.
 - makes the client simple. Clients can treat composite structures and individual objects uniformly.
 - Clients normally don't know (and shouldn't care) whether they're dealing with a leaf or a composite component.
 - This simplifies client code, because it avoids having to write tag-and-case-statement style functions over the classes that define the composition.
 - makes it easier to add new kinds of components. Newly defined Composite or Leaf subclasses work automatically with existing structures and client code.
 - Clients don't have to be changed for new Component classes.
 - can make your design overly general. The disadvantage of making it easy to add new components is that it makes it harder to restrict the components of a composite.
 - Sometimes you want a composite to have only certain components. With Composite, you can't rely on the type system to enforce those constraints for you.
 - You'll have to use run-time checks instead.

Real Life Example : 

## Decorator ##
---------------
 - More flexibility than static inheritance.
 - The Decorator pattern provides a more flexible way to add responsibilities to objects than can be had with static (multiple) inheritance.
 - With decorators, responsibilities can be added and removed at run-time simply by attaching and detaching them.
 - In contrast, inheritance requires creating a new class for each additional responsibility.
 - This gives rise to many classes and increases the complexity of a system.
 - Furthermore, providing different Decorator classes for a specific Target Abstraction class lets you mix and match responsibilities.
 - Decorators also make it easy to add a property twice.
 - Avoids feature-laden classes high up in the hierarchy. Decorator offers a pay-as-you-go approach to adding responsibilities.
 - Instead of trying to support all foreseeable features in a complex, customizable class, you can define a simple class and add functionality incrementally with Decorator objects.
 - Functionality can be composed from simple pieces. As a result, an application needn't pay for features it doesn't use.
 - It's also easy to define new kinds of Decorators independently from the classes of objects they extend, even for unforeseen extensions.
 - Extending a complex class tends to expose details unrelated to the responsibilities you're adding.
 - A decorator and its component aren't identical.
 - A decorator acts as a transparent enclosure. But from an object identity point of view, a decorated component is not identical to the component itself.
 - Hence you shouldn't rely on object identity when you use decorators.
 - Lots of little objects. A design that uses Decorator often results in systems composed of lots of little objects that all look alike.
 - The objects differ only in the way they are interconnected, not in their class or in the value of their variables.
 - Although these systems are easy to customize by those who understand them, they can be hard to learn and debug.

Real Life Example : 

## Facade ##
------------
 - It shields clients from subsystem components, thereby reducing the number of objects that clients deal with and making the subsystem easier to use.
 - It promotes weak coupling between the subsystem and its clients.
 - Often the components in a subsystem are strongly coupled.
 - Weak coupling lets you vary the components of the subsystem without affecting its clients.
 - Facades help layer a system and the dependencies between objects.
 - They can eliminate complex or circular dependencies.
 - This can be an important consequence when the client and the subsystem are implemented independently.
 - Reducing compilation dependencies is vital in large software systems.
 - You want to save time by minimizing re-compilation when subsystem classes change.
 - Reducing compilation dependencies with facades can limit the re-compilation needed for a small change in an important subsystem.
 - A facade can also simplify porting systems to other platforms, because it's less likely that building one subsystem requires building all others.
 - It doesn't prevent applications from using subsystem classes if they need to.
 - Thus you can choose between ease of use and generality.

Real Life Example : Starting Car, Heating in Microwave Oven etc.

## Factory Method ##
--------------------
 - Factory methods eliminate the need to bind application-specific classes into your code.
 - The code only deals with the Product interface; therefore it can work with any user-defined ConcreteProduct classes.
 - A potential disadvantage of factory methods is that clients might have to subclass the Creator class just to create a particular ConcreteProduct object.
 - Sub-classing is fine when the client has to subclass the Creator class anyway, but otherwise the client now must deal with another point of evolution.
 - Provides hooks for subclasses. Creating objects inside a class with a factory method is always more flexible than creating an object directly.
 - Factory Method gives subclasses a hook for providing an extended version of an object.
 - Connects parallel class hierarchies. In the examples we've considered so far, the factory method is only called by Creators. But this doesn't have to be the case; clients can find factory methods useful, especially in the case of parallel class hierarchies.

Real Life Example : 

## Flyweight ##
---------------
 - Flyweights may introduce run-time costs associated with transferring, finding, and/or computing extrinsic state, especially if it was formerly stored as intrinsic state. However, such costs are offset by space savings, which increase as more flyweights are shared.
 - Storage savings are a function of several factors:
 - the reduction in the total number of instances that comes from sharing.
 - the amount of intrinsic state per object.
 - whether extrinsic state is computed or stored.
 - The more flyweights are shared, the greater the storage savings. The savings increase with the amount of shared state. The greatest savings occur when the objects use substantial quantities of both intrinsic and extrinsic state, and the extrinsic state can be computed rather than stored. Then you save on storage in two ways: Sharing reduces the cost of intrinsic state, and you trade extrinsic state for computation time.
 - The Flyweight pattern is often combined with the Composite pattern to represent a hierarchical structure as a graph with shared leaf nodes. A consequence of sharing is that flyweight leaf nodes cannot store a pointer to their parent. Rather, the parent pointer is passed to the flyweight as part of its extrinsic state. This has a major impact on how the objects in the hierarchy communicate with each other.

## Interpreter ##
-----------------
 - The Interpreter pattern has the following benefits and liabilities:
 - It's easy to change and extend the grammar. Because the pattern uses classes to represent grammar rules, you can use inheritance to change or extend the grammar. Existing expressions can be modified incrementally, and new expressions can be defined as variations on old ones.
 - Implementing the grammar is easy, too. Classes defining nodes in the abstract syntax tree have similar implementations. These classes are easy to write, and often their generation can be automated with a compiler or parser generator.
 - Complex grammars are hard to maintain. The Interpreter pattern defines at least one class for every rule in the grammar (grammar rules defined using BNF may require multiple classes). Hence grammars containing many rules can be hard to manage and maintain. Other design patterns can be applied to mitigate the problem. But when the grammar is very complex, other techniques such as parser or compiler generators are more appropriate.
 - Adding new ways to interpret expressions. The Interpreter pattern makes it easier to evaluate an expression in a new way. For example, you can support pretty printing or type-checking an expression by defining a new operation on the expression classes. If you keep creating new ways of interpreting an expression, then consider using the Visitor pattern to avoid changing the grammar classes.

## Iterator ##
--------------
 - The Iterator pattern has three important consequences:
 - It supports variations in the traversal of an aggregate. Complex aggregates may be traversed in many ways. For example, code generation and semantic checking involve traversing parse trees. Code generation may traverse the parse tree inorder or preorder. Iterators make it easy to change the traversal algorithm: Just replace the iterator instance with a different one. You can also define Iterator subclasses to support new traversals.
 - Iterators simplify the Aggregate interface. Iterator's traversal interface obviates the need for a similar interface in Aggregate, thereby simplifying the aggregate's interface.
 - More than one traversal can be pending on an aggregate. An iterator keeps track of its own traversal state. Therefore you can have more than one traversal in progress at once.

## Mediator ##
--------------
 - It limits subclassing. A mediator localizes behavior that otherwise would be distributed among several objects. Changing this behavior requires subclassing Mediator only; Colleague classes can be reused as is.
 - It decouples colleagues. A mediator promotes loose coupling between colleagues. You can vary and reuse Colleague and Mediator classes independently.
 - It simplifies object protocols. A mediator replaces many-to-many interactions with one-to-many interactions between the mediator and its colleagues. One-to-many relationships are easier to understand, maintain, and extend.
 - It abstracts how objects cooperate. Making mediation an independent concept and encapsulating it in an object lets you focus on how objects interact apart from their individual behavior. That can help clarify how objects interact in a system.
 - It centralizes control. The Mediator pattern trades complexity of interaction for complexity in the mediator. Because a mediator encapsulates protocols, it can become more complex than any individual colleague. This can make the mediator itself a monolith that's hard to maintain.

## Memento ##
-------------
 - Preserving encapsulation boundaries. Memento avoids exposing information that only an originator should manage but that must be stored nevertheless outside the originator. The pattern shields other objects from potentially complex Originator internals, thereby preserving encapsulation boundaries.
 - It simplifies Originator. In other encapsulation-preserving designs, Originator keeps the versions of internal state that clients have requested. That puts all the storage management burden on Originator. Having clients manage the state they ask for simplifies Originator and keeps clients from having to notify originators when they're done.
 - Using mementos might be expensive. Mementos might incur considerable overhead if Originator must copy large amounts of information to store in the memento or if clients create and return mementos to the originator often enough. Unless encapsulating and restoring Originator state is cheap, the pattern might not be appropriate.
 - Defining narrow and wide interfaces. It may be difficult in some languages to ensure that only the originator can access the memento's state.
 - Hidden costs in caring for mementos. A caretaker is responsible for deleting the mementos it cares for. However, the caretaker has no idea how much state is in the memento. Hence an otherwise lightweight caretaker might incur large storage costs when it stores mementos.

## Observer ##
--------------
 - The Observer Design Pattern lets you vary subjects and observers independently. You can reuse subjects without reusing their observers, and vice versa. It lets you add observers without modifying the subject or other observers.
 - Abstract coupling between Subject and Observer.
 - All a subject knows is that it has a list of observers, each conforming to the simple interface of the abstract Observer class
 - The subject doesn't know the concrete class of any observer. Thus the coupling between subjects and observers is abstract and minimal.
 - Because Subject and Observer aren't tightly coupled, they can belong to different layers of abstraction in a system.
 - A lower-level subject can communicate and inform a higher-level observer, thereby keeping the system's layering intact.
 - If Subject and Observer are lumped together, then the resulting object must either span two layers (and violate the layering), or it must be forced to live in one layer or the other (which might compromise the layering abstraction).
 - Support for broadcast communication. Unlike an ordinary request, the notification that a subject sends needn't specify its receiver.
 - The notification is broadcast automatically to all interested objects that subscribed to it.
 - The subject doesn't care how many interested objects exist; its only responsibility is to notify its observers.
 - This gives you the freedom to add and remove observers at any time. It's up to the observer to handle or ignore a notification.
 - Unexpected updates. Because observers have no knowledge of each other's presence, they can be blind to the ultimate cost of changing the subject. A seemingly innocuous operation on the subject may cause a cascade of updates to observers and their dependent objects. Moreover, dependency criteria that aren't well-defined or maintained usually lead to spurious updates, which can be hard to track down.
 - This problem is aggravated by the fact that the simple update protocol provides no details on what changed in the subject. Without additional protocol to help observers discover what changed, they may be forced to work hard to deduce the changes.

Real Life Example : Blogger's update for users, JIRA ticket watchers, GitHub Issues etc. 

## Prototype ##
---------------
 - Prototype has many of the same consequences that Abstract Factory and Builder have: It hides the concrete product classes from the client, thereby reducing the number of names clients know about. Moreover, these patterns let a client work with application-specific classes without modification.
 - Additional benefits of the Prototype Design Pattern are listed below:
 - Adding and removing products at run-time. Prototypes let you incorporate a new concrete product class into a system simply by registering a prototypical instance with the client. That's a bit more flexible than other creational patterns, because a client can install and remove prototypes at run-time.
 - Specifying new objects by varying values. Highly dynamic systems let you define new behavior through object composition - by specifying values for an object's variables, for example - and not by defining new classes. You effectively define new kinds of objects by instantiating existing classes and registering the instances as prototypes of client objects. A client can exhibit new behavior by delegating responsibility to the prototype.
 - This kind of design lets users define new "classes" without programming. In fact, cloning a prototype is similar to instantiating a class. The Prototype pattern can greatly reduce the number of classes a system needs.
 - Specifying new objects by varying structure. Many applications build objects from parts and subparts. Editors for circuit design, for example, build circuits out of subcircuits. For convenience, such applications often let you instantiate complex, user-defined structures, say, to use a specific subcircuit again and again.
 - The Prototype pattern supports this as well. We simply add this subcircuit as a prototype to the palette of available circuit elements. As long as the composite circuit object implements clone() as a deep copy, circuits with different structures can be prototypes.
 - Reduced subclassing. Factory Method often produces a hierarchy of Creator classes that parallels the product class hierarchy. The Prototype pattern lets you clone a prototype instead of asking a factory method to make a new object. Hence you don't need a Creator class hierarchy at all. This benefit applies primarily to languages like C++ that don't treat classes as first-class objects. Languages that do, like Smalltalk and Objective C, derive less benefit, since you can always use a class object as a creator. Class objects already act like prototypes in these languages.
 - Configuring an application with classes dynamically. Some run-time environments let you load classes into an application dynamically. The Prototype pattern is the key to exploiting such facilities in a language like C++.
 - An application that wants to create instances of a dynamically loaded class won't be able to reference its constructor statically. Instead, the run-time environment creates an instance of each class automatically when it's loaded, and it registers the instance with a prototype manager. Then the application can ask the prototype manager for instances of newly loaded classes, classes that weren't linked with the program originally.
 - The main liability of the Prototype pattern is that each subclass of Prototype must implement the clone() operation, which may be difficult. For example, adding clone() is difficult when the classes under consideration already exist. Implementing clone() can be difficult when their internals include objects that don't support copying or have circular references.
 - Factory Method : creation through inheritance.
 - Prototype      : creation through delegation.

## Proxy ##
-----------
 - The Proxy pattern introduces a level of indirection when accessing an object. The additional indirection has many uses, depending on the kind of proxy:
 - A remote proxy can hide the fact that an object resides in a different address space.
 - A virtual proxy can perform optimizations such as creating an object on demand.
 - Both protection proxies and smart references allow additional housekeeping tasks when an object is accessed.
 - There's another optimization that the Proxy pattern can hide from the client. It's called copy-on-write, and it's related to creation on demand. Copying a large and complicated object can be an expensive operation. If the copy is never modified, then there's no need to incur this cost. By using a proxy to postpone the copying process, we ensure that we pay the price of copying the object only if it's modified.
 - To make copy-on-write work, the subject must be reference counted. Copying the proxy will do nothing more than increment this reference count. Only when the client requests an operation that modifies the subject does the proxy actually copy it. In that case the proxy must also decrement the subject's reference count. When the reference count goes to zero, the subject gets deleted.
 - Copy-on-write can reduce the cost of copying heavy weight subjects significantly.
 - Proxies promote strong cohesion.
 - Proxies simplify the client object and the object being proxied (by hiding complex issues like remoting and caching, etc.)
 - If the instantiation of all classes is encapsulated by policy, inserting a proxy at a later time is significantly easier.
 - Proxies often evolve into Decorators when multiple additional behaviors are needed. Knowing this, one does not have to introduce the Decorator until it is needed, avoiding overdesign and analysis paralysis.

Real Life Example : 

## Singleton ##
---------------
 - Controlled access to sole instance. Because the Singleton class encapsulates its sole instance, it can have strict control over how and when clients access it.
 - Reduced name space. The Singleton pattern is an improvement over global variables. It avoids polluting the name space with global variables that store sole instances.
 - Permits refinement of operations and representation. The Singleton class may be subclassed, and it's easy to configure an application with an instance of this extended class. You can configure the application with an instance of the class you need at run-time.
 - Permits a variable number of instances. The pattern makes it easy to change your mind and allow more than one instance of the Singleton class. Moreover, you can use the same approach to control the number of instances that the application uses. Only the operation that grants access to the Singleton instance needs to change.
 - More flexible than class operations. Another way to package a singleton's functionality is to use class operations (that is, static member functions in C++ or class methods in Smalltalk). But both of these language techniques make it hard to change a design to allow more than one instance of a class. Moreover, static member functions in C++ are never virtual, so subclasses can't override them polymorphically.

Real Life Example : Every Java application has a single instance of class Runtime that allows the application to interface with the environment in which the application is running. The current runtime can be obtained from the getRuntime method. etc. 

## State ##
-----------
 - It localizes state-specific behavior and partitions behavior for different states. The State pattern puts all behavior associated with a particular state into one object. Because all state-specific code lives in a State subclass, new states and transitions can be added easily by defining new subclasses.
 - It makes state transitions explicit. When an object defines its current state solely in terms of internal data values, its state transitions have no explicit representation; they only show up as assignments to some variables. Introducing separate objects for different states makes the transitions more explicit. Also, State objects can protect the Context from inconsistent internal states, because state transitions are atomic from the Context's perspective - they happen by rebinding one variable (the Context's State object variable), not several.
 - State objects can be shared. If State objects have no instance variables - that is, the state they represent is encoded entirely in their type - then contexts can share a State object. When states are shared in this way, they are essentially flyweights with no intrinsic state, only behavior.

## Strategy ##
--------------
 - Families of related algorithms. Hierarchies of Strategy classes define a family of algorithms or behaviors for contexts to reuse. Inheritance can help factor out common functionality of the algorithms.
 - An alternative to subclassing. Inheritance offers another way to support a variety of algorithms or behaviors. You can subclass a Context class directly to give it different behaviors. But this hardwires the behavior into Context. It mixes the algorithm implementation with Context's, making Context harder to understand, maintain, and extend. And you can't vary the algorithm dynamically. You wind up with many related classes whose only difference is the algorithm or behavior they employ. Encapsulating the algorithm in separate Strategy classes lets you vary the algorithm independently of its context, making it easier to switch, understand, and extend.
 - Strategies eliminate conditional statements. The Strategy pattern offers an alternative to conditional statements for selecting desired behavior. When different behaviors are lumped into one class, it's hard to avoid using conditional statements to select the right behavior. Encapsulating the behavior in separate Strategy classes eliminates these conditional statements.
 - A choice of implementations. Strategies can provide different implementations of the same behavior. The client can choose among strategies with different time and space trade-offs.
 - Clients must be aware of different Strategies. The pattern has a potential drawback in that a client must understand how Strategies differ before it can select the appropriate one. Clients might be exposed to implementation issues. Therefore you should use the Strategy pattern only when the variation in behavior is relevant to clients.
 - Communication overhead between Strategy and Context. The Strategy interface is shared by all ConcreteStrategy classes whether the algorithms they implement are trivial or complex. Hence it's likely that some ConcreteStrategies won't use all the information passed to them through this interface; simple ConcreteStrategies may use none of it! That means there will be times when the context creates and initializes parameters that never get used. If this is an issue, then you'll need tighter coupling between Strategy and Context.
 - Increased number of objects. Strategies increase the number of objects in an application. Sometimes you can reduce this overhead by implementing strategies as stateless objects that contexts can share. Any residual state is maintained by the context, which passes it in each request to the Strategy object. Shared strategies should not maintain state across invocations. The Flyweight pattern describes this approach in more detail.

## Template Method ##
---------------------
 - Template methods are a fundamental technique for code reuse. They are particularly important in class libraries, because they are the means for factoring out common behavior in library classes.
 - Template methods lead to an inverted control structure that's sometimes referred to as "the Hollywood principle," that is, "Don't call us, we'll call you". This refers to how a parent class calls the operations of a subclass and not the other way around.
 - It's important for template methods to specify which operations are hooks (may be overridden) and which are abstract operations (must be overridden). To reuse an abstract class effectively, subclass writers must understand which operations are designed for overriding.

## Visitor ##
-------------
 - Visitor makes adding new operations easy.
 - Visitors make it easy to add operations that depend on the components of complex objects.
 - You can define a new operation over an object structure simply by adding a new visitor.
 - In contrast, if you spread functionality over many classes, then you must change each class to define a new operation.
 - A visitor gathers related operations and separates unrelated ones.
 - Related behavior isn't spread over the classes defining the object structure; it's localized in a visitor. Unrelated sets of behavior are partitioned in their own visitor subclasses. That simplifies both the classes defining the elements and the algorithms defined in the visitors.
 - Any algorithm-specific data structures can be hidden in the visitor.
 - Adding new ConcreteElement classes is hard. The Visitor pattern makes it hard to add new subclasses of Element. Each new ConcreteElement gives rise to a new abstract operation on Visitor and a corresponding implementation in every ConcreteVisitor class. Sometimes a default implementation can be provided in Visitor that can be inherited by most of the ConcreteVisitors, but this is the exception rather than the rule.
 - So the key consideration in applying the Visitor pattern is whether you are mostly likely to change the algorithm applied over an object structure or the classes of objects that make up the structure. The Visitor class hierarchy can be difficult to maintain when new ConcreteElement classes are added frequently. In such cases, it's probably easier just to define operations on the classes that make up the structure. If the Element class hierarchy is stable, but you are continually adding operations or changing algorithms, then the Visitor pattern will help you manage the changes.
 - Visiting across class hierarchies. An iterator can visit the objects in a structure as it traverses them by calling their operations. But an iterator can't work across object structures with different types of elements.
 - Visitor does not have this restriction. It can visit objects that don't have a common parent class. You can add any type of object to a Visitor interface.
 - Accumulating state. Visitors can accumulate state as they visit each element in the object structure. Without a visitor, this state would be passed as extra arguments to the operations that perform the traversal, or they might appear as global variables.
 - Breaking encapsulation. Visitor's approach assumes that the ConcreteElement interface is powerful enough to let visitors do their job. As a result, the pattern often forces you to provide public operations that access an element's internal state, which may compromise its encapsulation.

Real Life Example : 
 
## Differences ##
-----------------
 
### Adapter vs Proxy Design Pattern ###
 - Adapter design pattern provides a different interface from the real object and enables the client to use it to interact with the real object.
 - But, proxy design pattern provides the same interface as in the real object.
 

### Decorator vs Proxy Design Pattern ###
 - Decorator design pattern adds behaviour at runtime to the real object.
 - But, Proxy does not change the behaviour instead it controls the behaviour.

## Source ##
------------
 http://java.boot.by/scea5-guide/ch07s03.html