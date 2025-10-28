# 🧩 **OOP DESIGN PATTERNS**

---

## 1. 🎨 **What Are Design Patterns**

Design Patterns are **reusable solutions** to common design problems in Object-Oriented Programming (OOP).  
They describe **how classes and objects interact** to achieve flexible, maintainable, and scalable systems.

### 🔸 Types of Design Patterns
| Type | Purpose | Example |
|------|----------|----------|
| **Creational** | Object creation | Singleton, Factory |
| **Structural** | Object composition | Adapter, Decorator |
| **Behavioral** | Object interaction | Strategy, Observer |

---

## 2. 📘 **UML Diagram Basics**

UML (Unified Modeling Language) visually represents OOP systems — classes, interfaces, and their relationships.

### 🔹 **Access Modifiers**
| Symbol | Visibility | Meaning |
|:------:|:------------|:--------|
| `+` | Public | Accessible everywhere |
| `-` | Private | Accessible only inside the class |
| `#` | Protected | Accessible within class and subclasses |
| `~` | Package | Accessible within same package |

---

## 3. 🔷 **Composition and Aggregation**

| Relationship | Symbol | Description | Example |
|---------------|:-------:|-------------|----------|
| **Composition** | ◆ (filled diamond) | Strong ownership — one object **cannot exist** without the other | A `Car` **has-a** `Engine` |
| **Aggregation** | ◇ (hollow diamond) | Weak ownership — parts can exist independently | A `Team` **has** `Players` |

---

## 4. 🧭 **Example: Strategy Pattern (Behavioral)**

**Intent:**  
Define a family of algorithms, encapsulate them, and make them interchangeable at runtime.

### UML Diagram (Text Representation)





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
