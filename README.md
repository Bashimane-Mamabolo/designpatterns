# 🧩 **OOP DESIGN PATTERNS**

---

## 1. **What Are Design Patterns**

Design patterns are **reusable solutions** to common problems that developers face when building software with Object-Oriented Programming (OOP). They provide proven approaches for making code more flexible, maintainable, and scalable.

Think of design patterns as **blueprints** that show how to organize classes and objects to solve specific design problems effectively.

### Types of Design Patterns
| Type | Purpose                                                                      | Example                     |
|------|------------------------------------------------------------------------------|-----------------------------|
| **Creational** | Control how objects are created                                          | Singleton, Factory, Builder |
| **Structural** | Organize classes and objects to form larger structures | Adapter, Decorator, Proxy   |
| **Behavioral** | Manage how objects communicate and work together          | Strategy, Observer, Command |

---

## 2. 📘 **UML Diagram Basics**

UML (Unified Modeling Language) is a visual language that helps us design and understand software systems. It shows classes, their attributes, methods, and how they relate to each other.

###  **Access Modifiers**
| Symbol | Visibility | Meaning |
|:------:|:------------|:--------|
| `+` | Public | Accessible everywhere |
| `-` | Private | Accessible only inside the class |
| `#` | Protected | Accessible within class and subclasses |
| `~` | Package | Accessible within same package |

---

### **Demonstrate Relationships Between Classes**

|Relationship |            Symbol             | Description | Example                                   |
|--------------|:-----------------------------:|-------------|-------------------------------------------|
| **Composition** |    `◆──` (filled diamond)     | Strong ownership — one object **cannot exist** without the other | A `Engine` **has-a** `Engine`             |
| **Aggregation** |    `◇──` (hollow diamond)     | Weak ownership — parts can exist independently | A `Team` **has** `Players`                |
| **Inheritance (Generalisation)** | `──▷` (hollow triangle arrow) | One class **inherits** from another (parent → child relationship) | `Dog` **extends** `Animal`                |
| **Dependency** |     `---➤` (dashed arrow)     | Temporary or indirect relationship — one class **depends on** another | `Coach` **uses** `PlayerPerformance` data |

---
### Common multiplicity notation
Multiplicity shows how many instances of one class relate to another.  
It’s an important part of class diagrams because it sets the real-world rules your system needs to follow.

Place multiplicity markers at the ends of association lines.

Common multiplicity notations:

| Symbol | Meaning                                                                                      |
|:------:|:---------------------------------------------------------------------------------------------|
|  `1`   | Exactly one                                                                                  |
| `0..1` | Zero or one                                                                                  |
| `0..*` | Zero or many (optional relationship)                                                         | 
| `1..*` | One or many (mandatory relationship)                                                         |
| `n..m` | A specific range (e.g., 2..4 = two to four instances)                                        |

---
### Creating UML Diagrams: Step-by-Step (football example)

1. **Define purpose & scope**
    - What am I modelling (e.g. Football Team Management)? Who will use the diagram?

2. **Identify key classes**
    - List main classes (e.g. `Team`, `Player`, `Coach`, `Match`).

3. **Add attributes & methods**
    - For each class add name, attributes (`+name: String`) and methods (`+playMatch()`).

4. **Show relationships**
    - Add Inheritance (is-a, e.g. `Goalkeeper` → `Player`) and other links: Composition (◆), Aggregation (◇), Dependency (----➤).

5. **Set multiplicity**
    - Specify counts (e.g. `Team` 1..* `Player`, `Team` 1 `Coach`) where relevant.

6. **Review, share & refine**
    - Check names, visibility, relationships and multiplicity. Walk through the model and get team feedback.


---

### **Example: Strategy Pattern (Behavioral)**

**Intent:**  
Define a family of algorithms, encapsulate them, and make them interchangeable at runtime.  
e.g. sorting algorithms, or payment method (cash, credit card or paypal)

**UML Diagram**

<p align="center">
  <img src="StragegyPatternRefactorGuru.png" alt="Strategy Pattern UML Diagram" width="500">
  <br>
  <em>Strategy Pattern — image source: <a href="https://refactoring.guru/design-patterns/strategy">Refactoring.Guru</a></em>
</p>


**Key Points:**
- `Context` **owns** (composition) a `Strategy` reference.
- `ConcreteStrategies` (1 or more) **implement** the `Strategy` interface.
- `Client` creates the `Context` and assigns the `Strategy`.

---

## 3. ⚙️ **SOLID Principles**

SOLID principles are guidelines for writing clean, maintainable object-oriented code.  
Refer to the example above for application.

| Principle | Meaning | Example |
|------------|----------|----------|
| **S**ingle Responsibility | A class should do one thing | `Context` only manages strategy usage |
| **O**pen/Closed | Open for extension, closed for modification | Add new strategies without changing existing code |
| **L**iskov Substitution | Subclasses can replace base classes | All `Strategy` implementations behave consistently |
| **I**nterface Segregation | Prefer smaller, specific interfaces | Strategy only defines `execute()` |
| **D**ependency Inversion | Depend on abstractions, not concretions | Context depends on `Strategy` interface, not concrete classes |

---

## 4. 💎 **Software Qualities (Attributes)**

Design patterns and SOLID principles help us achieve these **important software qualities**:

| Quality | Description                                   | Why it matters                  |
|----------|-----------------------------------------------|---------------------------------|
| **Reusability** | Components can be reused in different systems | Saves time and effort           |
| **Maintainability** | Easy to update and fix                        | Reduces long-term costs         |
| **Flexibility** | Behavior can change without rewriting code    | Handles changing business needs |
| **Scalability** | System can grow without structural change     | Supports business growth                           |
| **Low Coupling** | Fewer dependencies between components         |  Changes don't break other parts                               |
| **High Cohesion** | Each class has a focused responsibility       |  Easier to understand and test                               |

---

## 5. 🧰 **Design patterns Toolkits: Wrappers, Generics, etc.**
These are common techniques used in design patterns:

| Toolkit | Purpose | Example |
|----------|----------|----------|
| **Wrapper (Adapter)** | Converts one interface into another | Wraps a legacy class into a new interface |
| **Generics** | Create reusable, type-safe components | `List<T>`, `Strategy<T>` |
| **Interfaces & Abstract Classes** | Define contracts and common behavior | `Strategy` interface in example |
| **Dependency Injection (DI)** | Supplies dependencies externally | `Context.setStrategy(new StrategyA())` |

---

## 6. 👤 **Client Role**

The Client is the code that uses the design patterns. It decides which patterns to apply and how to configure them.  

It represents our application.
### Example (Simplified Java-like pseudocode):

```java
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.performAction(); // Executes Strategy A
    }
}
```


The client controls which strategy to use, demonstrating the Strategy pattern in action.

*Key Client Responsibilities:*
- Creates objects using appropriate patterns
- Configures relationships between objects
- Decides which strategy or implementation to use
- Orchestrates the overall workflow
---

## 🎯 **Putting It All Together**
*By combining UML for design, SOLID principles for code quality, and design patterns for proven solutions, we can build software that is:*

- Easy to maintain (clean organization and structure)
- Easy to change (flexible design)  
- Easy to reuse (modular components)  

This foundation helps create professional, quality software systems that can evolve over time.
