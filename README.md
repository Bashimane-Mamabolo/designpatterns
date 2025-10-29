# 🧩 **OOP DESIGN PATTERNS**

---

## 1. **What Are Design Patterns**

Design Patterns are **reusable solutions** to common design problems in Object-Oriented Programming (OOP).  
They describe **how classes and objects interact** to achieve flexible, maintainable, and scalable systems.

### Types of Design Patterns
| Type | Purpose                                                                      | Example                     |
|------|------------------------------------------------------------------------------|-----------------------------|
| **Creational** | Provides object creation mechanisms                                          | Singleton, Factory, Builder |
| **Structural** | Focus on how to compose classes and objects to form larger clever structures | Adapter, Decorator, Proxy   |
| **Behavioral** | Concerned with how objects communicate and interact with each other          | Strategy, Observer, Command |

---

## 2. 📘 **UML Diagram Basics**

UML (Unified Modeling Language) visually represents OOP systems — classes, interfaces, and their relationships.

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
### Step-by-step to make a UML diagram (football example)

1. **Define purpose & scope**
    - What am I modelling (e.g. Football Team Management)? Who is the audience? Static structure or behaviour?

2. **Identify key classes**
    - List main classes (e.g. `Team`, `Player`, `Coach`, `Match`).

3. **Add attributes & methods**
    - For each class add name, attributes (`+name: String`) and methods (`+playMatch()`).

4. **Show relationships**
    - Add Inheritance (is-a, e.g. `Goalkeeper` → `Player`) and other links: Composition (◆), Aggregation (◇), Dependency (----➤).

5. **Set multiplicity**
    - Specify counts (e.g. `Team` 1..* `Player`, `Team` 1 `Coach`) where relevant.

6. **Review, test & share**
    - Check names, visibility, relationships and multiplicity. Walk through the model and get team feedback.


---

### **Example: Strategy Pattern (Behavioral)**

**Intent:**  
Define a family of algorithms, encapsulate them, and make them interchangeable at runtime.

**UML Diagram (Text Representation)**





### Key Points:
- `Context` **owns** (composition) a `Strategy` reference.
- `ConcreteStrategyA` and `ConcreteStrategyB` **implement** the `Strategy` interface.
- `Client` creates the `Context` and assigns the `Strategy`.

---

## 5. ⚙️ **SOLID Principles**

These principles guide good OOP design and help patterns fit naturally into systems.

| Principle | Meaning | Example |
|------------|----------|----------|
| **S**ingle Responsibility | A class should do one thing | `Context` only manages strategy usage |
| **O**pen/Closed | Open for extension, closed for modification | Add new strategies without changing existing code |
| **L**iskov Substitution | Subclasses can replace base classes | All `Strategy` implementations behave consistently |
| **I**nterface Segregation | Prefer smaller, specific interfaces | Strategy only defines `execute()` |
| **D**ependency Inversion | Depend on abstractions, not concretions | Context depends on `Strategy` interface, not concrete classes |

---

## 6. 💎 **Software Qualities (Attributes)**

Design patterns and SOLID help us achieve **good software qualities**:

| Quality | Description |
|----------|-------------|
| **Reusability** | Components can be reused in different systems |
| **Maintainability** | Easy to update or extend |
| **Flexibility** | Behavior can change without rewriting code |
| **Scalability** | System can grow without structural change |
| **Low Coupling** | Fewer dependencies between components |
| **High Cohesion** | Each class has a focused purpose |

---

## 7. 🧰 **Toolkits: Wrappers, Generics, etc.**

| Toolkit | Purpose | Example |
|----------|----------|----------|
| **Wrapper (Adapter)** | Converts one interface into another | Wraps a legacy class into a new interface |
| **Generics** | Create reusable, type-safe components | `List<T>`, `Strategy<T>` |
| **Interfaces & Abstract Classes** | Define contracts and common behavior | `Strategy` interface in example |
| **Dependency Injection (DI)** | Supplies dependencies externally | `Context.setStrategy(new StrategyA())` |

---

## 8. 👤 **Client Role**

The **Client** is the entry point that interacts with the system.  
It decides **which strategy**, **which factory**, or **which adapter** to use.

### Example (Simplified Java-like pseudocode):

```java
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.performAction(); // Executes Strategy A
    }
}
