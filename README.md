# Mediatore examples in Java

Just 2 examples for the mediator pattern

##Example of buttons

This example is a simple JPanel with 3 buttons and a text label, pressing a button will change the text label,disable the pressed button and enable the other buttons.

#### How the classes interact?

- Each button(Concrete colleague) is aware of his mediator, they use the Execute() command to interact with the Mediator Interface
- The Mediator(Concrete mediator) implements the IMediator interface, in wich (in this example) there are methods that directly affects some buttons and a text label
- The Mediator is aware of each concrete colleague (Buttons), here they are registered at the moment a button is created

#### How to run this example

###### From terminal

<i>in the folder containing the code run these commands</i>

Just once
```sh
$ javac MediatorDemo.java
```

To run the example
```sh
$ java MediatorDemo
```

#### Where this come from:

 [wikibooks-MediatorPattern](https://en.wikibooks.org/wiki/Computer_Science_Design_Patterns/Mediator)
